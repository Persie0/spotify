package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k1s0 extends m1s0 {

    /* JADX INFO: renamed from: a */
    public final String f118420a;

    public k1s0(String str) {
        this.f118420a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1s0) && wj50.m88271j(this.f118420a, ((k1s0) obj).f118420a);
    }

    public final int hashCode() {
        return this.f118420a.hashCode();
    }
}
