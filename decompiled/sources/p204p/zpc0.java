package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;

/* JADX INFO: loaded from: classes8.dex */
public final class zpc0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285097a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f285098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f285099c;

    /* JADX WARN: Multi-variable type inference failed */
    public zpc0(eh00 eh00Var, m500 m500Var) {
        this.f285098b = (qe70) eh00Var;
        this.f285099c = m500Var;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.eh00, p.qe70] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f285097a) {
            case 0:
                this.f285098b.invoke();
                m500 m500VarM49715n0 = ((aqc0) this.f285099c).m49715n0();
                if (m500VarM49715n0 != null) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        m500VarM49715n0.overrideActivityTransition(1, 0, 0);
                    } else {
                        m500VarM49715n0.overridePendingTransition(0, 0);
                    }
                }
                break;
            default:
                this.f285098b.invoke();
                m500 m500Var = (m500) this.f285099c;
                if (m500Var != null) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        m500Var.overrideActivityTransition(1, 0, 0);
                    } else {
                        m500Var.overridePendingTransition(0, 0);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zpc0(eh00 eh00Var, aqc0 aqc0Var) {
        this.f285098b = (qe70) eh00Var;
        this.f285099c = aqc0Var;
    }
}
