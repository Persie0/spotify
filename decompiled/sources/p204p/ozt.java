package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ozt {

    /* JADX INFO: renamed from: a */
    public final boolean f172357a;

    /* JADX INFO: renamed from: b */
    public final boolean f172358b;

    /* JADX INFO: renamed from: c */
    public final nzt f172359c;

    /* JADX INFO: renamed from: d */
    public final gzt f172360d;

    public ozt(boolean z, boolean z2, nzt nztVar, gzt gztVar) {
        this.f172357a = z;
        this.f172358b = z2;
        this.f172359c = nztVar;
        this.f172360d = gztVar;
    }

    /* JADX INFO: renamed from: a */
    public static ozt m68665a(ozt oztVar, boolean z, boolean z2, nzt nztVar, gzt gztVar, int i) {
        if ((i & 1) != 0) {
            z = oztVar.f172357a;
        }
        if ((i & 2) != 0) {
            z2 = oztVar.f172358b;
        }
        if ((i & 4) != 0) {
            nztVar = oztVar.f172359c;
        }
        if ((i & 8) != 0) {
            gztVar = oztVar.f172360d;
        }
        oztVar.getClass();
        return new ozt(z, z2, nztVar, gztVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozt)) {
            return false;
        }
        ozt oztVar = (ozt) obj;
        return this.f172357a == oztVar.f172357a && this.f172358b == oztVar.f172358b && wj50.m88271j(this.f172359c, oztVar.f172359c) && wj50.m88271j(this.f172360d, oztVar.f172360d);
    }

    public final int hashCode() {
        return this.f172360d.hashCode() + ((this.f172359c.hashCode() + s571.m77245d(Boolean.hashCode(this.f172357a) * 31, 31, this.f172358b)) * 31);
    }
}
