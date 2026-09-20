package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zxt0 implements ayt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f287393a;

    public zxt0(boolean z) {
        this.f287393a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxt0) && this.f287393a == ((zxt0) obj).f287393a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f287393a);
    }
}
