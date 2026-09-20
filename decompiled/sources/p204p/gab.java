package p204p;

import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gab implements rp60, Serializable, sb70 {

    /* JADX INFO: renamed from: a */
    public transient rp60 f78013a;

    /* JADX INFO: renamed from: b */
    public final Object f78014b;

    /* JADX INFO: renamed from: c */
    public final Class f78015c;

    /* JADX INFO: renamed from: d */
    public final String f78016d;

    /* JADX INFO: renamed from: e */
    public final String f78017e;

    /* JADX INFO: renamed from: f */
    public final boolean f78018f;

    public gab(Object obj, Class cls, String str, String str2, boolean z) {
        this.f78014b = obj;
        this.f78015c = cls;
        this.f78016d = str;
        this.f78017e = str2;
        this.f78018f = z;
    }

    /* JADX INFO: renamed from: A */
    public abstract rp60 mo44149A();

    @Override // p204p.sb70
    /* JADX INFO: renamed from: C */
    public final GenericDeclaration mo25523C() {
        return iug1.m51689r(m44150G(), this.f78017e);
    }

    /* JADX INFO: renamed from: G */
    public final lq60 m44150G() {
        Class cls = this.f78015c;
        if (cls == null) {
            return null;
        }
        return this.f78018f ? qpv0.f191387a.mo54113c(cls) : qpv0.f191387a.mo54112b(cls);
    }

    /* JADX INFO: renamed from: I */
    public rp60 mo44151I() {
        rp60 rp60VarMo44152g = mo44152g();
        if (rp60VarMo44152g != this) {
            return rp60VarMo44152g;
        }
        throw new dd70();
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: e */
    public final List mo25528e() {
        return mo44151I().mo25528e();
    }

    /* JADX INFO: renamed from: g */
    public rp60 mo44152g() {
        rp60 rp60Var = this.f78013a;
        if (rp60Var != null) {
            return rp60Var;
        }
        rp60 rp60VarMo44149A = mo44149A();
        this.f78013a = rp60VarMo44149A;
        return rp60VarMo44149A;
    }

    @Override // p204p.qp60
    public final List getAnnotations() {
        return mo44151I().getAnnotations();
    }

    @Override // p204p.rp60
    public final String getName() {
        return this.f78016d;
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: h */
    public boolean mo25529h() {
        return mo44151I().mo25529h();
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: i */
    public final sr60 mo25530i() {
        return mo44151I().mo25530i();
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: j */
    public final Object mo36585j(Object... objArr) {
        return mo44151I().mo36585j(objArr);
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: r */
    public final Object mo36586r(tb70.C2409b c2409b) {
        return mo44151I().mo36586r(c2409b);
    }
}
