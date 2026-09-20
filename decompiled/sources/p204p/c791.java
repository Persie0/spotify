package p204p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes.dex */
public final class c791 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1806e9 f34827a;

    /* JADX INFO: renamed from: b */
    public final c791 f34828b;

    /* JADX INFO: renamed from: c */
    public final String f34829c;

    /* JADX INFO: renamed from: d */
    public final yum0 f34830d;

    /* JADX INFO: renamed from: e */
    public final yum0 f34831e;

    /* JADX INFO: renamed from: f */
    public final wum0 f34832f = b9m.m28495D(0);

    /* JADX INFO: renamed from: g */
    public final wum0 f34833g = b9m.m28495D(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h */
    public final yum0 f34834h;

    /* JADX INFO: renamed from: i */
    public final gb31 f34835i;

    /* JADX INFO: renamed from: j */
    public final gb31 f34836j;

    /* JADX INFO: renamed from: k */
    public final yum0 f34837k;

    /* JADX INFO: renamed from: l */
    public final rtq f34838l;

    public c791(AbstractC1806e9 abstractC1806e9, c791 c791Var, String str) {
        this.f34827a = abstractC1806e9;
        this.f34828b = c791Var;
        this.f34829c = str;
        this.f34830d = sam.m77645B(abstractC1806e9.mo38160Z0());
        this.f34831e = sam.m77645B(new v691(abstractC1806e9.mo38160Z0(), abstractC1806e9.mo38160Z0()));
        Boolean bool = Boolean.FALSE;
        this.f34834h = sam.m77645B(bool);
        this.f34835i = sam.m77685x();
        this.f34836j = sam.m77685x();
        this.f34837k = sam.m77645B(bool);
        this.f34838l = sam.m77674m(new l691(this, 1));
        abstractC1806e9.mo38143C1(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m31687a(Object obj, xq00 xq00Var, int i) {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(obj) : xq00Var.m91770i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(this) ? 32 : 16;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            xq00Var.m91757b0();
        } else if (m31693g()) {
            xq00Var.m91771i0(467722849);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(466062241);
            m31702p(obj);
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z = i3 == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = sam.m77674m(new l691(this, 0));
                xq00Var.m91793t0(objM91750T);
            }
            if (((Boolean) ((rv41) objM91750T).getValue()).booleanValue()) {
                xq00Var.m91771i0(466470356);
                Object objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = hz40.m49254z(dau.f47107a, xq00Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                xuk xukVar = (xuk) objM91750T2;
                boolean zM91770i = xq00Var.m91770i(xukVar) | (i3 == 32);
                Object objM91750T3 = xq00Var.m91750T();
                if (zM91770i || objM91750T3 == ia7Var) {
                    objM91750T3 = new ksh0(24, xukVar, this);
                    xq00Var.m91793t0(objM91750T3);
                }
                hz40.m49232d(xukVar, this, (gh00) objM91750T3, xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(467712929);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new l15(this, obj, i, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m31688b() {
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((w691) gb31Var.get(i)).f248294Y.m89067v());
        }
        gb31 gb31Var2 = this.f34836j;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((c791) gb31Var2.get(i2)).m31688b());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: c */
    public final void m31689c() {
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            w691 w691Var = (w691) gb31Var.get(i);
            w691Var.f248301f = null;
            w691Var.f248300e = null;
            w691Var.f248304i = false;
        }
        gb31 gb31Var2 = this.f34836j;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((c791) gb31Var2.get(i2)).m31689c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m31690d() {
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            if (((w691) gb31Var.get(i)).f248300e != null) {
                return true;
            }
        }
        gb31 gb31Var2 = this.f34836j;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((c791) gb31Var2.get(i2)).m31690d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final long m31691e() {
        c791 c791Var = this.f34828b;
        return c791Var != null ? c791Var.m31691e() : this.f34832f.m89067v();
    }

    /* JADX INFO: renamed from: f */
    public final u691 m31692f() {
        return (u691) this.f34831e.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m31693g() {
        return ((Boolean) this.f34837k.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m31694h(long j, boolean z) {
        wum0 wum0Var = this.f34833g;
        long jM89067v = wum0Var.m89067v();
        AbstractC1806e9 abstractC1806e9 = this.f34827a;
        boolean z2 = true;
        if (jM89067v == Long.MIN_VALUE) {
            wum0Var.m89068w(j);
            abstractC1806e9.m38142B1(true);
        } else if (!abstractC1806e9.m38172n1()) {
            abstractC1806e9.m38142B1(true);
        }
        this.f34834h.setValue(Boolean.FALSE);
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            w691 w691Var = (w691) gb31Var.get(i);
            yum0 yum0Var = w691Var.f248302g;
            yum0 yum0Var2 = w691Var.f248302g;
            if (!((Boolean) yum0Var.getValue()).booleanValue()) {
                long jMo59937e = z ? w691Var.m87271a().mo59937e() : j;
                w691Var.m87273c(w691Var.m87271a().mo59939g(jMo59937e));
                w691Var.f248293X = w691Var.m87271a().mo59936c(jMo59937e);
                if (w691Var.m87271a().m68612d(jMo59937e)) {
                    yum0Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) yum0Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        gb31 gb31Var2 = this.f34836j;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c791 c791Var = (c791) gb31Var2.get(i2);
            yum0 yum0Var3 = c791Var.f34830d;
            AbstractC1806e9 abstractC1806e10 = c791Var.f34827a;
            if (!wj50.m88271j(yum0Var3.getValue(), abstractC1806e10.mo38160Z0())) {
                c791Var.m31694h(j, z);
            }
            if (!wj50.m88271j(c791Var.f34830d.getValue(), abstractC1806e10.mo38160Z0())) {
                z2 = false;
            }
        }
        if (z2) {
            m31695i();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m31695i() {
        this.f34833g.m89068w(Long.MIN_VALUE);
        AbstractC1806e9 abstractC1806e9 = this.f34827a;
        if (abstractC1806e9 instanceof oqi0) {
            ((oqi0) abstractC1806e9).mo38185y1(this.f34830d.getValue());
        }
        m31700n(0L);
        abstractC1806e9.m38142B1(false);
        gb31 gb31Var = this.f34836j;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            ((c791) gb31Var.get(i)).m31695i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m31696j(float f) {
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            w691 w691Var = (w691) gb31Var.get(i);
            w691Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                lu61 lu61Var = w691Var.f248301f;
                if (lu61Var != null) {
                    w691Var.m87271a().m59934a(lu61Var.f137011c);
                    w691Var.f248300e = null;
                    w691Var.f248301f = null;
                }
                Object obj = f == -4.0f ? w691Var.m87271a().f137012d : w691Var.m87271a().f137011c;
                w691Var.m87271a().m59934a(obj);
                w691Var.m87271a().m59941i(obj);
                w691Var.m87273c(obj);
                w691Var.f248294Y.m89068w(w691Var.m87271a().mo59937e());
            } else {
                w691Var.f248303h.m84032w(f);
            }
        }
        gb31 gb31Var2 = this.f34836j;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((c791) gb31Var2.get(i2)).m31696j(f);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m31697k(Object obj, Object obj2) {
        this.f34833g.m89068w(Long.MIN_VALUE);
        AbstractC1806e9 abstractC1806e9 = this.f34827a;
        abstractC1806e9.m38142B1(false);
        boolean zM31693g = m31693g();
        yum0 yum0Var = this.f34830d;
        if (!zM31693g || !wj50.m88271j(abstractC1806e9.mo38160Z0(), obj) || !wj50.m88271j(yum0Var.getValue(), obj2)) {
            if (!wj50.m88271j(abstractC1806e9.mo38160Z0(), obj) && (abstractC1806e9 instanceof oqi0)) {
                ((oqi0) abstractC1806e9).mo38185y1(obj);
            }
            yum0Var.setValue(obj2);
            this.f34837k.setValue(Boolean.TRUE);
            this.f34831e.setValue(new v691(obj, obj2));
        }
        gb31 gb31Var = this.f34836j;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            c791 c791Var = (c791) gb31Var.get(i);
            if (c791Var.m31693g()) {
                c791Var.m31697k(c791Var.f34827a.mo38160Z0(), c791Var.f34830d.getValue());
            }
        }
        gb31 gb31Var2 = this.f34835i;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((w691) gb31Var2.get(i2)).m87272b(0L);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m31698l(long j) {
        wum0 wum0Var = this.f34833g;
        if (wum0Var.m89067v() == Long.MIN_VALUE) {
            wum0Var.m89068w(j);
        }
        m31700n(j);
        this.f34834h.setValue(Boolean.FALSE);
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            ((w691) gb31Var.get(i)).m87272b(j);
        }
        gb31 gb31Var2 = this.f34836j;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c791 c791Var = (c791) gb31Var2.get(i2);
            if (!wj50.m88271j(c791Var.f34830d.getValue(), c791Var.f34827a.mo38160Z0())) {
                c791Var.m31698l(j);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m31699m(cez0 cez0Var) {
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            w691 w691Var = (w691) gb31Var.get(i);
            yum0 yum0Var = w691Var.f248305t;
            if (!wj50.m88271j(w691Var.m87271a().f137011c, w691Var.m87271a().f137012d)) {
                w691Var.f248301f = w691Var.m87271a();
                w691Var.f248300e = cez0Var;
            }
            w691Var.f248299d.setValue(new lu61(w691Var.f248291L0, w691Var.f248296a, yum0Var.getValue(), yum0Var.getValue(), ja61.m52802x(w691Var.f248293X)));
            w691Var.f248294Y.m89068w(w691Var.m87271a().mo59937e());
            w691Var.f248304i = true;
        }
        gb31 gb31Var2 = this.f34836j;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((c791) gb31Var2.get(i2)).m31699m(cez0Var);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m31700n(long j) {
        if (this.f34828b == null) {
            this.f34832f.m89068w(j);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m31701o() {
        lu61 lu61Var;
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            w691 w691Var = (w691) gb31Var.get(i);
            cez0 cez0Var = w691Var.f248300e;
            if (cez0Var != null && (lu61Var = w691Var.f248301f) != null) {
                long jM72084O = q3d0.m72084O(cez0Var.m32602c() * ((double) cez0Var.m32606g()));
                Object objMo59939g = lu61Var.mo59939g(jM72084O);
                if (w691Var.f248304i) {
                    w691Var.m87271a().m59941i(objMo59939g);
                }
                w691Var.m87271a().m59934a(objMo59939g);
                w691Var.f248294Y.m89068w(w691Var.m87271a().mo59937e());
                if (w691Var.f248303h.m84031v() == -2.0f || w691Var.f248304i) {
                    w691Var.m87273c(objMo59939g);
                } else {
                    w691Var.m87272b(w691Var.f248292M0.m31691e());
                }
                if (jM72084O >= cez0Var.m32602c()) {
                    w691Var.f248300e = null;
                    w691Var.f248301f = null;
                } else {
                    cez0Var.m32608i(false);
                }
            }
        }
        gb31 gb31Var2 = this.f34836j;
        int size2 = gb31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((c791) gb31Var2.get(i2)).m31701o();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m31702p(Object obj) {
        yum0 yum0Var = this.f34830d;
        if (wj50.m88271j(yum0Var.getValue(), obj)) {
            return;
        }
        this.f34831e.setValue(new v691(yum0Var.getValue(), obj));
        AbstractC1806e9 abstractC1806e9 = this.f34827a;
        if (!wj50.m88271j(abstractC1806e9.mo38160Z0(), yum0Var.getValue())) {
            abstractC1806e9.mo38185y1(yum0Var.getValue());
        }
        yum0Var.setValue(obj);
        if (this.f34833g.m89067v() == Long.MIN_VALUE) {
            this.f34834h.setValue(Boolean.TRUE);
        }
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        for (int i = 0; i < size; i++) {
            ((w691) gb31Var.get(i)).f248303h.m84032w(-2.0f);
        }
    }

    public final String toString() {
        gb31 gb31Var = this.f34835i;
        int size = gb31Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((w691) gb31Var.get(i)) + ", ";
        }
        return str;
    }
}
