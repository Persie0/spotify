package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class tu70 extends exh0 implements dp70, jlq {

    /* JADX INFO: renamed from: Q0 */
    public static final ru70 f223780Q0 = new ru70();

    /* JADX INFO: renamed from: M0 */
    public uu70 f223781M0;

    /* JADX INFO: renamed from: N0 */
    public ae00 f223782N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f223783O0;

    /* JADX INFO: renamed from: P0 */
    public vvl0 f223784P0;

    /* JADX INFO: renamed from: H1 */
    public final boolean m81554H1(pu70 pu70Var, int i) {
        if (drg1.m36725m(i, 5) || drg1.m36725m(i, 6)) {
            if (this.f223784P0 == vvl0.f245249b) {
                return false;
            }
        } else if (drg1.m36725m(i, 3) || drg1.m36725m(i, 4)) {
            if (this.f223784P0 == vvl0.f245248a) {
                return false;
            }
        } else if (!drg1.m36725m(i, 1) && !drg1.m36725m(i, 2)) {
            ehf1.m38945k();
            throw null;
        }
        if (m81555I1(i)) {
            if (pu70Var.f181381b >= this.f223781M0.mo39888a() - 1) {
                return false;
            }
        } else if (pu70Var.f181380a <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: I1 */
    public final boolean m81555I1(int i) {
        if (drg1.m36725m(i, 1)) {
            return false;
        }
        if (!drg1.m36725m(i, 2)) {
            if (drg1.m36725m(i, 5)) {
                return this.f223783O0;
            }
            if (drg1.m36725m(i, 6)) {
                if (this.f223783O0) {
                    return false;
                }
            } else if (drg1.m36725m(i, 3)) {
                int iOrdinal = wjg1.m88318H(this).ordinal();
                if (iOrdinal == 0) {
                    return this.f223783O0;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f223783O0) {
                    return false;
                }
            } else {
                if (!drg1.m36725m(i, 4)) {
                    ehf1.m38945k();
                    throw null;
                }
                int iOrdinal2 = wjg1.m88318H(this).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.f223783O0;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f223783O0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new C2484v6(t5o0VarMo39619B, 9));
    }
}
