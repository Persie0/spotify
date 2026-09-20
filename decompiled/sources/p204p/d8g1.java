package p204p;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d8g1 implements ivg1, kdl0, oal0, k7l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46458a;

    /* JADX INFO: renamed from: b */
    public final Executor f46459b;

    /* JADX INFO: renamed from: c */
    public final Object f46460c;

    /* JADX INFO: renamed from: d */
    public final Object f46461d;

    public d8g1(Executor executor, k7l0 k7l0Var) {
        this.f46458a = 0;
        this.f46460c = new Object();
        this.f46459b = executor;
        this.f46461d = k7l0Var;
    }

    @Override // p204p.ivg1
    /* JADX INFO: renamed from: a */
    public final void mo35269a(Task task) {
        switch (this.f46458a) {
            case 0:
                if (((y7h1) task).f270088d) {
                    synchronized (this.f46460c) {
                        break;
                    }
                    this.f46459b.execute(new n081(this, 24));
                    return;
                }
                return;
            case 1:
                synchronized (this.f46460c) {
                    break;
                }
                this.f46459b.execute(new RunnableC2650zh(8, this, task));
                return;
            case 2:
                if (task.mo1518j() || ((y7h1) task).f270088d) {
                    return;
                }
                synchronized (this.f46460c) {
                    break;
                }
                this.f46459b.execute(new RunnableC2650zh(9, this, task));
                return;
            case 3:
                if (task.mo1518j()) {
                    synchronized (this.f46460c) {
                        break;
                    }
                    this.f46459b.execute(new RunnableC2650zh(10, this, task));
                    return;
                }
                return;
            default:
                this.f46459b.execute(new RunnableC2650zh(11, this, task));
                return;
        }
    }

    @Override // p204p.k7l0
    /* JADX INFO: renamed from: b */
    public void mo31435b() {
        ((y7h1) this.f46461d).m92997r();
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        ((y7h1) this.f46461d).m92995p(exc);
    }

    @Override // p204p.kdl0
    public void onSuccess(Object obj) {
        ((y7h1) this.f46461d).m92996q(obj);
    }

    public d8g1(Executor executor, r7l0 r7l0Var) {
        this.f46458a = 1;
        this.f46460c = new Object();
        this.f46459b = executor;
        this.f46461d = r7l0Var;
    }

    public d8g1(Executor executor, oal0 oal0Var) {
        this.f46458a = 2;
        this.f46460c = new Object();
        this.f46459b = executor;
        this.f46461d = oal0Var;
    }

    public d8g1(Executor executor, kdl0 kdl0Var) {
        this.f46458a = 3;
        this.f46460c = new Object();
        this.f46459b = executor;
        this.f46461d = kdl0Var;
    }

    public d8g1(Executor executor, cy51 cy51Var, y7h1 y7h1Var) {
        this.f46458a = 4;
        this.f46459b = executor;
        this.f46460c = cy51Var;
        this.f46461d = y7h1Var;
    }
}
