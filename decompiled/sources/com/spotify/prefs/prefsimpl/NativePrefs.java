package com.spotify.prefs.prefsimpl;

import com.spotify.prefs.prefs.Prefs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003R\u001c\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\u0003¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/prefs/prefsimpl/NativePrefs;", "Lcom/spotify/prefs/prefs/Prefs;", "<init>", "()V", "Lp/w2a1;", "destroy", "", "nThis", "J", "getNThis$annotations", "Companion", "src_main_java_com_spotify_prefs_prefsimpl-prefsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativePrefs implements Prefs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long nThis;

    @Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 ¨\u0006\u0006"}, m24212d2 = {"Lcom/spotify/prefs/prefsimpl/NativePrefs$Companion;", "", "<init>", "()V", "create", "Lcom/spotify/prefs/prefsimpl/NativePrefs;", "src_main_java_com_spotify_prefs_prefsimpl-prefsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativePrefs create() {
            return NativePrefs.create();
        }

        private Companion() {
        }
    }

    private NativePrefs() {
    }

    public static final native NativePrefs create();

    private static /* synthetic */ void getNThis$annotations() {
    }

    public final native void destroy();
}
