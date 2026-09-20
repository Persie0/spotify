package p204p;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class krf1 implements ivg1, kdl0, oal0, k7l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125640a;

    /* JADX INFO: renamed from: b */
    public final Executor f125641b;

    /* JADX INFO: renamed from: c */
    public final gbk f125642c;

    /* JADX INFO: renamed from: d */
    public final y7h1 f125643d;

    public /* synthetic */ krf1(Executor executor, gbk gbkVar, y7h1 y7h1Var, int i) {
        this.f125640a = i;
        this.f125641b = executor;
        this.f125642c = gbkVar;
        this.f125643d = y7h1Var;
    }

    @Override // p204p.ivg1
    /* JADX INFO: renamed from: a */
    public final void mo35269a(Task task) {
        switch (this.f125640a) {
            case 0:
                this.f125641b.execute(new RunnableC2650zh(6, this, task));
                break;
            default:
                this.f125641b.execute(new RunnableC2650zh(7, this, task));
                break;
        }
    }

    @Override // p204p.k7l0
    /* JADX INFO: renamed from: b */
    public void mo31435b() {
        this.f125643d.m92997r();
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        this.f125643d.m92995p(exc);
    }

    @Override // p204p.kdl0
    public void onSuccess(Object obj) {
        this.f125643d.m92996q(obj);
    }
}
