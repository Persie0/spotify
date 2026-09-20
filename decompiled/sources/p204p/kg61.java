package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kg61 {

    /* JADX INFO: renamed from: a */
    public final String f122306a;

    /* JADX INFO: renamed from: b */
    public final Float f122307b;

    /* JADX INFO: renamed from: c */
    public final Float f122308c;

    public kg61(String str, Float f, Float f2) {
        this.f122306a = str;
        this.f122307b = f;
        this.f122308c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg61)) {
            return false;
        }
        kg61 kg61Var = (kg61) obj;
        return wj50.m88271j(this.f122306a, kg61Var.f122306a) && wj50.m88271j(this.f122307b, kg61Var.f122307b) && wj50.m88271j(this.f122308c, kg61Var.f122308c);
    }

    public final int hashCode() {
        int iHashCode = this.f122306a.hashCode() * 31;
        Float f = this.f122307b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f122308c;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }
}
