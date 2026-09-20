package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lem0 implements pem0 {

    /* JADX INFO: renamed from: a */
    public final voc1 f132603a;

    public lem0(voc1 voc1Var) {
        this.f132603a = voc1Var;
    }

    /* JADX INFO: renamed from: a */
    public final voc1 m58796a() {
        return this.f132603a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lem0) && wj50.m88271j(this.f132603a, ((lem0) obj).f132603a);
    }

    public final int hashCode() {
        voc1 voc1Var = this.f132603a;
        if (voc1Var == null) {
            return 0;
        }
        return voc1Var.f243453a.hashCode();
    }
}
