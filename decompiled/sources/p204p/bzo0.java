package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bzo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ozo0 f32544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f32545b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f32546c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f32547d;

    public bzo0(ozo0 ozo0Var, int i, long j, long j2) {
        this.f32544a = ozo0Var;
        this.f32545b = i;
        this.f32546c = j;
        this.f32547d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32544a.mo49985o(this.f32545b, this.f32546c, this.f32547d);
    }
}
