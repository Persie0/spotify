package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fv2 implements hv2 {

    /* JADX INFO: renamed from: a */
    public final String f73620a;

    public fv2(String str) {
        this.f73620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv2) && wj50.m88271j(this.f73620a, ((fv2) obj).f73620a);
    }

    public final int hashCode() {
        return this.f73620a.hashCode();
    }
}
