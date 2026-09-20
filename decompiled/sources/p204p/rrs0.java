package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rrs0 extends xrs0 implements qrs0 {

    /* JADX INFO: renamed from: a */
    public final String f202107a;

    /* JADX INFO: renamed from: b */
    public final String f202108b;

    public rrs0(String str, String str2) {
        this.f202107a = str;
        this.f202108b = str2;
    }

    @Override // p204p.xrs0
    /* JADX INFO: renamed from: a */
    public final String mo70732a() {
        return this.f202107a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrs0)) {
            return false;
        }
        rrs0 rrs0Var = (rrs0) obj;
        return wj50.m88271j(this.f202107a, rrs0Var.f202107a) && wj50.m88271j(this.f202108b, rrs0Var.f202108b);
    }

    public final int hashCode() {
        return this.f202108b.hashCode() + (this.f202107a.hashCode() * 31);
    }
}
