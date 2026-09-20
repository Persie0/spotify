package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w691 implements rv41 {

    /* JADX INFO: renamed from: L0 */
    public final pg41 f248291L0;

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ c791 f248292M0;

    /* JADX INFO: renamed from: X */
    public w05 f248293X;

    /* JADX INFO: renamed from: Y */
    public final wum0 f248294Y;

    /* JADX INFO: renamed from: Z */
    public boolean f248295Z;

    /* JADX INFO: renamed from: a */
    public final tm91 f248296a;

    /* JADX INFO: renamed from: b */
    public final yum0 f248297b;

    /* JADX INFO: renamed from: c */
    public final yum0 f248298c;

    /* JADX INFO: renamed from: d */
    public final yum0 f248299d;

    /* JADX INFO: renamed from: e */
    public cez0 f248300e;

    /* JADX INFO: renamed from: f */
    public lu61 f248301f;

    /* JADX INFO: renamed from: g */
    public final yum0 f248302g;

    /* JADX INFO: renamed from: h */
    public final uum0 f248303h;

    /* JADX INFO: renamed from: i */
    public boolean f248304i;

    /* JADX INFO: renamed from: t */
    public final yum0 f248305t;

    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
    public w691(c791 c791Var, Object obj, w05 w05Var, tm91 tm91Var) {
        this.f248292M0 = c791Var;
        this.f248296a = tm91Var;
        yum0 yum0VarM77645B = sam.m77645B(obj);
        this.f248297b = yum0VarM77645B;
        Object objInvoke = null;
        yum0 yum0VarM77645B2 = sam.m77645B(jg31.m53286y(0.0f, 0.0f, null, 7));
        this.f248298c = yum0VarM77645B2;
        this.f248299d = sam.m77645B(new lu61((w9z) yum0VarM77645B2.getValue(), tm91Var, obj, yum0VarM77645B.getValue(), w05Var));
        this.f248302g = sam.m77645B(Boolean.TRUE);
        this.f248303h = stf1.m79253m(-1.0f);
        this.f248305t = sam.m77645B(obj);
        this.f248293X = w05Var;
        this.f248294Y = b9m.m28495D(m87271a().mo59937e());
        Float f = (Float) iqc1.f104729b.get(tm91Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            w05 w05Var2 = (w05) tm91Var.f221637a.invoke(obj);
            int iMo76848b = w05Var2.mo76848b();
            for (int i = 0; i < iMo76848b; i++) {
                w05Var2.mo76851e(fFloatValue, i);
            }
            objInvoke = this.f248296a.f221638b.invoke(w05Var2);
        }
        this.f248291L0 = jg31.m53286y(0.0f, 0.0f, objInvoke, 3);
    }

    /* JADX INFO: renamed from: a */
    public final lu61 m87271a() {
        return (lu61) this.f248299d.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m87272b(long j) {
        if (this.f248303h.m84031v() == -1.0f) {
            this.f248295Z = true;
            if (wj50.m88271j(m87271a().f137011c, m87271a().f137012d)) {
                m87273c(m87271a().f137011c);
            } else {
                m87273c(m87271a().mo59939g(j));
                this.f248293X = m87271a().mo59936c(j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m87273c(Object obj) {
        this.f248305t.setValue(obj);
    }

    /* JADX INFO: renamed from: d */
    public final void m87274d(Object obj, boolean z) {
        w9z w9zVar;
        lu61 lu61Var = this.f248301f;
        Object obj2 = lu61Var != null ? lu61Var.f137011c : null;
        yum0 yum0Var = this.f248297b;
        boolean zM88271j = wj50.m88271j(obj2, yum0Var.getValue());
        wum0 wum0Var = this.f248294Y;
        yum0 yum0Var2 = this.f248299d;
        pg41 pg41Var = this.f248291L0;
        if (zM88271j) {
            yum0Var2.setValue(new lu61(pg41Var, this.f248296a, obj, obj, ja61.m52802x(this.f248293X)));
            this.f248304i = true;
            wum0Var.m89068w(m87271a().mo59937e());
            return;
        }
        yum0 yum0Var3 = this.f248298c;
        if (!z || this.f248295Z) {
            w9zVar = (w9z) yum0Var3.getValue();
        } else if (((w9z) yum0Var3.getValue()) instanceof pg41) {
            w9zVar = pg41Var;
            w9zVar = (w9z) yum0Var3.getValue();
        }
        w9zVar = pg41Var;
        c791 c791Var = this.f248292M0;
        long jM31691e = c791Var.m31691e();
        yum0 yum0Var4 = c791Var.f34834h;
        n05 n05VarM53274l = w9zVar;
        if (jM31691e > 0) {
            n05VarM53274l = jg31.m53274l(w9zVar, c791Var.m31691e());
        }
        yum0Var2.setValue(new lu61(n05VarM53274l, this.f248296a, obj, yum0Var.getValue(), this.f248293X));
        wum0Var.m89068w(m87271a().mo59937e());
        this.f248304i = false;
        yum0Var4.setValue(Boolean.TRUE);
        if (c791Var.m31693g()) {
            gb31 gb31Var = c791Var.f34835i;
            int size = gb31Var.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                w691 w691Var = (w691) gb31Var.get(i);
                jMax = Math.max(jMax, w691Var.f248294Y.m89067v());
                w691Var.m87272b(0L);
            }
            yum0Var4.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m87275e(Object obj, Object obj2, w9z w9zVar) {
        this.f248297b.setValue(obj2);
        this.f248298c.setValue(w9zVar);
        if (wj50.m88271j(m87271a().f137012d, obj) && wj50.m88271j(m87271a().f137011c, obj2)) {
            return;
        }
        m87274d(obj, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m87276f(Object obj, w9z w9zVar) {
        if (this.f248304i) {
            lu61 lu61Var = this.f248301f;
            if (wj50.m88271j(obj, lu61Var != null ? lu61Var.f137011c : null)) {
                return;
            }
        }
        yum0 yum0Var = this.f248297b;
        boolean zM88271j = wj50.m88271j(yum0Var.getValue(), obj);
        uum0 uum0Var = this.f248303h;
        if (zM88271j && uum0Var.m84031v() == -1.0f) {
            return;
        }
        yum0Var.setValue(obj);
        this.f248298c.setValue(w9zVar);
        Object value = uum0Var.m84031v() == -3.0f ? obj : this.f248305t.getValue();
        yum0 yum0Var2 = this.f248302g;
        m87274d(value, !((Boolean) yum0Var2.getValue()).booleanValue());
        yum0Var2.setValue(Boolean.valueOf(uum0Var.m84031v() == -3.0f));
        if (uum0Var.m84031v() >= 0.0f) {
            m87273c(m87271a().mo59939g((long) (uum0Var.m84031v() * m87271a().mo59937e())));
        } else if (uum0Var.m84031v() == -3.0f) {
            m87273c(obj);
        }
        this.f248304i = false;
        uum0Var.m84032w(-1.0f);
    }

    @Override // p204p.rv41
    public final Object getValue() {
        return this.f248305t.getValue();
    }

    public final String toString() {
        return "current value: " + this.f248305t.getValue() + ", target: " + this.f248297b.getValue() + ", spec: " + ((w9z) this.f248298c.getValue());
    }
}
