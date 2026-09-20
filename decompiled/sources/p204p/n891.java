package p204p;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n891 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public z691 f151483a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f151484b;

    /* JADX WARN: Code duplicated, block: B:101:0x0223  */
    /* JADX WARN: Code duplicated, block: B:103:0x0231  */
    /* JADX WARN: Code duplicated, block: B:104:0x023d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0254  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:146:0x0300  */
    /* JADX WARN: Code duplicated, block: B:148:0x0306  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:150:0x030e  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fb A[EDGE_INSN: B:153:0x01fb->B:91:0x01fb BREAK  A[LOOP:1: B:19:0x0088->B:90:0x01f1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[LOOP:0: B:15:0x0053->B:17:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x0210  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        a531 a531Var;
        a531 a531Var2;
        uj5 uj5Var;
        uj5 uj5Var2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        uj5 uj5VarM95482v;
        ArrayList arrayList2;
        int i5;
        int i6;
        z691 z691Var;
        Animator animator;
        o691 o691Var;
        rb91 rb91Var;
        rb91 rb91Var2;
        int i7;
        a531 a531Var3;
        boolean z2;
        int i8;
        View view;
        rb91 rb91Var3;
        uj5 uj5Var3;
        int i9;
        int i10;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i11;
        View view4;
        View view5;
        w2b0 w2b0Var;
        int iM87072i;
        int i12;
        View view6;
        a531 a531Var4;
        Iterator it;
        z691 z691Var2 = this.f151483a;
        ViewGroup viewGroup = this.f151484b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!o891.f162744c.remove(viewGroup)) {
            return true;
        }
        uj5 uj5VarM66423c = o891.m66423c();
        ArrayList arrayList3 = (ArrayList) uj5VarM66423c.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(z691Var2);
            z691Var2.m95486b(new m891(this, uj5VarM66423c));
            i = 0;
            z691Var2.m95488j(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z691) it.next()).mo55876I(viewGroup);
                }
            }
            z691Var2.f279794X = new ArrayList();
            z691Var2.f279796Y = new ArrayList();
            a531Var = z691Var2.f279805g;
            a531Var2 = z691Var2.f279806h;
            uj5Var = new uj5((uj5) a531Var.f12414b);
            uj5Var2 = new uj5((uj5) a531Var2.f12414b);
            i2 = 0;
            while (true) {
                iArr = z691Var2.f279808t;
                if (i2 < iArr.length) {
                    break;
                }
                i7 = iArr[i2];
                if (i7 != z3) {
                    a531Var3 = a531Var2;
                    z2 = z3;
                    for (i8 = uj5Var.f13976c - 1; i8 >= 0; i8--) {
                        view = (View) uj5Var.m25312f(i8);
                        if (view == null && z691Var2.m95483B(view) && (rb91Var3 = (rb91) uj5Var2.remove(view)) != null && z691Var2.m95483B(rb91Var3.f197534b)) {
                            z691Var2.f279794X.add((rb91) uj5Var.m25313g(i8));
                            z691Var2.f279796Y.add(rb91Var3);
                        }
                    }
                } else if (i7 != 2) {
                    a531Var3 = a531Var2;
                    z2 = z3;
                    uj5Var3 = (uj5) a531Var.f12417e;
                    uj5 uj5Var4 = (uj5) a531Var3.f12417e;
                    i9 = uj5Var3.f13976c;
                    for (i10 = 0; i10 < i9; i10++) {
                        view2 = (View) uj5Var3.m25315i(i10);
                        if (view2 == null && z691Var2.m95483B(view2) && (view3 = (View) uj5Var4.get((String) uj5Var3.m25312f(i10))) != null && z691Var2.m95483B(view3)) {
                            rb91 rb91Var4 = (rb91) uj5Var.get(view2);
                            rb91 rb91Var5 = (rb91) uj5Var2.get(view3);
                            if (rb91Var4 != null && rb91Var5 != null) {
                                z691Var2.f279794X.add(rb91Var4);
                                z691Var2.f279796Y.add(rb91Var5);
                                uj5Var.remove(view2);
                                uj5Var2.remove(view3);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    z2 = z3;
                    sparseArray = (SparseArray) a531Var.f12415c;
                    a531Var3 = a531Var2;
                    SparseArray sparseArray2 = (SparseArray) a531Var3.f12415c;
                    size = sparseArray.size();
                    for (i11 = 0; i11 < size; i11++) {
                        view4 = (View) sparseArray.valueAt(i11);
                        if (view4 == null && z691Var2.m95483B(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && z691Var2.m95483B(view5)) {
                            rb91 rb91Var6 = (rb91) uj5Var.get(view4);
                            rb91 rb91Var7 = (rb91) uj5Var2.get(view5);
                            if (rb91Var6 != null && rb91Var7 != null) {
                                z691Var2.f279794X.add(rb91Var6);
                                z691Var2.f279796Y.add(rb91Var7);
                                uj5Var.remove(view4);
                                uj5Var2.remove(view5);
                            }
                        }
                    }
                } else if (i7 != 4) {
                    a531Var3 = a531Var2;
                    z2 = z3;
                } else {
                    w2b0Var = (w2b0) a531Var.f12416d;
                    w2b0 w2b0Var2 = (w2b0) a531Var2.f12416d;
                    iM87072i = w2b0Var.m87072i();
                    i12 = i;
                    while (i12 < iM87072i) {
                        view6 = (View) w2b0Var.m87073j(i12);
                        if (view6 == null && z691Var2.m95483B(view6)) {
                            a531Var4 = a531Var2;
                            View view7 = (View) w2b0Var2.m87067c(w2b0Var.m87069e(i12));
                            if (view7 != null && z691Var2.m95483B(view7)) {
                                rb91 rb91Var8 = (rb91) uj5Var.get(view6);
                                rb91 rb91Var9 = (rb91) uj5Var2.get(view7);
                                if (rb91Var8 != null && rb91Var9 != null) {
                                    z691Var2.f279794X.add(rb91Var8);
                                    z691Var2.f279796Y.add(rb91Var9);
                                    uj5Var.remove(view6);
                                    uj5Var2.remove(view7);
                                }
                            }
                            i12++;
                            a531Var2 = a531Var4;
                            z3 = z3;
                        } else {
                            a531Var4 = a531Var2;
                        }
                        i12++;
                        a531Var2 = a531Var4;
                        z3 = z3;
                    }
                    z2 = z3;
                    a531Var3 = a531Var2;
                }
                i2++;
                a531Var2 = a531Var3;
                z3 = z2;
                i = 0;
            }
            z = z3;
            for (i3 = 0; i3 < uj5Var.f13976c; i3++) {
                rb91Var2 = (rb91) uj5Var.m25315i(i3);
                if (z691Var2.m95483B(rb91Var2.f197534b)) {
                    z691Var2.f279794X.add(rb91Var2);
                    z691Var2.f279796Y.add(null);
                }
            }
            for (i4 = 0; i4 < uj5Var2.f13976c; i4++) {
                rb91Var = (rb91) uj5Var2.m25315i(i4);
                if (z691Var2.m95483B(rb91Var.f197534b)) {
                    z691Var2.f279796Y.add(rb91Var);
                    z691Var2.f279794X.add(null);
                }
            }
            uj5VarM95482v = z691.m95482v();
            int i13 = uj5VarM95482v.f13976c;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i13 - 1;
            while (i5 >= 0) {
                animator = (Animator) uj5VarM95482v.m25312f(i5);
                if (animator == null && (o691Var = (o691) uj5VarM95482v.get(animator)) != null) {
                    z691 z691Var3 = o691Var.f162296e;
                    View view8 = o691Var.f162292a;
                    if (view8 != null && Objects.equals(windowId, o691Var.f162295d)) {
                        rb91 rb91Var10 = o691Var.f162294c;
                        boolean z4 = z;
                        rb91 rb91VarM95493x = z691Var2.m95493x(view8, z4);
                        rb91 rb91VarM95491t = z691Var2.m95491t(view8, z4);
                        if (rb91VarM95493x == null && rb91VarM95491t == null) {
                            rb91VarM95491t = (rb91) ((uj5) z691Var2.f279806h.f12414b).get(view8);
                        }
                        if ((rb91VarM95493x != null || rb91VarM95491t != null) && z691Var3.mo30250A(rb91Var10, rb91VarM95491t)) {
                            z691 z691VarM95492u = z691Var3.m95492u();
                            ArrayList arrayList4 = z691Var3.f279782L0;
                            if (z691VarM95492u.f279795X0 != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                uj5VarM95482v.m25313g(i5);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(z691Var3);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                uj5VarM95482v.m25313g(i5);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                z691Var = (z691) arrayList2.get(i6);
                z691Var.m95484D(z691Var, mjr0.f144318d, false);
                if (!z691Var.f279786P0) {
                    z691Var.f279786P0 = true;
                    z691Var.m95484D(z691Var, mjr0.f144317c, false);
                }
            }
            z691Var2.mo55896q(viewGroup, z691Var2.f279805g, z691Var2.f279806h, z691Var2.f279794X, z691Var2.f279796Y);
            if (z691Var2.f279795X0 == null) {
                z691Var2.mo55877J();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            z691Var2.mo55873F();
            z691Var2.f279795X0.m80155k();
            z691Var2.f279795X0.m80156l();
            return true;
        }
        arrayList3 = new ArrayList();
        uj5VarM66423c.put(viewGroup, arrayList3);
        arrayList3.add(z691Var2);
        z691Var2.m95486b(new m891(this, uj5VarM66423c));
        i = 0;
        z691Var2.m95488j(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((z691) it.next()).mo55876I(viewGroup);
            }
        }
        z691Var2.f279794X = new ArrayList();
        z691Var2.f279796Y = new ArrayList();
        a531Var = z691Var2.f279805g;
        a531Var2 = z691Var2.f279806h;
        uj5Var = new uj5((uj5) a531Var.f12414b);
        uj5Var2 = new uj5((uj5) a531Var2.f12414b);
        i2 = 0;
        while (true) {
            iArr = z691Var2.f279808t;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i7 = iArr[i2];
            if (i7 != z3) {
                a531Var3 = a531Var2;
                z2 = z3;
                while (i8 >= 0) {
                    view = (View) uj5Var.m25312f(i8);
                    if (view == null) {
                    }
                }
            } else if (i7 != 2) {
                a531Var3 = a531Var2;
                z2 = z3;
                uj5Var3 = (uj5) a531Var.f12417e;
                uj5 uj5Var5 = (uj5) a531Var3.f12417e;
                i9 = uj5Var3.f13976c;
                while (i10 < i9) {
                    view2 = (View) uj5Var3.m25315i(i10);
                    if (view2 == null) {
                    }
                }
            } else if (i7 != 3) {
                z2 = z3;
                sparseArray = (SparseArray) a531Var.f12415c;
                a531Var3 = a531Var2;
                SparseArray sparseArray3 = (SparseArray) a531Var3.f12415c;
                size = sparseArray.size();
                while (i11 < size) {
                    view4 = (View) sparseArray.valueAt(i11);
                    if (view4 == null) {
                    }
                }
            } else if (i7 != 4) {
                a531Var3 = a531Var2;
                z2 = z3;
            } else {
                w2b0Var = (w2b0) a531Var.f12416d;
                w2b0 w2b0Var3 = (w2b0) a531Var2.f12416d;
                iM87072i = w2b0Var.m87072i();
                i12 = i;
                while (i12 < iM87072i) {
                    view6 = (View) w2b0Var.m87073j(i12);
                    if (view6 == null) {
                        a531Var4 = a531Var2;
                    } else {
                        a531Var4 = a531Var2;
                    }
                    i12++;
                    a531Var2 = a531Var4;
                    z3 = z3;
                }
                z2 = z3;
                a531Var3 = a531Var2;
            }
            i2++;
            a531Var2 = a531Var3;
            z3 = z2;
            i = 0;
        }
        z = z3;
        while (i3 < uj5Var.f13976c) {
            rb91Var2 = (rb91) uj5Var.m25315i(i3);
            if (z691Var2.m95483B(rb91Var2.f197534b)) {
                z691Var2.f279794X.add(rb91Var2);
                z691Var2.f279796Y.add(null);
            }
        }
        while (i4 < uj5Var2.f13976c) {
            rb91Var = (rb91) uj5Var2.m25315i(i4);
            if (z691Var2.m95483B(rb91Var.f197534b)) {
                z691Var2.f279796Y.add(rb91Var);
                z691Var2.f279794X.add(null);
            }
        }
        uj5VarM95482v = z691.m95482v();
        int i14 = uj5VarM95482v.f13976c;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i5 = i14 - 1;
        while (i5 >= 0) {
            animator = (Animator) uj5VarM95482v.m25312f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        while (i6 < arrayList2.size()) {
            z691Var = (z691) arrayList2.get(i6);
            z691Var.m95484D(z691Var, mjr0.f144318d, false);
            if (!z691Var.f279786P0) {
                z691Var.f279786P0 = true;
                z691Var.m95484D(z691Var, mjr0.f144317c, false);
            }
        }
        z691Var2.mo55896q(viewGroup, z691Var2.f279805g, z691Var2.f279806h, z691Var2.f279794X, z691Var2.f279796Y);
        if (z691Var2.f279795X0 == null) {
            z691Var2.mo55877J();
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        z691Var2.mo55873F();
        z691Var2.f279795X0.m80155k();
        z691Var2.f279795X0.m80156l();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f151484b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        o891.f162744c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) o891.m66423c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((z691) it.next()).mo55876I(viewGroup);
            }
        }
        this.f151483a.m95489k(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
