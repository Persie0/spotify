package p204p;

/* JADX INFO: renamed from: p.os */
/* JADX INFO: loaded from: classes4.dex */
public final class C2226os {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2188ns f168686a;

    /* JADX INFO: renamed from: b */
    public final boolean f168687b;

    /* JADX INFO: renamed from: c */
    public final boolean f168688c;

    public C2226os(InterfaceC2188ns interfaceC2188ns, boolean z) {
        this.f168686a = interfaceC2188ns;
        this.f168687b = z;
        this.f168688c = !z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2226os)) {
            return false;
        }
        C2226os c2226os = (C2226os) obj;
        return wj50.m88271j(this.f168686a, c2226os.f168686a) && this.f168687b == c2226os.f168687b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168687b) + (this.f168686a.hashCode() * 31);
    }
}
