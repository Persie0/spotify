package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class du51 extends hb11 implements xv41 {
    @Override // p204p.xv41
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f89363h;
            wj50.m88279p(objArr);
            numValueOf = Integer.valueOf(((Number) j0g1.m52066C(objArr, (this.f89364i + ((long) ((int) ((m46971q() + ((long) this.f89358X)) - this.f89364i)))) - 1)).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: x */
    public final void m36900x(int i) {
        synchronized (this) {
            Object[] objArr = this.f89363h;
            wj50.m88279p(objArr);
            mo46962a(Integer.valueOf(((Number) j0g1.m52066C(objArr, (this.f89364i + ((long) ((int) ((m46971q() + ((long) this.f89358X)) - this.f89364i)))) - 1)).intValue() + i));
        }
    }
}
