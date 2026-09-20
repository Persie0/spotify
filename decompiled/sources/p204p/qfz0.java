package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qfz0 {

    /* JADX INFO: renamed from: a */
    public final String f188316a;

    /* JADX INFO: renamed from: b */
    public final int f188317b;

    public qfz0(String str, int i) {
        this.f188316a = str;
        this.f188317b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfz0)) {
            return false;
        }
        qfz0 qfz0Var = (qfz0) obj;
        return wj50.m88271j(this.f188316a, qfz0Var.f188316a) && this.f188317b == qfz0Var.f188317b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f188317b) + (this.f188316a.hashCode() * 31);
    }
}
