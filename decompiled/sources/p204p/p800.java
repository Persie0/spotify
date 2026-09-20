package p204p;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class p800 extends r800 {
    /* JADX INFO: renamed from: z */
    public static boolean m69312z(Transition transition) {
        return (r800.m74963k(transition.getTargetIds()) && r800.m74963k(transition.getTargetNames()) && r800.m74963k(transition.getTargetTypes())) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public final void m69313A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m69313A(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m69312z(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: a */
    public final void mo69314a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: b */
    public final void mo69315b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo69315b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m69312z(transition) || !r800.m74963k(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: e */
    public final void mo69316e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: g */
    public final boolean mo69317g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: h */
    public final Object mo69318h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: l */
    public final boolean mo69319l() {
        c700.m31595O(4);
        return false;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: m */
    public final boolean mo69320m(Object obj) {
        if (!c700.m31595O(2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: n */
    public final Object mo69321n(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: o */
    public final Object mo69322o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: p */
    public final void mo69323p(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new m800(0, view, arrayList));
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: q */
    public final void mo69324q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new n800(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: s */
    public final void mo69325s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            r800.m74962j(rect, view);
            ((Transition) obj).setEpicenterCallback(new l800(0, rect));
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: t */
    public final void mo69326t(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new l800(1, rect));
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: v */
    public final void mo69327v(i500 i500Var, Object obj, oqb oqbVar, Runnable runnable) {
        ((Transition) obj).addListener(new o800(runnable));
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: w */
    public final void mo69328w(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r800.m74961f((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo69315b(transitionSet, arrayList);
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: x */
    public final void mo69329x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m69313A(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: y */
    public final Object mo69330y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
