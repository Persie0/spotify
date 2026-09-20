package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class fh8 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69601a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o2a f69602b;

    public /* synthetic */ fh8(o2a o2aVar, int i) {
        this.f69601a = i;
        this.f69602b = o2aVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f69601a) {
            case 0:
                boolean zIsEmpty = ((zg8) obj).f282543a.isEmpty();
                o2a o2aVar = this.f69602b;
                if (zIsEmpty) {
                    o2aVar.m66101b();
                } else if (!o2aVar.f161003g.contains("social_radar")) {
                    na6.m63957e("Identifier social_radar must have been previously enabled in order to initiate a scan request with it!");
                } else {
                    o2aVar.f161006t.onNext(new m2a());
                }
                break;
            case 1:
                pqm0 pqm0Var = (pqm0) obj;
                Set set = (Set) pqm0Var.f180350a;
                j2a j2aVar = (j2a) pqm0Var.f180351b;
                boolean zIsEmpty2 = set.isEmpty();
                o2a o2aVar2 = this.f69602b;
                i2a i2aVar = i2a.f97782a;
                if (zIsEmpty2 && j2aVar.equals(i2aVar)) {
                    o2aVar2.m66105g();
                    break;
                } else if (!set.isEmpty() && !j2aVar.equals(i2aVar)) {
                    o2aVar2.m66104f();
                    break;
                }
                break;
            default:
                this.f69602b.f160995Y.onNext(new g2a(5));
                break;
        }
    }
}
