package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class sm6 implements tm6 {

    /* JADX INFO: renamed from: a */
    public final mqm0 f210570a;

    /* JADX INFO: renamed from: b */
    public final ny51 f210571b;

    public sm6(mqm0 mqm0Var, ny51 ny51Var) {
        this.f210570a = mqm0Var;
        this.f210571b = ny51Var;
    }

    @Override // p204p.tm6
    /* JADX INFO: renamed from: a */
    public final mqm0 mo70274a() {
        return this.f210570a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm6)) {
            return false;
        }
        sm6 sm6Var = (sm6) obj;
        return wj50.m88271j(this.f210570a, sm6Var.f210570a) && wj50.m88271j(this.f210571b, sm6Var.f210571b);
    }

    public final int hashCode() {
        return this.f210571b.hashCode() + (this.f210570a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f210570a + ", result=" + this.f210571b + ")";
    }
}
