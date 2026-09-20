package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vup0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final iup0 f245057d = new iup0(12);

    /* JADX INFO: renamed from: a */
    public final mec0 f245058a;

    /* JADX INFO: renamed from: b */
    public final String f245059b;

    /* JADX INFO: renamed from: c */
    public final String f245060c;

    public vup0(mec0 mec0Var, String str, String str2) {
        this.f245058a = mec0Var;
        this.f245059b = str;
        this.f245060c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vup0)) {
            return false;
        }
        vup0 vup0Var = (vup0) obj;
        return this.f245058a.equals(vup0Var.f245058a) && wj50.m88271j(this.f245059b, vup0Var.f245059b) && wj50.m88271j(this.f245060c, vup0Var.f245060c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f245057d;
    }

    public final int hashCode() {
        int iHashCode = this.f245058a.hashCode() * 31;
        String str = this.f245059b;
        return this.f245060c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
