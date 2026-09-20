package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class ras implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197376a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gmj f197377b;

    public /* synthetic */ ras(gmj gmjVar, int i) {
        this.f197376a = i;
        this.f197377b = gmjVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f197376a) {
            case 0:
                j4s j4sVar = (j4s) obj;
                gmj.m45266c(this.f197377b, j4sVar.f108776a, j4sVar.f108777b, 4);
                break;
            default:
                Iterator it = ((kfw0) obj).f122235a.iterator();
                while (it.hasNext()) {
                    gmj.m45266c(this.f197377b, (String) it.next(), null, 6);
                }
                break;
        }
    }
}
