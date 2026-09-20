package p204p;

import com.spotify.remoteconfig.fetcherimpl.network.ResolveRequestFailedException;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class b331 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22878a;

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) throws ResolveRequestFailedException {
        switch (this.f22878a) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                o2x0 o2x0Var = (o2x0) obj;
                if ((o2x0Var != null ? o2x0Var.f161171a.f149860d : -1) != 200) {
                    if ((o2x0Var != null ? o2x0Var.f161171a.f149860d : -1) != 404) {
                        if ((o2x0Var != null ? o2x0Var.f161171a.f149860d : -1) == 429) {
                            return;
                        } else {
                            throw new ResolveRequestFailedException(edb.m38563l("Unauth Resolve request failed: ", o2x0Var != null ? o2x0Var.f161171a.f149860d : -1, "!"), o2x0Var);
                        }
                    }
                    return;
                }
                return;
            case 3:
                throw ei6.m39072i(obj);
            default:
                throw ei6.m39072i(obj);
        }
    }

    public /* synthetic */ b331(Object obj, int i) {
        this.f22878a = i;
    }
}
