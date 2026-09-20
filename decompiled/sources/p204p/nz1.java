package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nz1 {

    /* JADX INFO: renamed from: a */
    public final String f159970a;

    public nz1(String str) {
        this.f159970a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz1) && wj50.m88271j(this.f159970a, ((nz1) obj).f159970a);
    }

    public final int hashCode() {
        return this.f159970a.hashCode();
    }
}
