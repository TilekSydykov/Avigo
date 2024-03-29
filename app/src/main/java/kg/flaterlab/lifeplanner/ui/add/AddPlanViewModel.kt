package kg.flaterlab.lifeplanner.ui.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import kg.flaterlab.lifeplanner.data.AppRepository
import kg.flaterlab.lifeplanner.db.model.Plan

class AddPlanViewModel: ViewModel(){
    private lateinit var repository: AppRepository

    fun init(rep: AppRepository){
        repository = rep
    }

    fun setPlan(plan : Plan){
        repository.insertPlan(plan)
    }

    // fun getPlanTrace(): LiveData<ArrayList<String>>{

    // }
}