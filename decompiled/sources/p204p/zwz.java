package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zwz {

    /* JADX INFO: renamed from: a */
    public final boolean f287116a;

    /* JADX INFO: renamed from: b */
    public final String f287117b;

    /* JADX INFO: renamed from: c */
    public final boolean f287118c;

    public zwz(String str, boolean z, boolean z2) {
        this.f287116a = z;
        this.f287117b = str;
        this.f287118c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwz)) {
            return false;
        }
        zwz zwzVar = (zwz) obj;
        return this.f287116a == zwzVar.f287116a && wj50.m88271j(this.f287117b, zwzVar.f287117b) && this.f287118c == zwzVar.f287118c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f287118c) + s571.m77243b(Boolean.hashCode(this.f287116a) * 31, 31, this.f287117b);
    }
}
