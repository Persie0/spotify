package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class huw implements u1x {

    /* JADX INFO: renamed from: a */
    public final String f95479a;

    /* JADX INFO: renamed from: b */
    public final String f95480b;

    public huw(String str, String str2) {
        this.f95479a = str;
        this.f95480b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huw)) {
            return false;
        }
        huw huwVar = (huw) obj;
        return wj50.m88271j(this.f95479a, huwVar.f95479a) && wj50.m88271j(this.f95480b, huwVar.f95480b);
    }

    public final int hashCode() {
        return this.f95480b.hashCode() + (this.f95479a.hashCode() * 31);
    }
}
