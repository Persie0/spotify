package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xlh implements bk20, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f263147a;

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        fxx fxxVar = (fxx) obj;
        List list = fxxVar.f74479a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((axx) this.f263147a.invoke((axx) it.next()));
        }
        return fxx.m43028a(fxxVar, arrayList, null, 14);
    }

    @Override // p204p.bk20
    /* JADX INFO: renamed from: c */
    public void mo29573c(yj20 yj20Var) {
        this.f263147a.invoke(yj20Var);
    }
}
