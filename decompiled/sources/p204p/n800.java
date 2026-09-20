package p204p;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n800 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f151294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f151295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f151296c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f151297d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ p800 f151298e;

    public n800(p800 p800Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f151298e = p800Var;
        this.f151294a = obj;
        this.f151295b = arrayList;
        this.f151296c = obj2;
        this.f151297d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        p800 p800Var = this.f151298e;
        Object obj = this.f151294a;
        if (obj != null) {
            p800Var.m69313A(obj, this.f151295b, null);
        }
        Object obj2 = this.f151296c;
        if (obj2 != null) {
            p800Var.m69313A(obj2, this.f151297d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
