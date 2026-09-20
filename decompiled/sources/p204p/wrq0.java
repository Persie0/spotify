package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wrq0 {

    /* JADX INFO: renamed from: a */
    public final String f254404a;

    /* JADX INFO: renamed from: b */
    public final String f254405b;

    /* JADX INFO: renamed from: c */
    public final boolean f254406c;

    public wrq0(String str, String str2, boolean z) {
        this.f254404a = str;
        this.f254405b = str2;
        this.f254406c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrq0)) {
            return false;
        }
        wrq0 wrq0Var = (wrq0) obj;
        return wj50.m88271j(this.f254404a, wrq0Var.f254404a) && wj50.m88271j(this.f254405b, wrq0Var.f254405b) && this.f254406c == wrq0Var.f254406c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254406c) + s571.m77243b(this.f254404a.hashCode() * 31, 31, this.f254405b);
    }
}
