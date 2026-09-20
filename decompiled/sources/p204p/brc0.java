package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class brc0 extends erc0 {

    /* JADX INFO: renamed from: a */
    public final String f30075a;

    public brc0(String str) {
        this.f30075a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof brc0) && wj50.m88271j(this.f30075a, ((brc0) obj).f30075a);
    }

    public final int hashCode() {
        String str = this.f30075a;
        return 1487980699 + (str == null ? 0 : str.hashCode());
    }
}
