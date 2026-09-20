package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zw90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final String f286949a;

    public zw90(String str) {
        this.f286949a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zw90) && wj50.m88271j(this.f286949a, ((zw90) obj).f286949a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.f286949a.hashCode() * 31);
    }
}
