package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010!¨\u0006#"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/V3NewSessionRequest;", "", "", "activate", "", "localDeviceId", "Lcom/spotify/jam/internal/socialconnect/models/SessionOrigin;", "origin", "Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;", "configuration", "<init>", "(ZLjava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/SessionOrigin;Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;)V", "copy", "(ZLjava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/SessionOrigin;Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;)Lcom/spotify/jam/internal/socialconnect/models/V3NewSessionRequest;", "a", "Z", "getActivate", "()Z", "getActivate$annotations", "()V", "b", "Ljava/lang/String;", "getLocalDeviceId", "()Ljava/lang/String;", "getLocalDeviceId$annotations", "c", "Lcom/spotify/jam/internal/socialconnect/models/SessionOrigin;", "getOrigin", "()Lcom/spotify/jam/internal/socialconnect/models/SessionOrigin;", "getOrigin$annotations", "d", "Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;", "getConfiguration", "()Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;", "getConfiguration$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class V3NewSessionRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean activate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String localDeviceId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final SessionOrigin origin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final SessionConfiguration configuration;

    public V3NewSessionRequest(@gk60(name = "activate") boolean z, @gk60(name = "local_device_id") String str, @gk60(name = "origin") SessionOrigin sessionOrigin, @gk60(name = "configuration") SessionConfiguration sessionConfiguration) {
        this.activate = z;
        this.localDeviceId = str;
        this.origin = sessionOrigin;
        this.configuration = sessionConfiguration;
    }

    @gk60(name = "activate")
    public static /* synthetic */ void getActivate$annotations() {
    }

    @gk60(name = "configuration")
    public static /* synthetic */ void getConfiguration$annotations() {
    }

    @gk60(name = "local_device_id")
    public static /* synthetic */ void getLocalDeviceId$annotations() {
    }

    @gk60(name = "origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    public final V3NewSessionRequest copy(@gk60(name = "activate") boolean activate, @gk60(name = "local_device_id") String localDeviceId, @gk60(name = "origin") SessionOrigin origin, @gk60(name = "configuration") SessionConfiguration configuration) {
        return new V3NewSessionRequest(activate, localDeviceId, origin, configuration);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V3NewSessionRequest)) {
            return false;
        }
        V3NewSessionRequest v3NewSessionRequest = (V3NewSessionRequest) obj;
        return this.activate == v3NewSessionRequest.activate && wj50.m88271j(this.localDeviceId, v3NewSessionRequest.localDeviceId) && wj50.m88271j(this.origin, v3NewSessionRequest.origin) && wj50.m88271j(this.configuration, v3NewSessionRequest.configuration);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Boolean.hashCode(this.activate) * 31, 31, this.localDeviceId);
        SessionOrigin sessionOrigin = this.origin;
        int iHashCode = (iM77243b + (sessionOrigin == null ? 0 : sessionOrigin.hashCode())) * 31;
        SessionConfiguration sessionConfiguration = this.configuration;
        return iHashCode + (sessionConfiguration != null ? sessionConfiguration.hashCode() : 0);
    }
}
