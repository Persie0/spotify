package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vto {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2415th f244738a;

    /* JADX INFO: renamed from: b */
    public final C2614yi f244739b;

    /* JADX INFO: renamed from: c */
    public final int f244740c;

    public /* synthetic */ vto(InterfaceC2415th interfaceC2415th, C2614yi c2614yi) {
        this(interfaceC2415th, c2614yi, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vto)) {
            return false;
        }
        vto vtoVar = (vto) obj;
        return wj50.m88271j(this.f244738a, vtoVar.f244738a) && wj50.m88271j(this.f244739b, vtoVar.f244739b) && this.f244740c == vtoVar.f244740c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f244740c) + ((this.f244739b.hashCode() + (this.f244738a.hashCode() * 31)) * 31);
    }

    public vto(InterfaceC2415th interfaceC2415th, C2614yi c2614yi, int i) {
        this.f244738a = interfaceC2415th;
        this.f244739b = c2614yi;
        this.f244740c = i;
    }
}
