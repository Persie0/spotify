package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x5b1 extends y5b1 {

    /* JADX INFO: renamed from: a */
    public final String f258371a;

    public x5b1(String str) {
        this.f258371a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5b1) && wj50.m88271j(this.f258371a, ((x5b1) obj).f258371a);
    }

    public final int hashCode() {
        return this.f258371a.hashCode();
    }
}
