package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class siq implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ki3 f209587b;

    public /* synthetic */ siq(ki3 ki3Var, int i) {
        this.f209586a = i;
        this.f209587b = ki3Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f209586a) {
            case 0:
                ((z2z) this.f209587b.f122773b).m95235b((List) obj);
                break;
            default:
                ibj ibjVar = (ibj) obj;
                ((z2z) this.f209587b.f122773b).m95236c(ibjVar instanceof hbj ? (hbj) ibjVar : null);
                break;
        }
    }
}
