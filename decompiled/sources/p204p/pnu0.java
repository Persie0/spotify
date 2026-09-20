package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pnu0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179533a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f179534b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f179535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnu0(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f179533a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f179533a;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        fbk fbkVar = (fbk) obj3;
        switch (i) {
            case 0:
                pnu0 pnu0Var = new pnu0(3, 0, fbkVar);
                pnu0Var.f179534b = iIntValue;
                pnu0Var.f179535c = iIntValue2;
                return pnu0Var.invokeSuspend(w2a1.f247311a);
            case 1:
                pnu0 pnu0Var2 = new pnu0(3, 1, fbkVar);
                pnu0Var2.f179534b = iIntValue;
                pnu0Var2.f179535c = iIntValue2;
                return pnu0Var2.invokeSuspend(w2a1.f247311a);
            default:
                pnu0 pnu0Var3 = new pnu0(3, 2, fbkVar);
                pnu0Var3.f179534b = iIntValue;
                pnu0Var3.f179535c = iIntValue2;
                return pnu0Var3.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f179533a) {
            case 0:
                int i = this.f179534b;
                int i2 = this.f179535c;
                bga.m29073P(obj);
                return new Integer(i2 - i);
            case 1:
                int i3 = this.f179534b;
                int i4 = this.f179535c;
                bga.m29073P(obj);
                return Boolean.valueOf(i3 < (-i4) || i3 > i4);
            default:
                int i5 = this.f179534b;
                int i6 = this.f179535c;
                bga.m29073P(obj);
                return new suc(i5, i6);
        }
    }
}
