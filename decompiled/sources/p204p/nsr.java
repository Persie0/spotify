package p204p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nsr extends dv61 {

    /* JADX INFO: renamed from: c */
    public int f157872c;

    public nsr(int i) {
        super(0L, false);
        this.f157872c = i;
    }

    /* JADX INFO: renamed from: c */
    public abstract fbk mo48211c();

    /* JADX INFO: renamed from: d */
    public Throwable mo48212d(Object obj) {
        ruf rufVar = obj instanceof ruf ? (ruf) obj : null;
        if (rufVar != null) {
            return rufVar.f202838a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m65586f(Throwable th) {
        srz.m79154l(new cvk("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo48211c().getContext());
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo48214h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            lsr lsrVar = (lsr) mo48211c();
            ibk ibkVar = lsrVar.f136587e;
            Object obj = lsrVar.f136589g;
            juk context = ibkVar.getContext();
            Object objM41327u = fcg1.m41327u(context, obj);
            tf60 tf60Var = null;
            k1a1 k1a1VarM37367L = objM41327u != fcg1.f68117a ? dyu.m37367L(ibkVar, context, objM41327u) : null;
            try {
                juk context2 = ibkVar.getContext();
                Object objMo48214h = mo48214h();
                Throwable thMo48212d = mo48212d(objMo48214h);
                if (thMo48212d == null && isg1.m51534n(this.f157872c)) {
                    tf60Var = (tf60) context2.mo26595B(gk40.f80712X0);
                }
                if (tf60Var != null && !tf60Var.isActive()) {
                    CancellationException cancellationExceptionMo26603h = tf60Var.mo26603h();
                    mo48210a(cancellationExceptionMo26603h);
                    ibkVar.resumeWith(new c6x0(cancellationExceptionMo26603h));
                } else if (thMo48212d != null) {
                    ibkVar.resumeWith(new c6x0(thMo48212d));
                } else {
                    ibkVar.resumeWith(mo48213e(objMo48214h));
                }
            } finally {
                if (k1a1VarM37367L == null || k1a1VarM37367L.m55084A0()) {
                    fcg1.m41319m(context, objM41327u);
                }
            }
        } catch (DispatchException e) {
            srz.m79154l(e.f10914a, mo48211c().getContext());
        } catch (Throwable th) {
            m65586f(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo48210a(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: e */
    public Object mo48213e(Object obj) {
        return obj;
    }
}
