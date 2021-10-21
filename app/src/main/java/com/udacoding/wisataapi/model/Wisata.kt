package com.udacoding.wisataapi.model

class Wisata {


    var status_code : Int? = null
    var message : String? = null
    var data : ArrayList<ItemWisata>? = null

}



class  ItemWisata{

    var id : String? = null
    var nama_tempat : String? = null
    var lokasi : String? = null
    var deskripsi : String? = null
    var gambar : String? = null

}