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

/**
 * Resource bindings
 */

// ANIM

/**
 * Binds the anim
 */
fun Context.bindAnim(@AnimRes id: Int): Lazy<Animation> {
    return lazy { AnimationUtils.loadAnimation(this, id) }
}

/**
 * Binds the anim
 */
fun Dialog.bindAnim(@AnimRes id: Int) = context.bindAnim(id)

/**
 * Binds the anim
 */
fun Fragment.bindAnim(@AnimRes id: Int) = activity.bindAnim(id)

/**
 * Binds the anim
 */
fun android.support.v4.app.Fragment.bindAnim(@AnimRes id: Int) = activity.bindAnim(id)

/**
 * Binds the anim
 */
fun View.bindAnim(@AnimRes id: Int) = context.bindAnim(id)

/**
 * Binds the anim
 */
fun RecyclerView.ViewHolder.bindAnim(@AnimRes id: Int) = itemView.context.bindAnim(id)

// INT ARRAY

/**
 * Binds the int array
 */
fun Context.bindIntArray(@ArrayRes id: Int): Lazy<IntArray> {
    return lazy { resources.getIntArray(id) }
}

/**
 * Binds the int array
 */
fun Dialog.bindIntArray(@ArrayRes id: Int) = context.bindIntArray(id)

/**
 * Binds the int array
 */
fun Fragment.bindIntArray(@ArrayRes id: Int) = activity.bindIntArray(id)

/**
 * Binds the int array
 */
fun android.support.v4.app.Fragment.bindIntArray(@ArrayRes id: Int) = activity.bindIntArray(id)

/**
 * Binds the int array
 */
fun View.bindIntArray(@ArrayRes id: Int) = context.bindIntArray(id)

/**
 * Binds the int array
 */
fun RecyclerView.ViewHolder.bindIntArray(@ArrayRes id: Int) = itemView.context.bindIntArray(id)

// STRING ARRAY

/**
 * Binds the string array
 */
fun Context.bindStringArray(@ArrayRes id: Int): Lazy<Array<String>> {
    return lazy { resources.getStringArray(id) }
}

/**
 * Binds the string array
 */
fun Dialog.bindStringArray(@ArrayRes id: Int) = context.bindStringArray(id)

/**
 * Binds the string array
 */
fun Fragment.bindStringArray(@ArrayRes id: Int) = activity.bindStringArray(id)

/**
 * Binds the string array
 */
fun android.support.v4.app.Fragment.bindStringArray(@ArrayRes id: Int) = activity.bindStringArray(id)

/**
 * Binds the string array
 */
fun View.bindStringArray(@ArrayRes id: Int) = context.bindStringArray(id)

/**
 * Binds the string array
 */
fun RecyclerView.ViewHolder.bindStringArray(@ArrayRes id: Int) = itemView.context.bindStringArray(id)

// TEXT ARRAY

/**
 * Binds the text array
 */
fun Context.bindTextArray(@ArrayRes id: Int): Lazy<Array<CharSequence>> {
    return lazy { resources.getTextArray(id) }
}

/**
 * Binds the text array
 */
fun Dialog.bindTextArray(@ArrayRes id: Int) = context.bindTextArray(id)

/**
 * Binds the text array
 */
fun Fragment.bindTextArray(@ArrayRes id: Int) = activity.bindTextArray(id)

/**
 * Binds the text array
 */
fun android.support.v4.app.Fragment.bindTextArray(@ArrayRes id: Int) = activity.bindTextArray(id)

/**
 * Binds the text array
 */
fun View.bindTextArray(@ArrayRes id: Int) = context.bindTextArray(id)

/**
 * Binds the text array
 */
fun RecyclerView.ViewHolder.bindTextArray(@ArrayRes id: Int) = itemView.context.bindTextArray(id)

// TYPED ARRAY

/**
 * Binds the typed array
 */
fun Context.bindTypedArray(@ArrayRes id: Int): Lazy<TypedArray> {
    return lazy { resources.obtainTypedArray(id) }
}

/**
 * Binds the typed array
 */
fun Dialog.bindTypedArray(@ArrayRes id: Int) = context.bindTypedArray(id)

/**
 * Binds the typed array
 */
fun Fragment.bindTypedArray(@ArrayRes id: Int) = activity.bindTypedArray(id)

/**
 * Binds the typed array
 */
fun android.support.v4.app.Fragment.bindTypedArray(@ArrayRes id: Int) = activity.bindTypedArray(id)

/**
 * Binds the typed array
 */
fun View.bindTypedArray(@ArrayRes id: Int) = context.bindTypedArray(id)

/**
 * Binds the typed array
 */
fun RecyclerView.ViewHolder.bindTypedArray(@ArrayRes id: Int) = itemView.context.bindTypedArray(id)

// BITMAP

/**
 * Binds the bitmap
 */
fun Context.bindBitmap(@DrawableRes id: Int): Lazy<Bitmap> {
    return lazy { BitmapFactory.decodeResource(resources, id) }
}

/**
 * Binds the bitmap
 */
fun Dialog.bindBitmap(@DrawableRes id: Int) = context.bindBitmap(id)

/**
 * Binds the bitmap
 */
fun Fragment.bindBitmap(@DrawableRes id: Int) = activity.bindBitmap(id)

/**
 * Binds the bitmap
 */
fun android.support.v4.app.Fragment.bindBitmap(@DrawableRes id: Int) = activity.bindBitmap(id)

/**
 * Binds the bitmap
 */
fun View.bindBitmap(@DrawableRes id: Int) = context.bindBitmap(id)

/**
 * Binds the bitmap
 */
fun RecyclerView.ViewHolder.bindBitmap(@DrawableRes id: Int) = itemView.context.bindBitmap(id)

// BOOL

/**
 * Binds the boolean
 */
fun Context.bindBool(@BoolRes id: Int): Lazy<Boolean> {
    return lazy { resources.getBoolean(id) }
}

/**
 * Binds the boolean
 */
fun Dialog.bindBool(@BoolRes id: Int) = context.bindBool(id)

/**
 * Binds the boolean
 */
fun Fragment.bindBool(@BoolRes id: Int) = activity.bindBool(id)

/**
 * Binds the boolean
 */
fun android.support.v4.app.Fragment.bindBool(@BoolRes id: Int) = activity.bindBool(id)

/**
 * Binds the boolean
 */
fun View.bindBool(@BoolRes id: Int) = context.bindBool(id)

/**
 * Binds the boolean
 */
fun RecyclerView.ViewHolder.bindBool(@BoolRes id: Int) = itemView.context.bindBool(id)

// COLOR

/**
 * Binds the color
 */
fun Context.bindColor(@ColorRes id: Int): Lazy<Int> {
    return lazy { ContextCompat.getColor(this, id) }
}

/**
 * Binds the color
 */
fun Dialog.bindColor(@ColorRes id: Int) = context.bindColor(id)

/**
 * Binds the color
 */
fun Fragment.bindColor(@ColorRes id: Int) = activity.bindColor(id)

/**
 * Binds the color
 */
fun android.support.v4.app.Fragment.bindColor(@ColorRes id: Int) = activity.bindColor(id)

/**
 * Binds the color
 */
fun View.bindColor(@ColorRes id: Int) = context.bindColor(id)

/**
 * Binds the color
 */
fun RecyclerView.ViewHolder.bindColor(@ColorRes id: Int) = itemView.context.bindColor(id)

// COLOR STATE LIST

/**
 * Binds the color
 */
fun Context.bindColorStateList(id: Int): Lazy<ColorStateList> {
    return lazy { ContextCompat.getColorStateList(this, id) }
}

/**
 * Binds the color
 */
fun Dialog.bindColorStateList(id: Int) = context.bindColorStateList(id)

/**
 * Binds the color
 */
fun Fragment.bindColorStateList(id: Int) = activity.bindColorStateList(id)

/**
 * Binds the color
 */
fun android.support.v4.app.Fragment.bindColorStateList(id: Int) = activity.bindColorStateList(id)

/**
 * Binds the color
 */
fun View.bindColorStateList(id: Int) = context.bindColorStateList(id)

/**
 * Binds the color
 */
fun RecyclerView.ViewHolder.bindColorStateList(id: Int) = itemView.context.bindColorStateList(id)

// DIMEN

/**
 * Binds the dimen
 */
fun Context.bindDimen(@DimenRes id: Int): Lazy<Int> {
    return lazy { resources.getDimensionPixelSize(id) }
}

/**
 * Binds the dimen
 */
fun Dialog.bindDimen(@DimenRes id: Int) = context.bindDimen(id)

/**
 * Binds the dimen
 */
fun Fragment.bindDimen(@DimenRes id: Int) = activity.bindDimen(id)

/**
 * Binds the dimen
 */
fun android.support.v4.app.Fragment.bindDimen(@DimenRes id: Int) = activity.bindDimen(id)

/**
 * Binds the dimen
 */
fun View.bindDimen(@DimenRes id: Int) = context.bindDimen(id)

/**
 * Binds the dimen
 */
fun RecyclerView.ViewHolder.bindDimen(@DimenRes id: Int) = itemView.context.bindDimen(id)

// DRAWABLE

/**
 * Binds the drawable
 */
fun Context.bindDrawable(@DrawableRes id: Int): Lazy<Drawable> {
    return lazy { AppCompatResources.getDrawable(this, id)!! }
}

/**
 * Binds the drawable
 */
fun Dialog.bindDrawable(@DrawableRes id: Int) = context.bindDrawable(id)

/**
 * Binds the drawable
 */
fun Fragment.bindDrawable(@DrawableRes id: Int) = activity.bindDrawable(id)

/**
 * Binds the drawable
 */
fun android.support.v4.app.Fragment.bindDrawable(@DrawableRes id: Int) = activity.bindDrawable(id)

/**
 * Binds the drawable
 */
fun View.bindDrawable(@DrawableRes id: Int) = context.bindDrawable(id)

/**
 * Binds the drawable
 */
fun RecyclerView.ViewHolder.bindDrawable(@DrawableRes id: Int) = itemView.context.bindDrawable(id)

// FLOAT

/**
 * Binds the float
 */
fun Context.bindFloat(@DimenRes id: Int): Lazy<Float> {
    return lazy {
        val value = VALUE_HOLDER.VALUE
        resources.getValue(id, value, true)
        return@lazy value.float
    }
}

/**
 * Binds the float
 */
fun Dialog.bindFloat(@DimenRes id: Int) = context.bindFloat(id)

/**
 * Binds the float
 */
fun Fragment.bindFloat(@DimenRes id: Int) = activity.bindFloat(id)

/**
 * Binds the float
 */
fun android.support.v4.app.Fragment.bindFloat(@DimenRes id: Int) = activity.bindFloat(id)

/**
 * Binds the float
 */
fun View.bindFloat(@DimenRes id: Int) = context.bindFloat(id)

/**
 * Binds the float
 */
fun RecyclerView.ViewHolder.bindFloat(@DimenRes id: Int) = itemView.context.bindFloat(id)

// FONT

/**
 * Binds the font
 */
fun Context.bindFont(@FontRes id: Int): Lazy<Typeface> {
    return lazy { ResourcesCompat.getFont(this, id)!! }
}

/**
 * Binds the font
 */
fun Dialog.bindFont(@FontRes id: Int) = context.bindFloat(id)

/**
 * Binds the font
 */
fun Fragment.bindFont(@FontRes id: Int) = activity.bindFloat(id)

/**
 * Binds the font
 */
fun android.support.v4.app.Fragment.bindFont(@FontRes id: Int) = activity.bindFloat(id)

/**
 * Binds the font
 */
fun View.bindFont(@FontRes id: Int) = context.bindFloat(id)

/**
 * Binds the font
 */
fun RecyclerView.ViewHolder.bindFont(@FontRes id: Int) = itemView.context.bindFloat(id)

// INT

/**
 * Binds the int
 */
fun Context.bindInt(@IntegerRes id: Int): Lazy<Int> {
    return lazy { resources.getInteger(id) }
}

/**
 * Binds the int
 */
fun Dialog.bindInt(@IntegerRes id: Int) = context.bindInt(id)

/**
 * Binds the int
 */
fun Fragment.bindInt(@IntegerRes id: Int) = activity.bindInt(id)

/**
 * Binds the int
 */
fun android.support.v4.app.Fragment.bindInt(@IntegerRes id: Int) = activity.bindInt(id)

/**
 * Binds the int
 */
fun View.bindInt(@IntegerRes id: Int) = context.bindInt(id)

/**
 * Binds the int
 */
fun RecyclerView.ViewHolder.bindInt(@IntegerRes id: Int) = itemView.context.bindInt(id)

// STRING

/**
 * Binds the string
 */
fun Context.bindString(@StringRes id: Int): Lazy<String> {
    return lazy { getString(id) }
}

/**
 * Binds the string
 */
fun Dialog.bindString(@StringRes id: Int) = context.bindString(id)

/**
 * Binds the string
 */
fun Fragment.bindString(@StringRes id: Int) = activity.bindString(id)

/**
 * Binds the string
 */
fun android.support.v4.app.Fragment.bindString(@StringRes id: Int) = activity.bindString(id)

/**
 * Binds the string
 */
fun View.bindString(@StringRes id: Int) = context.bindString(id)

/**
 * Binds the string
 */
fun RecyclerView.ViewHolder.bindString(@StringRes id: Int) = itemView.context.bindString(id)

// VIEW

/**
 * Binds the view
 */
fun <V : View>Activity.bindView(@IdRes id: Int): Lazy<V> {
    return lazy { findViewById<V>(id) }
}

/**
 * Binds the view
 */
fun <V : View>Dialog.bindView(@IdRes id: Int): Lazy<V> {
    return lazy { findViewById<V>(id) }
}

/**
 * Binds the view
 */
fun <V : View>Fragment.bindView(@IdRes id: Int): Lazy<V> {
    return lazy { view.findViewById<V>(id) }
}

/**
 * Binds the view
 */
fun <V : View>android.support.v4.app.Fragment.bindView(@IdRes id: Int): Lazy<V> {
    return lazy { view!!.findViewById<V>(id) }
}

/**
 * Binds the view
 */
fun <V : View>View.bindView(@IdRes id: Int): Lazy<V> {
    return lazy { findViewById<V>(id) }
}

/**
 * Binds the view
 */
fun <V : View>RecyclerView.ViewHolder.bindView(@IdRes id: Int): Lazy<V> {
    return kotlin.lazy { itemView.findViewById<V>(id) }
}

private object VALUE_HOLDER {
    val VALUE: TypedValue = TypedValue()
}