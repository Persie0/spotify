package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class im90 implements v5m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103644a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v5m f103645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f103646c;

    public im90(jm90 jm90Var) {
        this.f103646c = jm90Var;
        this.f103645b = jm90Var.f113795a.mo28301c();
    }

    @Override // p204p.v5m
    /* JADX INFO: renamed from: a */
    public final xv41 mo38766a() {
        switch (this.f103644a) {
            case 0:
                break;
        }
        return this.f103645b.mo38766a();
    }

    @Override // p204p.v5m
    /* JADX INFO: renamed from: b */
    public final Object mo38767b(String str, ibk ibkVar) {
        switch (this.f103644a) {
            case 0:
                break;
        }
        return this.f103645b.mo38767b(str, ibkVar);
    }

    @Override // p204p.v5m
    /* JADX INFO: renamed from: c */
    public final void mo51090c(Set set) {
        switch (this.f103644a) {
            case 0:
                jm90 jm90Var = (jm90) this.f103646c;
                synchronized (jm90Var.f113796b) {
                    jm90Var.f113796b.addAll(set);
                    jm90Var.f113795a.mo28300a(g6f.m43736n1(jm90Var.f113796b));
                }
                return;
            default:
                xpy0 xpy0Var = (xpy0) this.f103646c;
                synchronized (xpy0Var.f264781b) {
                    xpy0Var.f264781b.addAll(set);
                    xpy0Var.f264780a.mo28300a(g6f.m43736n1(xpy0Var.f264781b));
                }
                return;
        }
    }

    public im90(xpy0 xpy0Var) {
        this.f103646c = xpy0Var;
        this.f103645b = xpy0Var.f264780a.mo28301c();
    }
}
