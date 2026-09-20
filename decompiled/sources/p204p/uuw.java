package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uuw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f234276a;

    /* JADX INFO: renamed from: b */
    public final String f234277b;

    public uuw(String str, String str2) {
        this.f234276a = str;
        this.f234277b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuw)) {
            return false;
        }
        uuw uuwVar = (uuw) obj;
        return wj50.m88271j(this.f234276a, uuwVar.f234276a) && wj50.m88271j(this.f234277b, uuwVar.f234277b);
    }

    public final int hashCode() {
        return this.f234277b.hashCode() + (this.f234276a.hashCode() * 31);
    }
}
