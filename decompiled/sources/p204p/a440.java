package p204p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a440 implements l400 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12137a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12138b;

    public /* synthetic */ a440(Object obj, int i) {
        this.f12137a = i;
        this.f12138b = obj;
    }

    @Override // p204p.l400
    /* JADX INFO: renamed from: c */
    public final void mo24662c(m400 m400Var) {
        l400 l400Var;
        switch (this.f12137a) {
            case 0:
                c440 c440Var = (c440) ((WeakReference) ((b440) this.f12138b).f23219e).get();
                if (c440Var != null) {
                    c440Var.f33839R0.execute(new ig10(c440Var, 3));
                    return;
                }
                return;
            default:
                xvb xvbVar = (xvb) this.f12138b;
                synchronized (xvbVar.f266337c) {
                    try {
                        int i = xvbVar.f266335a - 1;
                        xvbVar.f266335a = i;
                        if (xvbVar.f266336b && i == 0) {
                            xvbVar.close();
                        }
                        l400Var = (l400) xvbVar.f266340f;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (l400Var != null) {
                    l400Var.mo24662c(m400Var);
                    return;
                }
                return;
        }
    }
}
