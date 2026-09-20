package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e9a0 extends haa0 {

    /* JADX INFO: renamed from: a */
    public final String f57398a;

    public e9a0(String str) {
        this.f57398a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9a0) && wj50.m88271j(this.f57398a, ((e9a0) obj).f57398a);
    }

    public final int hashCode() {
        String str = this.f57398a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
