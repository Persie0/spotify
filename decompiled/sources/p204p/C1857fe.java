package p204p;

/* JADX INFO: renamed from: p.fe */
/* JADX INFO: loaded from: classes.dex */
public final class C1857fe {

    /* JADX INFO: renamed from: a */
    public final String f68626a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1667ah f68627b;

    public C1857fe(String str, InterfaceC1667ah interfaceC1667ah) {
        this.f68626a = str;
        this.f68627b = interfaceC1667ah;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1857fe)) {
            return false;
        }
        C1857fe c1857fe = (C1857fe) obj;
        return wj50.m88271j(this.f68626a, c1857fe.f68626a) && wj50.m88271j(this.f68627b, c1857fe.f68627b);
    }

    public final int hashCode() {
        return this.f68627b.hashCode() + (this.f68626a.hashCode() * 31);
    }
}
