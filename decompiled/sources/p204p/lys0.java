package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class lys0 extends rqo implements kys0 {

    /* JADX INFO: renamed from: X */
    public final int f138106X;

    /* JADX INFO: renamed from: Y */
    public uxq f138107Y;

    /* JADX INFO: renamed from: Z */
    public mi00 f138108Z;

    /* JADX INFO: renamed from: f */
    public boolean f138109f;

    /* JADX INFO: renamed from: g */
    public final boolean f138110g;

    /* JADX INFO: renamed from: h */
    public final int f138111h;

    /* JADX INFO: renamed from: i */
    public final nys0 f138112i;

    /* JADX INFO: renamed from: t */
    public final boolean f138113t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lys0(int i, uxq uxqVar, nys0 nys0Var, l25 l25Var, qti0 qti0Var, boolean z, boolean z2, boolean z3, int i2, du31 du31Var) {
        super(nys0Var.mo27379o(), l25Var, qti0Var, du31Var);
        if (i == 0) {
            m60264A0(0);
            throw null;
        }
        if (uxqVar == null) {
            m60264A0(1);
            throw null;
        }
        if (l25Var == null) {
            m60264A0(3);
            throw null;
        }
        if (du31Var == null) {
            m60264A0(5);
            throw null;
        }
        this.f138108Z = null;
        this.f138111h = i;
        this.f138107Y = uxqVar;
        this.f138112i = nys0Var;
        this.f138109f = z;
        this.f138110g = z2;
        this.f138113t = z3;
        this.f138106X = i2;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m60264A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: B */
    public final Object mo32014B(hyq hyqVar) {
        return null;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: F */
    public final boolean mo60265F() {
        return false;
    }

    /* JADX INFO: renamed from: H1 */
    public final nys0 m60266H1() {
        nys0 nys0Var = this.f138112i;
        if (nys0Var != null) {
            return nys0Var;
        }
        m60264A0(13);
        throw null;
    }

    /* JADX INFO: renamed from: I1 */
    public final ArrayList m60267I1(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (nys0 nys0Var : m60266H1().mo32019p()) {
            mi00 mi00VarMo65908b = z ? nys0Var.mo65908b() : nys0Var.mo65909c();
            if (mi00VarMo65908b != null) {
                arrayList.add(mi00VarMo65908b);
            }
        }
        return arrayList;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: N */
    public final wr70 mo32016N() {
        return m60266H1().mo32016N();
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: Q */
    public final wr70 mo32017Q() {
        return m60266H1().mo32017Q();
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: X */
    public final boolean mo28469X() {
        return false;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: d */
    public final boolean mo60268d() {
        return this.f138113t;
    }

    @Override // p204p.tqo
    /* JADX INFO: renamed from: e */
    public final uxq mo28470e() {
        uxq uxqVar = this.f138107Y;
        if (uxqVar != null) {
            return uxqVar;
        }
        m60264A0(11);
        throw null;
    }

    @Override // p204p.mi00, p204p.yu51
    /* JADX INFO: renamed from: f */
    public final mi00 mo29932f(oo91 oo91Var) {
        if (oo91Var != null) {
            return this;
        }
        m60264A0(7);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: f0 */
    public final boolean mo28800f0() {
        return false;
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: g0 */
    public final boolean mo28471g0() {
        return false;
    }

    @Override // p204p.cab
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m60264A0(9);
        throw null;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: h */
    public final boolean mo60269h() {
        return false;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: k0 */
    public final mi00 mo60270k0() {
        return this.f138108Z;
    }

    @Override // p204p.eab
    /* JADX INFO: renamed from: l0 */
    public final int mo38278l0() {
        int i = this.f138106X;
        if (i != 0) {
            return i;
        }
        m60264A0(6);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: n0 */
    public final List mo32018n0() {
        List listMo32018n0 = m60266H1().mo32018n0();
        if (listMo32018n0 != null) {
            return listMo32018n0;
        }
        m60264A0(14);
        throw null;
    }

    @Override // p204p.eab
    /* JADX INFO: renamed from: o0 */
    public final eab mo29934o0(nfe nfeVar, int i, uxq uxqVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: s */
    public final boolean mo28472s() {
        return this.f138110g;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: s0 */
    public final boolean mo60271s0() {
        return false;
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: t */
    public final int mo28473t() {
        int i = this.f138111h;
        if (i != 0) {
            return i;
        }
        m60264A0(10);
        throw null;
    }

    @Override // p204p.eab
    /* JADX INFO: renamed from: t0 */
    public final void mo38279t0(Collection collection) {
        if (collection != null) {
            return;
        }
        m60264A0(16);
        throw null;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: v */
    public final boolean mo60272v() {
        return false;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: v0 */
    public final boolean mo60273v0() {
        return false;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: w */
    public final boolean mo60274w() {
        return false;
    }

    @Override // p204p.yu51
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ qqo mo29932f(oo91 oo91Var) {
        mo29932f(oo91Var);
        return this;
    }
}
