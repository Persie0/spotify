package p204p;

import com.ravelin.core.model.RavelinError;

/* JADX INFO: loaded from: classes2.dex */
public final class inc implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103944a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sir0 f103945b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f103946c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f103947d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f103948e;

    public inc(tf60 tf60Var, tpz0 tpz0Var, sir0 sir0Var, gsz0 gsz0Var) {
        this.f103946c = tf60Var;
        this.f103947d = tpz0Var;
        this.f103945b = sir0Var;
        this.f103948e = gsz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: b */
    public Object m51129b(fiz fizVar, fbk fbkVar) {
        hnc hncVar;
        tpz0 tpz0Var = (tpz0) this.f103947d;
        if (fbkVar instanceof hnc) {
            hncVar = (hnc) fbkVar;
            int i = hncVar.f93293d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hncVar.f93293d = i - Integer.MIN_VALUE;
            } else {
                hncVar = new hnc(this, fbkVar);
            }
        } else {
            hncVar = new hnc(this, fbkVar);
        }
        Object obj = hncVar.f93291b;
        int i2 = hncVar.f93293d;
        if (i2 == 0) {
            bga.m29073P(obj);
            tf60 tf60Var = (tf60) this.f103946c;
            if (tf60Var != null) {
                qlg1.m73221z(tf60Var);
            }
            hncVar.f93290a = fizVar;
            hncVar.f93293d = 1;
            Object objM78928b = tpz0Var.m78928b(hncVar);
            yuk yukVar = yuk.f276404a;
            if (objM78928b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fizVar = hncVar.f93290a;
            bga.m29073P(obj);
        }
        x0h1.m89578u(this.f103945b, null, 0, new xha(fizVar, (gsz0) this.f103948e, tpz0Var, null, 14), 3);
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        nue nueVar;
        nlv0 nlv0Var;
        w1f1 w1f1Var;
        nlv0 nlv0Var2;
        long j;
        Object obj2;
        w1f1 w1f1Var2;
        sir0 sir0Var;
        long j2;
        switch (this.f103944a) {
            case 0:
                return m51129b((fiz) obj, fbkVar);
            default:
                if (fbkVar instanceof nue) {
                    nueVar = (nue) fbkVar;
                    int i = nueVar.f158615t;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nueVar.f158615t = i - Integer.MIN_VALUE;
                    } else {
                        nueVar = new nue(this, fbkVar);
                    }
                } else {
                    nueVar = new nue(this, fbkVar);
                }
                Object obj3 = nueVar.f158613h;
                int i2 = nueVar.f158615t;
                w2a1 w2a1Var = w2a1.f247311a;
                sir0 sir0Var2 = this.f103945b;
                yuk yukVar = yuk.f276404a;
                try {
                    if (i2 == 0) {
                        bga.m29073P(obj3);
                        nlv0Var = new nlv0();
                        w1f1Var = (w1f1) this.f103946c;
                        nlv0Var2 = (nlv0) this.f103948e;
                        nueVar.f158606a = obj;
                        nueVar.f158607b = nlv0Var;
                        nueVar.f158608c = nlv0Var2;
                        nueVar.f158609d = sir0Var2;
                        nueVar.f158610e = w1f1Var;
                        nueVar.f158611f = w1f1Var;
                        j = 5000;
                        nueVar.f158612g = 5000L;
                        nueVar.f158615t = 1;
                        if (w1f1Var.mo54248a(nueVar) != yukVar) {
                            obj2 = obj;
                            w1f1Var2 = w1f1Var;
                            sir0Var = sir0Var2;
                        }
                        return yukVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj3);
                        return w2a1Var;
                    }
                    j = nueVar.f158612g;
                    w1f1 w1f1Var3 = nueVar.f158611f;
                    w1f1 w1f1Var4 = nueVar.f158610e;
                    sir0Var = nueVar.f158609d;
                    nlv0Var2 = nueVar.f158608c;
                    nlv0Var = nueVar.f158607b;
                    obj2 = nueVar.f158606a;
                    bga.m29073P(obj3);
                    w1f1Var = w1f1Var3;
                    w1f1Var2 = w1f1Var4;
                    if (nlv0Var2.f155174a) {
                        nlv0Var2.f155174a = false;
                        nlv0Var.f155174a = true;
                        x0h1.m89578u(sir0Var, null, 0, new d37(j2, w1f1Var2, nlv0Var2, (fbk) null), 3);
                        break;
                    }
                    w1f1Var.mo54249c(null);
                    if (!nlv0Var.f155174a) {
                        ((mo4) this.f103947d).invoke();
                        ykk0 ykk0Var = obj2 instanceof ykk0 ? (ykk0) obj2 : null;
                        if (ykk0Var == null) {
                            return w2a1Var;
                        }
                        ykk0Var.f273746a.mo46940a(new RavelinError("Event blocked by rate limiter", null, 2, null));
                        return w2a1Var;
                    }
                    nueVar.f158606a = obj2;
                    nueVar.f158607b = nlv0Var;
                    nueVar.f158608c = null;
                    nueVar.f158609d = null;
                    nueVar.f158610e = null;
                    nueVar.f158611f = null;
                    nueVar.f158615t = 2;
                    if (sir0Var2.mo30229d(obj2, nueVar) != yukVar) {
                        return w2a1Var;
                    }
                    return yukVar;
                } catch (Throwable th) {
                    w1f1Var.mo54249c(null);
                    throw th;
                }
                j2 = j;
        }
    }

    public inc(w1f1 w1f1Var, sir0 sir0Var, mo4 mo4Var, nlv0 nlv0Var) {
        this.f103946c = w1f1Var;
        this.f103945b = sir0Var;
        this.f103947d = mo4Var;
        this.f103948e = nlv0Var;
    }
}
