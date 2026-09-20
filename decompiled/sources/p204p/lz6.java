package p204p;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes5.dex */
public final class lz6 {

    /* JADX INFO: renamed from: a */
    public final int f138265a;

    /* JADX INFO: renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f138266b;

    public lz6(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f138265a = i;
        this.f138266b = onAudioFocusChangeListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz6)) {
            return false;
        }
        lz6 lz6Var = (lz6) obj;
        return this.f138265a == lz6Var.f138265a && wj50.m88271j(this.f138266b, lz6Var.f138266b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f138265a) * 31;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f138266b;
        return iM38547C + (onAudioFocusChangeListener == null ? 0 : onAudioFocusChangeListener.hashCode());
    }
}
