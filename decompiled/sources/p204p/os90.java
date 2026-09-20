package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class os90 {

    /* JADX INFO: renamed from: a */
    public final Integer f168778a;

    /* JADX INFO: renamed from: b */
    public final String f168779b;

    public os90(Integer num, String str) {
        this.f168778a = num;
        this.f168779b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os90)) {
            return false;
        }
        os90 os90Var = (os90) obj;
        return wj50.m88271j(this.f168778a, os90Var.f168778a) && wj50.m88271j(this.f168779b, os90Var.f168779b);
    }

    public final int hashCode() {
        Integer num = this.f168778a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f168779b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
