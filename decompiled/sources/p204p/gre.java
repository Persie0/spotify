package p204p;

import java.util.Map;
import kotlin.KotlinNothingValueException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class gre {

    /* JADX INFO: renamed from: a */
    public final lre f83745a;

    /* JADX INFO: renamed from: b */
    public final e6a0 f83746b;

    /* JADX INFO: renamed from: c */
    public final dcm0 f83747c;

    /* JADX INFO: renamed from: d */
    public final ycc f83748d;

    /* JADX INFO: renamed from: e */
    public Map f83749e;

    /* JADX INFO: renamed from: f */
    public tp80 f83750f;

    /* JADX INFO: renamed from: g */
    public final zv41 f83751g;

    /* JADX INFO: renamed from: h */
    public final nuu0 f83752h;

    /* JADX INFO: renamed from: i */
    public final c9k f83753i;

    /* JADX INFO: renamed from: j */
    public di41 f83754j;

    public gre(lre lreVar, e6a0 e6a0Var, dcm0 dcm0Var, ycc yccVar, luk lukVar) {
        this.f83745a = lreVar;
        this.f83746b = e6a0Var;
        this.f83747c = dcm0Var;
        this.f83748d = yccVar;
        zv41 zv41VarM52819d = jag1.m52819d(pre.f180574a);
        this.f83751g = zv41VarM52819d;
        this.f83752h = bzf1.m31021m(zv41VarM52819d);
        this.f83753i = AbstractC0000a.m16o(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m45482a(gre greVar, ibk ibkVar) {
        dre dreVar;
        greVar.getClass();
        if (ibkVar instanceof dre) {
            dreVar = (dre) ibkVar;
            int i = dreVar.f52315c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dreVar.f52315c = i - Integer.MIN_VALUE;
            } else {
                dreVar = new dre(greVar, ibkVar);
            }
        } else {
            dreVar = new dre(greVar, ibkVar);
        }
        Object obj = dreVar.f52313a;
        int i2 = dreVar.f52315c;
        if (i2 == 0) {
            bga.m29073P(obj);
            xkb xkbVar = new xkb((nuu0) greVar.f83746b.f56601e, greVar, 10);
            ep80 ep80Var = new ep80(new up80(bga.m29104z(greVar.f83747c), false, false), null, 0 == true ? 1 : 0, 30);
            ep80Var.m39638b(new zmn0((gh00) new rqc(xkbVar, 22), true), new fre(greVar, 0));
            cp80 cp80VarM39637a = ep80Var.m39637a();
            tp80 tp80Var = (tp80) cp80VarM39637a.f40491a.invoke();
            greVar.f83750f = tp80Var;
            greVar.f83749e = cp80VarM39637a.f40493c;
            nuu0 nuu0Var = ((xp80) tp80Var).f264537j;
            yrb yrbVar = new yrb(greVar, 7);
            dreVar.f52315c = 1;
            if (nuu0Var.f158717a.collect(yrbVar, dreVar) == yuk.f276404a) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }
}
