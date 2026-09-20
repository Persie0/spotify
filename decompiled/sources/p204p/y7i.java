package p204p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class y7i implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f270091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f270092b;

    public /* synthetic */ y7i(Object obj, int i) {
        this.f270091a = i;
        this.f270092b = obj;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f270091a) {
            case 0:
                nai naiVar = (nai) obj;
                gh00 gh00Var = (gh00) this.f270092b;
                wj50.m88279p(naiVar);
                gh00Var.invoke(naiVar);
                break;
            case 1:
                ((Consumer) this.f270092b).accept(new bce1(obj, null));
                break;
            case 2:
                zv41 zv41Var = (zv41) this.f270092b;
                wj50.m88279p(obj);
                zv41Var.m97091m(null, obj);
                break;
            default:
                ((jph0) this.f270092b).f114666k.onNext(Boolean.valueOf(((fph0) obj).f71870a instanceof loh0));
                break;
        }
    }
}
