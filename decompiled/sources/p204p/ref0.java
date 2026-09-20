package p204p;

import com.spotify.nowplayingmini.nowplayingmini.NowPlayingMiniMode;

/* JADX INFO: loaded from: classes8.dex */
public final class ref0 {

    /* JADX INFO: renamed from: a */
    public final Object f198363a;

    /* JADX INFO: renamed from: b */
    public final int f198364b;

    public ref0(NowPlayingMiniMode nowPlayingMiniMode, int i) {
        this.f198363a = nowPlayingMiniMode;
        this.f198364b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ref0)) {
            return false;
        }
        ref0 ref0Var = (ref0) obj;
        return wj50.m88271j(this.f198363a, ref0Var.f198363a) && this.f198364b == ref0Var.f198364b;
    }

    public final int hashCode() {
        Object obj = this.f198363a;
        return Integer.hashCode(this.f198364b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
