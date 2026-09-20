package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class zld0 extends amd0 {

    /* JADX INFO: renamed from: a */
    public final Object f283981a = new Object();

    /* JADX INFO: renamed from: b */
    public Executor f283982b;

    /* JADX INFO: renamed from: c */
    public yld0 f283983c;

    /* JADX INFO: renamed from: d */
    public tld0 f283984d;

    /* JADX INFO: renamed from: e */
    public ArrayList f283985e;

    /* JADX INFO: renamed from: k */
    public final void m96360k(tld0 tld0Var, List list) throws Throwable {
        if (tld0Var == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        if (list == null) {
            throw new NullPointerException("dynamicRoutes must not be null");
        }
        synchronized (this.f283981a) {
            try {
                try {
                    Executor executor = this.f283982b;
                    if (executor != null) {
                        executor.execute(new vld0(this, this.f283983c, tld0Var, list, 1));
                    } else {
                        this.f283984d = tld0Var;
                        this.f283985e = new ArrayList(list);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo39918l(String str);

    /* JADX INFO: renamed from: m */
    public abstract void mo39919m(String str);

    /* JADX INFO: renamed from: n */
    public abstract void mo39920n(List list);

    /* JADX INFO: renamed from: o */
    public final void m96361o(Executor executor, yld0 yld0Var) {
        synchronized (this.f283981a) {
            try {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                }
                if (yld0Var == null) {
                    throw new NullPointerException("Listener shouldn't be null");
                }
                this.f283982b = executor;
                this.f283983c = yld0Var;
                ArrayList arrayList = this.f283985e;
                if (arrayList != null && !arrayList.isEmpty()) {
                    tld0 tld0Var = this.f283984d;
                    ArrayList arrayList2 = this.f283985e;
                    this.f283984d = null;
                    this.f283985e = null;
                    this.f283982b.execute(new vld0(this, yld0Var, tld0Var, arrayList2, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
