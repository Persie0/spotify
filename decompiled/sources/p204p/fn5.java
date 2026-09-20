package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final rey f71183a;

    /* JADX INFO: renamed from: b */
    public final String f71184b;

    public fn5(rey reyVar, String str) {
        this.f71183a = reyVar;
        this.f71184b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn5)) {
            return false;
        }
        fn5 fn5Var = (fn5) obj;
        return wj50.m88271j(this.f71183a, fn5Var.f71183a) && wj50.m88271j(this.f71184b, fn5Var.f71184b);
    }

    public final int hashCode() {
        return this.f71184b.hashCode() + (this.f71183a.hashCode() * 31);
    }
}
