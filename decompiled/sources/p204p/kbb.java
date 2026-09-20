package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kbb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vr11 f121159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f121160b;

    public kbb(vr11 vr11Var, int i) {
        this.f121159a = vr11Var;
        this.f121160b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f121159a.m86262f(this.f121160b);
    }
}
