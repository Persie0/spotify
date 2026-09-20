package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xzu0 implements e4z0 {

    /* JADX INFO: renamed from: a */
    public final rcm0 f267783a;

    public xzu0(rcm0 rcm0Var) {
        this.f267783a = rcm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzu0) && this.f267783a.equals(((xzu0) obj).f267783a);
    }

    @Override // p204p.e4z0
    public final String getId() {
        return "heading";
    }

    public final int hashCode() {
        return this.f267783a.hashCode() - 1115143618;
    }
}
