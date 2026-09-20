package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class eb80 implements ua80 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f57851a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public va80 f57852b;

    /* JADX INFO: renamed from: c */
    public w8j f57853c;

    /* JADX INFO: renamed from: a */
    public final void m38361a(w8j w8jVar) {
        this.f57853c = w8jVar;
        ArrayList arrayList = this.f57851a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            va80 va80Var = (va80) arrayList.get(size);
            this.f57852b = va80Var;
            w8jVar.accept(va80Var);
        }
        this.f57852b = null;
        this.f57853c = null;
    }

    @Override // p204p.ua80
    /* JADX INFO: renamed from: q */
    public final boolean mo32226q(va80 va80Var) {
        ArrayList arrayList = this.f57851a;
        return !arrayList.contains(va80Var) && arrayList.add(va80Var);
    }

    @Override // p204p.ua80
    /* JADX INFO: renamed from: z */
    public final boolean mo32229z(va80 va80Var) {
        va80 va80Var2 = this.f57852b;
        if (va80Var2 == null || va80Var == va80Var2) {
            return this.f57851a.remove(va80Var);
        }
        throw new IllegalArgumentException(s571.m77251j("Removing a listener (other than the one being notified) during ", String.valueOf(this.f57853c), " is not supported."));
    }
}
