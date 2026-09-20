package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w911 implements y911 {

    /* JADX INFO: renamed from: a */
    public final u911 f249054a;

    /* JADX INFO: renamed from: b */
    public final boolean f249055b;

    public w911(u911 u911Var, boolean z) {
        this.f249054a = u911Var;
        this.f249055b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w911)) {
            return false;
        }
        w911 w911Var = (w911) obj;
        return this.f249054a.equals(w911Var.f249054a) && this.f249055b == w911Var.f249055b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249055b) + (this.f249054a.hashCode() * 31);
    }
}
