package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fsv implements gsv {

    /* JADX INFO: renamed from: a */
    public final String f72985a;

    /* JADX INFO: renamed from: b */
    public final boolean f72986b;

    /* JADX INFO: renamed from: c */
    public final String f72987c;

    public fsv(String str, String str2, boolean z) {
        this.f72985a = str;
        this.f72986b = z;
        this.f72987c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsv)) {
            return false;
        }
        fsv fsvVar = (fsv) obj;
        return wj50.m88271j(this.f72985a, fsvVar.f72985a) && this.f72986b == fsvVar.f72986b && wj50.m88271j(this.f72987c, fsvVar.f72987c);
    }

    public final int hashCode() {
        return this.f72987c.hashCode() + s571.m77245d(this.f72985a.hashCode() * 31, 31, this.f72986b);
    }
}
