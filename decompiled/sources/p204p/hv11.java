package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hv11 {

    /* JADX INFO: renamed from: a */
    public final String f95559a;

    public hv11(String str) {
        this.f95559a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv11) && wj50.m88271j(this.f95559a, ((hv11) obj).f95559a);
    }

    public final int hashCode() {
        return this.f95559a.hashCode();
    }
}
