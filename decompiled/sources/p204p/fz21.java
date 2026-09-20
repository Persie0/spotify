package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final String f74892a;

    public fz21(String str) {
        this.f74892a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz21) && wj50.m88271j(this.f74892a, ((fz21) obj).f74892a);
    }

    public final int hashCode() {
        return this.f74892a.hashCode();
    }
}
