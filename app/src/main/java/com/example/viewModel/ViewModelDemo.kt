package com.example.viewModel

import androidx.lifecycle.ViewModel


//

/*view model humara data apne pass rakhta hai .
view model tabhi destroy hota hai jub hum apni app puri tarah band kr dete hai.
view model mein view ka reference kabhi ni rakhna chahiye.
view model are lifecycle aware.*/



class ViewModelDemo(val initialValue:Int):ViewModel() {

    var count:Int=initialValue

    fun increment(){
        count++
    }
}