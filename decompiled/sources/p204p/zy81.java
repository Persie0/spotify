package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zy81 {

    /* JADX INFO: renamed from: a */
    public final String f287517a;

    /* JADX INFO: renamed from: b */
    public final int f287518b;

    /* JADX INFO: renamed from: c */
    public final int f287519c;

    /* JADX INFO: renamed from: d */
    public final boolean f287520d;

    public zy81(String str, int i, int i2, boolean z) {
        this.f287517a = str;
        this.f287518b = i;
        this.f287519c = i2;
        this.f287520d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy81)) {
            return false;
        }
        zy81 zy81Var = (zy81) obj;
        return wj50.m88271j(this.f287517a, zy81Var.f287517a) && this.f287518b == zy81Var.f287518b && this.f287519c == zy81Var.f287519c && this.f287520d == zy81Var.f287520d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f287520d) + mt60.m62800g(this.f287519c, mt60.m62800g(this.f287518b, this.f287517a.hashCode() * 31, 31), 31);
    }
}
