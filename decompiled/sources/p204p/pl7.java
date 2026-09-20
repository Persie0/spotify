package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pl7 {

    /* JADX INFO: renamed from: a */
    public final dk7 f178654a;

    /* JADX INFO: renamed from: b */
    public final gh00 f178655b;

    public pl7(dk7 dk7Var, gh00 gh00Var) {
        this.f178654a = dk7Var;
        this.f178655b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl7)) {
            return false;
        }
        pl7 pl7Var = (pl7) obj;
        return wj50.m88271j(this.f178654a, pl7Var.f178654a) && wj50.m88271j(this.f178655b, pl7Var.f178655b);
    }

    public final int hashCode() {
        return this.f178655b.hashCode() + (this.f178654a.hashCode() * 31);
    }
}
