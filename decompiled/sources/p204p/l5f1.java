package p204p;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final class l5f1 {

    /* JADX INFO: renamed from: a */
    public m7a0 f129909a;

    /* JADX INFO: renamed from: b */
    public boolean f129910b;

    /* JADX INFO: renamed from: c */
    public boolean f129911c;

    /* JADX INFO: renamed from: d */
    public boolean f129912d;

    /* JADX INFO: renamed from: e */
    public boolean f129913e;

    /* JADX INFO: renamed from: f */
    public final Executor f129914f;

    /* JADX INFO: renamed from: g */
    public volatile en6 f129915g;

    /* JADX INFO: renamed from: h */
    public volatile en6 f129916h;

    /* JADX INFO: renamed from: i */
    public final Semaphore f129917i;

    /* JADX INFO: renamed from: j */
    public final Set f129918j;

    public l5f1(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = en6.f61074h;
        this.f129910b = false;
        this.f129911c = false;
        this.f129912d = true;
        this.f129913e = false;
        signInHubActivity.getApplicationContext();
        this.f129914f = threadPoolExecutor;
        this.f129917i = new Semaphore(0);
        this.f129918j = set;
    }

    /* JADX INFO: renamed from: a */
    public final void m58215a() {
        if (this.f129915g != null) {
            if (!this.f129910b) {
                this.f129913e = true;
            }
            if (this.f129916h != null) {
                this.f129915g.getClass();
                this.f129915g = null;
                return;
            }
            this.f129915g.getClass();
            en6 en6Var = this.f129915g;
            en6Var.f61079d.set(true);
            if (en6Var.f61077b.cancel(false)) {
                this.f129916h = this.f129915g;
            }
            this.f129915g = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58216b() {
        if (this.f129916h != null || this.f129915g == null) {
            return;
        }
        this.f129915g.getClass();
        en6 en6Var = this.f129915g;
        Executor executor = this.f129914f;
        if (en6Var.f61078c == 1) {
            en6Var.f61078c = 2;
            en6Var.f61076a.getClass();
            executor.execute(en6Var.f61077b);
        } else {
            int iM38547C = edb.m38547C(en6Var.f61078c);
            if (iM38547C == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iM38547C == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        kgg1.m56348k(this, sb);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
