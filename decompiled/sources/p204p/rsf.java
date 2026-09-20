package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class rsf extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f202319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rsf(int i, gh00 gh00Var) {
        super(1);
        this.f202318a = i;
        this.f202319b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f202318a) {
            case 0:
                this.f202319b.invoke(new ksf((String) obj));
                return w2a1.f247311a;
            case 1:
                this.f202319b.invoke(new wsf((String) obj));
                return w2a1.f247311a;
            case 2:
                this.f202319b.invoke(new avf((String) obj));
                return w2a1.f247311a;
            case 3:
                this.f202319b.invoke(new avf((String) obj));
                return w2a1.f247311a;
            case 4:
                this.f202319b.invoke(new fk0((pdu) obj));
                return w2a1.f247311a;
            case 5:
                this.f202319b.invoke(new wk3((String) obj));
                return w2a1.f247311a;
            case 6:
                this.f202319b.invoke(new ao3((String) obj));
                return w2a1.f247311a;
            case 7:
                this.f202319b.invoke(new zn3((String) obj));
                return w2a1.f247311a;
            case 8:
                this.f202319b.invoke(new a86(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 9:
                this.f202319b.invoke((is6) obj);
                return w2a1.f247311a;
            case 10:
                this.f202319b.invoke(new wbd((pla1) obj));
                return w2a1.f247311a;
            case 11:
                this.f202319b.invoke(new h2j(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 12:
                this.f202319b.invoke(new h3j((String) obj));
                return w2a1.f247311a;
            case 13:
                this.f202319b.invoke(new h3j((String) obj));
                return w2a1.f247311a;
            case 14:
                this.f202319b.invoke((k9j) obj);
                return w2a1.f247311a;
            case 15:
                this.f202319b.invoke(new fxj((String) obj));
                return w2a1.f247311a;
            case 16:
                this.f202319b.invoke(new i4k((s6k) obj));
                return w2a1.f247311a;
            case 17:
                this.f202319b.invoke(new cpl((String) obj));
                return w2a1.f247311a;
            case 18:
                this.f202319b.invoke(new avl(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 19:
                this.f202319b.invoke(new kqq(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 20:
                this.f202319b.invoke(new nrs((String) obj));
                return w2a1.f247311a;
            case 21:
                this.f202319b.invoke(new urs((cg9) obj));
                return w2a1.f247311a;
            case 22:
                this.f202319b.invoke(new tts((String) obj));
                return w2a1.f247311a;
            case 23:
                this.f202319b.invoke(((Boolean) obj).booleanValue() ? kkx.f123724a : jkx.f113432a);
                return w2a1.f247311a;
            case 24:
                this.f202319b.invoke(new lkx((String) obj));
                return w2a1.f247311a;
            case 25:
                qdu0 qdu0Var = (qdu0) obj;
                if (qdu0Var instanceof pdu0) {
                    this.f202319b.invoke(new axz(new cxz(((pdu0) qdu0Var).f176549a.f208087a)));
                } else if (!(qdu0Var instanceof odu0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 26:
                this.f202319b.invoke(new lw10((Integer) obj));
                return w2a1.f247311a;
            case 27:
                this.f202319b.invoke(u820.f227794a);
                return w2a1.f247311a;
            case 28:
                h50 h50Var = (h50) obj;
                this.f202319b.invoke(new hp40(h50Var.f87692k, h50Var.f87686e));
                return w2a1.f247311a;
            default:
                this.f202319b.invoke(new vb60(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
        }
    }
}
