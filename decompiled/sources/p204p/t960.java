package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t960 implements v960 {

    /* JADX INFO: renamed from: a */
    public final String f218193a;

    /* JADX INFO: renamed from: b */
    public final oc8 f218194b;

    /* JADX INFO: renamed from: c */
    public final String f218195c;

    public t960(String str, oc8 oc8Var, String str2) {
        this.f218193a = str;
        this.f218194b = oc8Var;
        this.f218195c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t960)) {
            return false;
        }
        t960 t960Var = (t960) obj;
        return wj50.m88271j(this.f218193a, t960Var.f218193a) && wj50.m88271j(this.f218194b, t960Var.f218194b) && yx50.m94808a(this.f218195c, t960Var.f218195c);
    }

    public final int hashCode() {
        return yx50.m94809b(this.f218195c) + ((this.f218194b.hashCode() + (this.f218193a.hashCode() * 31)) * 31);
    }
}
