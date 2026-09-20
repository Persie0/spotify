package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sgn0 implements tgn0 {

    /* JADX INFO: renamed from: a */
    public final String f208907a;

    /* JADX INFO: renamed from: b */
    public final String f208908b;

    public sgn0(String str, String str2) {
        this.f208907a = str;
        this.f208908b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgn0)) {
            return false;
        }
        sgn0 sgn0Var = (sgn0) obj;
        return wj50.m88271j(this.f208907a, sgn0Var.f208907a) && wj50.m88271j(this.f208908b, sgn0Var.f208908b);
    }

    public final int hashCode() {
        return this.f208908b.hashCode() + (this.f208907a.hashCode() * 31);
    }
}
