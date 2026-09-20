package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ji0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112591a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ om0 f112592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji0(om0 om0Var, int i) {
        super(1);
        this.f112591a = i;
        this.f112592b = om0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f112591a) {
            case 0:
                om0.m67310a(this.f112592b, qm0.UNLOADED, ((fj0) obj).f70028a.f91624a.mo29280c(), null, null, null, 124);
                break;
            case 1:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = C1965i3.f97949O0;
                qspVar.f192169h = new ji0(this.f112592b, 0);
                break;
            default:
                yur yurVar = (yur) obj;
                if (yurVar.f276445e) {
                    om0.m67310a(this.f112592b, qm0.UNLOADED, yurVar.f276446f.f147420a.mo29280c(), null, null, null, 124);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
