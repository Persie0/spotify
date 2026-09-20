package p204p;

import android.view.KeyEvent;
import androidx.compose.p002ui.geometry.Offset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class pie extends AbstractC2203o6 {

    /* JADX INFO: renamed from: j1 */
    public k6q0 f177926j1;

    /* JADX INFO: renamed from: k1 */
    public po40 f177927k1;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p204p.AbstractC2203o6, p204p.n6q0
    /* JADX INFO: renamed from: E0 */
    public final void mo39625E0(e6q0 e6q0Var, f6q0 f6q0Var, long j) {
        super.mo39625E0(e6q0Var, f6q0Var, j);
        if (f6q0Var != f6q0.f66486b) {
            if (f6q0Var != f6q0.f66487c || this.f177926j1 == null) {
                return;
            }
            ?? r7 = e6q0Var.f56704a;
            int size = r7.size();
            for (int i = 0; i < size; i++) {
                k6q0 k6q0Var = (k6q0) r7.get(i);
                if (k6q0Var.m55612l() && !k6q0Var.equals(this.f177926j1)) {
                    m70102W1(false);
                    return;
                }
            }
            return;
        }
        if (this.f177926j1 == null) {
            if (cu61.m33884f(e6q0Var, true)) {
                k6q0 k6q0Var2 = (k6q0) e6q0Var.f56704a.get(0);
                k6q0Var2.m55602a();
                this.f177926j1 = k6q0Var2;
                if (this.f162166T0) {
                    m66316Q1(k6q0Var2);
                    return;
                }
                return;
            }
            return;
        }
        ?? r8 = e6q0Var.f56704a;
        int size2 = r8.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!ex60.m40177k((k6q0) r8.get(i2))) {
                long jM66312M1 = m66312M1(j);
                int size3 = r8.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    k6q0 k6q0Var3 = (k6q0) r8.get(i3);
                    if (k6q0Var3.m55612l() || ex60.m40187u(k6q0Var3, j, jM66312M1)) {
                        m70102W1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((k6q0) r8.get(0)).m55602a();
        if (this.f162166T0) {
            k6q0 k6q0Var4 = this.f177926j1;
            wj50.m88279p(k6q0Var4);
            m66314O1(k6q0Var4.m55605e(), false);
            this.f162167U0.invoke();
        }
        this.f177926j1 = null;
    }

    @Override // p204p.AbstractC2203o6, p204p.n6q0
    /* JADX INFO: renamed from: M0 */
    public final void mo39628M0() {
        super.mo39628M0();
        m70102W1(false);
    }

    @Override // p204p.AbstractC2203o6
    /* JADX INFO: renamed from: T1 */
    public final boolean mo66319T1(KeyEvent keyEvent) {
        return false;
    }

    @Override // p204p.AbstractC2203o6
    /* JADX INFO: renamed from: U1 */
    public final void mo66320U1(KeyEvent keyEvent) {
        this.f162167U0.invoke();
    }

    @Override // p204p.wo40
    /* JADX INFO: renamed from: V */
    public final void mo70101V(zk1 zk1Var, f6q0 f6q0Var) {
        m66317R1();
        if (this.f162166T0 && this.f162170X0 == null) {
            j510 j510VarM51373n = iqg1.m51373n(this);
            m91437H1(j510VarM51373n);
            this.f162170X0 = j510VarM51373n;
        }
        if (f6q0Var != f6q0.f66486b) {
            if (f6q0Var != f6q0.f66487c || this.f177927k1 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) zk1Var.m96291s();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                po40 po40Var = (po40) arrayList.get(i);
                if (po40Var.m70474d() && !po40Var.equals(this.f177927k1)) {
                    m70102W1(true);
                    return;
                }
            }
            return;
        }
        if (this.f177927k1 == null) {
            ArrayList arrayList2 = (ArrayList) zk1Var.m96291s();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (sjf1.m78327l((po40) arrayList2.get(i2))) {
                    po40 po40Var2 = (po40) ((ArrayList) zk1Var.m96291s()).get(0);
                    po40Var2.m70471a();
                    this.f177927k1 = po40Var2;
                    if (this.f162166T0) {
                        m66315P1(po40Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ArrayList arrayList3 = (ArrayList) zk1Var.m96291s();
        int size3 = arrayList3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (!hdi.m47236m((po40) arrayList3.get(i3))) {
                float fMo51233g = ((pec1) oqg1.m67639h(this, wsh.f254629t)).mo51233g();
                ArrayList arrayList4 = (ArrayList) zk1Var.m96291s();
                int size4 = arrayList4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    po40 po40Var3 = (po40) arrayList4.get(i4);
                    long jM70472b = po40Var3.m70472b();
                    po40 po40Var4 = this.f177927k1;
                    wj50.m88279p(po40Var4);
                    boolean z = Math.abs(Offset.m254d(Offset.m256f(jM70472b, po40Var4.m70472b()))) > fMo51233g;
                    if (po40Var3.m70474d() || z) {
                        m70102W1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((po40) ((ArrayList) zk1Var.m96291s()).get(0)).m70471a();
        if (this.f162166T0) {
            po40 po40Var5 = this.f177927k1;
            wj50.m88279p(po40Var5);
            m66314O1(po40Var5.m70472b(), true);
            this.f162167U0.invoke();
        }
        this.f177927k1 = null;
    }

    /* JADX INFO: renamed from: W1 */
    public final void m70102W1(boolean z) {
        if (z) {
            this.f177927k1 = null;
        } else {
            this.f177926j1 = null;
        }
        m66313N1(z);
    }

    @Override // p204p.wo40
    /* JADX INFO: renamed from: b1 */
    public final void mo70103b1() {
        m70102W1(true);
    }
}
