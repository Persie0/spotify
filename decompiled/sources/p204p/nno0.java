package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nno0 {

    /* JADX INFO: renamed from: a */
    public final String f156459a;

    /* JADX INFO: renamed from: b */
    public final String f156460b;

    /* JADX INFO: renamed from: c */
    public final String f156461c;

    /* JADX INFO: renamed from: d */
    public final String f156462d;

    /* JADX INFO: renamed from: e */
    public final f5u f156463e;

    public nno0(String str, String str2, String str3, String str4, f5u f5uVar) {
        this.f156459a = str;
        this.f156460b = str2;
        this.f156461c = str3;
        this.f156462d = str4;
        this.f156463e = f5uVar;
    }

    /* JADX INFO: renamed from: a */
    public final f5u m65213a() {
        return this.f156463e;
    }

    /* JADX INFO: renamed from: b */
    public final String m65214b() {
        return this.f156459a;
    }

    /* JADX INFO: renamed from: c */
    public final String m65215c() {
        return this.f156461c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nno0)) {
            return false;
        }
        nno0 nno0Var = (nno0) obj;
        return wj50.m88271j(this.f156459a, nno0Var.f156459a) && wj50.m88271j(this.f156460b, nno0Var.f156460b) && wj50.m88271j(this.f156461c, nno0Var.f156461c) && wj50.m88271j(this.f156462d, nno0Var.f156462d) && wj50.m88271j(this.f156463e, nno0Var.f156463e);
    }

    public final int hashCode() {
        int iHashCode = this.f156459a.hashCode() * 31;
        String str = this.f156460b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156461c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f156462d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        f5u f5uVar = this.f156463e;
        return iHashCode4 + (f5uVar != null ? f5uVar.hashCode() : 0);
    }

    public /* synthetic */ nno0(String str, String str2, String str3, f5u f5uVar, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (String) null, (i & 16) != 0 ? null : f5uVar);
    }
}
