package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class me80 extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142629a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cvt f142630b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f142631c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Enum f142632d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kzd1 f142633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me80(kzd1 kzd1Var, fbk fbkVar, int i) {
        super(5, fbkVar);
        this.f142629a = i;
        this.f142633e = kzd1Var;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f142629a) {
            case 0:
                me80 me80Var = new me80((oe80) this.f142633e, (fbk) obj5, 0);
                me80Var.f142631c = (je80) obj2;
                me80Var.f142632d = (ge80) obj3;
                me80Var.f142630b = (cvt) obj4;
                w2a1 w2a1Var = w2a1.f247311a;
                me80Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                me80 me80Var2 = new me80((e8u0) this.f142633e, (fbk) obj5, 1);
                me80Var2.f142631c = (s7u0) obj;
                me80Var2.f142632d = (r7u0) obj3;
                me80Var2.f142630b = (cvt) obj4;
                w2a1 w2a1Var2 = w2a1.f247311a;
                me80Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f142629a) {
            case 0:
                je80 je80Var = (je80) this.f142631c;
                ge80 ge80Var = (ge80) this.f142632d;
                cvt cvtVar = this.f142630b;
                bga.m29073P(obj);
                if (cvtVar != null) {
                    d850 d850VarM60683w = m3h1.m60683w(cvtVar);
                    oe80 oe80Var = (oe80) this.f142633e;
                    if (le80.f132486a[ge80Var.ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (je80Var.m53085a().length() > 0) {
                        oe80Var.f164374b.mo47342b(je80Var.m53085a(), d850VarM60683w, null);
                    }
                }
                return w2a1.f247311a;
            default:
                s7u0 s7u0Var = (s7u0) this.f142631c;
                r7u0 r7u0Var = (r7u0) this.f142632d;
                cvt cvtVar2 = this.f142630b;
                bga.m29073P(obj);
                if (z7u0.f280283a[r7u0Var.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cvtVar2 != null) {
                    ((e8u0) this.f142633e).f57271c.mo47342b(s7u0Var.m77399a(), m3h1.m60683w(cvtVar2), null);
                }
                return w2a1.f247311a;
        }
    }
}
