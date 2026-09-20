package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Alert", "Lcom/spotify/interapp/model/a;", "", "statusCode", "", "shortText", "longText", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "c", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "getStatusCode$annotations", "()V", "d", "Ljava/lang/String;", "getShortText", "()Ljava/lang/String;", "setShortText", "(Ljava/lang/String;)V", "getShortText$annotations", "e", "getLongText", "setLongText", "getLongText$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$Alert extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer statusCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String shortText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String longText;

    public AppProtocol$Alert(@gk60(name = "code") Integer num, @gk60(name = "short_text") String str, @gk60(name = "long_text") String str2) {
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
}
