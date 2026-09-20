package p204p;

import com.spotify.base.java.logging.Logger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class dfq implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hfq f48633b;

    public /* synthetic */ dfq(hfq hfqVar, int i) {
        this.f48632a = i;
        this.f48633b = hfqVar;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f48632a) {
            case 0:
                rui ruiVar = (rui) obj;
                hfq hfqVar = this.f48633b;
                kwi kwiVar = (kwi) hfqVar.f90789m.get();
                boolean z = kwiVar instanceof jwi;
                w2a1 w2a1Var = w2a1.f247311a;
                if (z) {
                    Object objM47357d = hfq.m47357d(hfqVar, ruiVar, ((jwi) kwiVar).f116647b, fbkVar);
                    return objM47357d == yuk.f276404a ? objM47357d : w2a1Var;
                }
                if (kwiVar instanceof iwi) {
                    Logger.m3973i("CastBasic->%s", "Ignoring pull-to-local command");
                    return w2a1Var;
                }
                if (kwiVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Logger.m3973i("CastBasic->%s", "Route selection without a transfer command? sus");
                return w2a1Var;
            default:
                Object objM47356c = hfq.m47356c(this.f48633b, ((t1b0) obj).f216210a, fbkVar);
                return objM47356c == yuk.f276404a ? objM47356c : w2a1.f247311a;
        }
    }
}
