package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mm70 implements rtr {

    /* JADX INFO: renamed from: a */
    public final gh0 f145060a;

    /* JADX INFO: renamed from: b */
    public final String f145061b;

    public mm70(String str, gh0 gh0Var) {
        this.f145060a = gh0Var;
        this.f145061b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm70)) {
            return false;
        }
        mm70 mm70Var = (mm70) obj;
        return wj50.m88271j(this.f145060a, mm70Var.f145060a) && wj50.m88271j(this.f145061b, mm70Var.f145061b);
    }

    public final int hashCode() {
        return this.f145061b.hashCode() + (this.f145060a.hashCode() * 31);
    }
}
