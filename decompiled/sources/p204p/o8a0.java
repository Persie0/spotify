package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o8a0 implements p5a0 {

    /* JADX INFO: renamed from: a */
    public final vco f162749a;

    public o8a0(vco vcoVar) {
        this.f162749a = vcoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8a0) && wj50.m88271j(this.f162749a, ((o8a0) obj).f162749a);
    }

    @Override // p204p.p5a0
    public final vco getData() {
        return this.f162749a;
    }

    public final int hashCode() {
        return this.f162749a.hashCode();
    }
}
