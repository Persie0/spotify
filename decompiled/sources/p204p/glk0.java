package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class glk0<T> extends hk60<T> {

    /* JADX INFO: renamed from: a */
    private final hk60<T> f81105a;

    public glk0(hk60<T> hk60Var) {
        this.f81105a = hk60Var;
    }

    @Override // p204p.hk60
    public T fromJson(xl60 xl60Var) {
        return xl60Var.mo51068B() == xl60.EnumC2579c.NULL ? (T) xl60Var.mo51085t() : this.f81105a.fromJson(xl60Var);
    }

    @Override // p204p.hk60
    public void toJson(rm60 rm60Var, T t) {
        if (t == null) {
            rm60Var.mo56895t();
        } else {
            this.f81105a.toJson(rm60Var, t);
        }
    }

    public String toString() {
        return this.f81105a + ".nullSafe()";
    }
}
