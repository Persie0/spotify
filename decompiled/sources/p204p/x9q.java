package p204p;

import android.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class x9q extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public final Object f259420c;

    /* JADX INFO: renamed from: d */
    public final boolean f259421d;

    /* JADX INFO: renamed from: e */
    public final Object f259422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public x9q(jx31 jx31Var, boolean z, boolean z2) {
        Integer num;
        super(jx31Var, 5);
        i500 i500Var = jx31Var.f116782c;
        int i = jx31Var.f116780a;
        Transition transition = null;
        if (i == 2) {
            if (z) {
                e500 e500Var = i500Var.f98710k1;
                if (e500Var == null || e500Var == null) {
                    num = null;
                } else {
                    num = e500Var.f56212k;
                }
            } else {
                e500 e500Var2 = i500Var.f98710k1;
                if (e500Var2 == null) {
                    num = null;
                } else {
                    num = e500Var2.f56210i;
                }
            }
        } else if (z) {
            e500 e500Var3 = i500Var.f98710k1;
            if (e500Var3 == null || e500Var3 == null) {
                num = null;
            } else {
                num = e500Var3.f56210i;
            }
        } else {
            e500 e500Var4 = i500Var.f98710k1;
            if (e500Var4 == null) {
                num = null;
            } else {
                num = e500Var4.f56212k;
            }
        }
        this.f259420c = num;
        if (i == 2) {
            if (z) {
                e500 e500Var5 = i500Var.f98710k1;
            } else {
                e500 e500Var6 = i500Var.f98710k1;
            }
        }
        this.f259421d = true;
        if (z2) {
            if (z) {
                e500 e500Var7 = i500Var.f98710k1;
                if (e500Var7 != null && e500Var7 != null) {
                    transition = e500Var7.f56214m;
                }
            } else {
                e500 e500Var8 = i500Var.f98710k1;
                if (e500Var8 != null) {
                    transition = e500Var8.f56214m;
                }
            }
        }
        this.f259422e = transition;
    }

    /* JADX INFO: renamed from: F1 */
    public final r800 m90264F1() {
        Object obj = this.f259420c;
        r800 r800VarM90265G1 = m90265G1(obj);
        Object obj2 = this.f259422e;
        r800 r800VarM90265G2 = m90265G1(obj2);
        if (r800VarM90265G1 == null || r800VarM90265G2 == null || r800VarM90265G1 == r800VarM90265G2) {
            return r800VarM90265G1 == null ? r800VarM90265G2 : r800VarM90265G1;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m38165e1().f116782c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    /* JADX INFO: renamed from: G1 */
    public final r800 m90265G1(Object obj) {
        if (obj == null) {
            return null;
        }
        p800 p800Var = k800.f120225a;
        if (p800Var.mo69317g(obj)) {
            return p800Var;
        }
        r800 r800Var = k800.f120226b;
        if (r800Var != null && r800Var.mo69317g(obj)) {
            return r800Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + m38165e1().f116782c + " is not a valid framework Transition or AndroidX Transition");
    }
}
