package p204p;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes5.dex */
public final class gpj0 extends lg01 {

    /* JADX INFO: renamed from: a */
    public final zxx0 f83206a;

    /* JADX INFO: renamed from: b */
    public final nt70 f83207b;

    /* JADX INFO: renamed from: c */
    public final C2642z9 f83208c;

    /* JADX INFO: renamed from: d */
    public final ni00 f83209d;

    /* JADX INFO: renamed from: e */
    public final vjz f83210e;

    public gpj0(zxx0 zxx0Var, nt70 nt70Var, C2642z9 c2642z9, ni00 ni00Var) {
        this.f83206a = zxx0Var;
        this.f83207b = nt70Var;
        this.f83208c = c2642z9;
        this.f83209d = ni00Var;
        fbk fbkVar = null;
        this.f83210e = new vjz(new lcw0(xtm0.m92074U(k0e1.m54985d((ObservableSource) nt70Var.invoke()), new g3c0(fbkVar, this, 16)), 21), new far0(3, 6, fbkVar), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (p204p.zn91.m96565n(r8, r0) == r5) goto L25;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m45374a(int i, ibk ibkVar) {
        epj0 epj0Var;
        if (ibkVar instanceof epj0) {
            epj0Var = (epj0) ibkVar;
            int i2 = epj0Var.f61658d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                epj0Var.f61658d = i2 - Integer.MIN_VALUE;
            } else {
                epj0Var = new epj0(this, ibkVar);
            }
        } else {
            epj0Var = new epj0(this, ibkVar);
        }
        Object objM86755t = epj0Var.f61656b;
        int i3 = epj0Var.f61658d;
        zxx0 zxx0Var = this.f83206a;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM86755t);
            yab yabVarM54985d = k0e1.m54985d((ObservableSource) this.f83207b.invoke());
            epj0Var.f61655a = i;
            epj0Var.f61658d = 1;
            objM86755t = vyf1.m86755t(yabVarM54985d, epj0Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i3 == 1) {
            i = epj0Var.f61655a;
            bga.m29073P(objM86755t);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = epj0Var.f61655a;
            bga.m29073P(objM86755t);
        }
        zxx0.f287421a.getClass();
        zxx0Var.mo27557c(xxx0.f267134m, new Integer(i));
        return new ed01(new Integer(i));
        if (((Boolean) objM86755t).booleanValue() && i != dpj0.f51348h.f175852a) {
            zxx0.f287421a.getClass();
            zxx0Var.mo27557c(xxx0.f267133l, Boolean.TRUE);
            this.f83208c.invoke();
            CompletableSource completableSource = (CompletableSource) this.f83209d.invoke();
            epj0Var.f61655a = i;
            epj0Var.f61658d = 2;
        }
        zxx0.f287421a.getClass();
        zxx0Var.mo27557c(xxx0.f267134m, new Integer(i));
        return new ed01(new Integer(i));
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f83210e;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return m45374a(((Number) obj2).intValue(), (ibk) fbkVar);
    }
}
