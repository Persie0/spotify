package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fdz {

    /* JADX INFO: renamed from: a */
    public final String f68618a;

    /* JADX INFO: renamed from: b */
    public final String f68619b;

    /* JADX INFO: renamed from: c */
    public final rcz f68620c;

    /* JADX INFO: renamed from: d */
    public final rcm0 f68621d;

    /* JADX INFO: renamed from: e */
    public final is9 f68622e;

    /* JADX INFO: renamed from: f */
    public final int f68623f;

    /* JADX INFO: renamed from: g */
    public final String f68624g;

    /* JADX INFO: renamed from: h */
    public final String f68625h;

    public fdz(String str, String str2, rcz rczVar, rcm0 rcm0Var, is9 is9Var, int i, String str3, String str4) {
        this.f68618a = str;
        this.f68619b = str2;
        this.f68620c = rczVar;
        this.f68621d = rcm0Var;
        this.f68622e = is9Var;
        this.f68623f = i;
        this.f68624g = str3;
        this.f68625h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdz)) {
            return false;
        }
        fdz fdzVar = (fdz) obj;
        return wj50.m88271j(this.f68618a, fdzVar.f68618a) && wj50.m88271j(this.f68619b, fdzVar.f68619b) && this.f68620c == fdzVar.f68620c && wj50.m88271j(this.f68621d, fdzVar.f68621d) && wj50.m88271j(this.f68622e, fdzVar.f68622e) && this.f68623f == fdzVar.f68623f && wj50.m88271j(this.f68624g, fdzVar.f68624g) && wj50.m88271j(this.f68625h, fdzVar.f68625h);
    }

    public final int hashCode() {
        return this.f68625h.hashCode() + s571.m77243b(mt60.m62800g(this.f68623f, (this.f68622e.hashCode() + yds.m93483m(this.f68621d, (this.f68620c.hashCode() + s571.m77243b(this.f68618a.hashCode() * 31, 31, this.f68619b)) * 31, 31)) * 31, 31), 31, this.f68624g);
    }
}
