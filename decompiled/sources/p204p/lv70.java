package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lv70 implements o6d0 {

    /* JADX INFO: renamed from: a */
    public final hv70 f137252a;

    /* JADX INFO: renamed from: b */
    public final zr51 f137253b;

    /* JADX INFO: renamed from: c */
    public final iv70 f137254c;

    /* JADX INFO: renamed from: d */
    public final toi0 f137255d;

    /* JADX INFO: renamed from: e */
    public final toi0 f137256e;

    public lv70(hv70 hv70Var, zr51 zr51Var) {
        this.f137252a = hv70Var;
        this.f137253b = zr51Var;
        this.f137254c = (iv70) hv70Var.f95604b.invoke();
        toi0 toi0Var = x350.f257695a;
        this.f137255d = new toi0();
        this.f137256e = new toi0();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: D */
    public final float mo26962D(long j) {
        return this.f137253b.mo26962D(j);
    }

    @Override // p204p.o6d0
    /* JADX INFO: renamed from: G */
    public final n6d0 mo34817G(int i, int i2, Map map, gh00 gh00Var, gh00 gh00Var2) {
        return this.f137253b.mo34817G(i, i2, map, gh00Var, gh00Var2);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: L */
    public final long mo35985L(int i) {
        return this.f137253b.mo35985L(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O */
    public final long mo35986O(float f) {
        return this.f137253b.mo35986O(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O0 */
    public final float mo35987O0(int i) {
        return this.f137253b.mo35987O0(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: P0 */
    public final float mo35988P0(float f) {
        return this.f137253b.mo35988P0(f);
    }

    @Override // p204p.o6d0
    /* JADX INFO: renamed from: T */
    public final n6d0 mo44714T(int i, int i2, Map map, gh00 gh00Var) {
        return this.f137253b.mo44714T(i, i2, map, gh00Var);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f137253b.mo24617W0();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: Z0 */
    public final float mo35989Z0(float f) {
        return this.f137253b.mo35989Z0(f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final List m60070a(int i) {
        toi0 toi0Var = this.f137256e;
        List list = (List) toi0Var.m87103b(i);
        if (list != null) {
            return list;
        }
        iv70 iv70Var = this.f137254c;
        Object objMo30873d = iv70Var.mo30873d(i);
        List listMo73431S = this.f137253b.mo73431S(objMo30873d, this.f137252a.m48722a(i, objMo30873d, iv70Var.mo30871b(i)));
        toi0Var.m81201i(i, listMo73431S);
        return listMo73431S;
    }

    @Override // p204p.rj50
    /* JADX INFO: renamed from: a0 */
    public final boolean mo34819a0() {
        return this.f137253b.mo34819a0();
    }

    @Override // p204p.rj50
    public final ko70 getLayoutDirection() {
        return this.f137253b.getLayoutDirection();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f137253b.mo24619j();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l0 */
    public final int mo35990l0(float f) {
        return this.f137253b.mo35990l0(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l1 */
    public final long mo35991l1(long j) {
        return this.f137253b.mo35991l1(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: t0 */
    public final float mo28377t0(long j) {
        return this.f137253b.mo28377t0(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: y */
    public final long mo26963y(float f) {
        return this.f137253b.mo26963y(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: z */
    public final long mo35992z(long j) {
        return this.f137253b.mo35992z(j);
    }
}
