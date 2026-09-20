package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vci implements wci {

    /* JADX INFO: renamed from: a */
    public final String f240136a;

    /* JADX INFO: renamed from: b */
    public final String f240137b;

    public vci(String str, String str2) {
        this.f240136a = str;
        this.f240137b = str2;
    }

    @Override // p204p.wci
    /* JADX INFO: renamed from: a */
    public final String mo80473a() {
        return this.f240136a;
    }

    @Override // p204p.wci
    /* JADX INFO: renamed from: b */
    public final String mo80474b() {
        return this.f240137b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vci)) {
            return false;
        }
        vci vciVar = (vci) obj;
        return wj50.m88271j(this.f240136a, vciVar.f240136a) && wj50.m88271j(this.f240137b, vciVar.f240137b);
    }

    public final int hashCode() {
        return this.f240137b.hashCode() + (this.f240136a.hashCode() * 31);
    }
}
