package com.mcet.campus_connect

import android.provider.ContactsContract.CommonDataKinds.Email

class user {
    var name : String? = null
    var email: String? = null
    var uid : String? =null
    constructor(){}
    constructor(name: String?,email: String?,uid:String?){
        this.name =name
        this.email =email
        this.uid =uid

    }
}