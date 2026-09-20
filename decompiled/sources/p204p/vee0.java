package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vee0 {

    /* JADX INFO: renamed from: a */
    public final int f240714a;

    /* JADX INFO: renamed from: b */
    public final String f240715b;

    /* JADX INFO: renamed from: c */
    public final String f240716c;

    /* JADX INFO: renamed from: d */
    public final akk f240717d;

    /* JADX INFO: renamed from: e */
    public final akk f240718e;

    /* JADX INFO: renamed from: f */
    public final eh00 f240719f;

    public vee0(int i, String str, String str2, akk akkVar, akk akkVar2, eh00 eh00Var) {
        this.f240714a = i;
        this.f240715b = str;
        this.f240716c = str2;
        this.f240717d = akkVar;
        this.f240718e = akkVar2;
        this.f240719f = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vee0)) {
            return false;
        }
        vee0 vee0Var = (vee0) obj;
        return this.f240714a == vee0Var.f240714a && wj50.m88271j(this.f240715b, vee0Var.f240715b) && wj50.m88271j(this.f240716c, vee0Var.f240716c) && wj50.m88271j(this.f240717d, vee0Var.f240717d) && wj50.m88271j(this.f240718e, vee0Var.f240718e) && wj50.m88271j(this.f240719f, vee0Var.f240719f);
    }

    public final int hashCode() {
        return this.f240719f.hashCode() + ((this.f240718e.hashCode() + ((this.f240717d.hashCode() + s571.m77243b(s571.m77243b(Integer.hashCode(this.f240714a) * 31, 31, this.f240715b), 31, this.f240716c)) * 31)) * 31);
    }
}
