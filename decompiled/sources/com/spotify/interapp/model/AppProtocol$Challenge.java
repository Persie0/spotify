package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001B[\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u000e\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u000e\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u000e\u0012\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010\u000e\u0012\u0004\b$\u0010\u0014\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010\u000e\u0012\u0004\b(\u0010\u0014\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b/\u0010\u0014\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Challenge", "Lcom/spotify/interapp/model/a;", "", "nonce", "authprovider", "authid", "timestamp", "authrole", "authmethod", "", "session", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "c", "Ljava/lang/String;", "getNonce", "()Ljava/lang/String;", "setNonce", "(Ljava/lang/String;)V", "getNonce$annotations", "()V", "d", "getAuthprovider", "setAuthprovider", "getAuthprovider$annotations", "e", "getAuthid", "setAuthid", "getAuthid$annotations", "f", "getTimestamp", "setTimestamp", "getTimestamp$annotations", "g", "getAuthrole", "setAuthrole", "getAuthrole$annotations", "h", "getAuthmethod", "setAuthmethod", "getAuthmethod$annotations", "i", "Ljava/lang/Integer;", "getSession", "()Ljava/lang/Integer;", "setSession", "(Ljava/lang/Integer;)V", "getSession$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$Challenge extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String nonce;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String authprovider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String authid;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String timestamp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String authrole;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String authmethod;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Integer session;

    public AppProtocol$Challenge(@gk60(name = "nonce") String str, @gk60(name = "authprovider") String str2, @gk60(name = "authid") String str3, @gk60(name = "timestamp") String str4, @gk60(name = "authrole") String str5, @gk60(name = "authmethod") String str6, @gk60(name = "session") Integer num) {
        this.nonce = str;
        this.authprovider = str2;
        this.authid = str3;
        this.timestamp = str4;
        this.authrole = str5;
        this.authmethod = str6;
        this.session = num;
    }

    @gk60(name = "authid")
    public static /* synthetic */ void getAuthid$annotations() {
    }

    @gk60(name = "authmethod")
    public static /* synthetic */ void getAuthmethod$annotations() {
    }

    @gk60(name = "authprovider")
    public static /* synthetic */ void getAuthprovider$annotations() {
    }

    @gk60(name = "authrole")
    public static /* synthetic */ void getAuthrole$annotations() {
    }

    @gk60(name = "nonce")
    public static /* synthetic */ void getNonce$annotations() {
    }

    @gk60(name = "session")
    public static /* synthetic */ void getSession$annotations() {
    }

    @gk60(name = "timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }
}
