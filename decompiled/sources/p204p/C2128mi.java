package p204p;

/* JADX INFO: renamed from: p.mi */
/* JADX INFO: loaded from: classes.dex */
public final class C2128mi implements InterfaceC2165ni {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2415th f143893a;

    /* JADX INFO: renamed from: b */
    public final String f143894b;

    /* JADX INFO: renamed from: c */
    public final String f143895c;

    public C2128mi(InterfaceC2415th interfaceC2415th, String str, String str2) {
        this.f143893a = interfaceC2415th;
        this.f143894b = str;
        this.f143895c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2128mi)) {
            return false;
        }
        C2128mi c2128mi = (C2128mi) obj;
        return wj50.m88271j(this.f143893a, c2128mi.f143893a) && wj50.m88271j(this.f143894b, c2128mi.f143894b) && wj50.m88271j(this.f143895c, c2128mi.f143895c);
    }

    public final int hashCode() {
        return this.f143895c.hashCode() + s571.m77243b(this.f143893a.hashCode() * 31, 31, this.f143894b);
    }
}
