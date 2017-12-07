package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by James on 12/7/2017.
 */


val Context.layoutInflater get() = LayoutInflater.from(this)