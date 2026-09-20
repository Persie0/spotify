package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iju0 {

    /* JADX INFO: renamed from: a */
    public final hju0 f102894a;

    /* JADX INFO: renamed from: b */
    public final boolean f102895b;

    /* JADX INFO: renamed from: c */
    public final boolean f102896c;

    public iju0(hju0 hju0Var, boolean z, boolean z2) {
        this.f102894a = hju0Var;
        this.f102895b = z;
        this.f102896c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static iju0 m50836a(iju0 iju0Var, hju0 hju0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            hju0Var = iju0Var.f102894a;
        }
        if ((i & 2) != 0) {
            z = iju0Var.f102895b;
        }
        if ((i & 4) != 0) {
            z2 = iju0Var.f102896c;
        }
        iju0Var.getClass();
        return new iju0(hju0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iju0)) {
            return false;
        }
        iju0 iju0Var = (iju0) obj;
        return wj50.m88271j(this.f102894a, iju0Var.f102894a) && this.f102895b == iju0Var.f102895b && this.f102896c == iju0Var.f102896c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102896c) + s571.m77245d(this.f102894a.hashCode() * 31, 31, this.f102895b);
    }

    public /* synthetic */ iju0(hju0 hju0Var, int i) {
        this((i & 1) != 0 ? new hju0((String) null, (qf40) null, 0, (String) null, (String) null, false, 0, 255) : hju0Var, false, false);
    }
}
