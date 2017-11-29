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
import android.content.res.TypedArray
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.support.v4.content.ContextCompat
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.content.res.AppCompatResources
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.support.v4.app.DialogFragment as SupportDialogFragment
import android.support.v4.app.Fragment as SupportFragment

// ANIM
fun Context.bindAnim(@AnimRes id: Int) = unsafeLazy { AnimationUtils.loadAnimation(this, id) }
fun Dialog.bindAnim(@AnimRes id: Int) = context.bindAnim(id)
fun Fragment.bindAnim(@AnimRes id: Int) = activity.bindAnim(id)
fun android.support.v4.app.Fragment.bindAnim(@AnimRes id: Int) = activity!!.bindAnim(id)
fun View.bindAnim(@AnimRes id: Int) = context.bindAnim(id)
fun RecyclerView.ViewHolder.bindAnim(@AnimRes id: Int) = itemView.context.bindAnim(id)

// INT ARRAY
fun Context.bindIntArray(@ArrayRes id: Int) = unsafeLazy { resources.getIntArray(id) }
fun Dialog.bindIntArray(@ArrayRes id: Int) = context.bindIntArray(id)
fun Fragment.bindIntArray(@ArrayRes id: Int) = activity.bindIntArray(id)
fun android.support.v4.app.Fragment.bindIntArray(@ArrayRes id: Int) = activity!!.bindIntArray(id)
fun View.bindIntArray(@ArrayRes id: Int) = context.bindIntArray(id)
fun RecyclerView.ViewHolder.bindIntArray(@ArrayRes id: Int) = itemView.context.bindIntArray(id)

// STRING ARRAY
fun Context.bindStringArray(@ArrayRes id: Int) = unsafeLazy { resources.getStringArray(id) }
fun Dialog.bindStringArray(@ArrayRes id: Int) = context.bindStringArray(id)
fun Fragment.bindStringArray(@ArrayRes id: Int) = activity.bindStringArray(id)
fun android.support.v4.app.Fragment.bindStringArray(@ArrayRes id: Int) = activity!!.bindStringArray(id)
fun View.bindStringArray(@ArrayRes id: Int) = context.bindStringArray(id)
fun RecyclerView.ViewHolder.bindStringArray(@ArrayRes id: Int) = itemView.context.bindStringArray(id)

// TEXT ARRAY
fun Context.bindTextArray(@ArrayRes id: Int) = unsafeLazy { resources.getTextArray(id) }
fun Dialog.bindTextArray(@ArrayRes id: Int) = context.bindTextArray(id)
fun Fragment.bindTextArray(@ArrayRes id: Int) = activity.bindTextArray(id)
fun android.support.v4.app.Fragment.bindTextArray(@ArrayRes id: Int) = activity!!.bindTextArray(id)
fun View.bindTextArray(@ArrayRes id: Int) = context.bindTextArray(id)
fun RecyclerView.ViewHolder.bindTextArray(@ArrayRes id: Int) = itemView.context.bindTextArray(id)

// TYPED ARRAY
fun Context.bindTypedArray(@ArrayRes id: Int): Lazy<TypedArray> =
        unsafeLazy { resources.obtainTypedArray(id) }
fun Dialog.bindTypedArray(@ArrayRes id: Int) = context.bindTypedArray(id)
fun Fragment.bindTypedArray(@ArrayRes id: Int) = activity.bindTypedArray(id)
fun android.support.v4.app.Fragment.bindTypedArray(@ArrayRes id: Int) = activity!!.bindTypedArray(id)
fun View.bindTypedArray(@ArrayRes id: Int) = context.bindTypedArray(id)
fun RecyclerView.ViewHolder.bindTypedArray(@ArrayRes id: Int) = itemView.context.bindTypedArray(id)

// BITMAP
fun Context.bindBitmap(@DrawableRes id: Int): Lazy<Bitmap> =
        unsafeLazy { BitmapFactory.decodeResource(resources, id) }
fun Dialog.bindBitmap(@DrawableRes id: Int) = context.bindBitmap(id)
fun Fragment.bindBitmap(@DrawableRes id: Int) = activity.bindBitmap(id)
fun android.support.v4.app.Fragment.bindBitmap(@DrawableRes id: Int) = activity!!.bindBitmap(id)
fun View.bindBitmap(@DrawableRes id: Int) = context.bindBitmap(id)
fun RecyclerView.ViewHolder.bindBitmap(@DrawableRes id: Int) = itemView.context.bindBitmap(id)

// BOOL
fun Context.bindBool(@BoolRes id: Int): Lazy<Boolean> = unsafeLazy { resources.getBoolean(id) }
fun Dialog.bindBool(@BoolRes id: Int) = context.bindBool(id)
fun Fragment.bindBool(@BoolRes id: Int) = activity.bindBool(id)
fun android.support.v4.app.Fragment.bindBool(@BoolRes id: Int) = activity!!.bindBool(id)
fun View.bindBool(@BoolRes id: Int) = context.bindBool(id)
fun RecyclerView.ViewHolder.bindBool(@BoolRes id: Int) = itemView.context.bindBool(id)

// COLOR
fun Context.bindColor(@ColorRes id: Int): Lazy<Int> =
        unsafeLazy { ContextCompat.getColor(this, id) }
fun Dialog.bindColor(@ColorRes id: Int) = context.bindColor(id)
fun Fragment.bindColor(@ColorRes id: Int) = activity.bindColor(id)
fun android.support.v4.app.Fragment.bindColor(@ColorRes id: Int) = activity!!.bindColor(id)
fun View.bindColor(@ColorRes id: Int) = context.bindColor(id)
fun RecyclerView.ViewHolder.bindColor(@ColorRes id: Int) = itemView.context.bindColor(id)

// COLOR STATE LIST
fun Context.bindColorStateList(id: Int) = unsafeLazy { ContextCompat.getColorStateList(this, id) }
fun Dialog.bindColorStateList(id: Int) = context.bindColorStateList(id)
fun Fragment.bindColorStateList(id: Int) = activity.bindColorStateList(id)
fun android.support.v4.app.Fragment.bindColorStateList(id: Int) = activity!!.bindColorStateList(id)
fun View.bindColorStateList(id: Int) = context.bindColorStateList(id)
fun RecyclerView.ViewHolder.bindColorStateList(id: Int) = itemView.context.bindColorStateList(id)

// DIMEN
fun Context.bindDimen(@DimenRes id: Int) =
        unsafeLazy { resources.getDimensionPixelSize(id) }
fun Dialog.bindDimen(@DimenRes id: Int) = context.bindDimen(id)
fun Fragment.bindDimen(@DimenRes id: Int) = activity.bindDimen(id)
fun android.support.v4.app.Fragment.bindDimen(@DimenRes id: Int) = activity!!.bindDimen(id)
fun View.bindDimen(@DimenRes id: Int) = context.bindDimen(id)
fun RecyclerView.ViewHolder.bindDimen(@DimenRes id: Int) = itemView.context.bindDimen(id)

// DRAWABLE
fun Context.bindDrawable(@DrawableRes id: Int) =
        unsafeLazy { AppCompatResources.getDrawable(this, id)!! }
fun Dialog.bindDrawable(@DrawableRes id: Int) = context.bindDrawable(id)
fun Fragment.bindDrawable(@DrawableRes id: Int) = activity.bindDrawable(id)
fun android.support.v4.app.Fragment.bindDrawable(@DrawableRes id: Int) = activity!!.bindDrawable(id)
fun View.bindDrawable(@DrawableRes id: Int) = context.bindDrawable(id)
fun RecyclerView.ViewHolder.bindDrawable(@DrawableRes id: Int) = itemView.context.bindDrawable(id)

// FLOAT
fun Context.bindFloat(@DimenRes id: Int): Lazy<Float> {
    return unsafeLazy {
        val value = VALUE_HOLDER.VALUE
        resources.getValue(id, value, true)
        return@unsafeLazy value.float
    }
}
fun Dialog.bindFloat(@DimenRes id: Int) = context.bindFloat(id)
fun Fragment.bindFloat(@DimenRes id: Int) = activity.bindFloat(id)
fun android.support.v4.app.Fragment.bindFloat(@DimenRes id: Int) = activity!!.bindFloat(id)
fun View.bindFloat(@DimenRes id: Int) = context.bindFloat(id)
fun RecyclerView.ViewHolder.bindFloat(@DimenRes id: Int) = itemView.context.bindFloat(id)

// FONT
fun Context.bindFont(@FontRes id: Int) = unsafeLazy { ResourcesCompat.getFont(this, id)!! }
fun Dialog.bindFont(@FontRes id: Int) = context.bindFloat(id)
fun Fragment.bindFont(@FontRes id: Int) = activity.bindFloat(id)
fun android.support.v4.app.Fragment.bindFont(@FontRes id: Int) = activity!!.bindFloat(id)
fun View.bindFont(@FontRes id: Int) = context.bindFloat(id)
fun RecyclerView.ViewHolder.bindFont(@FontRes id: Int) = itemView.context.bindFloat(id)

// INT
fun Context.bindInt(@IntegerRes id: Int) = unsafeLazy { resources.getInteger(id) }
fun Dialog.bindInt(@IntegerRes id: Int) = context.bindInt(id)
fun Fragment.bindInt(@IntegerRes id: Int) = activity.bindInt(id)
fun android.support.v4.app.Fragment.bindInt(@IntegerRes id: Int) = activity!!.bindInt(id)
fun View.bindInt(@IntegerRes id: Int) = context.bindInt(id)
fun RecyclerView.ViewHolder.bindInt(@IntegerRes id: Int) = itemView.context.bindInt(id)

// STRING
fun Context.bindString(@StringRes id: Int) = unsafeLazy { getString(id) }
fun Dialog.bindString(@StringRes id: Int) = context.bindString(id)
fun Fragment.bindString(@StringRes id: Int) = activity.bindString(id)
fun android.support.v4.app.Fragment.bindString(@StringRes id: Int) = activity!!.bindString(id)
fun View.bindString(@StringRes id: Int) = context.bindString(id)
fun RecyclerView.ViewHolder.bindString(@StringRes id: Int) = itemView.context.bindString(id)

// VIEW
fun <V : View>Activity.bindView(@IdRes id: Int) = unsafeLazy { findViewById<V>(id) }
fun <V : View>Dialog.bindView(@IdRes id: Int) = unsafeLazy { findViewById<V>(id) }
fun <V : View>Fragment.bindView(@IdRes id: Int) = unsafeLazy { view.findViewById<V>(id) }
fun <V : View>android.support.v4.app.Fragment.bindView(@IdRes id: Int) =
        unsafeLazy { view!!.findViewById<V>(id) }
fun <V : View>View.bindView(@IdRes id: Int) = unsafeLazy { findViewById<V>(id) }
fun <V : View>RecyclerView.ViewHolder.bindView(@IdRes id: Int) =
        unsafeLazy { itemView.findViewById<V>(id) }

// OPTIONAL VIEW
fun <V : View>Activity.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { findViewById<V>(id) }
fun <V : View>Dialog.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { findViewById<V>(id) }
fun <V : View>Fragment.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { view.findViewById<V>(id) }
fun <V : View>android.support.v4.app.Fragment.bindOptionalView(@IdRes id: Int) =
        optionalUnsafeLazy { view!!.findViewById<V>(id) }
fun <V : View>View.bindOptionalView(@IdRes id: Int) = optionalUnsafeLazy { findViewById<V>(id) }
fun <V : View>RecyclerView.ViewHolder.bindOptionalView(@IdRes id: Int) =
        optionalUnsafeLazy { itemView.findViewById<V>(id) }

private fun <T> unsafeLazy(initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)

private fun <T> optionalUnsafeLazy(initializer: () -> T?) = lazy(LazyThreadSafetyMode.NONE, initializer)

private object VALUE_HOLDER {
    val VALUE: TypedValue = TypedValue()
}