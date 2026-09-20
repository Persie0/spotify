package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class lhw {

    /* JADX INFO: renamed from: a */
    public final int f133653a;

    /* JADX INFO: renamed from: b */
    public final Object f133654b;

    /* JADX INFO: renamed from: c */
    public final khw f133655c;

    /* JADX INFO: renamed from: d */
    public final khw f133656d;

    public lhw(int i, Object obj, khw khwVar, khw khwVar2) {
        this.f133653a = i;
        this.f133654b = obj;
        this.f133655c = khwVar;
        this.f133656d = khwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhw)) {
            return false;
        }
        lhw lhwVar = (lhw) obj;
        return this.f133653a == lhwVar.f133653a && this.f133654b.equals(lhwVar.f133654b) && this.f133655c.equals(lhwVar.f133655c) && this.f133656d.equals(lhwVar.f133656d);
    }

    public final int hashCode() {
        return this.f133656d.hashCode() + ((this.f133655c.hashCode() + dq60.m36604d(mt60.m62800g(this.f133653a, Integer.hashCode(R.string.puffin_headphones_optimization_error_title) * 31, 31), 31, this.f133654b)) * 31);
    }
}
