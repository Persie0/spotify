package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yar implements ssi {

    /* JADX INFO: renamed from: a */
    public final Observable f270969a;

    /* JADX INFO: renamed from: b */
    public final dn4 f270970b;

    /* JADX INFO: renamed from: c */
    public final c9k f270971c;

    /* JADX INFO: renamed from: d */
    public Boolean f270972d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f270973e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final lsi0 f270974f = msi0.m62770a();

    public yar(Observable observable, dn4 dn4Var, luk lukVar) {
        this.f270969a = observable;
        this.f270970b = dn4Var;
        this.f270971c = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x005e->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r7 == r4) goto L24;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m93216c(yar yarVar, boolean z, fbk fbkVar) {
        uar uarVar;
        Iterator it;
        int i;
        gh00 gh00Var;
        yarVar.getClass();
        if (fbkVar instanceof uar) {
            uarVar = (uar) fbkVar;
            int i2 = uarVar.f228537f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uarVar.f228537f = i2 - Integer.MIN_VALUE;
            } else {
                uarVar = new uar(yarVar, fbkVar);
            }
        } else {
            uarVar = new uar(yarVar, fbkVar);
        }
        Object objM93217d = uarVar.f228535d;
        int i3 = uarVar.f228537f;
        Object obj = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                z = uarVar.f228532a;
                bga.m29073P(objM93217d);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = uarVar.f228534c;
                z = uarVar.f228532a;
                it = uarVar.f228533b;
                bga.m29073P(objM93217d);
            }
            while (it.hasNext()) {
                gh00Var = (gh00) it.next();
                uarVar.f228533b = it;
                uarVar.f228532a = z;
                uarVar.f228534c = i;
                uarVar.f228537f = 2;
                if (gh00Var.invoke(uarVar) == obj) {
                    return obj;
                }
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM93217d);
        eh00 varVar = new var(yarVar, z, 0);
        uarVar.f228532a = z;
        uarVar.f228537f = 1;
        objM93217d = yarVar.m93217d(varVar, uarVar);
        it = ((List) objM93217d).iterator();
        i = 0;
        while (it.hasNext()) {
            gh00Var = (gh00) it.next();
            uarVar.f228533b = it;
            uarVar.f228532a = z;
            uarVar.f228534c = i;
            uarVar.f228537f = 2;
            if (gh00Var.invoke(uarVar) == obj) {
                return obj;
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() throws Throwable {
        if (this.f270970b.m36449d()) {
            qlg1.m73215t(this.f270971c.f35578a);
            x0h1.m89581x(dau.f47107a, new fop(this, new war(this, 0), (fbk) null));
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (this.f270970b.m36449d()) {
            wxf1.m89255l(this.f270971c, b0g1.m27776L(mvl0.m62953p(k0e1.m54985d(this.f270969a)), new C2148n1(this)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Object m93217d(eh00 eh00Var, ibk ibkVar) {
        xar xarVar;
        lsi0 lsi0Var;
        eh00 eh00Var2;
        if (ibkVar instanceof xar) {
            xarVar = (xar) ibkVar;
            int i = xarVar.f259744e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xarVar.f259744e = i - Integer.MIN_VALUE;
            } else {
                xarVar = new xar(this, ibkVar);
            }
        } else {
            xarVar = new xar(this, ibkVar);
        }
        Object obj = xarVar.f259742c;
        int i2 = xarVar.f259744e;
        if (i2 == 0) {
            bga.m29073P(obj);
            xarVar.f259740a = (qe70) eh00Var;
            lsi0Var = this.f270974f;
            xarVar.f259741b = lsi0Var;
            xarVar.f259744e = 1;
            Object objMo54248a = lsi0Var.mo54248a(xarVar);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                eh00Var2 = eh00Var;
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = xarVar.f259741b;
            eh00 eh00Var3 = (eh00) xarVar.f259740a;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            eh00Var2 = eh00Var3;
        }
        eh00Var2 = eh00Var;
        try {
            return eh00Var2.invoke();
        } finally {
            lsi0Var.mo54249c(null);
        }
    }
}
