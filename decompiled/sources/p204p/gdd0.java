package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gdd0 {

    /* JADX INFO: renamed from: a */
    public final String f78807a;

    /* JADX INFO: renamed from: b */
    public final String f78808b;

    /* JADX INFO: renamed from: c */
    public final aej f78809c;

    /* JADX INFO: renamed from: d */
    public final boolean f78810d;

    /* JADX INFO: renamed from: e */
    public final pla1 f78811e;

    public gdd0(String str, String str2, aej aejVar, boolean z, pla1 pla1Var) {
        this.f78807a = str;
        this.f78808b = str2;
        this.f78809c = aejVar;
        this.f78810d = z;
        this.f78811e = pla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdd0)) {
            return false;
        }
        gdd0 gdd0Var = (gdd0) obj;
        return wj50.m88271j(this.f78807a, gdd0Var.f78807a) && wj50.m88271j(this.f78808b, gdd0Var.f78808b) && wj50.m88271j(this.f78809c, gdd0Var.f78809c) && this.f78810d == gdd0Var.f78810d && wj50.m88271j(this.f78811e, gdd0Var.f78811e);
    }

    public final int hashCode() {
        return this.f78811e.hashCode() + s571.m77245d((this.f78809c.hashCode() + s571.m77243b(this.f78807a.hashCode() * 31, 31, this.f78808b)) * 31, 31, this.f78810d);
    }
}
