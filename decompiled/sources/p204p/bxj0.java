package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bxj0 extends dxj0 {

    /* JADX INFO: renamed from: a */
    public final String f31875a;

    public bxj0(String str) {
        this.f31875a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxj0) && wj50.m88271j(this.f31875a, ((bxj0) obj).f31875a);
    }

    public final int hashCode() {
        return this.f31875a.hashCode();
    }
}
