package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bvt {

    /* JADX INFO: renamed from: a */
    public final qy8 f31427a;

    /* JADX INFO: renamed from: b */
    public final juk f31428b;

    /* JADX INFO: renamed from: c */
    public final gxt f31429c;

    /* JADX INFO: renamed from: d */
    public final i7p f31430d;

    /* JADX INFO: renamed from: e */
    public final i7p f31431e;

    /* JADX INFO: renamed from: f */
    public final i7p f31432f;

    /* JADX INFO: renamed from: g */
    public final i7p f31433g;

    /* JADX INFO: renamed from: h */
    public xxt f31434h;

    /* JADX INFO: renamed from: i */
    public boolean f31435i;

    /* JADX INFO: renamed from: j */
    public boolean f31436j;

    /* JADX INFO: renamed from: k */
    public c9k f31437k;

    /* JADX INFO: renamed from: l */
    public fmu0 f31438l;

    public bvt(qy8 qy8Var, juk jukVar, gxt gxtVar, i7p i7pVar, i7p i7pVar2, i7p i7pVar3, i7p i7pVar4) {
        this.f31427a = qy8Var;
        this.f31428b = jukVar;
        this.f31429c = gxtVar;
        this.f31430d = i7pVar;
        this.f31431e = i7pVar2;
        this.f31432f = i7pVar3;
        this.f31433g = i7pVar4;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m30650a(bvt bvtVar, Object obj, Object obj2, b250 b250Var) {
        bvtVar.getClass();
        try {
            return bvtVar.f31427a.mo24358a().mo26462d(obj, obj2, b250Var);
        } catch (Exception e) {
            bvtVar.f31429c.invoke(e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m30651b(int i) {
        xxt xxtVarM30653d = m30653d();
        if ((xxtVarM30653d == null || !xxtVarM30653d.mo62533a()) && this.f31435i && i == 0) {
            this.f31434h = null;
            this.f31435i = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final b250 m30652c() {
        fmu0 fmu0Var = this.f31438l;
        if (fmu0Var != null) {
            return (b250) fmu0Var.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final xxt m30653d() {
        yxt yxtVarM57706k;
        if (this.f31434h == null) {
            b250 b250VarM30652c = m30652c();
            this.f31434h = (b250VarM30652c == null || (yxtVarM57706k = kyf1.m57706k(b250VarM30652c)) == null) ? null : yxtVarM57706k.create();
        }
        return this.f31434h;
    }
}
