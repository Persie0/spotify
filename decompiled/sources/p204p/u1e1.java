package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u1e1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final v1e1 f225801a;

    /* JADX INFO: renamed from: b */
    public final f0e1 f225802b;

    public u1e1(v1e1 v1e1Var, f0e1 f0e1Var) {
        this.f225801a = v1e1Var;
        this.f225802b = f0e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f225801a.f236355d) {
            try {
                if (((u1e1) this.f225801a.f236353b.remove(this.f225802b)) != null) {
                    t1e1 t1e1Var = (t1e1) this.f225801a.f236354c.remove(this.f225802b);
                    if (t1e1Var != null) {
                        f0e1 f0e1Var = this.f225802b;
                        wkq wkqVar = (wkq) t1e1Var;
                        gaz gazVarM44190b = gaz.m44190b();
                        Objects.toString(f0e1Var);
                        gazVarM44190b.getClass();
                        wkqVar.f252288h.execute(new vkq(wkqVar, 0));
                    }
                } else {
                    gaz gazVarM44190b2 = gaz.m44190b();
                    Objects.toString(this.f225802b);
                    gazVarM44190b2.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
