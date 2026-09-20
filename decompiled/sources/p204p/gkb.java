package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gkb implements okb {

    /* JADX INFO: renamed from: a */
    public final String f80774a;

    /* JADX INFO: renamed from: b */
    public final nkb f80775b;

    public gkb(String str, nkb nkbVar) {
        this.f80774a = str;
        this.f80775b = nkbVar;
    }

    /* JADX INFO: renamed from: a */
    public final String m45040a() {
        return this.f80774a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkb)) {
            return false;
        }
        gkb gkbVar = (gkb) obj;
        return wj50.m88271j(this.f80774a, gkbVar.f80774a) && wj50.m88271j(this.f80775b, gkbVar.f80775b);
    }

    @Override // p204p.okb
    public final nkb getType() {
        return this.f80775b;
    }

    public final int hashCode() {
        return this.f80775b.hashCode() + (this.f80774a.hashCode() * 31);
    }
}
