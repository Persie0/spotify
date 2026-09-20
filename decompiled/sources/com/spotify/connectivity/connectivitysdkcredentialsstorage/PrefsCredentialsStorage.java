package com.spotify.connectivity.connectivitysdkcredentialsstorage;

import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.prefs.prefs.Prefs;
import kotlin.Metadata;
import p204p.xhq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m24212d2 = {"Lcom/spotify/connectivity/connectivitysdkcredentialsstorage/PrefsCredentialsStorage;", "", "<init>", "()V", "Companion", "p/xhq0", "src_main_java_com_spotify_connectivity_connectivitysdkcredentialsstorage-connectivitysdkcredentialsstorage"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PrefsCredentialsStorage {
    public static final xhq0 Companion = new xhq0();

    public static final native NativeCredentialsStorage create(Prefs prefs, String str);
}
