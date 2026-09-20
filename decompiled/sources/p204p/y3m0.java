package p204p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class y3m0 extends ufj0 {
    public y3m0(long j, djs0 djs0Var, y1t0 y1t0Var, ktz0 ktz0Var) {
        super(y1t0Var, djs0Var, j, ktz0Var, new gua());
    }

    @Override // p204p.n3t0
    /* JADX INFO: renamed from: X0 */
    public final void mo42229X0(long j, String str) {
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // p204p.ufj0, p204p.n3t0
    /* JADX INFO: renamed from: Y0 */
    public final void mo63646Y0(ktz0 ktz0Var) {
        if (this.f229826i.f84423b > 0) {
            super.mo63646Y0(ktz0Var);
        }
    }

    @Override // p204p.ufj0, p204p.n3t0
    /* JADX INFO: renamed from: Z0 */
    public final long mo36188Z0(ktz0 ktz0Var, int i) {
        return 19500L;
    }

    @Override // p204p.n3t0, p204p.deu
    /* JADX INFO: renamed from: b */
    public final hrh mo35820b(ktz0 ktz0Var) {
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // p204p.n3t0, p204p.deu
    /* JADX INFO: renamed from: g0 */
    public final hrh mo35822g0(ktz0 ktz0Var, int i) {
        throw new SerializationException("Packing only supports primitive number types");
    }
}
