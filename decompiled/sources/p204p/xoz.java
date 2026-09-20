package p204p;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class xoz extends exh0 implements xpz, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: M0 */
    public View f264388M0;

    /* JADX INFO: renamed from: N0 */
    public ViewTreeObserver f264389N0;

    /* JADX INFO: renamed from: O0 */
    public final c7x f264390O0 = new c7x(this, 29);

    /* JADX INFO: renamed from: P0 */
    public final gfx f264391P0 = new gfx(this, 1);

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        ViewTreeObserver viewTreeObserver = this.f264389N0;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f264389N0 = null;
        yjg1.m93925q(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f264388M0 = null;
    }

    /* JADX INFO: renamed from: H1 */
    public final pqz m91574H1() {
        boolean z;
        if (!this.f63770a.f63766L0) {
            mt40.m62791c("visitLocalDescendants called on an unattached node");
        }
        exh0 exh0Var = this.f63770a;
        if ((exh0Var.f63773d & 1024) != 0) {
            boolean z2 = false;
            for (exh0 exh0Var2 = exh0Var.f63775f; exh0Var2 != null; exh0Var2 = exh0Var2.f63775f) {
                if ((exh0Var2.f63772c & 1024) != 0) {
                    exh0 exh0VarM88331j = exh0Var2;
                    qqi0 qqi0Var = null;
                    while (exh0VarM88331j != null) {
                        if (exh0VarM88331j instanceof pqz) {
                            pqz pqzVar = (pqz) exh0VarM88331j;
                            if (z2) {
                                return pqzVar;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (exh0VarM88331j.f63772c & 1024) != 0 && (exh0VarM88331j instanceof xlq)) {
                            int i = 0;
                            for (exh0 exh0Var3 = ((xlq) exh0VarM88331j).f263224N0; exh0Var3 != null; exh0Var3 = exh0Var3.f63775f) {
                                if ((exh0Var3.f63772c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        exh0VarM88331j = exh0Var3;
                                    } else {
                                        if (qqi0Var == null) {
                                            qqi0Var = new qqi0(0, new exh0[16]);
                                        }
                                        if (exh0VarM88331j != null) {
                                            qqi0Var.m73556b(exh0VarM88331j);
                                            exh0VarM88331j = null;
                                        }
                                        qqi0Var.m73556b(exh0Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        exh0VarM88331j = wjg1.m88331j(qqi0Var);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // p204p.xpz
    /* JADX INFO: renamed from: V0 */
    public final void mo39631V0(spz spzVar) {
        spzVar.mo67471b(false);
        spzVar.mo78927e(this.f264390O0);
        spzVar.mo78926c(this.f264391P0);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (wjg1.m88319I(this).f135652M0 == null) {
            return;
        }
        View viewM67359k = omo0.m67359k(this);
        ppz focusOwner = ((oz3) wjg1.m88320J(this)).getFocusOwner();
        g2m0 g2m0VarM88320J = wjg1.m88320J(this);
        boolean z = (view == null || view.equals(g2m0VarM88320J) || !omo0.m67358j(viewM67359k, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(g2m0VarM88320J) || !omo0.m67358j(viewM67359k, view2)) ? false : true;
        if (z && z2) {
            this.f264388M0 = view2;
            return;
        }
        if (z2) {
            this.f264388M0 = view2;
            pqz pqzVarM91574H1 = m91574H1();
            if (pqzVarM91574H1.m70695L1().m57128a()) {
                return;
            }
            fag1.m41171t(pqzVarM91574H1);
            return;
        }
        if (!z) {
            this.f264388M0 = null;
            return;
        }
        this.f264388M0 = null;
        if (m91574H1().m70695L1().m57129b()) {
            ((rpz) focusOwner).m76198d(8, false, false);
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        ViewTreeObserver viewTreeObserver = yjg1.m93925q(this).getViewTreeObserver();
        this.f264389N0 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }
}
