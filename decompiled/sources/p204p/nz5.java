package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nz5 {

    /* JADX INFO: renamed from: a */
    public final String f159999a;

    public nz5(String str) {
        this.f159999a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz5) && wj50.m88271j(this.f159999a, ((nz5) obj).f159999a);
    }

    public final int hashCode() {
        return this.f159999a.hashCode();
    }
}
