package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vja extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f241930a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ float f241931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f241932c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f241933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vja(boolean z, float f, fbk fbkVar) {
        super(3, fbkVar);
        this.f241932c = z;
        this.f241933d = f;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        float fFloatValue = ((Number) obj2).floatValue();
        vja vjaVar = new vja(this.f241932c, this.f241933d, (fbk) obj3);
        vjaVar.f241930a = zBooleanValue;
        vjaVar.f241931b = fFloatValue;
        return vjaVar.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f241930a;
        float f = this.f241931b;
        bga.m29073P(obj);
        boolean z2 = this.f241932c;
        boolean z3 = false;
        float f2 = this.f241933d;
        if (!z2 ? !(!z || f < f2) : f < f2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
