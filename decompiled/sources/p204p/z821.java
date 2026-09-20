package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z821 implements b921 {

    /* JADX INFO: renamed from: a */
    public final String f280346a;

    /* JADX INFO: renamed from: b */
    public final int f280347b;

    public z821(String str, int i) {
        this.f280346a = str;
        this.f280347b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z821)) {
            return false;
        }
        z821 z821Var = (z821) obj;
        return wj50.m88271j(this.f280346a, z821Var.f280346a) && this.f280347b == z821Var.f280347b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f280347b) + (this.f280346a.hashCode() * 31);
    }
}
