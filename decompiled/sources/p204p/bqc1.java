package p204p;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class bqc1 extends z691 {

    /* JADX INFO: renamed from: e1 */
    public static final String[] f29786e1 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: d1 */
    public int f29787d1 = 3;

    /* JADX INFO: renamed from: T */
    public static void m30248T(rb91 rb91Var) {
        View view = rb91Var.f197534b;
        int visibility = view.getVisibility();
        HashMap map = rb91Var.f197533a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: U */
    public static zpc1 m30249U(rb91 rb91Var, rb91 rb91Var2) {
        zpc1 zpc1Var = new zpc1();
        zpc1Var.f285100a = false;
        zpc1Var.f285101b = false;
        if (rb91Var != null) {
            HashMap map = rb91Var.f197533a;
            if (map.containsKey("android:visibility:visibility")) {
                zpc1Var.f285102c = ((Integer) map.get("android:visibility:visibility")).intValue();
                zpc1Var.f285104e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                zpc1Var.f285102c = -1;
                zpc1Var.f285104e = null;
            }
        } else {
            zpc1Var.f285102c = -1;
            zpc1Var.f285104e = null;
        }
        if (rb91Var2 != null) {
            HashMap map2 = rb91Var2.f197533a;
            if (map2.containsKey("android:visibility:visibility")) {
                zpc1Var.f285103d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                zpc1Var.f285105f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                zpc1Var.f285103d = -1;
                zpc1Var.f285105f = null;
            }
        } else {
            zpc1Var.f285103d = -1;
            zpc1Var.f285105f = null;
        }
        if (rb91Var != null && rb91Var2 != null) {
            int i = zpc1Var.f285102c;
            int i2 = zpc1Var.f285103d;
            if (i != i2 || zpc1Var.f285104e != zpc1Var.f285105f) {
                if (i != i2) {
                    if (i == 0) {
                        zpc1Var.f285101b = false;
                        zpc1Var.f285100a = true;
                        return zpc1Var;
                    }
                    if (i2 == 0) {
                        zpc1Var.f285101b = true;
                        zpc1Var.f285100a = true;
                        return zpc1Var;
                    }
                } else {
                    if (zpc1Var.f285105f == null) {
                        zpc1Var.f285101b = false;
                        zpc1Var.f285100a = true;
                        return zpc1Var;
                    }
                    if (zpc1Var.f285104e == null) {
                        zpc1Var.f285101b = true;
                        zpc1Var.f285100a = true;
                        return zpc1Var;
                    }
                }
            }
        } else {
            if (rb91Var == null && zpc1Var.f285103d == 0) {
                zpc1Var.f285101b = true;
                zpc1Var.f285100a = true;
                return zpc1Var;
            }
            if (rb91Var2 == null && zpc1Var.f285102c == 0) {
                zpc1Var.f285101b = false;
                zpc1Var.f285100a = true;
            }
        }
        return zpc1Var;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: A */
    public final boolean mo30250A(rb91 rb91Var, rb91 rb91Var2) {
        if (rb91Var == null && rb91Var2 == null) {
            return false;
        }
        if (rb91Var != null && rb91Var2 != null && rb91Var2.f197533a.containsKey("android:visibility:visibility") != rb91Var.f197533a.containsKey("android:visibility:visibility")) {
            return false;
        }
        zpc1 zpc1VarM30249U = m30249U(rb91Var, rb91Var2);
        if (zpc1VarM30249U.f285100a) {
            return zpc1VarM30249U.f285102c == 0 || zpc1VarM30249U.f285103d == 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public abstract ObjectAnimator mo26145V(ViewGroup viewGroup, View view, rb91 rb91Var, rb91 rb91Var2);

    /* JADX INFO: renamed from: W */
    public abstract ObjectAnimator mo26146W(ViewGroup viewGroup, View view, rb91 rb91Var, rb91 rb91Var2);

    @Override // p204p.z691
    /* JADX INFO: renamed from: e */
    public void mo26147e(rb91 rb91Var) {
        m30248T(rb91Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (m30249U(m95491t(r1, false), m95493x(r1, false)).f285100a != false) goto L77;
     */
    @Override // p204p.z691
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo30251m(ViewGroup viewGroup, rb91 rb91Var, rb91 rb91Var2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        zpc1 zpc1VarM30249U = m30249U(rb91Var, rb91Var2);
        if (zpc1VarM30249U.f285100a && (zpc1VarM30249U.f285104e != null || zpc1VarM30249U.f285105f != null)) {
            if (!zpc1VarM30249U.f285101b) {
                int i = zpc1VarM30249U.f285103d;
                if ((this.f29787d1 & 2) == 2 && rb91Var != null) {
                    View view3 = rb91Var.f197534b;
                    View viewM72488a = rb91Var2 != null ? rb91Var2.f197534b : null;
                    View view4 = (View) view3.getTag(R.id.save_overlay_view);
                    if (view4 != null) {
                        view2 = null;
                        z2 = true;
                    } else {
                        if (viewM72488a == null || viewM72488a.getParent() == null) {
                            if (viewM72488a != null) {
                                view = null;
                                z = false;
                            } else {
                                viewM72488a = null;
                                view = null;
                                z = true;
                            }
                        } else if (i == 4 || view3 == viewM72488a) {
                            z = false;
                            view = viewM72488a;
                            viewM72488a = null;
                        } else {
                            viewM72488a = null;
                            view = null;
                            z = true;
                        }
                        if (!z) {
                            View view5 = view;
                            view4 = viewM72488a;
                            view2 = view5;
                            z2 = false;
                        } else if (view3.getParent() == null) {
                            z2 = false;
                            view2 = view;
                            view4 = view3;
                        } else {
                            if (view3.getParent() instanceof View) {
                                View view6 = (View) view3.getParent();
                                if (m30249U(m95493x(view6, true), m95491t(view6, true)).f285100a) {
                                    int id = view6.getId();
                                    if (view6.getParent() == null && id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                } else {
                                    viewM72488a = qb91.m72488a(viewGroup, view3, view6);
                                }
                            }
                            View view7 = view;
                            view4 = viewM72488a;
                            view2 = view7;
                            z2 = false;
                        }
                    }
                    if (view4 != null) {
                        if (!z2) {
                            int[] iArr = (int[]) rb91Var.f197533a.get("android:visibility:screenLocation");
                            int i2 = iArr[0];
                            int i3 = iArr[1];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view4.offsetLeftAndRight((i2 - iArr2[0]) - view4.getLeft());
                            view4.offsetTopAndBottom((i3 - iArr2[1]) - view4.getTop());
                            mec1.m61550b(view4, viewGroup);
                        }
                        ObjectAnimator objectAnimatorMo26146W = mo26146W(viewGroup, view4, rb91Var, rb91Var2);
                        if (!z2) {
                            if (objectAnimatorMo26146W == null) {
                                viewGroup.getOverlay().remove(view4);
                                return objectAnimatorMo26146W;
                            }
                            view3.setTag(R.id.save_overlay_view, view4);
                            ypc1 ypc1Var = new ypc1(this, viewGroup, view4, view3);
                            objectAnimatorMo26146W.addListener(ypc1Var);
                            objectAnimatorMo26146W.addPauseListener(ypc1Var);
                            m95492u().m95486b(ypc1Var);
                        }
                        return objectAnimatorMo26146W;
                    }
                    if (view2 != null) {
                        int visibility = view2.getVisibility();
                        bpc1.m30115b(view2, 0);
                        ObjectAnimator objectAnimatorMo26146W2 = mo26146W(viewGroup, view2, rb91Var, rb91Var2);
                        if (objectAnimatorMo26146W2 == null) {
                            bpc1.m30115b(view2, visibility);
                            return objectAnimatorMo26146W2;
                        }
                        xpc1 xpc1Var = new xpc1(view2, i);
                        objectAnimatorMo26146W2.addListener(xpc1Var);
                        m95492u().m95486b(xpc1Var);
                        return objectAnimatorMo26146W2;
                    }
                }
            } else if ((this.f29787d1 & 1) == 1 && rb91Var2 != null) {
                View view8 = rb91Var2.f197534b;
                if (rb91Var == null) {
                    View view9 = (View) view8.getParent();
                }
                return mo26145V(viewGroup, view8, rb91Var, rb91Var2);
            }
        }
        return null;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: w */
    public final String[] mo30252w() {
        return f29786e1;
    }
}
