package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class ooc1 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qoc1 f167543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ poc1 f167544b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fpc1 f167545c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f167546d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kk6 f167547e;

    public ooc1(qoc1 qoc1Var, poc1 poc1Var, fpc1 fpc1Var, View view, kk6 kk6Var) {
        this.f167543a = qoc1Var;
        this.f167544b = poc1Var;
        this.f167545c = fpc1Var;
        this.f167546d = view;
        this.f167547e = kk6Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f167543a.f190911a.getLifecycle().mo31988d(this.f167544b);
        this.f167545c.m42326b();
        this.f167546d.removeOnLayoutChangeListener(this.f167547e);
    }
}
