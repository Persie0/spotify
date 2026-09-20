package p204p;

import com.squareup.moshi.JsonDataException;

/* JADX INFO: loaded from: classes11.dex */
public final class doj0<T> extends hk60<T> {

    /* JADX INFO: renamed from: a */
    private final hk60<T> f51054a;

    public doj0(hk60<T> hk60Var) {
        this.f51054a = hk60Var;
    }

    @Override // p204p.hk60
    public T fromJson(xl60 xl60Var) {
        if (xl60Var.mo51068B() != xl60.EnumC2579c.NULL) {
            return this.f51054a.fromJson(xl60Var);
        }
        throw new JsonDataException("Unexpected null at " + xl60Var.m91387h());
    }

    @Override // p204p.hk60
    public void toJson(rm60 rm60Var, T t) {
        if (t != null) {
            this.f51054a.toJson(rm60Var, t);
        } else {
            throw new JsonDataException("Unexpected null at " + rm60Var.m75910n());
        }
    }

    public String toString() {
        return this.f51054a + ".nonNull()";
    }
}
