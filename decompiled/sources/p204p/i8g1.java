package p204p;

import android.os.RemoteException;
import com.google.android.engage.service.AppEngageException;

/* JADX INFO: loaded from: classes4.dex */
public final class i8g1 extends bwf1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f99786b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ev61 f99787c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f99788d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f99789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8g1(k8f1 k8f1Var, ev61 ev61Var, w7f1 w7f1Var, ev61 ev61Var2) {
        super(ev61Var);
        this.f99788d = w7f1Var;
        this.f99787c = ev61Var2;
        this.f99789e = k8f1Var;
    }

    @Override // p204p.bwf1
    /* JADX INFO: renamed from: a */
    public final void mo30688a() {
        switch (this.f99786b) {
            case 0:
                synchronized (((dsg1) this.f99789e).f52574f) {
                    try {
                        dsg1 dsg1Var = (dsg1) this.f99789e;
                        ev61 ev61Var = this.f99787c;
                        dsg1Var.f52573e.add(ev61Var);
                        ev61Var.f63172a.mo1510b(new sqe1(dsg1Var, ev61Var));
                        if (((dsg1) this.f99789e).f52579k.getAndIncrement() > 0) {
                            ((dsg1) this.f99789e).f52570b.m94136g("Already connected to the service.", new Object[0]);
                        }
                        dsg1.m36771c((dsg1) this.f99789e, (i8g1) this.f99788d);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ev61 ev61Var2 = this.f99787c;
                try {
                    gu30 gu30Var = ((k8f1) this.f99789e).f120363e.f52581m;
                    if (gu30Var != null) {
                        ((w7f1) this.f99788d).mo29654b(gu30Var, ev61Var2);
                    } else {
                        ev61Var2.m40098c(new AppEngageException(2));
                    }
                    return;
                } catch (RemoteException unused) {
                    ev61Var2.m40098c(new AppEngageException(3));
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8g1(dsg1 dsg1Var, ev61 ev61Var, ev61 ev61Var2, i8g1 i8g1Var) {
        super(ev61Var);
        this.f99787c = ev61Var2;
        this.f99788d = i8g1Var;
        this.f99789e = dsg1Var;
    }
}
