package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ecm implements cut {

    /* JADX INFO: renamed from: a */
    public final uut f58355a;

    /* JADX INFO: renamed from: b */
    public final avt f58356b;

    /* JADX INFO: renamed from: c */
    public final uwt f58357c;

    /* JADX INFO: renamed from: d */
    public final String f58358d;

    public ecm(cut cutVar, gh00 gh00Var) {
        this.f58355a = cutVar.getBehavior();
        this.f58356b = cutVar.mo24358a();
        this.f58357c = glf1.m45134d(cutVar.mo24632c(), gh00Var);
        this.f58358d = cutVar.mo29380b();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f58356b;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: b */
    public final String mo29380b() {
        return this.f58358d;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        return this.f58357c;
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        return this.f58355a;
    }
}
