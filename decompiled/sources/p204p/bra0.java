package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class bra0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30034a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gra0 f30035b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f30036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bra0(gra0 gra0Var, gh00 gh00Var, int i) {
        super(1);
        this.f30034a = i;
        this.f30035b = gra0Var;
        this.f30036c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f30034a) {
            case 0:
                List list = (List) obj;
                Boolean bool = (Boolean) list.get(0);
                Boolean bool2 = (Boolean) list.get(1);
                return new era0(this.f30035b, this.f30036c, bool.booleanValue(), bool2.booleanValue());
            case 1:
                return new t9y0(new bra0(this.f30035b, this.f30036c, 0), ip80.f104423c1);
            default:
                return new era0(this.f30035b, this.f30036c, false, true);
        }
    }
}
