package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fvk0 implements hvk0 {

    /* JADX INFO: renamed from: a */
    public final String f73809a;

    public fvk0(String str) {
        this.f73809a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvk0) && wj50.m88271j(this.f73809a, ((fvk0) obj).f73809a);
    }

    public final int hashCode() {
        return this.f73809a.hashCode();
    }
}
