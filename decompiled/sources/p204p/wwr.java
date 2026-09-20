package p204p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class wwr implements cmj {

    /* JADX INFO: renamed from: a */
    public final bxr f255820a;

    /* JADX INFO: renamed from: b */
    public final boolean f255821b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f255822c;

    /* JADX INFO: renamed from: e */
    public Animator f255824e;

    /* JADX INFO: renamed from: h */
    public mjv0 f255827h;

    /* JADX INFO: renamed from: i */
    public boolean f255828i;

    /* JADX INFO: renamed from: k */
    public njv0 f255830k;

    /* JADX INFO: renamed from: d */
    public final swr f255823d = new swr(this);

    /* JADX INFO: renamed from: f */
    public float f255825f = 1.0f;

    /* JADX INFO: renamed from: g */
    public bmj f255826g = opg1.f167908Q0;

    /* JADX INFO: renamed from: j */
    public boolean f255829j = true;

    public wwr(bxr bxrVar, boolean z) {
        this.f255820a = bxrVar;
        this.f255821b = z;
    }

    @Override // p204p.cmj
    /* JADX INFO: renamed from: a */
    public final void mo33382a(RecyclerView recyclerView) {
        if (this.f255821b) {
            swr swrVar = this.f255823d;
            if (recyclerView == null) {
                RecyclerView recyclerView2 = this.f255822c;
                if (recyclerView2 != null) {
                    recyclerView2.setItemAnimator(this.f255827h);
                    recyclerView2.m1024p0(swrVar);
                }
            } else {
                this.f255827h = recyclerView.getItemAnimator();
                recyclerView.m1013j(swrVar);
            }
        }
        this.f255822c = recyclerView;
    }

    @Override // p204p.cmj
    /* JADX INFO: renamed from: b */
    public final boolean mo33383b(bmj bmjVar) {
        int i = 1;
        if (!this.f255821b) {
            return true;
        }
        Animator animator = this.f255824e;
        if (animator != null) {
            animator.cancel();
            animator.removeAllListeners();
        }
        this.f255824e = null;
        int i2 = 0;
        this.f255829j = false;
        this.f255826g = bmjVar;
        RecyclerView recyclerView = this.f255822c;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        nlv0 nlv0Var = new nlv0();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f255825f, 0.0f);
        valueAnimatorOfFloat.setDuration(50L);
        valueAnimatorOfFloat.addListener(new twr(this, nlv0Var));
        valueAnimatorOfFloat.addUpdateListener(new uwr(this, bmjVar, i));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(0L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new vwr(nlv0Var, this, bmjVar, i2));
        animatorSet.start();
        this.f255824e = animatorSet;
        return true;
    }

    @Override // p204p.cmj
    /* JADX INFO: renamed from: c */
    public final void mo33384c(bmj bmjVar) {
        if (this.f255821b) {
            this.f255829j = true;
            if (this.f255828i) {
                this.f255828i = false;
                m89213d(bmjVar);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m89213d(bmj bmjVar) {
        Animator animator = this.f255824e;
        if (animator != null) {
            animator.cancel();
            animator.removeAllListeners();
        }
        this.f255824e = null;
        nlv0 nlv0Var = new nlv0();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration((bmjVar.f28566b || bmjVar.f28567c) ? 75L : 50L);
        valueAnimatorOfFloat.addListener(new twr(nlv0Var, this));
        valueAnimatorOfFloat.addUpdateListener(new uwr(this, bmjVar, 0));
        valueAnimatorOfFloat.start();
        this.f255824e = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: e */
    public final void m89214e(View view, float f, bmj bmjVar) {
        View view2;
        RecyclerView recyclerView = this.f255822c;
        dkv0 dkv0VarM997T = recyclerView != null ? recyclerView.m997T(view) : null;
        if (dkv0VarM997T instanceof qxf) {
            qxf qxfVar = (qxf) dkv0VarM997T;
            if (!((Boolean) this.f255820a.invoke(qxfVar.f193663V0, bmjVar)).booleanValue() || qxfVar.f50039a.getAlpha() == f) {
                return;
            }
        }
        if (dkv0VarM997T == null || (view2 = dkv0VarM997T.f50039a) == null) {
            return;
        }
        view2.setAlpha(f);
    }
}
