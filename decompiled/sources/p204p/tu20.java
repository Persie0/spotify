package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tu20 {

    /* JADX INFO: renamed from: a */
    public final String f223746a;

    /* JADX INFO: renamed from: b */
    public final String f223747b;

    public tu20(String str, String str2) {
        this.f223746a = str;
        this.f223747b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu20)) {
            return false;
        }
        tu20 tu20Var = (tu20) obj;
        return wj50.m88271j(this.f223746a, tu20Var.f223746a) && wj50.m88271j(this.f223747b, tu20Var.f223747b);
    }

    public final int hashCode() {
        return this.f223747b.hashCode() + (this.f223746a.hashCode() * 31);
    }
}
