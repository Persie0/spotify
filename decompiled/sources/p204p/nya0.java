package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nya0 extends oya0 {

    /* JADX INFO: renamed from: a */
    public final String f159756a;

    /* JADX INFO: renamed from: b */
    public final Object f159757b;

    public nya0(String str, Object obj) {
        this.f159756a = str;
        this.f159757b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nya0)) {
            return false;
        }
        nya0 nya0Var = (nya0) obj;
        return wj50.m88271j(this.f159756a, nya0Var.f159756a) && wj50.m88271j(this.f159757b, nya0Var.f159757b);
    }

    public final int hashCode() {
        return s6x0.m77349b(this.f159757b) + (this.f159756a.hashCode() * 31);
    }
}
