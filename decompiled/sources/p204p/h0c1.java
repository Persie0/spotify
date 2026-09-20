package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class h0c1 {
    public static final g0c1 Companion = new g0c1();

    /* JADX INFO: renamed from: d */
    public static final fr70[] f86217d = {q3d0.m72078I(2, pib1.f177896X), q3d0.m72078I(2, pib1.f177898Y), null};

    /* JADX INFO: renamed from: a */
    public final ewu0 f86218a;

    /* JADX INFO: renamed from: b */
    public final x3a1 f86219b;

    /* JADX INFO: renamed from: c */
    public final String f86220c;

    public /* synthetic */ h0c1(int i, ewu0 ewu0Var, x3a1 x3a1Var, String str) {
        if (1 != (i & 1)) {
            edo.m38617p(i, 1, f0c1.f64609a.getDescriptor());
            throw null;
        }
        this.f86218a = ewu0Var;
        if ((i & 2) == 0) {
            this.f86219b = null;
        } else {
            this.f86219b = x3a1Var;
        }
        if ((i & 4) == 0) {
            this.f86220c = null;
        } else {
            this.f86220c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0c1)) {
            return false;
        }
        h0c1 h0c1Var = (h0c1) obj;
        return this.f86218a == h0c1Var.f86218a && this.f86219b == h0c1Var.f86219b && wj50.m88271j(this.f86220c, h0c1Var.f86220c);
    }

    public final int hashCode() {
        int iHashCode = this.f86218a.hashCode() * 31;
        x3a1 x3a1Var = this.f86219b;
        int iHashCode2 = (iHashCode + (x3a1Var == null ? 0 : x3a1Var.hashCode())) * 31;
        String str = this.f86220c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public h0c1(ewu0 ewu0Var, x3a1 x3a1Var, String str) {
        this.f86218a = ewu0Var;
        this.f86219b = x3a1Var;
        this.f86220c = str;
    }
}
