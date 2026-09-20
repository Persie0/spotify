package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hl8 {

    /* JADX INFO: renamed from: a */
    public final String f92638a;

    /* JADX INFO: renamed from: b */
    public final int f92639b;

    public hl8(String str, int i) {
        this.f92638a = str;
        this.f92639b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl8)) {
            return false;
        }
        hl8 hl8Var = (hl8) obj;
        return wj50.m88271j(this.f92638a, hl8Var.f92638a) && this.f92639b == hl8Var.f92639b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92639b) + (this.f92638a.hashCode() * 31);
    }
}
