package p204p;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class l7j {

    /* JADX INFO: renamed from: a */
    public final o0e1 f130661a;

    /* JADX INFO: renamed from: b */
    public final Context f130662b;

    /* JADX INFO: renamed from: c */
    public final Object f130663c = new Object();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f130664d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public Object f130665e;

    public l7j(Context context, o0e1 o0e1Var) {
        this.f130661a = o0e1Var;
        this.f130662b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo36122a();

    /* JADX INFO: renamed from: b */
    public final void m58416b(Object obj) {
        synchronized (this.f130663c) {
            Object obj2 = this.f130665e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f130665e = obj;
                this.f130661a.f160374d.execute(new fxf(3, g6f.m43728j1(this.f130664d), this));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo36123c();

    /* JADX INFO: renamed from: d */
    public abstract void mo36124d();
}
