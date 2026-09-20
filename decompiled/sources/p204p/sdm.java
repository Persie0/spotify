package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class sdm implements bwr {

    /* JADX INFO: renamed from: a */
    public final ArrayList f208037a;

    /* JADX INFO: renamed from: b */
    public final xoi0 f208038b;

    /* JADX INFO: renamed from: c */
    public final gh00 f208039c;

    /* JADX INFO: renamed from: d */
    public final int f208040d;

    public sdm(ArrayList arrayList, xoi0 xoi0Var, tb61 tb61Var, int i) {
        this.f208037a = arrayList;
        this.f208038b = xoi0Var;
        this.f208039c = tb61Var;
        this.f208040d = i;
    }

    @Override // p204p.bwr
    public final void dispose() {
        Iterator it = this.f208037a.iterator();
        while (it.hasNext()) {
            ((xp80) ((qdm) it.next()).f187713c).m91650a();
        }
    }
}
