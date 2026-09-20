package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\f\u0012\u0004\b!\u0010\u0012\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010\f\u0012\u0004\b%\u0010\u0012\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010¨\u0006&"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$UriWithNamedOptions", "Lcom/spotify/interapp/model/a;", "", "uri", "skipToUri", "", "skipToIndex", "skipToUid", "featureIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "c", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "getUri$annotations", "()V", "d", "getSkipToUri", "setSkipToUri", "getSkipToUri$annotations", "e", "Ljava/lang/Integer;", "getSkipToIndex", "()Ljava/lang/Integer;", "setSkipToIndex", "(Ljava/lang/Integer;)V", "getSkipToIndex$annotations", "f", "getSkipToUid", "setSkipToUid", "getSkipToUid$annotations", "g", "getFeatureIdentifier", "setFeatureIdentifier", "getFeatureIdentifier$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$UriWithNamedOptions extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String skipToUri;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Integer skipToIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String skipToUid;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String featureIdentifier;

    public AppProtocol$UriWithNamedOptions(@gk60(name = "uri") String str, @gk60(name = "skipToURI") String str2, @gk60(name = "skipToIndex") Integer num, @gk60(name = "skipToUid") String str3, @gk60(name = "feature_identifier") String str4) {
        this.uri = str;
        this.skipToUri = str2;
        this.skipToIndex = num;
        this.skipToUid = str3;
        this.featureIdentifier = str4;
    }

    @gk60(name = "feature_identifier")
    public static /* synthetic */ void getFeatureIdentifier$annotations() {
    }

    @gk60(name = "skipToIndex")
    public static /* synthetic */ void getSkipToIndex$annotations() {
    }

    @gk60(name = "skipToUid")
    public static /* synthetic */ void getSkipToUid$annotations() {
    }

    @gk60(name = "skipToURI")
    public static /* synthetic */ void getSkipToUri$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }
}
