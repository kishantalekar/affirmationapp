package com.example.affirmationapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(@StringRes val stringResourceId:Int,val noOfCourses:Int,@DrawableRes val imageResourceId:Int)
