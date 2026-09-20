package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wm1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f252680a;

    public wm1(String str) {
        this.f252680a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm1) && wj50.m88271j(this.f252680a, ((wm1) obj).f252680a);
    }

    public final int hashCode() {
        return this.f252680a.hashCode();
    }
}
