package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ito {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2415th f105636a;

    /* JADX INFO: renamed from: b */
    public final int f105637b;

    public ito(InterfaceC2415th interfaceC2415th, int i) {
        this.f105636a = interfaceC2415th;
        this.f105637b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ito)) {
            return false;
        }
        ito itoVar = (ito) obj;
        return wj50.m88271j(this.f105636a, itoVar.f105636a) && this.f105637b == itoVar.f105637b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f105637b) + (this.f105636a.hashCode() * 31);
    }
}
