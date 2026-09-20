package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i96 {

    /* JADX INFO: renamed from: a */
    public final boolean f99914a;

    /* JADX INFO: renamed from: b */
    public final String f99915b;

    /* JADX INFO: renamed from: c */
    public final vdl f99916c;

    /* JADX INFO: renamed from: d */
    public final boolean f99917d;

    public i96(boolean z, String str, vdl vdlVar, boolean z2) {
        this.f99914a = z;
        this.f99915b = str;
        this.f99916c = vdlVar;
        this.f99917d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i96)) {
            return false;
        }
        i96 i96Var = (i96) obj;
        return this.f99914a == i96Var.f99914a && wj50.m88271j(this.f99915b, i96Var.f99915b) && wj50.m88271j(this.f99916c, i96Var.f99916c) && this.f99917d == i96Var.f99917d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f99914a) * 31;
        String str = this.f99915b;
        return Boolean.hashCode(this.f99917d) + ((this.f99916c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
