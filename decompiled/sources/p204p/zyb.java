package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zyb {

    /* JADX INFO: renamed from: a */
    public final boolean f287543a;

    /* JADX INFO: renamed from: b */
    public final boolean f287544b;

    /* JADX INFO: renamed from: c */
    public final String f287545c;

    public zyb(String str, boolean z, boolean z2) {
        this.f287543a = z;
        this.f287544b = z2;
        this.f287545c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyb)) {
            return false;
        }
        zyb zybVar = (zyb) obj;
        return this.f287543a == zybVar.f287543a && this.f287544b == zybVar.f287544b && wj50.m88271j(this.f287545c, zybVar.f287545c);
    }

    public final int hashCode() {
        return this.f287545c.hashCode() + s571.m77245d(Boolean.hashCode(this.f287543a) * 31, 31, this.f287544b);
    }
}
