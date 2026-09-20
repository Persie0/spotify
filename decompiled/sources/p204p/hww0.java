package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hww0 {

    /* JADX INFO: renamed from: a */
    public final String f96066a;

    /* JADX INFO: renamed from: b */
    public final ppg1 f96067b;

    public hww0(String str, ppg1 ppg1Var) {
        this.f96066a = str;
        this.f96067b = ppg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hww0)) {
            return false;
        }
        hww0 hww0Var = (hww0) obj;
        return wj50.m88271j(this.f96066a, hww0Var.f96066a) && wj50.m88271j(this.f96067b, hww0Var.f96067b);
    }

    public final int hashCode() {
        return this.f96067b.hashCode() + (this.f96066a.hashCode() * 31);
    }
}
