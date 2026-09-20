package p204p;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uwq extends tvq implements hpv0 {

    /* JADX INFO: renamed from: X */
    public final Object f234716X;

    /* JADX INFO: renamed from: Y */
    public final Object f234717Y;

    /* JADX INFO: renamed from: Z */
    public final lpv0 f234718Z;

    /* JADX INFO: renamed from: h */
    public final nq60 f234719h;

    /* JADX INFO: renamed from: i */
    public final String f234720i;

    /* JADX INFO: renamed from: t */
    public final String f234721t;

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ qr60[] f234714M0 = {new wys0(uwq.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};

    /* JADX INFO: renamed from: L0 */
    public static final iq3 f234713L0 = new iq3(9);

    /* JADX INFO: renamed from: N0 */
    public static final Object f234715N0 = new Object();

    public uwq(nq60 nq60Var, String str, String str2, nys0 nys0Var, Object obj, sp60 sp60Var) {
        super(sp60Var);
        this.f234719h = nq60Var;
        this.f234720i = str;
        this.f234721t = str2;
        this.f234716X = obj;
        this.f234717Y = q3d0.m72078I(2, new wul(this, 2));
        this.f234718Z = kgg1.m56357t(nys0Var, new gwq(this, 0));
    }

    @Override // p204p.sb70
    /* JADX INFO: renamed from: C */
    public final GenericDeclaration mo25523C() {
        return iug1.m51689r(this.f234719h, this.f234721t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.hpv0
    /* JADX INFO: renamed from: E */
    public final Field mo25524E() {
        return (Field) this.f234717Y.getValue();
    }

    @Override // p204p.tvq
    /* JADX INFO: renamed from: G */
    public final zwq mo54483G() {
        gd70 gd70VarMo29933i = mo54484I().mo29933i();
        wj50.m88279p(gd70VarMo29933i);
        return new zwq(gd70VarMo29933i, d1h1.m34647h(this) ? null : new gwq(this, 1));
    }

    @Override // p204p.cpv0
    /* JADX INFO: renamed from: J */
    public final Object mo25526J() {
        return this.f234716X;
    }

    /* JADX INFO: renamed from: P */
    public final Member m84114P() {
        if (!mo54484I().mo65906E()) {
            return null;
        }
        vfe vfeVar = mvx0.f147667a;
        iqg1 iqg1VarM62973b = mvx0.m62973b(mo54484I());
        if (iqg1VarM62973b instanceof so60) {
            so60 so60Var = (so60) iqg1VarM62973b;
            if (so60Var.m78626y().m96611h()) {
                xo60 xo60VarM96610g = so60Var.m78626y().m96610g();
                if (!xo60VarM96610g.m91532j() || !xo60VarM96610g.m91531i()) {
                    return null;
                }
                return this.f234719h.m65383P(so60Var.m78624w().getString(xo60VarM96610g.m91530h()), so60Var.m78624w().getString(xo60VarM96610g.m91529g()));
            }
        }
        return mo25524E();
    }

    @Override // p204p.tvq
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final nys0 mo54484I() {
        qr60 qr60Var = f234714M0[0];
        return (nys0) this.f234718Z.invoke();
    }

    /* JADX INFO: renamed from: R */
    public abstract jwq mo68184R();

    @Override // p204p.cpv0
    /* JADX INFO: renamed from: a */
    public final nq60 mo25527a() {
        return this.f234719h;
    }

    public final boolean equals(Object obj) {
        hpv0 hpv0VarM52044c = j0b1.m52044c(obj);
        return hpv0VarM52044c != null && wj50.m88271j(this.f234719h, hpv0VarM52044c.mo25527a()) && wj50.m88271j(this.f234720i, hpv0VarM52044c.getName()) && wj50.m88271j(this.f234721t, hpv0VarM52044c.mo25532m()) && wj50.m88271j(this.f234716X, hpv0VarM52044c.mo25526J());
    }

    @Override // p204p.cpv0
    public final lbb getCaller() {
        return mo68184R().getCaller();
    }

    @Override // p204p.rp60
    public final String getName() {
        return this.f234720i;
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: h */
    public final boolean mo25529h() {
        return false;
    }

    public final int hashCode() {
        return this.f234721t.hashCode() + s571.m77243b(this.f234719h.hashCode() * 31, 31, this.f234720i);
    }

    @Override // p204p.hpv0
    /* JADX INFO: renamed from: m */
    public final String mo25532m() {
        return this.f234721t;
    }

    @Override // p204p.cpv0
    /* JADX INFO: renamed from: o */
    public final lbb mo25533o() {
        mo68184R().getClass();
        return null;
    }

    public final String toString() {
        return qyq0.m74223h(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uwq(nq60 nq60Var, String str, String str2, Object obj) {
        this(nq60Var, str, str2, null, obj, nqg1.m65441o());
        sp60 sp60Var = sp60.f212742i;
    }

    public uwq(nq60 nq60Var, nys0 nys0Var, sp60 sp60Var) {
        this(nq60Var, nys0Var.getName().m73844b(), mvx0.m62973b(nys0Var).mo51380k(), nys0Var, fab.f67502a, sp60Var);
    }
}
