package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cl6 {

    /* JADX INFO: renamed from: a */
    public final String f39191a;

    /* JADX INFO: renamed from: b */
    public final String f39192b;

    public /* synthetic */ cl6() {
        this("", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl6)) {
            return false;
        }
        cl6 cl6Var = (cl6) obj;
        return wj50.m88271j(this.f39191a, cl6Var.f39191a) && wj50.m88271j(this.f39192b, cl6Var.f39192b);
    }

    public final int hashCode() {
        return this.f39192b.hashCode() + (this.f39191a.hashCode() * 31);
    }

    public cl6(String str, String str2) {
        this.f39191a = str;
        this.f39192b = str2;
    }
}
