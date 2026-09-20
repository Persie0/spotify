package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yi70 implements e850 {

    /* JADX INFO: renamed from: a */
    public final Object f273057a = new Object();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f273058b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public volatile d850 f273059c;

    @Override // p204p.e850
    /* JADX INFO: renamed from: b */
    public final void mo34670b(aey0 aey0Var, av91 av91Var, d850 d850Var) {
        synchronized (this.f273057a) {
            this.f273058b.put(aey0Var, d850Var);
            this.f273059c = d850Var;
        }
    }
}
