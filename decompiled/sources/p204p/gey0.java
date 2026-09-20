package p204p;

import android.animation.Animator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gey0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79234a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f79235b;

    public /* synthetic */ gey0(int i, List list) {
        this.f79234a = i;
        this.f79235b = list;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f79234a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f79234a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f79234a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v12, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v16, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v20, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v4, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p.eh00, p.qe70] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f79234a) {
            case 0:
                for (lth lthVar : this.f79235b) {
                    lthVar.f136784d = ((Number) lthVar.f136781a.invoke()).floatValue();
                    lthVar.f136785e = ((Number) lthVar.f136782b.invoke()).floatValue();
                }
                break;
            case 1:
                for (mth mthVar : this.f79235b) {
                    mthVar.f147078d = ((Number) mthVar.f147075a.invoke()).floatValue();
                    mthVar.f147079e = ((Number) mthVar.f147076b.invoke()).floatValue();
                }
                break;
            default:
                for (nth nthVar : this.f79235b) {
                    nthVar.f158071d = ((Number) nthVar.f158068a.invoke()).floatValue();
                    nthVar.f158072e = ((Number) nthVar.f158069b.invoke()).floatValue();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m44536a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m44537b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m44538c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m44539d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m44540e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m44541f(Animator animator) {
    }

    /* JADX INFO: renamed from: g */
    private final void m44542g(Animator animator) {
    }

    /* JADX INFO: renamed from: h */
    private final void m44543h(Animator animator) {
    }

    /* JADX INFO: renamed from: i */
    private final void m44544i(Animator animator) {
    }
}
