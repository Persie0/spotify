package p204p;

/* JADX INFO: renamed from: p.ui */
/* JADX INFO: loaded from: classes10.dex */
public final class C2459ui implements InterfaceC2573xi {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2415th f230551a;

    /* JADX INFO: renamed from: b */
    public final int f230552b;

    public C2459ui(InterfaceC2415th interfaceC2415th, int i) {
        this.f230551a = interfaceC2415th;
        this.f230552b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2459ui)) {
            return false;
        }
        C2459ui c2459ui = (C2459ui) obj;
        return wj50.m88271j(this.f230551a, c2459ui.f230551a) && this.f230552b == c2459ui.f230552b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f230552b) + (this.f230551a.hashCode() * 31);
    }
}
