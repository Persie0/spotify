package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f277678a;

    public yz31(String str) {
        this.f277678a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz31) && wj50.m88271j(this.f277678a, ((yz31) obj).f277678a);
    }

    public final int hashCode() {
        return this.f277678a.hashCode();
    }
}
