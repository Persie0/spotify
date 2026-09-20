package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u0015\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019¨\u0006\u001f"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Status", "Lcom/spotify/interapp/model/a;", "", "statusCode", "", "shortText", "longText", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/spotify/interapp/model/AppProtocol$Status;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/interapp/model/AppProtocol$Status;", "c", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "getStatusCode$annotations", "()V", "d", "Ljava/lang/String;", "getShortText", "()Ljava/lang/String;", "setShortText", "(Ljava/lang/String;)V", "getShortText$annotations", "e", "getLongText", "setLongText", "getLongText$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AppProtocol$Status extends AbstractC0800a {

    /* JADX INFO: renamed from: f */
    public static final AppProtocol$Status f4396f = new AppProtocol$Status(0, "", "");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer statusCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String shortText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String longText;

    public AppProtocol$Status(@gk60(name = "code") Integer num, @gk60(name = "short_text") String str, @gk60(name = "long_text") String str2) {
        this.statusCode = num;
        this.shortText = str;
        this.longText = str2;
    }

    @gk60(name = "long_text")
    public static /* synthetic */ void getLongText$annotations() {
    }

    @gk60(name = "short_text")
    public static /* synthetic */ void getShortText$annotations() {
    }

    @gk60(name = "code")
    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public final AppProtocol$Status copy(@gk60(name = "code") Integer statusCode, @gk60(name = "short_text") String shortText, @gk60(name = "long_text") String longText) {
        return new AppProtocol$Status(statusCode, shortText, longText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppProtocol$Status)) {
            return false;
        }
        AppProtocol$Status appProtocol$Status = (AppProtocol$Status) obj;
        return wj50.m88271j(this.statusCode, appProtocol$Status.statusCode) && wj50.m88271j(this.shortText, appProtocol$Status.shortText) && wj50.m88271j(this.longText, appProtocol$Status.longText);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.shortText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.longText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
