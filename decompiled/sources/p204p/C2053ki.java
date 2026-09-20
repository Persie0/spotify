package p204p;

/* JADX INFO: renamed from: p.ki */
/* JADX INFO: loaded from: classes.dex */
public final class C2053ki implements InterfaceC2165ni {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2415th f122747a;

    /* JADX INFO: renamed from: b */
    public final String f122748b;

    public C2053ki(InterfaceC2415th interfaceC2415th, String str) {
        this.f122747a = interfaceC2415th;
        this.f122748b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2053ki)) {
            return false;
        }
        C2053ki c2053ki = (C2053ki) obj;
        return wj50.m88271j(this.f122747a, c2053ki.f122747a) && wj50.m88271j(this.f122748b, c2053ki.f122748b);
    }

    public final int hashCode() {
        return this.f122748b.hashCode() + (this.f122747a.hashCode() * 31);
    }
}
