package p204p;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class y800 implements fd20, h9y0, ijc1 {

    /* JADX INFO: renamed from: a */
    public final i500 f270157a;

    /* JADX INFO: renamed from: b */
    public final hjc1 f270158b;

    /* JADX INFO: renamed from: c */
    public final RunnableC2364s6 f270159c;

    /* JADX INFO: renamed from: d */
    public vic1 f270160d;

    /* JADX INFO: renamed from: e */
    public oc80 f270161e = null;

    /* JADX INFO: renamed from: f */
    public ltx0 f270162f = null;

    public y800(i500 i500Var, hjc1 hjc1Var, RunnableC2364s6 runnableC2364s6) {
        this.f270157a = i500Var;
        this.f270158b = hjc1Var;
        this.f270159c = runnableC2364s6;
    }

    @Override // p204p.fd20
    /* JADX INFO: renamed from: S */
    public final vic1 mo34125S() {
        Application application;
        i500 i500Var = this.f270157a;
        vic1 vic1VarMo34125S = i500Var.mo34125S();
        if (!vic1VarMo34125S.equals(i500Var.f98720t1)) {
            this.f270160d = vic1VarMo34125S;
            return vic1VarMo34125S;
        }
        if (this.f270160d == null) {
            Context applicationContext = i500Var.m49702X0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f270160d = new n9y0(application, i500Var, i500Var.f98701f);
        }
        return this.f270160d;
    }

    @Override // p204p.fd20
    /* JADX INFO: renamed from: T */
    public final koi0 mo34126T() {
        Application application;
        i500 i500Var = this.f270157a;
        Context applicationContext = i500Var.m49702X0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        koi0 koi0Var = new koi0(0);
        if (application != null) {
            koi0Var.m56998a(tic1.f220605d, application);
        }
        koi0Var.m56998a(gyf1.f85601a, i500Var);
        koi0Var.m56998a(gyf1.f85602b, this);
        Bundle bundle = i500Var.f98701f;
        if (bundle != null) {
            koi0Var.m56998a(gyf1.f85603c, bundle);
        }
        return koi0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m93033a(ta80 ta80Var) {
        this.f270161e.m66676g(ta80Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m93034b() {
        if (this.f270161e == null) {
            this.f270161e = new oc80(this, true);
            ltx0 ltx0VarM59910e = ltx0.m59910e(this);
            this.f270162f = ltx0VarM59910e;
            ltx0VarM59910e.m59917j();
            this.f270159c.run();
        }
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        m93034b();
        return this.f270161e;
    }

    @Override // p204p.ijc1
    /* JADX INFO: renamed from: w */
    public final hjc1 mo34134w() {
        m93034b();
        return this.f270158b;
    }

    @Override // p204p.h9y0
    /* JADX INFO: renamed from: x */
    public final f9y0 mo34135x() {
        m93034b();
        return this.f270162f.m59915g();
    }
}
