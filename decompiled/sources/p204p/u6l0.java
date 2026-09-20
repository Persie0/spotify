package p204p;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class u6l0 implements zu30 {

    /* JADX INFO: renamed from: a */
    public boolean f227382a;

    /* JADX INFO: renamed from: b */
    public final Object f227383b;

    /* JADX INFO: renamed from: c */
    public Object f227384c;

    public u6l0(String str, String str2, boolean z) {
        this.f227384c = str;
        this.f227383b = str2;
        this.f227382a = z;
    }

    /* JADX INFO: renamed from: a */
    public void m82450a() {
        ((bqa) this.f227383b).m30233l(new CancellationException("onBack cancelled"), true);
        ((di41) this.f227384c).mo26601e(null);
    }

    /* JADX INFO: renamed from: b */
    public void m82451b(ivg1 ivg1Var) {
        synchronized (this.f227383b) {
            try {
                if (((ArrayDeque) this.f227384c) == null) {
                    this.f227384c = new ArrayDeque();
                }
                ((ArrayDeque) this.f227384c).add(ivg1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m82452c(Task task) {
        ivg1 ivg1Var;
        synchronized (this.f227383b) {
            if (((ArrayDeque) this.f227384c) != null && !this.f227382a) {
                this.f227382a = true;
                while (true) {
                    synchronized (this.f227383b) {
                        try {
                            ivg1Var = (ivg1) ((ArrayDeque) this.f227384c).poll();
                            if (ivg1Var == null) {
                                this.f227382a = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ivg1Var.mo35269a(task);
                }
            }
        }
    }

    @Override // p204p.zu30
    /* JADX INFO: renamed from: e */
    public synchronized xra0 mo47169e(String str) {
        zu51 zu51Var;
        zu51Var = (zu51) ((HashMap) this.f227383b).get(str);
        if (zu51Var == null) {
            zu51Var = new zu51(str, (LinkedBlockingQueue) this.f227384c, this.f227382a);
            ((HashMap) this.f227383b).put(str, zu51Var);
        }
        return zu51Var;
    }

    public u6l0(int i) {
        switch (i) {
            case 2:
                this.f227383b = new Object();
                break;
            default:
                this.f227382a = false;
                this.f227383b = new HashMap();
                this.f227384c = new LinkedBlockingQueue();
                break;
        }
    }

    public u6l0(xuk xukVar, boolean z, th00 th00Var, lgq0 lgq0Var) {
        this.f227382a = z;
        this.f227383b = xtm0.m92080a(-2, 1, 4);
        this.f227384c = x0h1.m89578u(xukVar, null, 0, new mw2(lgq0Var, th00Var, this, (fbk) null, 3), 3);
    }
}
