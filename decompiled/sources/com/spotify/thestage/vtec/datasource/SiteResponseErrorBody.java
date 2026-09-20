package com.spotify.thestage.vtec.datasource;

import java.util.List;
import kotlin.Metadata;
import p204p.gk60;
import p204p.mt60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/thestage/vtec/datasource/SiteResponseErrorBody;", "", "", "message", "", "code", "", "details", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "copy", "(Ljava/lang/String;ILjava/util/List;)Lcom/spotify/thestage/vtec/datasource/SiteResponseErrorBody;", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "b", "I", "getCode", "()I", "getCode$annotations", "c", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "getDetails$annotations", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class SiteResponseErrorBody {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final List details;

    public SiteResponseErrorBody(@gk60(name = "message") String str, @gk60(name = "code") int i, @gk60(name = "details") List<String> list) {
        this.message = str;
        this.code = i;
        this.details = list;
    }

    @gk60(name = "code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @gk60(name = "details")
    public static /* synthetic */ void getDetails$annotations() {
    }

    @gk60(name = "message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    public final SiteResponseErrorBody copy(@gk60(name = "message") String message, @gk60(name = "code") int code, @gk60(name = "details") List<String> details) {
        return new SiteResponseErrorBody(message, code, details);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SiteResponseErrorBody)) {
            return false;
        }
        SiteResponseErrorBody siteResponseErrorBody = (SiteResponseErrorBody) obj;
        return wj50.m88271j(this.message, siteResponseErrorBody.message) && this.code == siteResponseErrorBody.code && wj50.m88271j(this.details, siteResponseErrorBody.details);
    }

    public final int hashCode() {
        return this.details.hashCode() + mt60.m62800g(this.code, this.message.hashCode() * 31, 31);
    }
}
