package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hwc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f95910a;

    public hwc0(String str) {
        this.f95910a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwc0) && wj50.m88271j(this.f95910a, ((hwc0) obj).f95910a);
    }

    public final int hashCode() {
        return this.f95910a.hashCode();
    }
}
