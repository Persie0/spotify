package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class au31 {

    /* JADX INFO: renamed from: a */
    public final String f19831a;

    /* JADX INFO: renamed from: b */
    public final int f19832b;

    public au31(String str, int i) {
        this.f19831a = str;
        this.f19832b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au31)) {
            return false;
        }
        au31 au31Var = (au31) obj;
        return wj50.m88271j(this.f19831a, au31Var.f19831a) && this.f19832b == au31Var.f19832b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19832b) + (this.f19831a.hashCode() * 31);
    }
}
