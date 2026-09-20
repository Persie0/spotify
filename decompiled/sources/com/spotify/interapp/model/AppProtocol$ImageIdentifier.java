package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u0016\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010\u000e\u0012\u0004\b#\u0010\u0014\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012¨\u0006$"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$ImageIdentifier", "Lcom/spotify/interapp/model/a;", "", "id", "", "height", "width", "imageType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "Lcom/spotify/interapp/model/AppProtocol$ImageIdentifier;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spotify/interapp/model/AppProtocol$ImageIdentifier;", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "d", "Ljava/lang/Integer;", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "getHeight$annotations", "e", "getWidth", "setWidth", "getWidth$annotations", "f", "getImageType", "setImageType", "getImageType$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AppProtocol$ImageIdentifier extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Integer height;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Integer width;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String imageType;

    public AppProtocol$ImageIdentifier(@gk60(name = "id") String str, @gk60(name = "height") Integer num, @gk60(name = "width") Integer num2, @gk60(name = "image_type") String str2) {
        this.id = str;
        this.height = num;
        this.width = num2;
        this.imageType = str2;
    }

    @gk60(name = "height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @gk60(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @gk60(name = "image_type")
    public static /* synthetic */ void getImageType$annotations() {
    }

    @gk60(name = "width")
    public static /* synthetic */ void getWidth$annotations() {
    }

    public final AppProtocol$ImageIdentifier copy(@gk60(name = "id") String id, @gk60(name = "height") Integer height, @gk60(name = "width") Integer width, @gk60(name = "image_type") String imageType) {
        return new AppProtocol$ImageIdentifier(id, height, width, imageType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppProtocol$ImageIdentifier)) {
            return false;
        }
        AppProtocol$ImageIdentifier appProtocol$ImageIdentifier = (AppProtocol$ImageIdentifier) obj;
        return wj50.m88271j(this.id, appProtocol$ImageIdentifier.id) && wj50.m88271j(this.height, appProtocol$ImageIdentifier.height) && wj50.m88271j(this.width, appProtocol$ImageIdentifier.width) && wj50.m88271j(this.imageType, appProtocol$ImageIdentifier.imageType);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.imageType;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
