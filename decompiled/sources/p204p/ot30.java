package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ot30 implements ug5 {

    /* JADX INFO: renamed from: a */
    public final int f168959a;

    /* JADX INFO: renamed from: b */
    public int f168960b;

    /* JADX INFO: renamed from: c */
    public final Object f168961c;

    public ot30(ug5 ug5Var, int i) {
        this.f168961c = ug5Var;
        this.f168959a = i;
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: a */
    public Object mo67761a() {
        return ((ug5) this.f168961c).mo67761a();
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: b */
    public void mo53943b(int i, int i2, int i3) {
        int i4 = this.f168960b == 0 ? this.f168959a : 0;
        ((ug5) this.f168961c).mo53943b(i + i4, i2 + i4, i3);
    }

    @Override // p204p.ug5
    public void clear() {
        vph.m86124a("Clear is not valid on OffsetApplier");
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: f */
    public void mo53944f(int i, int i2) {
        ((ug5) this.f168961c).mo53944f(i + (this.f168960b == 0 ? this.f168959a : 0), i2);
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: g */
    public void mo67762g(Object obj, th00 th00Var) {
        ((ug5) this.f168961c).mo67762g(obj, th00Var);
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: i */
    public void mo53945i(int i, Object obj) {
        ((ug5) this.f168961c).mo53945i(i + (this.f168960b == 0 ? this.f168959a : 0), obj);
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: n */
    public void mo53947n(int i, Object obj) {
        ((ug5) this.f168961c).mo53947n(i + (this.f168960b == 0 ? this.f168959a : 0), obj);
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: o */
    public void mo67763o(Object obj) {
        this.f168960b++;
        ((ug5) this.f168961c).mo67763o(obj);
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: p */
    public void mo57589p() {
        ((ug5) this.f168961c).mo57589p();
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: u */
    public void mo67764u() {
        if (this.f168960b <= 0) {
            vph.m86124a("OffsetApplier up called with no corresponding down");
        }
        this.f168960b--;
        ((ug5) this.f168961c).mo67764u();
    }

    public ot30() {
        this.f168961c = new ot30[256];
        this.f168959a = 0;
        this.f168960b = 0;
    }

    public ot30(int i, int i2) {
        this.f168961c = null;
        this.f168959a = i;
        int i3 = i2 & 7;
        this.f168960b = i3 == 0 ? 8 : i3;
    }
}
