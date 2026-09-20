package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fsb {

    /* JADX INFO: renamed from: a */
    public final String f72821a;

    /* JADX INFO: renamed from: b */
    public final boolean f72822b;

    public fsb(String str, boolean z) {
        this.f72821a = str;
        this.f72822b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsb)) {
            return false;
        }
        fsb fsbVar = (fsb) obj;
        return this.f72821a.equals(fsbVar.f72821a) && this.f72822b == fsbVar.f72822b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72822b) + (this.f72821a.hashCode() * 31);
    }
}
