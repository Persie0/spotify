package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q8t {

    /* JADX INFO: renamed from: a */
    public final String f186380a;

    /* JADX INFO: renamed from: b */
    public final String f186381b;

    /* JADX INFO: renamed from: c */
    public final hv41 f186382c;

    /* JADX INFO: renamed from: d */
    public final yu11 f186383d;

    /* JADX INFO: renamed from: e */
    public final c6u0 f186384e;

    public q8t(String str, String str2, hv41 hv41Var, yu11 yu11Var, c6u0 c6u0Var) {
        this.f186380a = str;
        this.f186381b = str2;
        this.f186382c = hv41Var;
        this.f186383d = yu11Var;
        this.f186384e = c6u0Var;
    }

    /* JADX INFO: renamed from: a */
    public static q8t m72339a(q8t q8tVar, hv41 hv41Var, yu11 yu11Var, int i) {
        String str = q8tVar.f186380a;
        String str2 = q8tVar.f186381b;
        if ((i & 4) != 0) {
            hv41Var = q8tVar.f186382c;
        }
        hv41 hv41Var2 = hv41Var;
        if ((i & 8) != 0) {
            yu11Var = q8tVar.f186383d;
        }
        c6u0 c6u0Var = q8tVar.f186384e;
        q8tVar.getClass();
        return new q8t(str, str2, hv41Var2, yu11Var, c6u0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8t)) {
            return false;
        }
        q8t q8tVar = (q8t) obj;
        return wj50.m88271j(this.f186380a, q8tVar.f186380a) && wj50.m88271j(this.f186381b, q8tVar.f186381b) && wj50.m88271j(this.f186382c, q8tVar.f186382c) && this.f186383d == q8tVar.f186383d && wj50.m88271j(this.f186384e, q8tVar.f186384e);
    }

    public final int hashCode() {
        return this.f186384e.hashCode() + ((this.f186383d.hashCode() + ((this.f186382c.hashCode() + s571.m77243b(this.f186380a.hashCode() * 31, 31, this.f186381b)) * 31)) * 31);
    }
}
