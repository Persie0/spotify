package p204p;

import com.ravelin.core.util.security.RootCheckerNative;

/* JADX INFO: loaded from: classes.dex */
public final class evm implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63285a;

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f63285a) {
            case 0:
                return new fwx0();
            case 1:
                return new koc0();
            default:
                return new RootCheckerNative();
        }
    }

    public evm(j7n0 j7n0Var) {
        this.f63285a = 2;
    }
}
