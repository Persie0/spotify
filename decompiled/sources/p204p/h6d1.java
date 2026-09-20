package p204p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class h6d1 {

    /* JADX INFO: renamed from: a */
    public final ruc f88070a = new ruc(1);

    public h6d1(zh21 zh21Var) {
        Iterator<E> it = zh21Var.iterator();
        while (it.hasNext()) {
            ide1 ide1Var = (ide1) it.next();
            i6d1 i6d1Var = ide1Var.f101088a;
            ruc rucVar = this.f88070a;
            hde1 hde1Var = ide1Var.f101089b;
            Iterator it2 = i6d1Var.f99215a.iterator();
            while (it2.hasNext()) {
                ((CopyOnWriteArrayList) rucVar.f202797a.computeIfAbsent((String) it2.next(), rer.f198422h)).add(hde1Var);
            }
        }
    }
}
