package p204p;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes9.dex */
public final class q8a0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f186270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f186271b;

    public q8a0(boolean z, boolean z2) {
        this.f186270a = z;
        this.f186271b = z2;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(o6q0 o6q0Var, fbk fbkVar) {
        if (this.f186270a || this.f186271b) {
            Object objM82714H1 = ((ub61) o6q0Var).m82714H1(new g69(2, 5, null), fbkVar);
            if (objM82714H1 == yuk.f276404a) {
                return objM82714H1;
            }
        }
        return w2a1.f247311a;
    }
}
