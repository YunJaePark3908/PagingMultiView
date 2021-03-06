package com.example.pagingmultiview.model

import com.google.gson.annotations.SerializedName

data class RespDaejeonTouristModel(
    @SerializedName("comMsgHeader")
    var comMsgHeader: ComMsgHeader = ComMsgHeader(),
    @SerializedName("msgHeader")
    var msgHeader: MsgHeader = MsgHeader(),
    @SerializedName("msgBody")
    var msgBody: List<MsgBody> = listOf()
) {

    data class MsgBody(
        @SerializedName("id")
        var id: String = "",
        @SerializedName("addr1")
        var addr1: String = "",
        @SerializedName("addr2")
        var addr2: String = "",
        @SerializedName("cGubun")
        var cGubun: String = "",
        @SerializedName("cid")
        var cid: String = "",
        @SerializedName("dCode")
        var dCode: String = "",
        @SerializedName("dLang")
        var dLang: String = "",
        @SerializedName("expression")
        var expression: String = "",
        @SerializedName("hitCnt")
        var hitCnt: String = "",
        @SerializedName("idxImgName")
        var idxImgName: String = "",
        @SerializedName("idxImgPath")
        var idxImgPath: String = "",
        @SerializedName("imgIdx")
        var imgIdx: String = "",
        @SerializedName("keyword")
        var keyword: String = "",
        @SerializedName("name")
        var name: String = "",
        @SerializedName("recommend")
        var recommend: String = "",
        @SerializedName("telCode")
        var telCode: String = "",
        @SerializedName("telKuk")
        var telKuk: String = "",
        @SerializedName("telNo")
        var telNo: String = "",
        @SerializedName("tourSeq")
        var tourSeq: String = "",
        @SerializedName("useYn")
        var useYn: String = "",
        @SerializedName("zipcode")
        var zipcode: String = ""
    )
}