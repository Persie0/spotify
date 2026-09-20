package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x7o0 extends y7o0 {

    /* JADX INFO: renamed from: a */
    public final String f258955a;

    public x7o0(String str) {
        this.f258955a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7o0) && wj50.m88271j(this.f258955a, ((x7o0) obj).f258955a);
    }

    public final int hashCode() {
        return this.f258955a.hashCode();
    }
}
