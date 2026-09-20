package p204p;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class w800 extends r800 {
    @Override // p204p.r800
    /* JADX INFO: renamed from: a */
    public final void mo69314a(View view, Object obj) {
        ((z691) obj).mo55893c(view);
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: b */
    public final void mo69315b(Object obj, ArrayList arrayList) {
        z691 z691Var = (z691) obj;
        if (z691Var == null) {
            return;
        }
        int i = 0;
        if (z691Var instanceof ka91) {
            ka91 ka91Var = (ka91) z691Var;
            int size = ka91Var.f120837d1.size();
            while (i < size) {
                mo69315b(ka91Var.m55888V(i), arrayList);
                i++;
            }
            return;
        }
        if (r800.m74963k(z691Var.f279803e) && r800.m74963k(z691Var.f279804f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                z691Var.mo55893c((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: c */
    public final void mo74964c(Object obj) {
        ((t691) obj).m80153i();
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: d */
    public final void mo74965d(Object obj, fxf fxfVar) {
        t691 t691Var = (t691) obj;
        t691Var.f217500g = fxfVar;
        if (!t691Var.f217495b) {
            t691Var.f217497d = 2;
        } else {
            t691Var.m80154j();
            t691Var.f217498e.m61688a(0.0f);
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: e */
    public final void mo69316e(ViewGroup viewGroup, Object obj) {
        o891.m66421a(viewGroup, (z691) obj);
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: g */
    public final boolean mo69317g(Object obj) {
        return obj instanceof z691;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: h */
    public final Object mo69318h(Object obj) {
        if (obj != null) {
            return ((z691) obj).clone();
        }
        return null;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: i */
    public final Object mo74966i(ViewGroup viewGroup, Object obj) {
        z691 z691Var = (z691) obj;
        ArrayList arrayList = o891.f162744c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!z691Var.mo55854z()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        z691 z691VarClone = z691Var.clone();
        ka91 ka91Var = new ka91();
        ka91Var.m55887U(z691VarClone);
        o891.m66424d(viewGroup, ka91Var);
        viewGroup.setTag(R.id.transition_current_scene, null);
        n891 n891Var = new n891();
        n891Var.f151483a = ka91Var;
        n891Var.f151484b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(n891Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(n891Var);
        viewGroup.invalidate();
        t691 t691Var = new t691(ka91Var);
        ka91Var.f279795X0 = t691Var;
        ka91Var.m95486b(t691Var);
        return ka91Var.f279795X0;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: l */
    public final boolean mo69319l() {
        return true;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: m */
    public final boolean mo69320m(Object obj) {
        boolean zMo55854z = ((z691) obj).mo55854z();
        if (!zMo55854z) {
            Objects.toString(obj);
        }
        return zMo55854z;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: n */
    public final Object mo69321n(Object obj, Object obj2, Object obj3) {
        z691 z691Var = (z691) obj;
        z691 z691Var2 = (z691) obj2;
        z691 z691Var3 = (z691) obj3;
        if (z691Var != null && z691Var2 != null) {
            ka91 ka91Var = new ka91();
            ka91Var.m55887U(z691Var);
            ka91Var.m55887U(z691Var2);
            ka91Var.m55891Y(1);
            z691Var = ka91Var;
        } else if (z691Var == null) {
            z691Var = z691Var2 != null ? z691Var2 : null;
        }
        if (z691Var3 == null) {
            return z691Var;
        }
        ka91 ka91Var2 = new ka91();
        if (z691Var != null) {
            ka91Var2.m55887U(z691Var);
        }
        ka91Var2.m55887U(z691Var3);
        return ka91Var2;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: o */
    public final Object mo69322o(Object obj, Object obj2) {
        ka91 ka91Var = new ka91();
        if (obj != null) {
            ka91Var.m55887U((z691) obj);
        }
        ka91Var.m55887U((z691) obj2);
        return ka91Var;
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: p */
    public final void mo69323p(Object obj, View view, ArrayList arrayList) {
        ((z691) obj).m95486b(new t800(view, arrayList));
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: q */
    public final void mo69324q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((z691) obj).m95486b(new u800(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: r */
    public final void mo74967r(Object obj, float f) {
        t691 t691Var = (t691) obj;
        boolean z = t691Var.f217495b;
        if (z) {
            ka91 ka91Var = t691Var.f217501h;
            long j = ka91Var.f279793W0;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (t691Var.f217498e != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j3 = t691Var.f217494a;
            if (j2 == j3 || !z) {
                return;
            }
            if (!t691Var.f217496c) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    ka91Var.mo55878K(j2, j3);
                    t691Var.f217494a = j2;
                }
            }
            ob31 ob31Var = t691Var.f217499f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i = (ob31Var.f163528a + 1) % 20;
            ob31Var.f163528a = i;
            ((long[]) ob31Var.f163529b)[i] = jCurrentAnimationTimeMillis;
            ((float[]) ob31Var.f163530c)[i] = j2;
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: s */
    public final void mo69325s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            r800.m74962j(rect, view);
            ((z691) obj).mo55880M(new s800(0, rect));
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: t */
    public final void mo69326t(Object obj, Rect rect) {
        ((z691) obj).mo55880M(new s800(1, rect));
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: u */
    public final void mo74968u(Object obj, oqb oqbVar, kep kepVar, Runnable runnable) {
        z691 z691Var = (z691) obj;
        jt4 jt4Var = new jt4(kepVar, z691Var, runnable, 10);
        synchronized (oqbVar) {
            while (oqbVar.f168146c) {
                try {
                    try {
                        oqbVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((jt4) oqbVar.f168147d) != jt4Var) {
                oqbVar.f168147d = jt4Var;
                if (oqbVar.f168145b) {
                    Runnable runnable2 = (Runnable) jt4Var.f115706b;
                    z691 z691Var2 = (z691) jt4Var.f115707c;
                    Runnable runnable3 = (Runnable) jt4Var.f115708d;
                    if (runnable2 == null) {
                        z691Var2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        z691Var.m95486b(new v800(runnable));
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: v */
    public final void mo69327v(i500 i500Var, Object obj, oqb oqbVar, Runnable runnable) {
        mo74968u(obj, oqbVar, null, runnable);
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: w */
    public final void mo69328w(Object obj, View view, ArrayList arrayList) {
        ka91 ka91Var = (ka91) obj;
        ArrayList arrayList2 = ka91Var.f279804f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r800.m74961f((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo69315b(ka91Var, arrayList);
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: x */
    public final void mo69329x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        ka91 ka91Var = (ka91) obj;
        if (ka91Var != null) {
            ArrayList arrayList3 = ka91Var.f279804f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m87431z(ka91Var, arrayList, arrayList2);
        }
    }

    @Override // p204p.r800
    /* JADX INFO: renamed from: y */
    public final Object mo69330y(Object obj) {
        if (obj == null) {
            return null;
        }
        ka91 ka91Var = new ka91();
        ka91Var.m55887U((z691) obj);
        return ka91Var;
    }

    /* JADX INFO: renamed from: z */
    public final void m87431z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        z691 z691Var = (z691) obj;
        int i = 0;
        if (z691Var instanceof ka91) {
            ka91 ka91Var = (ka91) z691Var;
            int size = ka91Var.f120837d1.size();
            while (i < size) {
                m87431z(ka91Var.m55888V(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (r800.m74963k(z691Var.f279803e)) {
            ArrayList arrayList3 = z691Var.f279804f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    z691Var.mo55893c((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    z691Var.mo55875H((View) arrayList.get(size3));
                }
            }
        }
    }
}
