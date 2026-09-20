package p204p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes11.dex */
public final class x3m0 extends m3t0 {

    /* JADX INFO: renamed from: X */
    public int f257833X;

    public x3m0(y1t0 y1t0Var, o3t0 o3t0Var, ktz0 ktz0Var) {
        super(y1t0Var, o3t0Var, ktz0Var);
    }

    @Override // p204p.m3t0, p204p.fro
    /* JADX INFO: renamed from: b */
    public final frh mo29814b(ktz0 ktz0Var) {
        throw new SerializationException("Packing only supports primitive number types. The input type however was a struct: " + ktz0Var);
    }

    @Override // p204p.m3t0
    /* JADX INFO: renamed from: c1 */
    public final String mo45306c1(long j) {
        throw new SerializationException("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // p204p.m3t0
    /* JADX INFO: renamed from: f1 */
    public final long mo45307f1(ktz0 ktz0Var, int i) {
        return 19500L;
    }

    @Override // p204p.m3t0, p204p.frh
    /* JADX INFO: renamed from: p */
    public final int mo29816p(ktz0 ktz0Var) {
        if (this.f139753d.m66196d()) {
            return -1;
        }
        int i = this.f257833X;
        this.f257833X = i + 1;
        return i;
    }
}
