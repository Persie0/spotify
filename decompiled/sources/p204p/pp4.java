package p204p;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class pp4 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qp4 f179884a;

    public pp4(qp4 qp4Var) {
        this.f179884a = qp4Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        qp4 qp4Var = this.f179884a;
        synchronized (qp4Var) {
            if (((hvu0) ((WeakReference) qp4Var.f191124b).get()) == null) {
                qp4Var.m73426k();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        mvu0 mvu0VarM48899d;
        long jM79497b;
        long j;
        qp4 qp4Var = this.f179884a;
        synchronized (qp4Var) {
            try {
                hvu0 hvu0Var = (hvu0) ((WeakReference) qp4Var.f191124b).get();
                if (hvu0Var != null) {
                    fvu0 fvu0Var = hvu0Var.f95795a;
                    if (i >= 40) {
                        mvu0 mvu0VarM48899d2 = hvu0Var.m48899d();
                        if (mvu0VarM48899d2 != null) {
                            mvu0VarM48899d2.m62967a();
                        }
                    } else if (i >= 20) {
                        op4 op4Var = (op4) qp4Var.f191125c;
                        Context context = fvu0Var.f73867a;
                        double d = op4Var.f167751a;
                        if (d != 1.0d) {
                            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(op4Var);
                            qp4 qp4Var2 = op4Var.f167752b;
                            hvu0 hvu0Var2 = (hvu0) ((WeakReference) qp4Var2.f191124b).get();
                            if (hvu0Var2 != null) {
                                mvu0 mvu0VarM48899d3 = hvu0Var2.m48899d();
                                if (mvu0VarM48899d3 != null) {
                                    synchronized (mvu0VarM48899d3.f147653c) {
                                        j = mvu0VarM48899d3.f147651a.f224242a;
                                    }
                                    mvu0VarM48899d3.m62969c((long) (d * j));
                                }
                            } else {
                                qp4Var2.m73426k();
                            }
                        }
                    } else if (i >= 10 && (mvu0VarM48899d = hvu0Var.m48899d()) != null) {
                        synchronized (mvu0VarM48899d.f147653c) {
                            jM79497b = mvu0VarM48899d.f147651a.f224244c.m79497b();
                        }
                        long j2 = jM79497b / ((long) 2);
                        synchronized (mvu0VarM48899d.f147653c) {
                            mvu0VarM48899d.f147651a.f224244c.m79499d(j2);
                        }
                    }
                } else {
                    qp4Var.m73426k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
