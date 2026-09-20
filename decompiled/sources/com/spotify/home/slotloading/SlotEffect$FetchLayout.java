package com.spotify.home.slotloading;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m24211d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, m24212d2 = {"com/spotify/home/slotloading/SlotEffect$FetchLayout", "", "", "isRefresh", "", "sessionId", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "Lcom/spotify/home/slotloading/SlotEffect$FetchLayout;", "copy", "(ZLjava/lang/String;)Lcom/spotify/home/slotloading/SlotEffect$FetchLayout;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getSessionId", "src_main_java_com_spotify_home_slotloading-slotloading"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class SlotEffect$FetchLayout {
    private final boolean isRefresh;
    private final String sessionId;

    public SlotEffect$FetchLayout(boolean z, String str) {
        this.isRefresh = z;
        this.sessionId = str;
    }

    public static /* synthetic */ SlotEffect$FetchLayout copy$default(SlotEffect$FetchLayout slotEffect$FetchLayout, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = slotEffect$FetchLayout.isRefresh;
        }
        if ((i & 2) != 0) {
            str = slotEffect$FetchLayout.sessionId;
        }
        return slotEffect$FetchLayout.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsRefresh() {
        return this.isRefresh;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final SlotEffect$FetchLayout copy(boolean isRefresh, String sessionId) {
        return new SlotEffect$FetchLayout(isRefresh, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotEffect$FetchLayout)) {
            return false;
        }
        SlotEffect$FetchLayout slotEffect$FetchLayout = (SlotEffect$FetchLayout) other;
        return this.isRefresh == slotEffect$FetchLayout.isRefresh && wj50.m88271j(this.sessionId, slotEffect$FetchLayout.sessionId);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isRefresh) * 31;
        String str = this.sessionId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SlotEffect$FetchLayout(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
