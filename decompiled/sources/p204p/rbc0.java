package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rbc0 {

    /* JADX INFO: renamed from: a */
    public final String f197553a;

    public /* synthetic */ rbc0(String str) {
        this.f197553a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rbc0) {
            return wj50.m88271j(this.f197553a, ((rbc0) obj).f197553a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f197553a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("ManifestId(value=", this.f197553a, ")");
    }
}
