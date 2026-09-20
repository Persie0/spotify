package p204p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class hcq {

    /* JADX INFO: renamed from: a */
    public final zbq f89884a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f89885b;

    /* JADX INFO: renamed from: c */
    public final ase0 f89886c;

    /* JADX INFO: renamed from: d */
    public final eh00 f89887d;

    /* JADX INFO: renamed from: e */
    public final eh00 f89888e;

    /* JADX INFO: renamed from: f */
    public final gh00 f89889f;

    public hcq(zbq zbqVar, WeakReference weakReference, ase0 ase0Var, eh00 eh00Var, eh00 eh00Var2, gh00 gh00Var) {
        this.f89884a = zbqVar;
        this.f89885b = weakReference;
        this.f89886c = ase0Var;
        this.f89887d = eh00Var;
        this.f89888e = eh00Var2;
        this.f89889f = gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final WeakReference m47136a() {
        return this.f89885b;
    }

    /* JADX INFO: renamed from: b */
    public final gh00 m47137b() {
        return this.f89889f;
    }

    /* JADX INFO: renamed from: c */
    public final ase0 m47138c() {
        return this.f89886c;
    }

    /* JADX INFO: renamed from: d */
    public final zbq m47139d() {
        return this.f89884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcq)) {
            return false;
        }
        hcq hcqVar = (hcq) obj;
        return this.f89884a.equals(hcqVar.f89884a) && this.f89885b.equals(hcqVar.f89885b) && this.f89886c.equals(hcqVar.f89886c) && wj50.m88271j(this.f89887d, hcqVar.f89887d) && wj50.m88271j(this.f89888e, hcqVar.f89888e) && wj50.m88271j(this.f89889f, hcqVar.f89889f);
    }

    public final int hashCode() {
        int iHashCode = (this.f89886c.hashCode() + ((this.f89885b.hashCode() + (this.f89884a.hashCode() * 31)) * 31)) * 31;
        eh00 eh00Var = this.f89887d;
        int iHashCode2 = (iHashCode + (eh00Var == null ? 0 : eh00Var.hashCode())) * 31;
        eh00 eh00Var2 = this.f89888e;
        int iHashCode3 = (iHashCode2 + (eh00Var2 == null ? 0 : eh00Var2.hashCode())) * 31;
        gh00 gh00Var = this.f89889f;
        return iHashCode3 + (gh00Var != null ? gh00Var.hashCode() : 0);
    }
}
