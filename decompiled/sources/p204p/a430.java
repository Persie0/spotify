package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a430 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2524w8 f12128a;

    /* JADX INFO: renamed from: b */
    public final z330 f12129b;

    public a430(AbstractC2524w8 abstractC2524w8, z330 z330Var, int i) {
        abstractC2524w8 = (i & 1) != 0 ? lv21.f137205b : abstractC2524w8;
        z330Var = (i & 2) != 0 ? x330.f257666a : z330Var;
        this.f12128a = abstractC2524w8;
        this.f12129b = z330Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a430)) {
            return false;
        }
        a430 a430Var = (a430) obj;
        return wj50.m88271j(this.f12128a, a430Var.f12128a) && wj50.m88271j(this.f12129b, a430Var.f12129b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d((this.f12129b.hashCode() + (this.f12128a.hashCode() * 31)) * 31, 31, false);
    }
}
