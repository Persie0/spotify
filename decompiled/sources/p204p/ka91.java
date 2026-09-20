package p204p;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ka91 extends z691 {

    /* JADX INFO: renamed from: f1 */
    public int f120839f1;

    /* JADX INFO: renamed from: i1 */
    public z691[] f120842i1;

    /* JADX INFO: renamed from: d1 */
    public ArrayList f120837d1 = new ArrayList();

    /* JADX INFO: renamed from: e1 */
    public boolean f120838e1 = true;

    /* JADX INFO: renamed from: g1 */
    public boolean f120840g1 = false;

    /* JADX INFO: renamed from: h1 */
    public int f120841h1 = 0;

    @Override // p204p.z691
    /* JADX INFO: renamed from: E */
    public final void mo55872E(View view) {
        super.mo55872E(view);
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            ((z691) this.f120837d1.get(i)).mo55872E(view);
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: F */
    public final void mo55873F() {
        this.f279793W0 = 0L;
        ja91 ja91Var = new ja91(this, 1);
        for (int i = 0; i < this.f120837d1.size(); i++) {
            z691 z691Var = (z691) this.f120837d1.get(i);
            z691Var.m95486b(ja91Var);
            z691Var.mo55873F();
            long j = z691Var.f279793W0;
            if (this.f120838e1) {
                this.f279793W0 = Math.max(this.f279793W0, j);
            } else {
                long j2 = this.f279793W0;
                z691Var.f279797Y0 = j2;
                this.f279793W0 = j2 + j;
            }
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: G */
    public final z691 mo55874G(x691 x691Var) {
        super.mo55874G(x691Var);
        return this;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: H */
    public final void mo55875H(View view) {
        for (int i = 0; i < this.f120837d1.size(); i++) {
            ((z691) this.f120837d1.get(i)).mo55875H(view);
        }
        this.f279804f.remove(view);
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: I */
    public final void mo55876I(View view) {
        super.mo55876I(view);
        z691[] z691VarArrM55892Z = m55892Z();
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            z691VarArrM55892Z[i].mo55876I(view);
        }
        Arrays.fill(z691VarArrM55892Z, (Object) null);
        this.f120842i1 = z691VarArrM55892Z;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: J */
    public final void mo55877J() {
        if (this.f120837d1.isEmpty()) {
            m95485R();
            m95490r();
            return;
        }
        yyb0 yyb0Var = new yyb0(this, 1);
        Iterator it = this.f120837d1.iterator();
        while (it.hasNext()) {
            ((z691) it.next()).m95486b(yyb0Var);
        }
        this.f120839f1 = this.f120837d1.size();
        if (this.f120838e1) {
            Iterator it2 = this.f120837d1.iterator();
            while (it2.hasNext()) {
                ((z691) it2.next()).mo55877J();
            }
            return;
        }
        for (int i = 1; i < this.f120837d1.size(); i++) {
            ((z691) this.f120837d1.get(i - 1)).m95486b(new ja91((z691) this.f120837d1.get(i), 0));
        }
        z691 z691Var = (z691) this.f120837d1.get(0);
        if (z691Var != null) {
            z691Var.mo55877J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // p204p.z691
    /* JADX INFO: renamed from: K */
    public final void mo55878K(long j, long j2) {
        long j3;
        long j4 = this.f279793W0;
        long j5 = 0;
        if (this.f279807i != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.f279786P0 = false;
            m95484D(this, mjr0.f144316b, z);
        }
        if (!this.f120838e1) {
            int size = 1;
            while (true) {
                if (size >= this.f120837d1.size()) {
                    size = this.f120837d1.size();
                    break;
                } else if (((z691) this.f120837d1.get(size)).f279797Y0 > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.f120837d1.size()) {
                        z691 z691Var = (z691) this.f120837d1.get(i);
                        long j6 = z691Var.f279797Y0;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        z691Var.mo55878K(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    z691 z691Var2 = (z691) this.f120837d1.get(i);
                    long j8 = z691Var2.f279797Y0;
                    long j9 = j - j8;
                    z691Var2.mo55878K(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.f279807i != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.f279786P0 = true;
                }
                m95484D(this, mjr0.f144317c, z);
            }
        }
        for (int i2 = 0; i2 < this.f120837d1.size(); i2++) {
            ((z691) this.f120837d1.get(i2)).mo55878K(j, j2);
        }
        j3 = j5;
        if (this.f279807i != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.f279786P0 = true;
            }
            m95484D(this, mjr0.f144317c, z);
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: M */
    public final void mo55880M(s800 s800Var) {
        this.f279791U0 = s800Var;
        this.f120841h1 |= 8;
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            ((z691) this.f120837d1.get(i)).mo55880M(s800Var);
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: O */
    public final void mo55882O(ajp0 ajp0Var) {
        super.mo55882O(ajp0Var);
        this.f120841h1 |= 4;
        if (this.f120837d1 != null) {
            for (int i = 0; i < this.f120837d1.size(); i++) {
                ((z691) this.f120837d1.get(i)).mo55882O(ajp0Var);
            }
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: P */
    public final void mo55883P(zz11 zz11Var) {
        this.f279790T0 = zz11Var;
        this.f120841h1 |= 2;
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            ((z691) this.f120837d1.get(i)).mo55883P(zz11Var);
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: Q */
    public final void mo55884Q(long j) {
        this.f279800b = j;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: S */
    public final String mo55885S(String str) {
        String strMo55885S = super.mo55885S(str);
        for (int i = 0; i < this.f120837d1.size(); i++) {
            StringBuilder sbM75191i = rbz.m75191i(strMo55885S, "\n");
            sbM75191i.append(((z691) this.f120837d1.get(i)).mo55885S(str + "  "));
            strMo55885S = sbM75191i.toString();
        }
        return strMo55885S;
    }

    /* JADX INFO: renamed from: T */
    public final void m55886T(l891 l891Var) {
        super.m95486b(l891Var);
    }

    /* JADX INFO: renamed from: U */
    public final void m55887U(z691 z691Var) {
        this.f120837d1.add(z691Var);
        z691Var.f279807i = this;
        long j = this.f279801c;
        if (j >= 0) {
            z691Var.mo55879L(j);
        }
        if ((this.f120841h1 & 1) != 0) {
            z691Var.mo55881N(this.f279802d);
        }
        if ((this.f120841h1 & 2) != 0) {
            z691Var.mo55883P(this.f279790T0);
        }
        if ((this.f120841h1 & 4) != 0) {
            z691Var.mo55882O(this.f279792V0);
        }
        if ((this.f120841h1 & 8) != 0) {
            z691Var.mo55880M(this.f279791U0);
        }
    }

    /* JADX INFO: renamed from: V */
    public final z691 m55888V(int i) {
        if (i < 0 || i >= this.f120837d1.size()) {
            return null;
        }
        return (z691) this.f120837d1.get(i);
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void mo55879L(long j) {
        ArrayList arrayList;
        this.f279801c = j;
        if (j < 0 || (arrayList = this.f120837d1) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((z691) this.f120837d1.get(i)).mo55879L(j);
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void mo55881N(TimeInterpolator timeInterpolator) {
        this.f120841h1 |= 1;
        ArrayList arrayList = this.f120837d1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((z691) this.f120837d1.get(i)).mo55881N(timeInterpolator);
            }
        }
        this.f279802d = timeInterpolator;
    }

    /* JADX INFO: renamed from: Y */
    public final void m55891Y(int i) {
        if (i == 0) {
            this.f120838e1 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(s571.m77246e(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f120838e1 = false;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final z691[] m55892Z() {
        z691[] z691VarArr = this.f120842i1;
        this.f120842i1 = null;
        if (z691VarArr == null) {
            z691VarArr = new z691[this.f120837d1.size()];
        }
        return (z691[]) this.f120837d1.toArray(z691VarArr);
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: c */
    public final z691 mo55893c(View view) {
        for (int i = 0; i < this.f120837d1.size(); i++) {
            ((z691) this.f120837d1.get(i)).mo55893c(view);
        }
        this.f279804f.add(view);
        return this;
    }

    @Override // p204p.z691
    public final void cancel() {
        super.cancel();
        z691[] z691VarArrM55892Z = m55892Z();
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            z691VarArrM55892Z[i].cancel();
        }
        Arrays.fill(z691VarArrM55892Z, (Object) null);
        this.f120842i1 = z691VarArrM55892Z;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: e */
    public final void mo26147e(rb91 rb91Var) {
        View view = rb91Var.f197534b;
        if (m95483B(view)) {
            for (z691 z691Var : this.f120837d1) {
                if (z691Var.m95483B(view)) {
                    z691Var.mo26147e(rb91Var);
                    rb91Var.f197535c.add(z691Var);
                }
            }
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: h */
    public final void mo55894h(rb91 rb91Var) {
        super.mo55894h(rb91Var);
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            ((z691) this.f120837d1.get(i)).mo55894h(rb91Var);
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: i */
    public final void mo26148i(rb91 rb91Var) {
        View view = rb91Var.f197534b;
        if (m95483B(view)) {
            for (z691 z691Var : this.f120837d1) {
                if (z691Var.m95483B(view)) {
                    z691Var.mo26148i(rb91Var);
                    rb91Var.f197535c.add(z691Var);
                }
            }
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final z691 clone() {
        ka91 ka91Var = (ka91) super.clone();
        ka91Var.f120837d1 = new ArrayList();
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            z691 z691VarClone = ((z691) this.f120837d1.get(i)).clone();
            ka91Var.f120837d1.add(z691VarClone);
            z691VarClone.f279807i = ka91Var;
        }
        return ka91Var;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: q */
    public final void mo55896q(ViewGroup viewGroup, a531 a531Var, a531 a531Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f279800b;
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            z691 z691Var = (z691) this.f120837d1.get(i);
            if (j > 0 && (this.f120838e1 || i == 0)) {
                long j2 = z691Var.f279800b;
                if (j2 > 0) {
                    z691Var.mo55884Q(j2 + j);
                } else {
                    z691Var.mo55884Q(j);
                }
            }
            z691Var.mo55896q(viewGroup, a531Var, a531Var2, arrayList, arrayList2);
        }
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: s */
    public final void mo55897s(ViewGroup viewGroup) {
        super.mo55897s(viewGroup);
        z691[] z691VarArrM55892Z = m55892Z();
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            z691VarArrM55892Z[i].mo55897s(viewGroup);
        }
        Arrays.fill(z691VarArrM55892Z, (Object) null);
        this.f120842i1 = z691VarArrM55892Z;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: y */
    public final boolean mo55898y() {
        for (int i = 0; i < this.f120837d1.size(); i++) {
            if (((z691) this.f120837d1.get(i)).mo55898y()) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: z */
    public final boolean mo55854z() {
        int size = this.f120837d1.size();
        for (int i = 0; i < size; i++) {
            if (!((z691) this.f120837d1.get(i)).mo55854z()) {
                return false;
            }
        }
        return true;
    }
}
