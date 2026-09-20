package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uti {

    /* JADX INFO: renamed from: a */
    public final pqm0 f233926a;

    /* JADX INFO: renamed from: b */
    public final boolean f233927b;

    /* JADX INFO: renamed from: c */
    public final boolean f233928c;

    /* JADX INFO: renamed from: d */
    public final boolean f233929d;

    public uti(pqm0 pqm0Var, boolean z, boolean z2, boolean z3) {
        this.f233926a = pqm0Var;
        this.f233927b = z;
        this.f233928c = z2;
        this.f233929d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uti)) {
            return false;
        }
        uti utiVar = (uti) obj;
        return wj50.m88271j(this.f233926a, utiVar.f233926a) && this.f233927b == utiVar.f233927b && this.f233928c == utiVar.f233928c && this.f233929d == utiVar.f233929d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233929d) + s571.m77245d(s571.m77245d(this.f233926a.hashCode() * 31, 31, this.f233927b), 31, this.f233928c);
    }
}
