package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yl21 {

    /* JADX INFO: renamed from: a */
    public final ol21 f273884a;

    /* JADX INFO: renamed from: b */
    public final mb61 f273885b;

    /* JADX WARN: Multi-variable type inference failed */
    public yl21(ol21 ol21Var, th00 th00Var) {
        this.f273884a = ol21Var;
        this.f273885b = (mb61) th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl21)) {
            return false;
        }
        yl21 yl21Var = (yl21) obj;
        return this.f273884a == yl21Var.f273884a && this.f273885b.equals(yl21Var.f273885b);
    }

    public final int hashCode() {
        return this.f273885b.hashCode() + (this.f273884a.hashCode() * 31);
    }
}
