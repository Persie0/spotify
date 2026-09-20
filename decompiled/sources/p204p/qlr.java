package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qlr {

    /* JADX INFO: renamed from: a */
    public final int f189902a;

    /* JADX INFO: renamed from: b */
    public final int f189903b;

    /* JADX INFO: renamed from: c */
    public final String f189904c;

    public qlr(int i, int i2, String str) {
        this.f189902a = i;
        this.f189903b = i2;
        this.f189904c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlr)) {
            return false;
        }
        qlr qlrVar = (qlr) obj;
        return this.f189902a == qlrVar.f189902a && this.f189903b == qlrVar.f189903b && wj50.m88271j(this.f189904c, qlrVar.f189904c);
    }

    public final int hashCode() {
        return this.f189904c.hashCode() + mt60.m62800g(this.f189903b, Integer.hashCode(this.f189902a) * 31, 31);
    }
}
