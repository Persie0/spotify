package p204p;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cmp extends sc21 {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f39744s;

    /* JADX INFO: renamed from: h */
    public final ArrayList f39745h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f39746i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ArrayList f39747j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final ArrayList f39748k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f39749l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public final ArrayList f39750m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final ArrayList f39751n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ArrayList f39752o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final ArrayList f39753p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final ArrayList f39754q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final ArrayList f39755r = new ArrayList();

    @Override // p204p.mjv0
    /* JADX INFO: renamed from: c */
    public final boolean mo33394c(dkv0 dkv0Var, List list) {
        return !list.isEmpty() || super.mo33394c(dkv0Var, list);
    }

    @Override // p204p.mjv0
    /* JADX INFO: renamed from: f */
    public final void mo33395f(dkv0 dkv0Var) {
        View view = dkv0Var.f50039a;
        view.animate().cancel();
        ArrayList arrayList = this.f39747j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((bmp) arrayList.get(size)).f28588a == dkv0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m61992d(dkv0Var);
                arrayList.remove(size);
            }
        }
        m33405q(this.f39748k, dkv0Var);
        if (this.f39745h.remove(dkv0Var)) {
            view.setAlpha(1.0f);
            m61992d(dkv0Var);
        }
        if (this.f39746i.remove(dkv0Var)) {
            view.setAlpha(1.0f);
            m61992d(dkv0Var);
        }
        ArrayList arrayList2 = this.f39751n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m33405q(arrayList3, dkv0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f39750m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((bmp) arrayList5.get(size4)).f28588a == dkv0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m61992d(dkv0Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f39749l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(dkv0Var)) {
                view.setAlpha(1.0f);
                m61992d(dkv0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f39754q.remove(dkv0Var);
        this.f39752o.remove(dkv0Var);
        this.f39755r.remove(dkv0Var);
        this.f39753p.remove(dkv0Var);
        m33404p();
    }

    @Override // p204p.mjv0
    /* JADX INFO: renamed from: g */
    public final void mo33396g() {
        ArrayList arrayList = this.f39747j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            bmp bmpVar = (bmp) arrayList.get(size);
            View view = bmpVar.f28588a.f50039a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m61992d(bmpVar.f28588a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f39745h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m61992d((dkv0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f39746i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            dkv0 dkv0Var = (dkv0) arrayList3.get(size3);
            dkv0Var.f50039a.setAlpha(1.0f);
            m61992d(dkv0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f39748k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            amp ampVar = (amp) arrayList4.get(size4);
            dkv0 dkv0Var2 = ampVar.f17170a;
            if (dkv0Var2 != null) {
                m33406r(ampVar, dkv0Var2);
            }
            dkv0 dkv0Var3 = ampVar.f17171b;
            if (dkv0Var3 != null) {
                m33406r(ampVar, dkv0Var3);
            }
        }
        arrayList4.clear();
        if (mo33397i()) {
            ArrayList arrayList5 = this.f39750m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    bmp bmpVar2 = (bmp) arrayList6.get(size6);
                    View view2 = bmpVar2.f28588a.f50039a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m61992d(bmpVar2.f28588a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f39749l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    dkv0 dkv0Var4 = (dkv0) arrayList8.get(size8);
                    dkv0Var4.f50039a.setAlpha(1.0f);
                    m61992d(dkv0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f39751n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    amp ampVar2 = (amp) arrayList10.get(size10);
                    dkv0 dkv0Var5 = ampVar2.f17170a;
                    if (dkv0Var5 != null) {
                        m33406r(ampVar2, dkv0Var5);
                    }
                    dkv0 dkv0Var6 = ampVar2.f17171b;
                    if (dkv0Var6 != null) {
                        m33406r(ampVar2, dkv0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m33403o(this.f39754q);
            m33403o(this.f39753p);
            m33403o(this.f39752o);
            m33403o(this.f39755r);
            m61993e();
        }
    }

    @Override // p204p.mjv0
    /* JADX INFO: renamed from: i */
    public final boolean mo33397i() {
        return (this.f39746i.isEmpty() && this.f39748k.isEmpty() && this.f39747j.isEmpty() && this.f39745h.isEmpty() && this.f39753p.isEmpty() && this.f39754q.isEmpty() && this.f39752o.isEmpty() && this.f39755r.isEmpty() && this.f39750m.isEmpty() && this.f39749l.isEmpty() && this.f39751n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.mjv0
    /* JADX INFO: renamed from: j */
    public final void mo33398j() {
        long j = this.f144348d;
        ArrayList<dkv0> arrayList = this.f39745h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f39747j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f39748k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f39746i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (dkv0 dkv0Var : arrayList) {
            View view = dkv0Var.f50039a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f39754q.add(dkv0Var);
            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new xlp(this, dkv0Var, viewPropertyAnimatorAnimate, view)).start();
            arrayList = arrayList;
        }
        arrayList.clear();
        int i = 0;
        Object[] objArr = 0;
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.f39750m.add(arrayList5);
            arrayList2.clear();
            wlp wlpVar = new wlp(this, arrayList5, i);
            if (zIsEmpty) {
                wlpVar.run();
            } else {
                View view2 = ((bmp) arrayList5.get(0)).f28588a.f50039a;
                WeakHashMap weakHashMap = mec1.f142677a;
                view2.postOnAnimationDelayed(wlpVar, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.f39751n.add(arrayList6);
            arrayList3.clear();
            lk00 lk00Var = new lk00(this, arrayList6, objArr == true ? 1 : 0, 16);
            if (zIsEmpty) {
                lk00Var.run();
            } else {
                View view3 = ((amp) arrayList6.get(0)).f17170a.f50039a;
                WeakHashMap weakHashMap2 = mec1.f142677a;
                view3.postOnAnimationDelayed(lk00Var, j);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.f39749l.add(arrayList7);
        arrayList4.clear();
        wlp wlpVar2 = new wlp(this, arrayList7, 1);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            wlpVar2.run();
            return;
        }
        if (zIsEmpty) {
            j = 0;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.f144349e : 0L, zIsEmpty3 ? 0L : this.f144350f) + j;
        View view4 = ((dkv0) arrayList7.get(0)).f50039a;
        WeakHashMap weakHashMap3 = mec1.f142677a;
        view4.postOnAnimationDelayed(wlpVar2, jMax);
    }

    @Override // p204p.sc21
    /* JADX INFO: renamed from: k */
    public final void mo33399k(dkv0 dkv0Var) {
        m33407s(dkv0Var);
        dkv0Var.f50039a.setAlpha(0.0f);
        this.f39746i.add(dkv0Var);
    }

    @Override // p204p.sc21
    /* JADX INFO: renamed from: l */
    public final boolean mo33400l(dkv0 dkv0Var, dkv0 dkv0Var2, int i, int i2, int i3, int i4) {
        if (dkv0Var == dkv0Var2) {
            return mo33401m(dkv0Var, i, i2, i3, i4);
        }
        View view = dkv0Var.f50039a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m33407s(dkv0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = dkv0Var2.f50039a;
        m33407s(dkv0Var2);
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        this.f39748k.add(new amp(dkv0Var, dkv0Var2, i, i2, i3, i4));
        return true;
    }

    @Override // p204p.sc21
    /* JADX INFO: renamed from: m */
    public final boolean mo33401m(dkv0 dkv0Var, int i, int i2, int i3, int i4) {
        View view = dkv0Var.f50039a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) dkv0Var.f50039a.getTranslationY());
        m33407s(dkv0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m61992d(dkv0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f39747j.add(new bmp(dkv0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // p204p.sc21
    /* JADX INFO: renamed from: n */
    public final void mo33402n(dkv0 dkv0Var) {
        m33407s(dkv0Var);
        this.f39745h.add(dkv0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m33403o(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((dkv0) arrayList.get(size)).f50039a.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m33404p() {
        if (mo33397i()) {
            return;
        }
        m61993e();
    }

    /* JADX INFO: renamed from: q */
    public final void m33405q(ArrayList arrayList, dkv0 dkv0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            amp ampVar = (amp) arrayList.get(size);
            if (m33406r(ampVar, dkv0Var) && ampVar.f17170a == null && ampVar.f17171b == null) {
                arrayList.remove(ampVar);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m33406r(amp ampVar, dkv0 dkv0Var) {
        if (ampVar.f17171b == dkv0Var) {
            ampVar.f17171b = null;
        } else {
            if (ampVar.f17170a != dkv0Var) {
                return false;
            }
            ampVar.f17170a = null;
        }
        View view = dkv0Var.f50039a;
        View view2 = dkv0Var.f50039a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        m61992d(dkv0Var);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m33407s(dkv0 dkv0Var) {
        if (f39744s == null) {
            f39744s = new ValueAnimator().getInterpolator();
        }
        dkv0Var.f50039a.animate().setInterpolator(f39744s);
        mo33395f(dkv0Var);
    }
}
