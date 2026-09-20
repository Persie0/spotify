package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class y0l0 {

    /* JADX INFO: renamed from: a */
    public final String f268002a;

    /* JADX INFO: renamed from: b */
    public final String f268003b;

    /* JADX INFO: renamed from: c */
    public final List f268004c;

    /* JADX INFO: renamed from: d */
    public final String f268005d;

    /* JADX INFO: renamed from: e */
    public final int f268006e;

    /* JADX INFO: renamed from: f */
    public final boolean f268007f;

    /* JADX INFO: renamed from: g */
    public final m0r f268008g;

    /* JADX INFO: renamed from: h */
    public final Float f268009h;

    /* JADX INFO: renamed from: i */
    public final boolean f268010i;

    public y0l0(String str, String str2, List list, String str3, int i, boolean z, m0r m0rVar, Float f, boolean z2) {
        this.f268002a = str;
        this.f268003b = str2;
        this.f268004c = list;
        this.f268005d = str3;
        this.f268006e = i;
        this.f268007f = z;
        this.f268008g = m0rVar;
        this.f268009h = f;
        this.f268010i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0l0)) {
            return false;
        }
        y0l0 y0l0Var = (y0l0) obj;
        return wj50.m88271j(this.f268002a, y0l0Var.f268002a) && wj50.m88271j(this.f268003b, y0l0Var.f268003b) && wj50.m88271j(this.f268004c, y0l0Var.f268004c) && wj50.m88271j(this.f268005d, y0l0Var.f268005d) && this.f268006e == y0l0Var.f268006e && this.f268007f == y0l0Var.f268007f && this.f268008g == y0l0Var.f268008g && this.f268009h.equals(y0l0Var.f268009h) && this.f268010i == y0l0Var.f268010i;
    }

    public final int hashCode() {
        String str = this.f268002a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f268003b;
        int iM77244c = s571.m77244c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f268004c);
        String str3 = this.f268005d;
        int iM77245d = s571.m77245d(f710.m40938f(this.f268006e, (iM77244c + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f268007f);
        m0r m0rVar = this.f268008g;
        return Boolean.hashCode(this.f268010i) + f710.m40938f(1, (this.f268009h.hashCode() + ((iM77245d + (m0rVar != null ? m0rVar.hashCode() : 0)) * 31)) * 961, 31);
    }
}
