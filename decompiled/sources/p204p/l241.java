package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class l241 {

    /* JADX INFO: renamed from: a */
    public final int f128916a;

    /* JADX INFO: renamed from: b */
    public final k241 f128917b;

    public l241(int i, k241 k241Var) {
        this.f128916a = i;
        this.f128917b = k241Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l241)) {
            return false;
        }
        l241 l241Var = (l241) obj;
        return this.f128916a == l241Var.f128916a && wj50.m88271j(this.f128917b, l241Var.f128917b);
    }

    public final int hashCode() {
        return this.f128917b.hashCode() + (Integer.hashCode(this.f128916a) * 31);
    }

    public /* synthetic */ l241() {
        this(100, g241.f75834a);
    }
}
