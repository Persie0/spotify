package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rz80 {

    /* JADX INFO: renamed from: a */
    public final String f204089a;

    /* JADX INFO: renamed from: b */
    public final gva f204090b;

    /* JADX INFO: renamed from: c */
    public final gva f204091c;

    /* JADX INFO: renamed from: d */
    public final boolean f204092d;

    public /* synthetic */ rz80(String str, gva gvaVar, gva gvaVar2, int i) {
        this(str, (i & 2) != 0 ? null : gvaVar, (i & 4) != 0 ? null : gvaVar2, (i & 8) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz80)) {
            return false;
        }
        rz80 rz80Var = (rz80) obj;
        return wj50.m88271j(this.f204089a, rz80Var.f204089a) && wj50.m88271j(this.f204090b, rz80Var.f204090b) && wj50.m88271j(this.f204091c, rz80Var.f204091c) && this.f204092d == rz80Var.f204092d;
    }

    public final int hashCode() {
        int iHashCode = this.f204089a.hashCode() * 31;
        gva gvaVar = this.f204090b;
        int iHashCode2 = (iHashCode + (gvaVar == null ? 0 : gvaVar.hashCode())) * 31;
        gva gvaVar2 = this.f204091c;
        return Boolean.hashCode(this.f204092d) + ((iHashCode2 + (gvaVar2 != null ? gvaVar2.hashCode() : 0)) * 31);
    }

    public rz80(String str, gva gvaVar, gva gvaVar2, boolean z) {
        this.f204089a = str;
        this.f204090b = gvaVar;
        this.f204091c = gvaVar2;
        this.f204092d = z;
    }
}
