package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fcm implements cfo {

    /* JADX INFO: renamed from: a */
    public final pgo f68141a;

    /* JADX INFO: renamed from: b */
    public final mko f68142b;

    /* JADX INFO: renamed from: c */
    public final uut f68143c;

    /* JADX INFO: renamed from: d */
    public final avt f68144d;

    /* JADX INFO: renamed from: e */
    public final uwt f68145e;

    /* JADX INFO: renamed from: f */
    public final String f68146f;

    public fcm(cfo cfoVar, gh00 gh00Var) {
        this.f68141a = cfoVar.mo24649e();
        this.f68142b = cfoVar.getData();
        this.f68143c = cfoVar.getBehavior();
        this.f68144d = cfoVar.mo24358a();
        this.f68145e = glf1.m45134d(cfoVar.mo24632c(), gh00Var);
        this.f68146f = cfoVar.mo29380b();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f68144d;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: b */
    public final String mo29380b() {
        return this.f68146f;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        return this.f68145e;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f68141a;
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        return this.f68143c;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f68142b;
    }
}
