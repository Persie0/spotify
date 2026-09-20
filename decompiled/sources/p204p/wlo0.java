package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wlo0 implements amo0 {

    /* JADX INFO: renamed from: a */
    public final uqw f252591a;

    /* JADX INFO: renamed from: b */
    public final hrw f252592b;

    public wlo0(uqw uqwVar, hrw hrwVar) {
        this.f252591a = uqwVar;
        this.f252592b = hrwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlo0)) {
            return false;
        }
        wlo0 wlo0Var = (wlo0) obj;
        return this.f252591a.equals(wlo0Var.f252591a) && this.f252592b.equals(wlo0Var.f252592b);
    }

    public final int hashCode() {
        return this.f252592b.hashCode() + (this.f252591a.hashCode() * 31);
    }
}
