package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x611 implements y611 {

    /* JADX INFO: renamed from: a */
    public final String f258560a;

    /* JADX INFO: renamed from: b */
    public final boolean f258561b;

    public x611(String str, boolean z) {
        this.f258560a = str;
        this.f258561b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x611)) {
            return false;
        }
        x611 x611Var = (x611) obj;
        return wj50.m88271j(this.f258560a, x611Var.f258560a) && this.f258561b == x611Var.f258561b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258561b) + (this.f258560a.hashCode() * 31);
    }
}
