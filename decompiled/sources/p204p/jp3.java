package p204p;

import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jp3 implements wja, lp3, njq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kp3 f114558a;

    @Override // p204p.wja
    /* JADX INFO: renamed from: a */
    public void mo26364a(z2l z2lVar) {
        kp3 kp3Var = this.f114558a;
        synchronized (kp3Var) {
            try {
                if (kp3Var.f124966b instanceof alr) {
                    kp3Var.f124967c.add(z2lVar);
                }
                kp3Var.f124966b.mo26364a(z2lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.lp3
    /* JADX INFO: renamed from: d */
    public void mo31098d(Bundle bundle) {
        this.f114558a.f124965a.mo31098d(bundle);
    }

    @Override // p204p.njq
    /* JADX INFO: renamed from: e */
    public void mo40111e(j4t0 j4t0Var) {
        kp3 kp3Var = this.f114558a;
        Log.isLoggable("FirebaseCrashlytics", 3);
        gp3 gp3Var = (gp3) j4t0Var.get();
        gl8 gl8Var = new gl8(gp3Var, 20);
        ydi ydiVar = new ydi();
        ip3 ip3Var = (ip3) gp3Var;
        hp3 hp3VarM51228b = ip3Var.m51228b("clx", ydiVar);
        if (hp3VarM51228b == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            hp3VarM51228b = ip3Var.m51228b("crash", ydiVar);
        }
        if (hp3VarM51228b != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            fj1 fj1Var = new fj1();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c06 c06Var = new c06(gl8Var);
            synchronized (kp3Var) {
                try {
                    Iterator it = kp3Var.f124967c.iterator();
                    while (it.hasNext()) {
                        fj1Var.mo26364a((z2l) it.next());
                    }
                    ydiVar.f271775c = fj1Var;
                    ydiVar.f271774b = c06Var;
                    kp3Var.f124966b = fj1Var;
                    kp3Var.f124965a = c06Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
