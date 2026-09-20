package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class er51 {

    /* JADX INFO: renamed from: a */
    public final String f62025a;

    /* JADX INFO: renamed from: b */
    public final String f62026b;

    /* JADX INFO: renamed from: c */
    public final int f62027c;

    public er51(String str, String str2, int i) {
        this.f62025a = str;
        this.f62026b = str2;
        this.f62027c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er51)) {
            return false;
        }
        er51 er51Var = (er51) obj;
        return wj50.m88271j(this.f62025a, er51Var.f62025a) && wj50.m88271j(this.f62026b, er51Var.f62026b) && this.f62027c == er51Var.f62027c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f62027c) + s571.m77243b(this.f62025a.hashCode() * 31, 31, this.f62026b);
    }
}
