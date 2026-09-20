package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k13 implements f7p0 {

    /* JADX INFO: renamed from: a */
    public final C2481v3 f118195a;

    /* JADX INFO: renamed from: b */
    public final ou8 f118196b;

    /* JADX INFO: renamed from: c */
    public final C2481v3 f118197c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ u190 f118198d;

    public k13(u190 u190Var) {
        this.f118198d = u190Var;
        this.f118195a = new C2481v3(u190Var.m82196b(), 21);
        this.f118196b = u190Var.f225727h;
        this.f118197c = new C2481v3(u190Var.m82196b(), 22);
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: a */
    public final Object mo40981a(d850 d850Var, fbk fbkVar) {
        u190 u190Var = this.f118198d;
        u190Var.getClass();
        return u190Var.m82199e(d850Var.f46380a.f279709a, (ibk) fbkVar);
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: b */
    public final fiz mo40982b() {
        return this.f118196b;
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: i */
    public final fiz mo40983i() {
        return this.f118197c;
    }

    @Override // p204p.f7p0
    public final fiz isActive() {
        return this.f118195a;
    }
}
