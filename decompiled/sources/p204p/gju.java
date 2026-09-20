package p204p;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class gju implements qwf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f80566b;

    public /* synthetic */ gju(Object obj, int i) {
        this.f80565a = i;
        this.f80566b = obj;
    }

    @Override // p204p.qwf
    /* JADX INFO: renamed from: a */
    public final ovf mo26174a(hwf hwfVar) {
        switch (this.f80565a) {
            case 0:
                g2q g2qVar = (g2q) this.f80566b;
                return ((lfp0) hwfVar) instanceof lfp0 ? new awo(g2qVar.m43399d(), g2qVar.m43400e(), 11) : new awo(g2qVar.m43399d(), g2qVar.m43400e(), 11);
            case 1:
                xl81.m91406o(hwfVar);
                return new mop(((u7q) this.f80566b).m82533e(), 1);
            case 2:
                return new zoh(((tgq) this.f80566b).m80769c(), l1h.f128719a);
            default:
                m3w0 m3w0Var = (m3w0) hwfVar;
                dju djuVar = (dju) this.f80566b;
                Context context = djuVar.f49744b;
                if (m3w0Var == null) {
                    return new zoh(context, rkk.m75763o(new C2061kp(djuVar, 3), true, -1787880365));
                }
                if (m3w0Var instanceof m3w0) {
                    return new zoh(context, rkk.m75763o(new C2061kp(djuVar, 4), true, 661008572));
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
