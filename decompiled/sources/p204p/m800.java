package p204p;

import android.transition.Transition;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class m800 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f140890b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f140891c;

    public /* synthetic */ m800(int i, Object obj, Object obj2) {
        this.f140889a = i;
        this.f140890b = obj;
        this.f140891c = obj2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        int i = this.f140889a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        Transition sharedElementEnterTransition;
        switch (this.f140889a) {
            case 0:
                transition.removeListener(this);
                ((View) this.f140890b).setVisibility(8);
                ArrayList arrayList = (ArrayList) this.f140891c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
                break;
            default:
                ((ye90) this.f140890b).invoke();
                Window window = ((m500) this.f140891c).getWindow();
                if (window != null && (sharedElementEnterTransition = window.getSharedElementEnterTransition()) != null) {
                    sharedElementEnterTransition.removeListener(this);
                    break;
                }
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        int i = this.f140889a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        int i = this.f140889a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        switch (this.f140889a) {
            case 0:
                transition.removeListener(this);
                transition.addListener(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m61098a(Transition transition) {
    }

    /* JADX INFO: renamed from: b */
    private final void m61099b(Transition transition) {
    }

    /* JADX INFO: renamed from: c */
    private final void m61100c(Transition transition) {
    }

    /* JADX INFO: renamed from: d */
    private final void m61101d(Transition transition) {
    }

    /* JADX INFO: renamed from: e */
    private final void m61102e(Transition transition) {
    }

    /* JADX INFO: renamed from: f */
    private final void m61103f(Transition transition) {
    }

    /* JADX INFO: renamed from: g */
    private final void m61104g(Transition transition) {
    }
}
