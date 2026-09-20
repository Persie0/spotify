package p204p;

/* JADX INFO: renamed from: p.ji */
/* JADX INFO: loaded from: classes.dex */
public final class C2016ji implements InterfaceC2165ni {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2415th f112588a;

    /* JADX INFO: renamed from: b */
    public final String f112589b;

    /* JADX INFO: renamed from: c */
    public final String f112590c;

    public C2016ji(InterfaceC2415th interfaceC2415th, String str, String str2) {
        this.f112588a = interfaceC2415th;
        this.f112589b = str;
        this.f112590c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2016ji)) {
            return false;
        }
        C2016ji c2016ji = (C2016ji) obj;
        return wj50.m88271j(this.f112588a, c2016ji.f112588a) && wj50.m88271j(this.f112589b, c2016ji.f112589b) && wj50.m88271j(this.f112590c, c2016ji.f112590c);
    }

    public final int hashCode() {
        return this.f112590c.hashCode() + s571.m77243b(this.f112588a.hashCode() * 31, 31, this.f112589b);
    }
}
