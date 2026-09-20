package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ulo0 implements vlo0 {

    /* JADX INFO: renamed from: a */
    public final String f231599a;

    /* JADX INFO: renamed from: b */
    public final String f231600b;

    /* JADX INFO: renamed from: c */
    public final String f231601c;

    public ulo0(String str, String str2, String str3) {
        this.f231599a = str;
        this.f231600b = str2;
        this.f231601c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulo0)) {
            return false;
        }
        ulo0 ulo0Var = (ulo0) obj;
        return wj50.m88271j(this.f231599a, ulo0Var.f231599a) && wj50.m88271j(this.f231600b, ulo0Var.f231600b) && wj50.m88271j(this.f231601c, ulo0Var.f231601c);
    }

    public final int hashCode() {
        return this.f231601c.hashCode() + s571.m77243b(this.f231599a.hashCode() * 31, 31, this.f231600b);
    }
}
