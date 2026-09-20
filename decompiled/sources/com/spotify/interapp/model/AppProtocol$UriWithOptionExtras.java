package com.spotify.interapp.model;

import java.util.List;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\n\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$UriWithOptionExtras", "Lcom/spotify/interapp/model/a;", "", "uri", "", "options", "featureIdentifier", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "c", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "getUri$annotations", "()V", "d", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "getOptions$annotations", "e", "getFeatureIdentifier", "setFeatureIdentifier", "getFeatureIdentifier$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$UriWithOptionExtras extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final List options;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String featureIdentifier;

    public AppProtocol$UriWithOptionExtras(@gk60(name = "uri") String str, @gk60(name = "options") List<String> list, @gk60(name = "feature_identifier") String str2) {
        this.uri = str;
        this.options = list;
        this.featureIdentifier = str2;
    }

    @gk60(name = "feature_identifier")
    public static /* synthetic */ void getFeatureIdentifier$annotations() {
    }

    @gk60(name = "options")
    public static /* synthetic */ void getOptions$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }
}
