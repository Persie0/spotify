package p204p;

import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wd21 extends f29 {

    /* JADX INFO: renamed from: e */
    public final xdy0 f250194e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f250195f;

    /* JADX INFO: renamed from: g */
    public hm11 f250196g;

    public wd21(xdy0 xdy0Var, qr8 qr8Var) {
        super(qr8Var);
        this.f250194e = xdy0Var;
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: a */
    public void mo30883a() {
        super.mo30883a();
        hm11 hm11Var = this.f250196g;
        if (hm11Var != null) {
            vwf1.m86577k((Animator) hm11Var.f92796b);
        }
        this.f250196g = null;
        this.f250195f = null;
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: b */
    public final zdy0 mo26476b() {
        return this.f250194e;
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: d */
    public void mo26477d(ConstraintLayout constraintLayout) {
        hm11 hm11VarMo30853h = mo30853h(constraintLayout);
        ((Animator) hm11VarMo30853h.f92796b).addListener(new dbq(this, 7));
        this.f250196g = hm11VarMo30853h;
        this.f250195f = constraintLayout;
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: e */
    public void mo26478e() {
        Animator animator;
        hm11 hm11Var = this.f250196g;
        if (hm11Var == null || (animator = (Animator) hm11Var.f92796b) == null) {
            return;
        }
        animator.pause();
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: f */
    public void mo30885f(key0 key0Var) {
        this.f65136d = key0Var;
        hm11 hm11Var = this.f250196g;
        if (hm11Var != null) {
            ((vd21) hm11Var.f92797c).mo27465V();
            ConstraintLayout constraintLayout = this.f250195f;
            if (constraintLayout != null) {
                inl0.m51135a(constraintLayout, new vod0(23, constraintLayout, hm11Var));
            }
        }
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: g */
    public void mo26479g() {
        Animator animator;
        hm11 hm11Var = this.f250196g;
        if (hm11Var == null || (animator = (Animator) hm11Var.f92796b) == null) {
            return;
        }
        animator.resume();
    }

    /* JADX INFO: renamed from: h */
    public abstract hm11 mo30853h(ConstraintLayout constraintLayout);
}
