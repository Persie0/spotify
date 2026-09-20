package p204p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gbb {

    /* JADX INFO: renamed from: a */
    public Object f78253a;

    /* JADX INFO: renamed from: b */
    public jbb f78254b;

    /* JADX INFO: renamed from: c */
    public syw0 f78255c;

    /* JADX INFO: renamed from: d */
    public boolean f78256d;

    /* JADX INFO: renamed from: a */
    public final void m44210a(Runnable runnable, Executor executor) {
        syw0 syw0Var = this.f78255c;
        if (syw0Var != null) {
            syw0Var.mo28322a(runnable, executor);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44211b(Object obj) {
        this.f78256d = true;
        jbb jbbVar = this.f78254b;
        boolean z = jbbVar != null && jbbVar.f110727b.m63868l(obj);
        if (z) {
            this.f78253a = null;
            this.f78254b = null;
            this.f78255c = null;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44212c(Throwable th) {
        this.f78256d = true;
        jbb jbbVar = this.f78254b;
        boolean z = jbbVar != null && jbbVar.f110727b.m63869m(th);
        if (z) {
            this.f78253a = null;
            this.f78254b = null;
            this.f78255c = null;
        }
        return z;
    }

    public final void finalize() {
        syw0 syw0Var;
        jbb jbbVar = this.f78254b;
        if (jbbVar != null) {
            ibb ibbVar = jbbVar.f110727b;
            if (!ibbVar.isDone()) {
                ibbVar.m63869m(new C1889g9("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f78253a, 2));
            }
        }
        if (this.f78256d || (syw0Var = this.f78255c) == null) {
            return;
        }
        syw0Var.m63868l(null);
    }
}
