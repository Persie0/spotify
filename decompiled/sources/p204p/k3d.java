package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class k3d implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f118847d = new ak0(17);

    /* JADX INFO: renamed from: a */
    public final mec0 f118848a;

    /* JADX INFO: renamed from: b */
    public final String f118849b;

    /* JADX INFO: renamed from: c */
    public final String f118850c;

    public k3d(mec0 mec0Var, String str, String str2) {
        this.f118848a = mec0Var;
        this.f118849b = str;
        this.f118850c = str2;
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
        if (!(obj instanceof k3d)) {
            return false;
        }
        k3d k3dVar = (k3d) obj;
        return this.f118848a.equals(k3dVar.f118848a) && wj50.m88271j(this.f118849b, k3dVar.f118849b) && wj50.m88271j(this.f118850c, k3dVar.f118850c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f118847d;
    }

    public final int hashCode() {
        int iHashCode = this.f118848a.hashCode() * 31;
        String str = this.f118849b;
        return this.f118850c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
