package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dtc {

    /* JADX INFO: renamed from: a */
    public final String f52766a;

    /* JADX INFO: renamed from: b */
    public final qf40 f52767b;

    public dtc(String str, qf40 qf40Var) {
        this.f52766a = str;
        this.f52767b = qf40Var;
    }

    /* JADX INFO: renamed from: a */
    public final qf40 m36847a() {
        return this.f52767b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtc)) {
            return false;
        }
        dtc dtcVar = (dtc) obj;
        return wj50.m88271j(this.f52766a, dtcVar.f52766a) && wj50.m88271j(this.f52767b, dtcVar.f52767b);
    }

    public final int hashCode() {
        return this.f52767b.hashCode() + (this.f52766a.hashCode() * 31);
    }
}
