package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fq60 extends gq60 {

    /* JADX INFO: renamed from: a */
    public final yfe f72080a;

    public fq60(yfe yfeVar) {
        this.f72080a = yfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq60) && wj50.m88271j(this.f72080a, ((fq60) obj).f72080a);
    }

    public final int hashCode() {
        return this.f72080a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f72080a + ')';
    }
}
