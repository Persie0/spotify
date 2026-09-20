package p204p;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xvd1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final ptc f266368a;

    /* JADX INFO: renamed from: b */
    public List f266369b;

    /* JADX INFO: renamed from: c */
    public ArrayList f266370c;

    /* JADX INFO: renamed from: d */
    public final HashMap f266371d;

    public xvd1(ptc ptcVar) {
        super(ptcVar.m70927n0());
        this.f266371d = new HashMap();
        this.f266368a = ptcVar;
    }

    /* JADX INFO: renamed from: a */
    public final awd1 m92234a(WindowInsetsAnimation windowInsetsAnimation) {
        awd1 awd1Var = (awd1) this.f266371d.get(windowInsetsAnimation);
        if (awd1Var != null) {
            return awd1Var;
        }
        awd1 awd1VarM27301g = awd1.m27301g(windowInsetsAnimation);
        this.f266371d.put(windowInsetsAnimation, awd1VarM27301g);
        return awd1VarM27301g;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f266368a.mo46013s0(m92234a(windowInsetsAnimation));
        this.f266371d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m92234a(windowInsetsAnimation);
        this.f266368a.mo46014t0();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f266370c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f266370c = arrayList2;
            this.f266369b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM46007m = gx31.m46007m(list.get(size));
            awd1 awd1VarM92234a = m92234a(windowInsetsAnimationM46007m);
            awd1VarM92234a.m27306f(windowInsetsAnimationM46007m.getFraction());
            this.f266370c.add(awd1VarM92234a);
        }
        return this.f266368a.mo30501u0(swd1.m79536g(null, windowInsets), this.f266369b).m79541f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        return this.f266368a.mo30502v0(m92234a(windowInsetsAnimation), yya1.m94874f(bounds)).m94877e();
    }
}
