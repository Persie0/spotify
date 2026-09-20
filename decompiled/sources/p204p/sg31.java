package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sg31 implements vg31 {

    /* JADX INFO: renamed from: a */
    public final String f208707a;

    public sg31(String str) {
        this.f208707a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg31) && wj50.m88271j(this.f208707a, ((sg31) obj).f208707a);
    }

    public final int hashCode() {
        return this.f208707a.hashCode();
    }
}
