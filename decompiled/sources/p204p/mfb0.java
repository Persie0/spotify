package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class mfb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f143017a;

    /* JADX INFO: renamed from: b */
    public final String f143018b;

    /* JADX INFO: renamed from: c */
    public final boolean f143019c;

    public mfb0(ContextTrack contextTrack, String str, boolean z) {
        this.f143017a = contextTrack;
        this.f143018b = str;
        this.f143019c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfb0)) {
            return false;
        }
        mfb0 mfb0Var = (mfb0) obj;
        return wj50.m88271j(this.f143017a, mfb0Var.f143017a) && wj50.m88271j(this.f143018b, mfb0Var.f143018b) && this.f143019c == mfb0Var.f143019c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143019c) + s571.m77243b(this.f143017a.hashCode() * 31, 31, this.f143018b);
    }
}
