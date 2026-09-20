package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ik0 {

    /* JADX INFO: renamed from: a */
    public final int f102938a;

    /* JADX INFO: renamed from: b */
    public final String f102939b;

    /* JADX INFO: renamed from: c */
    public final String f102940c;

    /* JADX INFO: renamed from: d */
    public final tdu f102941d;

    public ik0(int i, String str, String str2, tdu tduVar) {
        this.f102938a = i;
        this.f102939b = str;
        this.f102940c = str2;
        this.f102941d = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik0)) {
            return false;
        }
        ik0 ik0Var = (ik0) obj;
        return this.f102938a == ik0Var.f102938a && wj50.m88271j(this.f102939b, ik0Var.f102939b) && wj50.m88271j(this.f102940c, ik0Var.f102940c) && this.f102941d.equals(ik0Var.f102941d);
    }

    public final int hashCode() {
        return this.f102941d.hashCode() + s571.m77243b(s571.m77243b(edb.m38547C(this.f102938a) * 31, 31, this.f102939b), 31, this.f102940c);
    }
}
