package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ev0 implements gv0 {

    /* JADX INFO: renamed from: a */
    public final int f63114a;

    /* JADX INFO: renamed from: b */
    public final String f63115b;

    public ev0(int i, String str) {
        this.f63114a = i;
        this.f63115b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev0)) {
            return false;
        }
        ev0 ev0Var = (ev0) obj;
        return this.f63114a == ev0Var.f63114a && wj50.m88271j(this.f63115b, ev0Var.f63115b);
    }

    public final int hashCode() {
        return this.f63115b.hashCode() + (Integer.hashCode(this.f63114a) * 31);
    }
}
