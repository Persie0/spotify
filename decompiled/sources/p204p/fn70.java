package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fn70 extends lrg1 {

    /* JADX INFO: renamed from: b */
    public final ee9 f71215b;

    /* JADX INFO: renamed from: c */
    public final x6x0 f71216c;

    public fn70(ee9 ee9Var, x6x0 x6x0Var) {
        this.f71215b = ee9Var;
        this.f71216c = x6x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn70)) {
            return false;
        }
        fn70 fn70Var = (fn70) obj;
        return wj50.m88271j(this.f71215b, fn70Var.f71215b) && wj50.m88271j(this.f71216c, fn70Var.f71216c);
    }

    public final int hashCode() {
        return this.f71216c.hashCode() + (this.f71215b.hashCode() * 31);
    }
}
