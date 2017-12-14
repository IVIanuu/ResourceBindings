/*
 * Copyright 2017 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ivianuu.resourcebindings

import android.app.Activity
import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.BitmapFactory
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
import android.support.annotation.*
import android.support.v4.content.ContextCompat
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.content.res.AppCompatResources
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.View
import android.view.animation.AnimationUtils
import android.support.v4.app.Fragment as SupportFragment

// ANIM

private fun Context.getResAnimation(@AnimRes id: Int) = AnimationUtils.loadAnimation(this, id)
fun Context.bindAnim(@AnimRes id: Int) = unsafeLazy { getResAnimation(id) }
fun Dialog.bindAnim(@AnimRes id: Int) = unsafeLazy { context.getResAnimation(id) }
fun Fragment.bindAnim(@AnimRes id: Int) = unsafeLazy { activity.getResAnimation(id) }
fun SupportFragment.bindAnim(@AnimRes id: Int) = unsafeLazy { activity!!.getResAnimation(id) }
fun View.bindAnim(@AnimRes id: Int) = unsafeLazy { context.getResAnimation(id) }
fun RecyclerView.ViewHolder.bindAnim(@AnimRes id: Int) = unsafeLazy { itemView.context.getResAnimation(id) }

// INT ARRAY
private fun Context.getResIntArray(@ArrayRes id: Int) = resources.getIntArray(id)
fun Context.bindIntArray(@ArrayRes id: Int) = unsafeLazy { getResIntArray(id) }
fun Dialog.bindIntArray(@ArrayRes id: Int) = unsafeLazy { context.getResIntArray(id) }
fun Fragment.bindIntArray(@ArrayRes id: Int) = unsafeLazy { activity.getResIntArray(id) }
fun SupportFragment.bindIntArray(@ArrayRes id: Int) = unsafeLazy { context!!.getResIntArray(id) }
fun View.bindIntArray(@ArrayRes id: Int) = unsafeLazy { context.getResIntArray(id) }
fun RecyclerView.ViewHolder.bindIntArray(@ArrayRes id: Int) = unsafeLazy { itemView.context.getResIntArray(id) }

// STRING ARRAY
private fun Context.getResStringArray(@ArrayRes id: Int) = resources.getStringArray(id)
fun Context.bindStringArray(@ArrayRes id: Int) = unsafeLazy { getResStringArray(id) }
fun Dialog.bindStringArray(@ArrayRes id: Int) = unsafeLazy { context.getResStringArray(id) }
fun Fragment.bindStringArray(@ArrayRes id: Int) = unsafeLazy { activity.getResStringArray(id) }
fun SupportFragment.bindStringArray(@ArrayRes id: Int) = unsafeLazy { activity!!.getResStringArray(id) }
fun View.bindStringArray(@ArrayRes id: Int) = unsafeLazy { context.getResStringArray(id) }
fun RecyclerView.ViewHolder.bindStringArray(@ArrayRes id: Int) = unsafeLazy { itemView.context.getResStringArray(id) }

// TEXT ARRAY
private fun Context.getResTextArray(@ArrayRes id: Int) = resources.getTextArray(id)
fun Context.bindTextArray(@ArrayRes id: Int) = unsafeLazy { getResTextArray(id) }
fun Dialog.bindTextArray(@ArrayRes id: Int) = unsafeLazy { context.getResTextArray(id) }
fun Fragment.bindTextArray(@ArrayRes id: Int) = unsafeLazy { activity.getResTextArray(id) }
fun SupportFragment.bindTextArray(@ArrayRes id: Int) = unsafeLazy { activity!!.getResTextArray(id) }
fun View.bindTextArray(@ArrayRes id: Int) = unsafeLazy { context.getResTextArray(id) }
fun RecyclerView.ViewHolder.bindTextArray(@ArrayRes id: Int) = unsafeLazy { itemView.context.getResTextArray(id) }

// TEXT ARRAY ATTR
private fun Context.resolveTextArrayAttr(@AttrRes attr: Int): Array<CharSequence> {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getTextArray(0)
    array.recycle()
    return value
}
fun Context.bindTextArrayAttr(@AttrRes attr: Int) = unsafeLazy { resolveTextArrayAttr(attr) }
fun Dialog.bindTextArrayAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveTextArrayAttr(attr) }
fun Fragment.bindTextArrayAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveTextArrayAttr(attr) }
fun SupportFragment.bindTextArrayAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveTextArrayAttr(attr) }
fun View.bindTextArrayAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveTextArrayAttr(attr) }
fun RecyclerView.ViewHolder.bindTextArrayAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveTextArrayAttr(attr) }

// TYPED ARRAY
private fun Context.getResTypedArray(@ArrayRes id: Int) = resources.obtainTypedArray(id)
fun Context.bindTypedArray(@ArrayRes id: Int) = unsafeLazy { getResTypedArray(id) }
fun Dialog.bindTypedArray(@ArrayRes id: Int) = unsafeLazy { context.getResTypedArray(id) }
fun Fragment.bindTypedArray(@ArrayRes id: Int) = unsafeLazy { activity.getResTypedArray(id) }
fun SupportFragment.bindTypedArray(@ArrayRes id: Int) = unsafeLazy { activity!!.getResTypedArray(id) }
fun View.bindTypedArray(@ArrayRes id: Int) = unsafeLazy { context.getResTypedArray(id) }
fun RecyclerView.ViewHolder.bindTypedArray(@ArrayRes id: Int) = unsafeLazy { itemView.context.getResTypedArray(id) }

// BITMAP
private fun Context.getResBitmap(@DrawableRes id: Int) = BitmapFactory.decodeResource(resources, id)
fun Context.bindBitmap(@DrawableRes id: Int) = unsafeLazy { getResBitmap(id) }
fun Dialog.bindBitmap(@DrawableRes id: Int) = context.bindBitmap(id)
fun Fragment.bindBitmap(@DrawableRes id: Int) = activity.bindBitmap(id)
fun SupportFragment.bindBitmap(@DrawableRes id: Int) = activity!!.bindBitmap(id)
fun View.bindBitmap(@DrawableRes id: Int) = context.bindBitmap(id)
fun RecyclerView.ViewHolder.bindBitmap(@DrawableRes id: Int) = itemView.context.bindBitmap(id)

// BOOL
private fun Context.getResBool(@BoolRes id: Int) = resources.getBoolean(id)
fun Context.bindBool(@BoolRes id: Int) = unsafeLazy { getResBool(id) }
fun Dialog.bindBool(@BoolRes id: Int) = unsafeLazy { context.getResBool(id) }
fun Fragment.bindBool(@BoolRes id: Int) = unsafeLazy { activity.getResBool(id) }
fun SupportFragment.bindBool(@BoolRes id: Int) = unsafeLazy { activity!!.getResBool(id) }
fun View.bindBool(@BoolRes id: Int) = unsafeLazy { context.getResBool(id) }
fun RecyclerView.ViewHolder.bindBool(@BoolRes id: Int) = unsafeLazy { itemView.context.getResBool(id) }

// BOOL ATTR
private fun Context.resolveBoolAttr(@AttrRes attr: Int): Boolean {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getBoolean(0, false)
    array.recycle()
    return value
}
fun Context.bindBoolAttr(@AttrRes attr: Int) = unsafeLazy { resolveBoolAttr(attr) }
fun Dialog.bindBoolAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveBoolAttr(attr) }
fun Fragment.bindBoolAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveBoolAttr(attr) }
fun SupportFragment.bindBoolAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveBoolAttr(attr) }
fun View.bindBoolAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveBoolAttr(attr) }
fun RecyclerView.ViewHolder.bindBoolAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveBoolAttr(attr) }

// COLOR
private fun Context.getResColor(@ColorRes id: Int) = ContextCompat.getColor(this, id)
fun Context.bindColor(@ColorRes id: Int) = unsafeLazy { getResColor(id) }
fun Dialog.bindColor(@ColorRes id: Int) = unsafeLazy { context.getResColor(id) }
fun Fragment.bindColor(@ColorRes id: Int) = unsafeLazy { activity.getResColor(id) }
fun SupportFragment.bindColor(@ColorRes id: Int) = unsafeLazy { activity!!.getResColor(id) }
fun View.bindColor(@ColorRes id: Int) = unsafeLazy { context.getResColor(id) }
fun RecyclerView.ViewHolder.bindColor(@ColorRes id: Int) = unsafeLazy { itemView.context.getResColor(id) }

// COLOR ATTR
private fun Context.resolveColorAttr(@AttrRes attr: Int): Int {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getColor(0, 0)
    array.recycle()
    return value
}
fun Context.bindColorAttr(@AttrRes attr: Int) = unsafeLazy { resolveColorAttr(attr) }
fun Dialog.bindColorAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveColorAttr(attr) }
fun Fragment.bindColorAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveColorAttr(attr) }
fun SupportFragment.bindColorAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveColorAttr(attr) }
fun View.bindColorAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveColorAttr(attr) }
fun RecyclerView.ViewHolder.bindColorAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveColorAttr(attr) }

// COLOR STATE LIST
private fun Context.getResColorStateList(id: Int) = ContextCompat.getColorStateList(this, id)
fun Context.bindColorStateList(id: Int) = unsafeLazy { getResColorStateList(id) }
fun Dialog.bindColorStateList(id: Int) = unsafeLazy { context.getResColorStateList(id) }
fun Fragment.bindColorStateList(id: Int) = unsafeLazy { activity.getResColorStateList(id) }
fun SupportFragment.bindColorStateList(id: Int) = unsafeLazy { activity!!.getResColorStateList(id) }
fun View.bindColorStateList(id: Int) = unsafeLazy { context.getResColorStateList(id) }
fun RecyclerView.ViewHolder.bindColorStateList(id: Int) = unsafeLazy { itemView.context.getResColorStateList(id) }

// COLOR STATE LIST ATTR
private fun Context.resolveColorStateListAttr(@AttrRes attr: Int): ColorStateList {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getColorStateList(0)
    array.recycle()
    return value
}
fun Context.bindColorStateListAttr(@AttrRes attr: Int) = unsafeLazy { resolveColorStateListAttr(attr) }
fun Dialog.bindColorStateListAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveColorStateListAttr(attr) }
fun Fragment.bindColorStateListAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveColorStateListAttr(attr) }
fun SupportFragment.bindColorStateListAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveColorStateListAttr(attr) }
fun View.bindColorStateListAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveColorStateListAttr(attr) }
fun RecyclerView.ViewHolder.bindColorStateListAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveColorStateListAttr(attr) }

// DIMEN
private fun Context.getResDimen(@DimenRes id: Int) = resources.getDimensionPixelSize(id)
fun Context.bindDimen(@DimenRes id: Int) = unsafeLazy { getResDimen(id) }
fun Dialog.bindDimen(@DimenRes id: Int) = unsafeLazy { context.getResDimen(id) }
fun Fragment.bindDimen(@DimenRes id: Int) = unsafeLazy { activity.getResDimen(id) }
fun SupportFragment.bindDimen(@DimenRes id: Int) = unsafeLazy { activity!!.getResDimen(id) }
fun View.bindDimen(@DimenRes id: Int) = unsafeLazy { context.getResDimen(id) }
fun RecyclerView.ViewHolder.bindDimen(@DimenRes id: Int) = unsafeLazy { itemView.context.getResDimen(id) }

// DIMEN ATTR
private fun Context.resolveDimenAttr(@AttrRes attr: Int): Float {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getDimension(0, 0f)
    array.recycle()
    return value
}
fun Context.bindDimenAttr(@AttrRes attr: Int) = unsafeLazy { resolveDimenAttr(attr) }
fun Dialog.bindDimenAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveDimenAttr(attr) }
fun Fragment.bindDimenAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveDimenAttr(attr) }
fun SupportFragment.bindDimenAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveDimenAttr(attr) }
fun View.bindDimenAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveDimenAttr(attr) }
fun RecyclerView.ViewHolder.bindDimenAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveDimenAttr(attr) }

// DIMEN PX
private fun Context.getResDimenPx(@DimenRes id: Int) = resources.getDimension(id)
fun Context.bindDimenPx(@DimenRes id: Int) = unsafeLazy { getResDimenPx(id) }
fun Dialog.bindDimenPx(@DimenRes id: Int) = unsafeLazy { context.getResDimenPx(id) }
fun Fragment.bindDimenPx(@DimenRes id: Int) = unsafeLazy { activity.getResDimenPx(id) }
fun SupportFragment.bindDimenPx(@DimenRes id: Int) = unsafeLazy { activity!!.getResDimenPx(id) }
fun View.bindDimenPx(@DimenRes id: Int) = unsafeLazy { context.getResDimenPx(id) }
fun RecyclerView.ViewHolder.bindDimenPx(@DimenRes id: Int) = unsafeLazy { itemView.context.getResDimenPx(id) }

// DIMEN PX ATTR
private fun Context.resolveDimenPxAttr(@AttrRes attr: Int): Int {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getDimensionPixelSize(0, 0)
    array.recycle()
    return value
}
fun Context.bindDimenPxAttr(@AttrRes attr: Int) = unsafeLazy { resolveDimenPxAttr(attr) }
fun Dialog.bindDimenPxAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveDimenPxAttr(attr) }
fun Fragment.bindDimenPxAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveDimenPxAttr(attr) }
fun SupportFragment.bindDimenPxAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveDimenPxAttr(attr) }
fun View.bindDimenPxAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveDimenPxAttr(attr) }
fun RecyclerView.ViewHolder.bindDimenPxAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveDimenPxAttr(attr) }

// DIMEN PX OFFSET
private fun Context.getResDimenPxOffset(@DimenRes id: Int) = resources.getDimensionPixelOffset(id)
fun Context.bindDimenPxOffset(@DimenRes id: Int) = unsafeLazy { getResDimenPxOffset(id) }
fun Dialog.bindDimenPxOffset(@DimenRes id: Int) = unsafeLazy { context.getResDimenPxOffset(id) }
fun Fragment.bindDimenPxOffset(@DimenRes id: Int) = unsafeLazy { activity.getResDimenPxOffset(id) }
fun SupportFragment.bindDimenPxOffset(@DimenRes id: Int) = unsafeLazy { activity!!.getResDimenPxOffset(id) }
fun View.bindDimenPxOffset(@DimenRes id: Int) = unsafeLazy { context.getResDimenPxOffset(id) }
fun RecyclerView.ViewHolder.bindDimenPxOffset(@DimenRes id: Int) = unsafeLazy { itemView.context.getResDimenPxOffset(id) }

// DIMEN PX ATTR OFFSET
private fun Context.resolveDimenPxOffsetAttr(@AttrRes attr: Int): Int {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getDimensionPixelOffset(0, 0)
    array.recycle()
    return value
}
fun Context.bindDimenPxOffsetAttr(@AttrRes attr: Int) = unsafeLazy { resolveDimenPxOffsetAttr(attr) }
fun Dialog.bindDimenPxOffsetAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveDimenPxOffsetAttr(attr) }
fun Fragment.bindDimenPxOffsetAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveDimenPxOffsetAttr(attr) }
fun SupportFragment.bindDimenPxOffsetAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveDimenPxOffsetAttr(attr) }
fun View.bindDimenPxOffsetAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveDimenPxOffsetAttr(attr) }
fun RecyclerView.ViewHolder.bindDimenPxOffsetAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveDimenPxOffsetAttr(attr) }

// DRAWABLE
private fun Context.getResDrawable(@DrawableRes id: Int) = AppCompatResources.getDrawable(this, id)!!
fun Context.bindDrawable(@DrawableRes id: Int) = unsafeLazy { getResDrawable(id) }
fun Dialog.bindDrawable(@DrawableRes id: Int) = unsafeLazy { context.getResDrawable(id) }
fun Fragment.bindDrawable(@DrawableRes id: Int) = unsafeLazy { activity.getResDrawable(id) }
fun SupportFragment.bindDrawable(@DrawableRes id: Int) = unsafeLazy { activity!!.getResDrawable(id) }
fun View.bindDrawable(@DrawableRes id: Int) = unsafeLazy { context.getResDrawable(id) }
fun RecyclerView.ViewHolder.bindDrawable(@DrawableRes id: Int) = unsafeLazy { itemView.context.getResDrawable(id) }

// DRAWABLE ATTR
private fun Context.resolveDrawableAttr(@AttrRes attr: Int): Drawable {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getDrawable(0)
    array.recycle()
    return value
}
fun Context.bindDrawableAttr(@AttrRes attr: Int) = unsafeLazy { resolveDrawableAttr(attr) }
fun Dialog.bindDrawableAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveDrawableAttr(attr) }
fun Fragment.bindDrawableAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveDrawableAttr(attr) }
fun SupportFragment.bindDrawableAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveDrawableAttr(attr) }
fun View.bindDrawableAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveDrawableAttr(attr) }
fun RecyclerView.ViewHolder.bindDrawableAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveDrawableAttr(attr) }

// FLOAT
private fun Context.getResFloat(@DimenRes id: Int): Float {
    val value = VALUE_HOLDER.VALUE
    resources.getValue(id, value, true)
    return value.float
}
fun Context.bindFloat(@DimenRes id: Int) = unsafeLazy { getResFloat(id) }
fun Dialog.bindFloat(@DimenRes id: Int) = unsafeLazy { context.getResFloat(id) }
fun Fragment.bindFloat(@DimenRes id: Int) = unsafeLazy { activity.getResFloat(id) }
fun SupportFragment.bindFloat(@DimenRes id: Int) = unsafeLazy { activity!!.getResFloat(id) }
fun View.bindFloat(@DimenRes id: Int) = unsafeLazy { context.getResFloat(id) }
fun RecyclerView.ViewHolder.bindFloat(@DimenRes id: Int) = unsafeLazy { itemView.context.getResFloat(id) }

// FLOAT ATTR
private fun Context.resolveFloatAttr(@AttrRes attr: Int): Float {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getFloat(0, 0f)
    array.recycle()
    return value
}
fun Context.bindFloatAttr(@AttrRes attr: Int) = unsafeLazy { resolveFloatAttr(attr) }
fun Dialog.bindFloatAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveFloatAttr(attr) }
fun Fragment.bindFloatAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveFloatAttr(attr) }
fun SupportFragment.bindFloatAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveFloatAttr(attr) }
fun View.bindFloatAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveFloatAttr(attr) }
fun RecyclerView.ViewHolder.bindFloatAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveFloatAttr(attr) }

// FONT
private fun Context.getResFont(@FontRes id: Int) = ResourcesCompat.getFont(this, id)!!
fun Context.bindFont(@FontRes id: Int) = unsafeLazy { getResFont(id) }
fun Dialog.bindFont(@FontRes id: Int) = unsafeLazy { context.getResFont(id) }
fun Fragment.bindFont(@FontRes id: Int) = unsafeLazy { activity.getResFont(id) }
fun SupportFragment.bindFont(@FontRes id: Int) = unsafeLazy { activity!!.getResFont(id) }
fun View.bindFont(@FontRes id: Int) = unsafeLazy { context.getResFont(id) }
fun RecyclerView.ViewHolder.bindFont(@FontRes id: Int) = unsafeLazy { itemView.context.getResFont(id) }

// FONT ATTR
@RequiresApi(Build.VERSION_CODES.O)
private fun Context.resolveFontAttr(@AttrRes attr: Int): Typeface {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getFont(0)
    array.recycle()
    return value
}
@RequiresApi(Build.VERSION_CODES.O)
fun Context.bindFontAttr(@AttrRes attr: Int) = unsafeLazy { resolveFontAttr(attr) }
@RequiresApi(Build.VERSION_CODES.O)
fun Dialog.bindFontAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveFontAttr(attr) }
@RequiresApi(Build.VERSION_CODES.O)
fun Fragment.bindFontAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveFontAttr(attr) }
@RequiresApi(Build.VERSION_CODES.O)
fun SupportFragment.bindFontAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveFontAttr(attr) }
@RequiresApi(Build.VERSION_CODES.O)
fun View.bindFontAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveFontAttr(attr) }
@RequiresApi(Build.VERSION_CODES.O)
fun RecyclerView.ViewHolder.bindFontAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveFontAttr(attr) }

// INT
private fun Context.getResInt(@IntegerRes id: Int) = resources.getInteger(id)
fun Context.bindInt(@IntegerRes id: Int) = unsafeLazy { getResInt(id) }
fun Dialog.bindInt(@IntegerRes id: Int) = unsafeLazy { context.getResInt(id) }
fun Fragment.bindInt(@IntegerRes id: Int) = unsafeLazy { activity.getResInt(id) }
fun SupportFragment.bindInt(@IntegerRes id: Int) = unsafeLazy { activity!!.getResInt(id) }
fun View.bindInt(@IntegerRes id: Int) = unsafeLazy { context.getResInt(id) }
fun RecyclerView.ViewHolder.bindInt(@IntegerRes id: Int) = unsafeLazy { itemView.context.getResInt(id) }

// INT ATTR
private fun Context.resolveIntAttr(@AttrRes attr: Int): Int {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getInt(0, 0)
    array.recycle()
    return value
}
fun Context.bindIntAttr(@AttrRes attr: Int) = unsafeLazy { resolveIntAttr(attr) }
fun Dialog.bindIntAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveIntAttr(attr) }
fun Fragment.bindIntAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveIntAttr(attr) }
fun SupportFragment.bindIntAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveIntAttr(attr) }
fun View.bindIntAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveIntAttr(attr) }
fun RecyclerView.ViewHolder.bindIntAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveIntAttr(attr) }

// INTEGER ATTR
private fun Context.resolveIntegerAttr(@AttrRes attr: Int): Int {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getInteger(0, 0)
    array.recycle()
    return value
}
fun Context.bindIntegerAttr(@AttrRes attr: Int) = unsafeLazy { resolveIntegerAttr(attr) }
fun Dialog.bindIntegerAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveIntegerAttr(attr) }
fun Fragment.bindIntegerAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveIntegerAttr(attr) }
fun SupportFragment.bindIntegerAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveIntegerAttr(attr) }
fun View.bindIntegerAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveIntegerAttr(attr) }
fun RecyclerView.ViewHolder.bindIntegerAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveIntegerAttr(attr) }

// STRING
fun Context.bindString(@StringRes id: Int) = unsafeLazy { getString(id) }
fun Dialog.bindString(@StringRes id: Int) = unsafeLazy { context.getString(id) }
fun Fragment.bindString(@StringRes id: Int) = unsafeLazy { activity.getString(id) }
fun SupportFragment.bindString(@StringRes id: Int) = unsafeLazy { activity!!.getString(id) }
fun View.bindString(@StringRes id: Int) = unsafeLazy { context.getString(id) }
fun RecyclerView.ViewHolder.bindString(@StringRes id: Int) = unsafeLazy { itemView.context.getString(id) }

// STRING ATTR
private fun Context.resolveStringAttr(@AttrRes attr: Int): String {
    val array = getTypedArrayWithAttributes(attr)
    val value = array.getString(0)
    array.recycle()
    return value
}
fun Context.bindStringAttr(@AttrRes attr: Int) = unsafeLazy { resolveStringAttr(attr) }
fun Dialog.bindStringAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveStringAttr(attr) }
fun Fragment.bindStringAttr(@AttrRes attr: Int) = unsafeLazy { activity.resolveStringAttr(attr) }
fun SupportFragment.bindStringAttr(@AttrRes attr: Int) = unsafeLazy { activity!!.resolveStringAttr(attr) }
fun View.bindStringAttr(@AttrRes attr: Int) = unsafeLazy { context.resolveStringAttr(attr) }
fun RecyclerView.ViewHolder.bindStringAttr(@AttrRes attr: Int) = unsafeLazy { itemView.context.resolveStringAttr(attr) }

// VIEW
fun <V : View>Activity.bindView(@IdRes id: Int) = unsafeLazy { findViewById<V>(id) }
fun <V : View>Dialog.bindView(@IdRes id: Int) = unsafeLazy { findViewById<V>(id) }
fun <V : View>Fragment.bindView(@IdRes id: Int) = unsafeLazy { view.findViewById<V>(id) }
fun <V : View>SupportFragment.bindView(@IdRes id: Int) =
        unsafeLazy { view!!.findViewById<V>(id) }
fun <V : View>View.bindView(@IdRes id: Int) = unsafeLazy { findViewById<V>(id) }
fun <V : View>RecyclerView.ViewHolder.bindView(@IdRes id: Int) =
        unsafeLazy { itemView.findViewById<V>(id) }

// OPTIONAL VIEW
fun <V : View>Activity.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { findViewById<V>(id) }
fun <V : View>Dialog.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { findViewById<V>(id) }
fun <V : View>Fragment.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { view.findViewById<V>(id) }
fun <V : View>SupportFragment.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { view!!.findViewById<V>(id) }
fun <V : View>View.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { findViewById<V>(id) }
fun <V : View>RecyclerView.ViewHolder.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { itemView.findViewById<V>(id) }

private fun <T> unsafeLazy(initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)

private fun <T> optionalUnsafeLazy(initializer: () -> T?) = lazy(LazyThreadSafetyMode.NONE, initializer)

private object VALUE_HOLDER {
    val VALUE: TypedValue = TypedValue()
}

private fun Context.getTypedArrayWithAttributes(vararg attr: Int) = theme.obtainStyledAttributes(attr)