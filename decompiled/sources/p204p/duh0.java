package p204p;

import androidx.car.app.model.CarColor;

/* JADX INFO: loaded from: classes5.dex */
public final class duh0 {

    /* JADX INFO: renamed from: a */
    public final int f53058a;

    /* JADX INFO: renamed from: b */
    public final int f53059b;

    public duh0(int i, int i2) {
        this.f53058a = i;
        this.f53059b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final CarColor m36971a() {
        return CarColor.createCustom(this.f53058a, this.f53059b);
    }

    /* JADX INFO: renamed from: b */
    public final pqm0 m36972b() {
        return new pqm0(Integer.valueOf(this.f53058a), Integer.valueOf(this.f53059b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duh0)) {
            return false;
        }
        duh0 duh0Var = (duh0) obj;
        return this.f53058a == duh0Var.f53058a && this.f53059b == duh0Var.f53059b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53059b) + (Integer.hashCode(this.f53058a) * 31);
    }
}
