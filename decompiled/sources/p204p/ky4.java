package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ky4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ly4 f127645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f127646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f127647c;

    public ky4(ly4 ly4Var, float f, float f2) {
        this.f127645a = ly4Var;
        this.f127646b = f;
        this.f127647c = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ly4 ly4Var = this.f127645a;
        gy4 gy4Var = ly4Var.f137950a;
        gy4Var.f85458y = this.f127646b;
        gy4Var.f85459z = this.f127647c;
        ly4.m60215a(ly4Var);
    }
}
