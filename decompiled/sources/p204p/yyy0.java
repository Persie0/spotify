package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yyy0 {

    /* JADX INFO: renamed from: a */
    public final String f277630a;

    /* JADX INFO: renamed from: b */
    public final int f277631b;

    public yyy0(String str, int i) {
        this.f277630a = str;
        this.f277631b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyy0)) {
            return false;
        }
        yyy0 yyy0Var = (yyy0) obj;
        return wj50.m88271j(this.f277630a, yyy0Var.f277630a) && this.f277631b == yyy0Var.f277631b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f277631b) + (this.f277630a.hashCode() * 31);
    }
}
