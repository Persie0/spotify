package p204p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes7.dex */
public final class xhy0 implements Function, i5b1 {

    /* JADX INFO: renamed from: a */
    public int f261731a;

    public /* synthetic */ xhy0(int i) {
        this.f261731a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m91068a() {
        return this.f261731a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        wlr0 wlr0Var = (wlr0) obj;
        return new kpy0(this.f261731a, wlr0Var.f252606b, wlr0Var.f252607c, wlr0Var.f252605a, wlr0Var.f252608d, wlr0Var.f252609e, wlr0Var.f252610f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m91069c(int i) {
        return (this.f261731a & i) == i;
    }

    @Override // p204p.i5b1
    /* JADX INFO: renamed from: e */
    public int mo49774e() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public boolean m91070g() {
        return !(!m91069c(32) || m91069c(64) || m91069c(128)) || m91069c(64);
    }

    /* JADX INFO: renamed from: h */
    public boolean m91071h() {
        return m91070g() || m91069c(128);
    }

    @Override // p204p.i5b1
    /* JADX INFO: renamed from: k */
    public int mo49775k() {
        return this.f261731a;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: m */
    public w05 mo35624m(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return j < ((long) this.f261731a) * 1000000 ? w05Var : w05Var2;
    }

    public xhy0(int i, int i2, int i3) {
        switch (i3) {
            case 6:
                this.f261731a = (i2 & 2) != 0 ? 0 : i;
                break;
            default:
                this.f261731a = (i2 & 1) != 0 ? 0 : i;
                break;
        }
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: f */
    public w05 mo35621f(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return w05Var3;
    }
}
