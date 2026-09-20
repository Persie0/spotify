package p204p;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes5.dex */
public final class npj0 extends lg01 {

    /* JADX INFO: renamed from: a */
    public final zxx0 f157016a;

    /* JADX INFO: renamed from: b */
    public final nt70 f157017b;

    /* JADX INFO: renamed from: c */
    public final C2642z9 f157018c;

    /* JADX INFO: renamed from: d */
    public final ni00 f157019d;

    /* JADX INFO: renamed from: e */
    public final vjz f157020e;

    public npj0(zxx0 zxx0Var, nt70 nt70Var, C2642z9 c2642z9, ni00 ni00Var) {
        this.f157016a = zxx0Var;
        this.f157017b = nt70Var;
        this.f157018c = c2642z9;
        this.f157019d = ni00Var;
        int i = 3;
        fbk fbkVar = null;
        this.f157020e = new vjz(new lcw0(new zux(k0e1.m54985d((ObservableSource) nt70Var.invoke()), new b7g0(zxx0Var.mo27555a(), 12), new m22(i, 3, fbkVar), 1), 21), new far0(i, 6, fbkVar), 2);
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f157020e;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), d850Var, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, d850 d850Var, fbk fbkVar) {
        lpj0 lpj0Var;
        boolean z2;
        if (fbkVar instanceof lpj0) {
            lpj0Var = (lpj0) fbkVar;
            int i = lpj0Var.f135785d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lpj0Var.f135785d = i - Integer.MIN_VALUE;
            } else {
                lpj0Var = new lpj0(this, (ibk) fbkVar);
            }
        } else {
            lpj0Var = new lpj0(this, (ibk) fbkVar);
        }
        Object objM86755t = lpj0Var.f135783b;
        int i2 = lpj0Var.f135785d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            yab yabVarM54985d = k0e1.m54985d((ObservableSource) this.f157017b.invoke());
            lpj0Var.f135782a = z;
            lpj0Var.f135785d = 1;
            objM86755t = vyf1.m86755t(yabVarM54985d, lpj0Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = lpj0Var.f135782a;
            bga.m29073P(objM86755t);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = lpj0Var.f135782a;
            bga.m29073P(objM86755t);
        }
        z = z2;
        zxx0.f287421a.getClass();
        this.f157016a.mo27557c(xxx0.f267133l, Boolean.valueOf(z));
        return new ed01(Boolean.valueOf(z));
        if (((Boolean) objM86755t).booleanValue()) {
            this.f157018c.invoke();
            CompletableSource completableSource = (CompletableSource) this.f157019d.invoke();
            lpj0Var.f135782a = z;
            lpj0Var.f135785d = 2;
            if (zn91.m96565n(completableSource, lpj0Var) != yukVar) {
                z2 = z;
                z = z2;
            }
            return yukVar;
        }
        zxx0.f287421a.getClass();
        this.f157016a.mo27557c(xxx0.f267133l, Boolean.valueOf(z));
        return new ed01(Boolean.valueOf(z));
    }
}
