package com.spotify.core.http;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/core/http/HttpOptions;", "", "timeout", "", "connectTimeout", "isFollowRedirects", "", "priority", "", "<init>", "(JJZI)V", "getTimeout", "()J", "getConnectTimeout", "()Z", "getPriority", "()I", "Companion", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class HttpOptions {
    public static final int PRIORITY_BACKGROUND = 0;
    public static final int PRIORITY_HIGH = 3;
    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_NORMAL = 2;
    private final long connectTimeout;
    private final boolean isFollowRedirects;
    private final int priority;
    private final long timeout;

    public HttpOptions(long j, long j2, boolean z, int i) {
        this.timeout = j;
        this.connectTimeout = j2;
        this.isFollowRedirects = z;
        this.priority = i;
    }

    public final long getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: isFollowRedirects, reason: from getter */
    public final boolean getIsFollowRedirects() {
        return this.isFollowRedirects;
    }

    public /* synthetic */ HttpOptions(long j, long j2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, z, (i2 & 8) != 0 ? 2 : i);
    }
}
