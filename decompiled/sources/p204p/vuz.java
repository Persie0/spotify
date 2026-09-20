package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vuz extends mb61 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245097a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ywz f245098b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ f1j f245099c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f245100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vuz(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f245097a = i2;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f245097a;
        ywz ywzVar = (ywz) obj;
        f1j f1jVar = (f1j) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        fbk fbkVar = (fbk) obj4;
        switch (i) {
            case 0:
                vuz vuzVar = new vuz(4, 0, fbkVar);
                vuzVar.f245098b = ywzVar;
                vuzVar.f245099c = f1jVar;
                vuzVar.f245100d = zBooleanValue;
                return vuzVar.invokeSuspend(w2a1.f247311a);
            default:
                vuz vuzVar2 = new vuz(4, 1, fbkVar);
                vuzVar2.f245098b = ywzVar;
                vuzVar2.f245099c = f1jVar;
                vuzVar2.f245100d = zBooleanValue;
                return vuzVar2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f245097a) {
            case 0:
                ywz ywzVar = this.f245098b;
                f1j f1jVar = this.f245099c;
                boolean z = this.f245100d;
                bga.m29073P(obj);
                return new s2y(ywzVar, f1jVar, z);
            default:
                ywz ywzVar2 = this.f245098b;
                f1j f1jVar2 = this.f245099c;
                boolean z2 = this.f245100d;
                bga.m29073P(obj);
                return new s2y(ywzVar2, f1jVar2, z2);
        }
    }
}
