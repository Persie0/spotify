package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class vwr extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245536a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f245537b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f245538c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f245539d;

    public /* synthetic */ vwr(Object obj, Object obj2, Object obj3, int i) {
        this.f245536a = i;
        this.f245537b = obj;
        this.f245538c = obj2;
        this.f245539d = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f245536a) {
            case 0:
                ((nlv0) this.f245537b).f155174a = true;
                wwr wwrVar = (wwr) this.f245538c;
                wwrVar.f255828i = false;
                wwrVar.f255826g = opg1.f167908Q0;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f245536a) {
            case 0:
                if (!((nlv0) this.f245537b).f155174a) {
                    wwr wwrVar = (wwr) this.f245538c;
                    if (!wwrVar.f255829j) {
                        wwrVar.f255828i = true;
                    } else {
                        wwrVar.m89213d((bmj) this.f245539d);
                    }
                    break;
                }
                break;
            default:
                if (!((zz00) this.f245537b).f287757t.get()) {
                    ((Consumer) this.f245538c).accept(new oz00((wz00) this.f245539d));
                }
                break;
        }
    }
}
