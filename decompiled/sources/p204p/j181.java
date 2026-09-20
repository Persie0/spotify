package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j181 extends mb61 implements bi00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f107693a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ gi20 f107694b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f107695c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f107696d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ i181 f107697e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ d181 f107698f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j181(d181 d181Var, fbk fbkVar) {
        super(6, fbkVar);
        this.f107698f = d181Var;
    }

    @Override // p204p.bi00
    /* JADX INFO: renamed from: c0 */
    public final Object mo27353c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        j181 j181Var = new j181(this.f107698f, (fbk) obj6);
        j181Var.f107693a = zBooleanValue;
        j181Var.f107694b = (gi20) obj2;
        j181Var.f107695c = iIntValue;
        j181Var.f107696d = (String) obj4;
        j181Var.f107697e = (i181) obj5;
        return j181Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f107693a;
        gi20 gi20Var = this.f107694b;
        int i = this.f107695c;
        String str = this.f107696d;
        i181 i181Var = this.f107697e;
        bga.m29073P(obj);
        boolean z2 = gi20Var.f80014a == di20.f49215c;
        Integer num = i181Var.f97442b;
        Integer num2 = i181Var.f97441a;
        boolean zBooleanValue = false;
        boolean z3 = gi20Var.f80016c;
        Boolean bool = gi20Var.f80020g;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        boolean z4 = i181Var.f97443c;
        d181 d181Var = this.f107698f;
        if (!z4 && num2 == null) {
            num2 = d181Var.f44195g;
        }
        d181Var.getClass();
        return new d181(str, z2, i, z, num, z3, num2, zBooleanValue);
    }
}
