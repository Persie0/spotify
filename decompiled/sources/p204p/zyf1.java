package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class zyf1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f287580a;

    /* JADX INFO: renamed from: b */
    public final long f287581b;

    /* JADX INFO: renamed from: c */
    public final boolean f287582c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ s0g1 f287583d;

    public zyf1(s0g1 s0g1Var, boolean z) {
        Objects.requireNonNull(s0g1Var);
        this.f287583d = s0g1Var;
        e8f e8fVar = e8f.f57164S0;
        this.f287580a = e8fVar.m38097b();
        this.f287581b = e8fVar.m38098c();
        this.f287582c = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo42856a();

    @Override // java.lang.Runnable
    public final void run() {
        s0g1 s0g1Var = this.f287583d;
        if (s0g1Var.f204387e) {
            mo42857b();
            return;
        }
        try {
            mo42856a();
        } catch (Exception e) {
            s0g1Var.m76870b(e, false, this.f287582c);
            mo42857b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo42857b() {
    }
}
