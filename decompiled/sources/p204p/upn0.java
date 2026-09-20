package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class upn0 extends iqn0 {

    /* JADX INFO: renamed from: g */
    public vpn0 f232740g;

    @Override // p204p.iqn0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof v3t0) {
            return super.containsKey((v3t0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof n3b1) {
            return super.containsValue((n3b1) obj);
        }
        return false;
    }

    @Override // p204p.iqn0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final vpn0 build() {
        mj91 mj91Var = this.f104807c;
        vpn0 vpn0Var = this.f232740g;
        if (mj91Var != vpn0Var.f61928a) {
            this.f104806b = new on3(18);
            vpn0Var = new vpn0(this.f104807c, size());
        }
        this.f232740g = vpn0Var;
        return vpn0Var;
    }

    @Override // p204p.iqn0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof v3t0) {
            return (n3b1) super.get((v3t0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof v3t0) ? obj2 : (n3b1) super.getOrDefault((v3t0) obj, (n3b1) obj2);
    }

    @Override // p204p.iqn0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof v3t0) {
            return (n3b1) super.remove((v3t0) obj);
        }
        return null;
    }
}
