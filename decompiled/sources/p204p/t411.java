package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t411 extends v411 {

    /* JADX INFO: renamed from: a */
    public final int f216876a;

    /* JADX INFO: renamed from: b */
    public final String f216877b;

    public t411(int i, String str) {
        this.f216876a = i;
        this.f216877b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t411)) {
            return false;
        }
        t411 t411Var = (t411) obj;
        return this.f216876a == t411Var.f216876a && wj50.m88271j(this.f216877b, t411Var.f216877b);
    }

    public final int hashCode() {
        return this.f216877b.hashCode() + (Integer.hashCode(this.f216876a) * 31);
    }
}
