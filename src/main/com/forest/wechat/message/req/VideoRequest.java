package com.forest.wechat.message.req;

public class VideoRequest extends Request {
    // ��Ƶ��Ϣý��id
    private String MediaId;
    // ��Ƶ��Ϣ����ͼ��ý��id
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
