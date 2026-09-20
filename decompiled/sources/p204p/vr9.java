package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class vr9 {

    /* JADX INFO: renamed from: a */
    public final boolean f244110a;

    /* JADX INFO: renamed from: b */
    public final int f244111b;

    /* JADX INFO: renamed from: c */
    public final int f244112c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f244113d;

    public vr9(boolean z, int i, int i2, ArrayList arrayList) {
        this.f244110a = z;
        this.f244111b = i;
        this.f244112c = i2;
        this.f244113d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr9)) {
            return false;
        }
        vr9 vr9Var = (vr9) obj;
        return this.f244110a == vr9Var.f244110a && this.f244111b == vr9Var.f244111b && this.f244112c == vr9Var.f244112c && this.f244113d.equals(vr9Var.f244113d);
    }

    public final int hashCode() {
        return this.f244113d.hashCode() + mt60.m62800g(this.f244112c, mt60.m62800g(this.f244111b, Boolean.hashCode(this.f244110a) * 31, 31), 31);
    }
}
