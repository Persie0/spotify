package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qs3 {

    /* JADX INFO: renamed from: a */
    public final gh00 f191963a;

    /* JADX INFO: renamed from: b */
    public gh00 f191964b;

    /* JADX INFO: renamed from: c */
    public eh00 f191965c;

    /* JADX INFO: renamed from: d */
    public n05 f191966d;

    /* JADX INFO: renamed from: e */
    public ypo f191967e;

    /* JADX INFO: renamed from: g */
    public final yum0 f191969g;

    /* JADX INFO: renamed from: h */
    public final yum0 f191970h;

    /* JADX INFO: renamed from: k */
    public final uum0 f191973k;

    /* JADX INFO: renamed from: l */
    public final yum0 f191974l;

    /* JADX INFO: renamed from: m */
    public final yum0 f191975m;

    /* JADX INFO: renamed from: n */
    public final ms3 f191976n;

    /* JADX INFO: renamed from: f */
    public final bri0 f191968f = new bri0();

    /* JADX INFO: renamed from: i */
    public final rtq f191971i = sam.m77674m(new as3(this, 0));

    /* JADX INFO: renamed from: j */
    public final uum0 f191972j = stf1.m79253m(Float.NaN);

    public qs3(Object obj, gh00 gh00Var) {
        this.f191963a = new C2126mg(5);
        this.f191969g = sam.m77645B(obj);
        this.f191970h = sam.m77645B(obj);
        sam.m77675n(new as3(this, 1), tjr0.f220989Q0);
        this.f191973k = stf1.m79253m(0.0f);
        this.f191974l = sam.m77645B(null);
        this.f191975m = sam.m77645B(b04.m27729k());
        this.f191976n = new ms3(this);
        this.f191963a = gh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m73662a(Object obj, xqi0 xqi0Var, xh00 xh00Var, ibk ibkVar) throws Throwable {
        is3 is3Var;
        Throwable th;
        if (ibkVar instanceof is3) {
            is3Var = (is3) ibkVar;
            int i = is3Var.f105112c;
            if ((i & Integer.MIN_VALUE) != 0) {
                is3Var.f105112c = i - Integer.MIN_VALUE;
            } else {
                is3Var = new is3(this, ibkVar);
            }
        } else {
            is3Var = new is3(this, ibkVar);
        }
        Object obj2 = is3Var.f105110a;
        int i2 = is3Var.f105112c;
        yum0 yum0Var = this.f191974l;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(obj2);
            if (m73664c().m38699c(obj)) {
                try {
                    bri0 bri0Var = this.f191968f;
                    try {
                        js3 js3Var = new js3(this, obj, xh00Var, fbkVar, 1);
                        is3Var.f105112c = 1;
                        Object objM30301b = bri0Var.m30301b(xqi0Var, js3Var, is3Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM30301b == yukVar) {
                            return yukVar;
                        }
                        yum0Var.setValue(null);
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        yum0Var.setValue(null);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else if (((Boolean) this.f191963a.invoke(obj)).booleanValue()) {
                this.f191970h.setValue(obj);
                m73669h(obj);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                bga.m29073P(obj2);
                yum0Var.setValue(null);
            } catch (Throwable th4) {
                th = th4;
                yum0Var.setValue(null);
                throw th;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final float m73663b(float f) {
        float fM73666e = m73666e(f);
        float fM73668g = fM73666e - m73668g();
        this.f191976n.m62695a(fM73666e, 0.0f);
        return fM73668g;
    }

    /* JADX INFO: renamed from: c */
    public final eep m73664c() {
        return (eep) this.f191975m.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m73665d() {
        return (this.f191964b == null || this.f191965c == null || this.f191966d == null || this.f191967e == null) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final float m73666e(float f) {
        uum0 uum0Var = this.f191972j;
        return n0e1.m63436m((Float.isNaN(uum0Var.m84031v()) ? 0.0f : uum0Var.m84031v()) + f, m73664c().m38701e(), m73664c().m38700d());
    }

    /* JADX INFO: renamed from: f */
    public final float m73667f(fcs fcsVar) {
        float fM38702f = m73664c().m38702f(fcs.f68250b);
        float fM38702f2 = m73664c().m38702f(fcsVar);
        float fM63436m = (n0e1.m63436m(this.f191972j.m84031v(), Math.min(fM38702f, fM38702f2), Math.max(fM38702f, fM38702f2)) - fM38702f) / (fM38702f2 - fM38702f);
        if (Float.isNaN(fM63436m)) {
            return 1.0f;
        }
        if (fM63436m < 1.0E-6f) {
            return 0.0f;
        }
        if (fM63436m > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fM63436m);
    }

    /* JADX INFO: renamed from: g */
    public final float m73668g() {
        uum0 uum0Var = this.f191972j;
        if (Float.isNaN(uum0Var.m84031v())) {
            pt40.m70893c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return uum0Var.m84031v();
    }

    /* JADX INFO: renamed from: h */
    public final void m73669h(Object obj) {
        this.f191969g.setValue(obj);
    }

    /* JADX INFO: renamed from: i */
    public final Object m73670i(float f, ibk ibkVar) {
        if (!m73665d()) {
            pt40.m70891a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object value = this.f191969g.getValue();
        eep eepVarM73664c = m73664c();
        float fM73668g = m73668g();
        gh00 gh00Var = this.f191964b;
        if (gh00Var == null) {
            wj50.m88260d0("positionalThreshold");
            throw null;
        }
        eh00 eh00Var = this.f191965c;
        if (eh00Var != null) {
            Object objM27726h = b04.m27726h(eepVarM73664c, fM73668g, f, gh00Var, eh00Var);
            return ((Boolean) this.f191963a.invoke(objM27726h)).booleanValue() ? b04.m27736r(this, objM27726h, f, ibkVar) : b04.m27736r(this, value, f, ibkVar);
        }
        wj50.m88260d0("velocityThreshold");
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m73671j(Object obj) {
        bri0 bri0Var = this.f191968f;
        lsi0 lsi0Var = bri0Var.f30100b;
        lsi0 lsi0Var2 = bri0Var.f30100b;
        boolean zM59837g = lsi0Var.m59837g();
        if (!zM59837g) {
            return zM59837g;
        }
        try {
            ms3 ms3Var = this.f191976n;
            float fM38702f = m73664c().m38702f(obj);
            if (!Float.isNaN(fM38702f)) {
                ms3Var.m62695a(fM38702f, 0.0f);
                this.f191974l.setValue(null);
            }
            m73669h(obj);
            this.f191970h.setValue(obj);
            return zM59837g;
        } finally {
            lsi0Var2.mo54249c(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m73672k(eep eepVar, Object obj) {
        if (wj50.m88271j(m73664c(), eepVar)) {
            return;
        }
        this.f191975m.setValue(eepVar);
        if (m73671j(obj)) {
            return;
        }
        this.f191974l.setValue(obj);
    }
}
