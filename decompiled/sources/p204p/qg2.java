package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qg2 implements ug2 {

    /* JADX INFO: renamed from: a */
    public final bdb1 f188342a;

    /* JADX INFO: renamed from: b */
    public final adb1 f188343b;

    /* JADX INFO: renamed from: c */
    public final String f188344c;

    public qg2(bdb1 bdb1Var, adb1 adb1Var, String str) {
        this.f188342a = bdb1Var;
        this.f188343b = adb1Var;
        this.f188344c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg2)) {
            return false;
        }
        qg2 qg2Var = (qg2) obj;
        return this.f188342a == qg2Var.f188342a && this.f188343b == qg2Var.f188343b && wj50.m88271j(this.f188344c, qg2Var.f188344c);
    }

    public final int hashCode() {
        return this.f188344c.hashCode() + ((this.f188343b.hashCode() + (this.f188342a.hashCode() * 31)) * 31);
    }
}
