package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f205571a;

    /* JADX INFO: renamed from: b */
    public final String f205572b;

    /* JADX INFO: renamed from: c */
    public final pcu0 f205573c;

    /* JADX INFO: renamed from: d */
    public final boolean f205574d;

    public s4d(String str, String str2, pcu0 pcu0Var, boolean z) {
        this.f205571a = str;
        this.f205572b = str2;
        this.f205573c = pcu0Var;
        this.f205574d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4d)) {
            return false;
        }
        s4d s4dVar = (s4d) obj;
        return wj50.m88271j(this.f205571a, s4dVar.f205571a) && wj50.m88271j(this.f205572b, s4dVar.f205572b) && wj50.m88271j(this.f205573c, s4dVar.f205573c) && this.f205574d == s4dVar.f205574d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205574d) + ((this.f205573c.hashCode() + s571.m77243b(this.f205571a.hashCode() * 31, 31, this.f205572b)) * 31);
    }
}
