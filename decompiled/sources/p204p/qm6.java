package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qm6 implements tm6 {

    /* JADX INFO: renamed from: a */
    public final mqm0 f190142a;

    /* JADX INFO: renamed from: b */
    public final fgw f190143b;

    public qm6(mqm0 mqm0Var, fgw fgwVar) {
        this.f190142a = mqm0Var;
        this.f190143b = fgwVar;
    }

    @Override // p204p.tm6
    /* JADX INFO: renamed from: a */
    public final mqm0 mo70274a() {
        return this.f190142a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm6)) {
            return false;
        }
        qm6 qm6Var = (qm6) obj;
        return wj50.m88271j(this.f190142a, qm6Var.f190142a) && wj50.m88271j(this.f190143b, qm6Var.f190143b);
    }

    public final int hashCode() {
        mqm0 mqm0Var = this.f190142a;
        return this.f190143b.hashCode() + ((mqm0Var == null ? 0 : mqm0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f190142a + ", result=" + this.f190143b + ")";
    }
}
