package p204p;

import android.animation.AnimatorSet;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r9q extends ix31 {

    /* JADX INFO: renamed from: c */
    public final p9q f197101c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f197102d;

    public r9q(p9q p9qVar) {
        this.f197101c = p9qVar;
    }

    @Override // p204p.ix31
    /* JADX INFO: renamed from: c */
    public final void mo51854c(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.f197102d;
        p9q p9qVar = this.f197101c;
        if (animatorSet == null) {
            ((jx31) p9qVar.f57320b).m54494c(this);
            return;
        }
        jx31 jx31Var = (jx31) p9qVar.f57320b;
        if (!jx31Var.f116786g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            t9q.f218341a.m80312a(animatorSet);
        }
        if (c700.m31595O(2)) {
            jx31Var.toString();
        }
    }

    @Override // p204p.ix31
    /* JADX INFO: renamed from: d */
    public final void mo51855d(ViewGroup viewGroup) {
        jx31 jx31Var = (jx31) this.f197101c.f57320b;
        AnimatorSet animatorSet = this.f197102d;
        if (animatorSet == null) {
            jx31Var.m54494c(this);
            return;
        }
        animatorSet.start();
        if (c700.m31595O(2)) {
            Objects.toString(jx31Var);
        }
    }

    @Override // p204p.ix31
    /* JADX INFO: renamed from: e */
    public final void mo51856e(fi8 fi8Var) {
        jx31 jx31Var = (jx31) this.f197101c.f57320b;
        AnimatorSet animatorSet = this.f197102d;
        if (animatorSet == null) {
            jx31Var.m54494c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !jx31Var.f116782c.f98689Z) {
            return;
        }
        if (c700.m31595O(2)) {
            jx31Var.toString();
        }
        long jM77589a = s9q.f206995a.m77589a(animatorSet);
        long j = (long) (fi8Var.f69805c * jM77589a);
        if (j == 0) {
            j = 1;
        }
        if (j == jM77589a) {
            j = jM77589a - 1;
        }
        if (c700.m31595O(2)) {
            animatorSet.toString();
            jx31Var.toString();
        }
        t9q.f218341a.m80313b(animatorSet, j);
    }

    @Override // p204p.ix31
    /* JADX INFO: renamed from: f */
    public final void mo51857f(ViewGroup viewGroup) {
        r9q r9qVar;
        p9q p9qVar = this.f197101c;
        if (p9qVar.m38174p1()) {
            return;
        }
        nps npsVarM69400F1 = p9qVar.m69400F1(viewGroup.getContext());
        this.f197102d = npsVarM69400F1 != null ? (AnimatorSet) npsVarM69400F1.f157064c : null;
        jx31 jx31Var = (jx31) p9qVar.f57320b;
        i500 i500Var = jx31Var.f116782c;
        boolean z = jx31Var.f116780a == 3;
        View view = i500Var.f98706h1;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f197102d;
        if (animatorSet != null) {
            r9qVar = this;
            animatorSet.addListener(new q9q(viewGroup, view, z, jx31Var, r9qVar));
        } else {
            r9qVar = this;
        }
        AnimatorSet animatorSet2 = r9qVar.f197102d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
