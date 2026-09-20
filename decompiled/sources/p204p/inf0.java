package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class inf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final k69 f103968a;

    /* JADX INFO: renamed from: b */
    public final k69 f103969b;

    /* JADX INFO: renamed from: c */
    public final int f103970c;

    /* JADX INFO: renamed from: d */
    public final int f103971d;

    /* JADX INFO: renamed from: e */
    public final Float f103972e;

    /* JADX INFO: renamed from: f */
    public final Float f103973f;

    public inf0(k69 k69Var, k69 k69Var2, int i, int i2, Float f, Float f2) {
        this.f103968a = k69Var;
        this.f103969b = k69Var2;
        this.f103970c = i;
        this.f103971d = i2;
        this.f103972e = f;
        this.f103973f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inf0)) {
            return false;
        }
        inf0 inf0Var = (inf0) obj;
        return wj50.m88271j(this.f103968a, inf0Var.f103968a) && wj50.m88271j(this.f103969b, inf0Var.f103969b) && this.f103970c == inf0Var.f103970c && this.f103971d == inf0Var.f103971d && wj50.m88271j(this.f103972e, inf0Var.f103972e) && wj50.m88271j(this.f103973f, inf0Var.f103973f);
    }

    public final int hashCode() {
        k69 k69Var = this.f103968a;
        int iHashCode = (k69Var == null ? 0 : k69Var.hashCode()) * 31;
        k69 k69Var2 = this.f103969b;
        int iM62800g = mt60.m62800g(this.f103971d, mt60.m62800g(this.f103970c, (iHashCode + (k69Var2 == null ? 0 : k69Var2.hashCode())) * 31, 31), 31);
        Float f = this.f103972e;
        int iHashCode2 = (iM62800g + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f103973f;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        k69 k69Var = this.f103968a;
        Object objValueOf = k69Var != null ? Integer.valueOf(k69Var.f119694b.size()) : "null";
        k69 k69Var2 = this.f103969b;
        return "OnBeatsData(beatsA=" + objValueOf + " beats, beatsB=" + (k69Var2 != null ? Integer.valueOf(k69Var2.f119694b.size()) : "null") + " beats, durationA=" + this.f103970c + ", durationB=" + this.f103971d + ", bpmA=" + this.f103972e + ", bpmB=" + this.f103973f + ")";
    }
}
