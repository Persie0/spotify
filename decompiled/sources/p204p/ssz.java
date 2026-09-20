package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ssz implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f213739a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ki3 f213740b;

    public /* synthetic */ ssz(ki3 ki3Var, int i) {
        this.f213739a = i;
        this.f213740b = ki3Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f213739a) {
            case 0:
                ((z2z) this.f213740b.f122773b).m95235b((List) obj);
                break;
            default:
                ibj ibjVar = (ibj) obj;
                ((z2z) this.f213740b.f122773b).m95236c(ibjVar instanceof hbj ? (hbj) ibjVar : null);
                break;
        }
    }
}
