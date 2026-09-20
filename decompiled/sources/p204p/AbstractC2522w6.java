package p204p;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: renamed from: p.w6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2522w6 extends eg60 implements fbk, xuk {

    /* JADX INFO: renamed from: c */
    public final juk f248218c;

    public AbstractC2522w6(juk jukVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m38795h0((tf60) jukVar.mo26595B(gk40.f80712X0));
        }
        this.f248218c = jukVar.mo26608y(this);
    }

    @Override // p204p.xuk
    /* JADX INFO: renamed from: M */
    public final juk mo31960M() {
        return this.f248218c;
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: T */
    public final String mo38781T() {
        return opo.m67555e(this).concat(" was cancelled");
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: g0 */
    public final void mo38794g0(CompletionHandlerException completionHandlerException) {
        srz.m79154l(completionHandlerException, this.f248218c);
    }

    @Override // p204p.fbk
    public final juk getContext() {
        return this.f248218c;
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: m0 */
    public String mo30506m0() {
        return opo.m67555e(this);
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: p0 */
    public final void mo38800p0(Object obj) {
        if (!(obj instanceof ruf)) {
            mo65807x0(obj);
        } else {
            ruf rufVar = (ruf) obj;
            mo65806w0(rufVar.f202838a, ruf.f202837b.get(rufVar) == 1);
        }
    }

    @Override // p204p.fbk
    public final void resumeWith(Object obj) {
        Object objM38798l0 = m38798l0(rlg1.m75859z(obj));
        if (objM38798l0 == i091.f97174b) {
            return;
        }
        mo26008O(objM38798l0);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m87264y0(int i, AbstractC2522w6 abstractC2522w6, th00 th00Var) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            hra.m48349B(th00Var, abstractC2522w6, this);
            return;
        }
        if (iM38547C != 1) {
            if (iM38547C == 2) {
                s95.m77564n(th00Var, abstractC2522w6, this);
            } else {
                if (iM38547C != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vjf1.m85772v(th00Var, abstractC2522w6, this);
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void mo65807x0(Object obj) {
    }

    /* JADX INFO: renamed from: w0 */
    public void mo65806w0(Throwable th, boolean z) {
    }
}
