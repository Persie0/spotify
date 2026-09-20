package p204p;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class y130 extends AbstractC1806e9 {
    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: E1 */
    public final void mo38147E1(AbstractC2205o8 abstractC2205o8) throws GeneralSecurityException {
        w130 w130Var = (w130) abstractC2205o8;
        if (w130Var.m86972n() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        z130.m95090U(w130Var.m86973o());
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: R0 */
    public final Object mo38154R0(AbstractC2205o8 abstractC2205o8) {
        w130 w130Var = (w130) abstractC2205o8;
        u130 u130VarM84437u = v130.m84437u();
        u130VarM84437u.m82194i();
        u130VarM84437u.m82193h(w130Var.m86973o());
        byte[] bArrM89907a = x4u0.m89907a(w130Var.m86972n());
        u130VarM84437u.m82192g(fva.m42776d(0, bArrM89907a, bArrM89907a.length));
        return (v130) u130VarM84437u.m60482b();
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: t1 */
    public final AbstractC2205o8 mo38178t1(fva fvaVar) {
        return w130.m86971p(fvaVar, ztx.m96955a());
    }
}
