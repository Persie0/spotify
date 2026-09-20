package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sea {

    /* JADX INFO: renamed from: a */
    public final String f208251a;

    /* JADX INFO: renamed from: b */
    public final String f208252b;

    /* JADX INFO: renamed from: c */
    public final rea f208253c;

    /* JADX INFO: renamed from: d */
    public final rea f208254d;

    public sea(String str, String str2, rea reaVar, rea reaVar2) {
        this.f208251a = str;
        this.f208252b = str2;
        this.f208253c = reaVar;
        this.f208254d = reaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sea)) {
            return false;
        }
        sea seaVar = (sea) obj;
        return wj50.m88271j(this.f208251a, seaVar.f208251a) && wj50.m88271j(this.f208252b, seaVar.f208252b) && wj50.m88271j(this.f208253c, seaVar.f208253c) && wj50.m88271j(this.f208254d, seaVar.f208254d);
    }

    public final int hashCode() {
        int iHashCode = (this.f208253c.hashCode() + s571.m77243b(this.f208251a.hashCode() * 31, 31, this.f208252b)) * 31;
        rea reaVar = this.f208254d;
        return iHashCode + (reaVar == null ? 0 : reaVar.hashCode());
    }
}
