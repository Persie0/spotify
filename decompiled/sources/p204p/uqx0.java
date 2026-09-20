package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uqx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f233145a;

    /* JADX INFO: renamed from: b */
    public final String f233146b;

    /* JADX INFO: renamed from: c */
    public final String f233147c;

    /* JADX INFO: renamed from: d */
    public final boolean f233148d;

    public uqx0(String str, int i, String str2, boolean z) {
        this.f233145a = i;
        this.f233146b = str;
        this.f233147c = str2;
        this.f233148d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqx0)) {
            return false;
        }
        uqx0 uqx0Var = (uqx0) obj;
        return this.f233145a == uqx0Var.f233145a && wj50.m88271j(this.f233146b, uqx0Var.f233146b) && wj50.m88271j(this.f233147c, uqx0Var.f233147c) && this.f233148d == uqx0Var.f233148d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233148d) + s571.m77243b(s571.m77243b(Integer.hashCode(this.f233145a) * 31, 31, this.f233146b), 31, this.f233147c);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f233145a;
    }
}
