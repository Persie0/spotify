package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a1f0 extends d1f0 {

    /* JADX INFO: renamed from: a */
    public final String f11404a;

    public a1f0(String str) {
        this.f11404a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1f0) && wj50.m88271j(this.f11404a, ((a1f0) obj).f11404a);
    }

    public final int hashCode() {
        return this.f11404a.hashCode();
    }
}
