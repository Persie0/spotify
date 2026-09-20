package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fp6 extends gp6 {

    /* JADX INFO: renamed from: d */
    public final String f71745d;

    /* JADX INFO: renamed from: e */
    public final String f71746e;

    public fp6(String str, String str2) {
        this.f71745d = str;
        this.f71746e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp6)) {
            return false;
        }
        fp6 fp6Var = (fp6) obj;
        return wj50.m88271j(this.f71745d, fp6Var.f71745d) && wj50.m88271j(this.f71746e, fp6Var.f71746e);
    }

    public final int hashCode() {
        return this.f71746e.hashCode() + (this.f71745d.hashCode() * 31);
    }

    @Override // p204p.vyf1
    /* JADX INFO: renamed from: x */
    public final String mo39618x() {
        return this.f71745d;
    }
}
