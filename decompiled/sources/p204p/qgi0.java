package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qgi0 {

    /* JADX INFO: renamed from: a */
    public final String f188478a;

    /* JADX INFO: renamed from: b */
    public final int f188479b;

    public qgi0(String str, int i) {
        this.f188478a = str;
        this.f188479b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgi0)) {
            return false;
        }
        qgi0 qgi0Var = (qgi0) obj;
        return wj50.m88271j(this.f188478a, qgi0Var.f188478a) && this.f188479b == qgi0Var.f188479b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f188479b) + (this.f188478a.hashCode() * 31);
    }
}
