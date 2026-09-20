package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vjr0 {

    /* JADX INFO: renamed from: a */
    public final String f242043a;

    /* JADX INFO: renamed from: b */
    public final String f242044b;

    public vjr0(String str, String str2) {
        this.f242043a = str;
        this.f242044b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjr0)) {
            return false;
        }
        vjr0 vjr0Var = (vjr0) obj;
        return wj50.m88271j(this.f242043a, vjr0Var.f242043a) && wj50.m88271j(this.f242044b, vjr0Var.f242044b);
    }

    public final int hashCode() {
        return this.f242044b.hashCode() + (this.f242043a.hashCode() * 31);
    }
}
