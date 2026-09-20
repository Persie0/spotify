package com.spotify.jam.internal.socialconnect.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/HostApprovalResponseError;", "", "", "code", "", "message", "", "details", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/spotify/jam/internal/socialconnect/models/HostApprovalResponseError;", "a", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "getCode$annotations", "()V", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "c", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "getDetails$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class HostApprovalResponseError {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Integer code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final List details;

    public HostApprovalResponseError(@gk60(name = "code") Integer num, @gk60(name = "message") String str, @gk60(name = "details") List<String> list) {
        this.code = num;
        this.message = str;
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

    public final HostApprovalResponseError copy(@gk60(name = "code") Integer code, @gk60(name = "message") String message, @gk60(name = "details") List<String> details) {
        return new HostApprovalResponseError(code, message, details);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostApprovalResponseError)) {
            return false;
        }
        HostApprovalResponseError hostApprovalResponseError = (HostApprovalResponseError) obj;
        return wj50.m88271j(this.code, hostApprovalResponseError.code) && wj50.m88271j(this.message, hostApprovalResponseError.message) && wj50.m88271j(this.details, hostApprovalResponseError.details);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.details;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public /* synthetic */ HostApprovalResponseError(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
