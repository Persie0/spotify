package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fkb {

    /* JADX INFO: renamed from: a */
    public final String f70516a;

    /* JADX INFO: renamed from: b */
    public final String f70517b;

    /* JADX INFO: renamed from: c */
    public final ekb f70518c;

    /* JADX INFO: renamed from: d */
    public final boolean f70519d;

    public fkb(String str, String str2, ekb ekbVar, boolean z) {
        this.f70516a = str;
        this.f70517b = str2;
        this.f70518c = ekbVar;
        this.f70519d = z;
    }

    /* JADX INFO: renamed from: a */
    public static fkb m41885a(fkb fkbVar, ekb ekbVar) {
        String str = fkbVar.f70516a;
        String str2 = fkbVar.f70517b;
        boolean z = fkbVar.f70519d;
        fkbVar.getClass();
        return new fkb(str, str2, ekbVar, z);
    }

    /* JADX INFO: renamed from: b */
    public final String m41886b() {
        return this.f70516a;
    }

    /* JADX INFO: renamed from: c */
    public final String m41887c() {
        return this.f70517b;
    }

    /* JADX INFO: renamed from: d */
    public final ekb m41888d() {
        return this.f70518c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m41889e() {
        return this.f70519d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkb)) {
            return false;
        }
        fkb fkbVar = (fkb) obj;
        return wj50.m88271j(this.f70516a, fkbVar.f70516a) && wj50.m88271j(this.f70517b, fkbVar.f70517b) && wj50.m88271j(this.f70518c, fkbVar.f70518c) && this.f70519d == fkbVar.f70519d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70519d) + ((this.f70518c.hashCode() + s571.m77243b(this.f70516a.hashCode() * 31, 31, this.f70517b)) * 31);
    }
}
