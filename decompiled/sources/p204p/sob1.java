package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sob1 extends wob1 {

    /* JADX INFO: renamed from: a */
    public final int f211158a;

    /* JADX INFO: renamed from: b */
    public final String f211159b;

    public sob1(int i, String str) {
        this.f211158a = i;
        this.f211159b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sob1)) {
            return false;
        }
        sob1 sob1Var = (sob1) obj;
        return this.f211158a == sob1Var.f211158a && wj50.m88271j(this.f211159b, sob1Var.f211159b);
    }

    public final int hashCode() {
        return this.f211159b.hashCode() + (Integer.hashCode(this.f211158a) * 31);
    }
}
