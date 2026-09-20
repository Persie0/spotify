package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pu70 {

    /* JADX INFO: renamed from: a */
    public final int f181380a;

    /* JADX INFO: renamed from: b */
    public final int f181381b;

    public pu70(int i, int i2) {
        this.f181380a = i;
        this.f181381b = i2;
        if (!(i >= 0)) {
            pt40.m70891a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        pt40.m70891a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu70)) {
            return false;
        }
        pu70 pu70Var = (pu70) obj;
        return this.f181380a == pu70Var.f181380a && this.f181381b == pu70Var.f181381b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f181381b) + (Integer.hashCode(this.f181380a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f181380a);
        sb.append(", end=");
        return edb.m38567p(sb, this.f181381b, ')');
    }
}
