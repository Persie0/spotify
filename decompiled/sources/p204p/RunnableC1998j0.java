package p204p;

import java.util.ArrayList;

/* JADX INFO: renamed from: p.j0 */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC1998j0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eh00 f107317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1797e0 f107318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2435u0 f107319c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f107320d;

    public RunnableC1998j0(eh00 eh00Var, C1797e0 c1797e0, C2435u0 c2435u0, gh00 gh00Var) {
        this.f107317a = eh00Var;
        this.f107318b = c1797e0;
        this.f107319c = c2435u0;
        this.f107320d = gh00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh00 eh00Var = this.f107317a;
        if (eh00Var != null) {
            eh00Var.invoke();
        }
        C1797e0 c1797e0 = this.f107318b;
        mmc mmcVar = (mmc) c1797e0.f54817a;
        C1840f0 c1840f0 = (C1840f0) c1797e0.f54818b;
        synchronized (mmcVar) {
            tx8.m81897l(bnc.f28783x, "unsubscribe(); channel = " + mmcVar.f28784c);
            anc ancVar = mmcVar.f28795n;
            synchronized (ancVar) {
                ((ArrayList) ancVar.f89665a).remove(c1840f0);
            }
            for (anc ancVar2 : mmcVar.f28796o.values()) {
                synchronized (ancVar2) {
                    ((ArrayList) ancVar2.f89665a).remove(c1840f0);
                }
            }
        }
        ((mmc) c1797e0.f54817a).m29946k(null);
        C2435u0 c2435u0 = this.f107319c;
        ArrayList arrayList = c2435u0.f225337c;
        gh00 gh00Var = this.f107320d;
        synchronized (arrayList) {
            c2435u0.f225337c.remove(gh00Var);
        }
    }
}
