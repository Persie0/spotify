package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class us61 implements l630 {

    /* JADX INFO: renamed from: a */
    public final ws61 f233545a;

    /* JADX INFO: renamed from: b */
    public final String f233546b;

    /* JADX INFO: renamed from: c */
    public final b250 f233547c;

    public us61(ws61 ws61Var, String str, b250 b250Var) {
        this.f233545a = ws61Var;
        this.f233546b = str;
        this.f233547c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us61)) {
            return false;
        }
        us61 us61Var = (us61) obj;
        return wj50.m88271j(this.f233545a, us61Var.f233545a) && wj50.m88271j(this.f233546b, us61Var.f233546b) && wj50.m88271j(this.f233547c, us61Var.f233547c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f233546b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f233545a.hashCode() * 31, 31, this.f233546b);
        b250 b250Var = this.f233547c;
        return iM77243b + (b250Var == null ? 0 : b250Var.hashCode());
    }
}
