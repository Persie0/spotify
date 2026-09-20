package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dpl {

    /* JADX INFO: renamed from: a */
    public final String f51361a;

    /* JADX INFO: renamed from: b */
    public final String f51362b;

    public dpl(String str, String str2) {
        this.f51361a = str;
        this.f51362b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpl)) {
            return false;
        }
        dpl dplVar = (dpl) obj;
        return wj50.m88271j(this.f51361a, dplVar.f51361a) && wj50.m88271j(this.f51362b, dplVar.f51362b);
    }

    public final int hashCode() {
        return this.f51362b.hashCode() + (this.f51361a.hashCode() * 31);
    }
}
