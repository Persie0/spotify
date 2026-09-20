package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gw4 {

    /* JADX INFO: renamed from: a */
    public final tm91 f84906a;

    /* JADX INFO: renamed from: b */
    public final Object f84907b;

    /* JADX INFO: renamed from: c */
    public final q05 f84908c;

    /* JADX INFO: renamed from: d */
    public final yum0 f84909d;

    /* JADX INFO: renamed from: e */
    public final yum0 f84910e;

    /* JADX INFO: renamed from: f */
    public final cri0 f84911f;

    /* JADX INFO: renamed from: g */
    public final pg41 f84912g;

    /* JADX INFO: renamed from: h */
    public final w05 f84913h;

    /* JADX INFO: renamed from: i */
    public final w05 f84914i;

    /* JADX INFO: renamed from: j */
    public w05 f84915j;

    /* JADX INFO: renamed from: k */
    public w05 f84916k;

    public gw4(Object obj, tm91 tm91Var, Object obj2) {
        this.f84906a = tm91Var;
        this.f84907b = obj2;
        q05 q05Var = new q05(tm91Var, obj, null, 60);
        this.f84908c = q05Var;
        this.f84909d = sam.m77645B(Boolean.FALSE);
        this.f84910e = sam.m77645B(obj);
        this.f84911f = new cri0();
        this.f84912g = new pg41(obj2, 3);
        w05 w05Var = q05Var.f183907c;
        boolean z = w05Var instanceof s05;
        w05 w05Var2 = z ? s95.f206857e : w05Var instanceof t05 ? s95.f206858f : w05Var instanceof u05 ? s95.f206859g : s95.f206860h;
        this.f84913h = w05Var2;
        w05 w05Var3 = z ? s95.f206853a : w05Var instanceof t05 ? s95.f206854b : w05Var instanceof u05 ? s95.f206855c : s95.f206856d;
        this.f84914i = w05Var3;
        this.f84915j = w05Var2;
        this.f84916k = w05Var3;
    }

    /* JADX INFO: renamed from: a */
    public static final void m45908a(gw4 gw4Var) {
        q05 q05Var = gw4Var.f84908c;
        q05Var.f183907c.mo76850d();
        q05Var.f183908d = Long.MIN_VALUE;
        gw4Var.f84909d.setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c */
    public static Object m45909c(gw4 gw4Var, Object obj, n05 n05Var, Float f, gh00 gh00Var, fbk fbkVar, int i) {
        if ((i & 2) != 0) {
            n05Var = gw4Var.f84912g;
        }
        Object objInvoke = f;
        if ((i & 4) != 0) {
            objInvoke = gw4Var.f84906a.f221638b.invoke(gw4Var.f84908c.f183907c);
        }
        Object obj2 = objInvoke;
        if ((i & 8) != 0) {
            gh00Var = null;
        }
        gh00 gh00Var2 = gh00Var;
        return cri0.m33740a(gw4Var.f84911f, new cw4(gw4Var, obj2, p711.m69228g(n05Var, gw4Var.f84906a, gw4Var.m45912e(), obj, obj2), gw4Var.f84908c.f183908d, gh00Var2, null), fbkVar);
    }

    /* JADX INFO: renamed from: b */
    public final Object m45910b(Float f, ypo ypoVar, gh00 gh00Var, mb61 mb61Var) {
        Object objM45912e = m45912e();
        tm91 tm91Var = this.f84906a;
        return cri0.m33740a(this.f84911f, new cw4(this, f, new xpo(ypoVar, tm91Var, objM45912e, (w05) tm91Var.f221637a.invoke(f)), this.f84908c.f183908d, gh00Var, null), mb61Var);
    }

    /* JADX INFO: renamed from: d */
    public final Object m45911d(Object obj) {
        if (wj50.m88271j(this.f84915j, this.f84913h) && wj50.m88271j(this.f84916k, this.f84914i)) {
            return obj;
        }
        tm91 tm91Var = this.f84906a;
        w05 w05Var = (w05) tm91Var.f221637a.invoke(obj);
        int iMo76848b = w05Var.mo76848b();
        boolean z = false;
        for (int i = 0; i < iMo76848b; i++) {
            if (w05Var.mo76847a(i) < this.f84915j.mo76847a(i) || w05Var.mo76847a(i) > this.f84916k.mo76847a(i)) {
                w05Var.mo76851e(n0e1.m63436m(w05Var.mo76847a(i), this.f84915j.mo76847a(i), this.f84916k.mo76847a(i)), i);
                z = true;
            }
        }
        return z ? tm91Var.f221638b.invoke(w05Var) : obj;
    }

    /* JADX INFO: renamed from: e */
    public final Object m45912e() {
        return this.f84908c.f183906b.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m45913f() {
        return ((Boolean) this.f84909d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final Object m45914g(Object obj, fbk fbkVar) {
        Object objM33740a = cri0.m33740a(this.f84911f, new dw4(this, obj, null, 0), fbkVar);
        return objM33740a == yuk.f276404a ? objM33740a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m45915h(ibk ibkVar) {
        Object objM33740a = cri0.m33740a(this.f84911f, new ew4(this, null, 0), ibkVar);
        return objM33740a == yuk.f276404a ? objM33740a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: i */
    public final void m45916i(Float f, Float f2) {
        tm91 tm91Var = this.f84906a;
        w05 w05Var = (w05) tm91Var.f221637a.invoke(f);
        if (w05Var == null) {
            w05Var = this.f84913h;
        }
        w05 w05Var2 = (w05) tm91Var.f221637a.invoke(f2);
        if (w05Var2 == null) {
            w05Var2 = this.f84914i;
        }
        int iMo76848b = w05Var.mo76848b();
        for (int i = 0; i < iMo76848b; i++) {
            if (w05Var.mo76847a(i) > w05Var2.mo76847a(i)) {
                nfq0.m64363b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + w05Var + " is greater than upper bound " + w05Var2 + " on index " + i);
            }
        }
        this.f84915j = w05Var;
        this.f84916k = w05Var2;
        if (m45913f()) {
            return;
        }
        Object objM45911d = m45911d(m45912e());
        if (wj50.m88271j(objM45911d, m45912e())) {
            return;
        }
        this.f84908c.f183906b.setValue(objM45911d);
    }

    public /* synthetic */ gw4(Object obj, tm91 tm91Var, Object obj2, int i) {
        this(obj, tm91Var, (i & 4) != 0 ? null : obj2);
    }
}
