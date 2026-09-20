package com.spotify.musicappplatform.state.idle.api;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b7\u0018\u0000:\f\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\f\u001e\u001a\u0017\u001c\u001b \u001d\u0016\u0018\u0019\u0015\u001f¨\u0006!"}, m24212d2 = {"Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "", "name", "", "weak", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "Z", "getWeak", "()Z", "p/bei0", "p/ydi0", "p/pdi0", "p/zdi0", "p/aei0", "p/odi0", "p/rdi0", "p/qdi0", "p/xdi0", "p/ndi0", "p/kei0", "p/wdi0", "src_main_java_com_spotify_musicappplatform_state_idle-idle"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class MusicAppLock {
    private final String name;
    private final boolean weak;

    public /* synthetic */ MusicAppLock(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MusicAppLock) && getClass().equals(other.getClass());
    }

    public String getName() {
        return this.name;
    }

    public boolean getWeak() {
        return this.weak;
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public String toString() {
        return getName() + " lock(weak: " + getWeak() + ")";
    }

    private MusicAppLock(String str, boolean z) {
        this.name = str;
        this.weak = z;
    }
}
