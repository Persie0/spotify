package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wpx0 implements arx0 {

    /* JADX INFO: renamed from: a */
    public final dq50 f253856a;

    /* JADX INFO: renamed from: b */
    public final String f253857b;

    /* JADX INFO: renamed from: c */
    public final boolean f253858c;

    public wpx0(dq50 dq50Var, boolean z) {
        String str = dq50Var.f51821a;
        this.f253856a = dq50Var;
        this.f253857b = str;
        this.f253858c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpx0)) {
            return false;
        }
        wpx0 wpx0Var = (wpx0) obj;
        return this.f253856a.equals(wpx0Var.f253856a) && wj50.m88271j(this.f253857b, wpx0Var.f253857b) && this.f253858c == wpx0Var.f253858c;
    }

    @Override // p204p.arx0
    public final String getId() {
        return this.f253857b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f253858c) + s571.m77245d(s571.m77243b(this.f253856a.hashCode() * 31, 31, this.f253857b), 31, false);
    }
}
