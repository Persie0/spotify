package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k2c0 extends n2c0 {

    /* JADX INFO: renamed from: a */
    public final String f118592a;

    public k2c0(String str) {
        this.f118592a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2c0) && wj50.m88271j(this.f118592a, ((k2c0) obj).f118592a);
    }

    public final int hashCode() {
        return this.f118592a.hashCode();
    }
}
