package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f280745a;

    /* JADX INFO: renamed from: b */
    public final String f280746b;

    /* JADX INFO: renamed from: c */
    public final pcu0 f280747c;

    public z9d(String str, String str2, pcu0 pcu0Var) {
        this.f280745a = str;
        this.f280746b = str2;
        this.f280747c = pcu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9d)) {
            return false;
        }
        z9d z9dVar = (z9d) obj;
        return wj50.m88271j(this.f280745a, z9dVar.f280745a) && wj50.m88271j(this.f280746b, z9dVar.f280746b) && wj50.m88271j(this.f280747c, z9dVar.f280747c);
    }

    public final int hashCode() {
        return this.f280747c.hashCode() + s571.m77243b(this.f280745a.hashCode() * 31, 31, this.f280746b);
    }
}
