package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class anl0 {

    /* JADX INFO: renamed from: a */
    public final String f17463a;

    /* JADX INFO: renamed from: b */
    public final zml0 f17464b;

    /* JADX INFO: renamed from: c */
    public final String f17465c;

    /* JADX INFO: renamed from: d */
    public final String f17466d;

    public anl0(String str, zml0 zml0Var, String str2, String str3) {
        this.f17463a = str;
        this.f17464b = zml0Var;
        this.f17465c = str2;
        this.f17466d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m26513a() {
        return this.f17465c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anl0)) {
            return false;
        }
        anl0 anl0Var = (anl0) obj;
        return wj50.m88271j(this.f17463a, anl0Var.f17463a) && wj50.m88271j(this.f17464b, anl0Var.f17464b) && wj50.m88271j(this.f17465c, anl0Var.f17465c) && wj50.m88271j(this.f17466d, anl0Var.f17466d);
    }

    public final int hashCode() {
        int iHashCode = this.f17463a.hashCode() * 31;
        zml0 zml0Var = this.f17464b;
        int iHashCode2 = (iHashCode + (zml0Var == null ? 0 : zml0Var.hashCode())) * 31;
        String str = this.f17465c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17466d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
