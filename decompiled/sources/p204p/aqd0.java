package p204p;

import androidx.media3.session.legacy.MediaSessionCompat;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aqd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pqd0 f18215b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pdp0 f18216c;

    public /* synthetic */ aqd0(pqd0 pqd0Var, pdp0 pdp0Var, int i) {
        this.f18214a = i;
        this.f18215b = pqd0Var;
        this.f18216c = pdp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f18214a) {
            case 0:
                pqd0 pqd0Var = this.f18215b;
                pqd0Var.f180275j.setPlaybackState(pqd0Var.m70635b(this.f18216c));
                break;
            default:
                pqd0 pqd0Var2 = this.f18215b;
                MediaSessionCompat mediaSessionCompat = pqd0Var2.f180275j;
                pdp0 pdp0Var = this.f18216c;
                mediaSessionCompat.setPlaybackState(pqd0Var2.m70635b(pdp0Var));
                pqd0Var2.f180271f.m65413x(pdp0Var.mo43895l0().m28393a(17) ? pdp0Var.mo43876b0() : qp71.f191180a);
                break;
        }
    }
}
