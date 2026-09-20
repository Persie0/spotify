package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cxu implements dxu {

    /* JADX INFO: renamed from: a */
    public final mqm0 f43091a;

    /* JADX INFO: renamed from: b */
    public final mqm0 f43092b;

    public /* synthetic */ cxu(mqm0 mqm0Var) {
        this(mqm0Var, mqm0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxu)) {
            return false;
        }
        cxu cxuVar = (cxu) obj;
        return wj50.m88271j(this.f43091a, cxuVar.f43091a) && wj50.m88271j(this.f43092b, cxuVar.f43092b);
    }

    public final int hashCode() {
        mqm0 mqm0Var = this.f43091a;
        int iHashCode = (mqm0Var == null ? 0 : mqm0Var.hashCode()) * 31;
        mqm0 mqm0Var2 = this.f43092b;
        return iHashCode + (mqm0Var2 != null ? mqm0Var2.hashCode() : 0);
    }

    public cxu(mqm0 mqm0Var, mqm0 mqm0Var2) {
        this.f43091a = mqm0Var;
        this.f43092b = mqm0Var2;
    }
}
