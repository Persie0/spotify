package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dma1 implements gma1 {

    /* JADX INFO: renamed from: a */
    public final String f50480a;

    public dma1(String str) {
        this.f50480a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dma1) && wj50.m88271j(this.f50480a, ((dma1) obj).f50480a);
    }

    public final int hashCode() {
        return this.f50480a.hashCode();
    }
}
