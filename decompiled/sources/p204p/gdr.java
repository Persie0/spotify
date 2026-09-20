package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gdr implements hdr {

    /* JADX INFO: renamed from: a */
    public final boolean f78926a;

    /* JADX INFO: renamed from: b */
    public final boolean f78927b;

    public gdr(boolean z, boolean z2) {
        this.f78926a = z;
        this.f78927b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdr)) {
            return false;
        }
        gdr gdrVar = (gdr) obj;
        return this.f78926a == gdrVar.f78926a && this.f78927b == gdrVar.f78927b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78927b) + (Boolean.hashCode(this.f78926a) * 31);
    }
}
