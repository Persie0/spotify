package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\b\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u0013"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Uri", "Lcom/spotify/interapp/model/a;", "", "uri", "featureIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "getUri$annotations", "()V", "d", "getFeatureIdentifier", "setFeatureIdentifier", "getFeatureIdentifier$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$Uri extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String featureIdentifier;

    public AppProtocol$Uri(@gk60(name = "uri") String str, @gk60(name = "feature_identifier") String str2) {
        this.uri = str;
        this.featureIdentifier = str2;
    }

    @gk60(name = "feature_identifier")
    public static /* synthetic */ void getFeatureIdentifier$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }
}
