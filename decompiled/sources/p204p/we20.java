package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class we20 {

    /* JADX INFO: renamed from: d */
    public static final iva f250408d;

    /* JADX INFO: renamed from: e */
    public static final iva f250409e;

    /* JADX INFO: renamed from: f */
    public static final iva f250410f;

    /* JADX INFO: renamed from: g */
    public static final iva f250411g;

    /* JADX INFO: renamed from: h */
    public static final iva f250412h;

    /* JADX INFO: renamed from: i */
    public static final iva f250413i;

    /* JADX INFO: renamed from: a */
    public final iva f250414a;

    /* JADX INFO: renamed from: b */
    public final iva f250415b;

    /* JADX INFO: renamed from: c */
    public final int f250416c;

    static {
        iva ivaVar = new iva(kk40.m56679u(":"));
        ivaVar.f106180c = ":";
        f250408d = ivaVar;
        iva ivaVar2 = new iva(kk40.m56679u(":status"));
        ivaVar2.f106180c = ":status";
        f250409e = ivaVar2;
        iva ivaVar3 = new iva(kk40.m56679u(":method"));
        ivaVar3.f106180c = ":method";
        f250410f = ivaVar3;
        iva ivaVar4 = new iva(kk40.m56679u(":path"));
        ivaVar4.f106180c = ":path";
        f250411g = ivaVar4;
        iva ivaVar5 = new iva(kk40.m56679u(":scheme"));
        ivaVar5.f106180c = ":scheme";
        f250412h = ivaVar5;
        iva ivaVar6 = new iva(kk40.m56679u(":authority"));
        ivaVar6.f106180c = ":authority";
        f250413i = ivaVar6;
    }

    public we20(iva ivaVar, iva ivaVar2) {
        this.f250414a = ivaVar;
        this.f250415b = ivaVar2;
        this.f250416c = ivaVar2.mo51747d() + ivaVar.mo51747d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we20)) {
            return false;
        }
        we20 we20Var = (we20) obj;
        return wj50.m88271j(this.f250414a, we20Var.f250414a) && wj50.m88271j(this.f250415b, we20Var.f250415b);
    }

    public final int hashCode() {
        return this.f250415b.hashCode() + (this.f250414a.hashCode() * 31);
    }

    public final String toString() {
        return this.f250414a.m51759r() + ": " + this.f250415b.m51759r();
    }

    public we20(String str, String str2) {
        iva ivaVar = new iva(kk40.m56679u(str));
        ivaVar.f106180c = str;
        iva ivaVar2 = new iva(kk40.m56679u(str2));
        ivaVar2.f106180c = str2;
        this(ivaVar, ivaVar2);
    }

    public we20(iva ivaVar, String str) {
        iva ivaVar2 = new iva(kk40.m56679u(str));
        ivaVar2.f106180c = str;
        this(ivaVar, ivaVar2);
    }
}
