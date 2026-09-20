package p204p;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class vky0 extends sjv0 {

    /* JADX INFO: renamed from: X */
    public boolean f242315X;

    /* JADX INFO: renamed from: Y */
    public boolean f242316Y;

    /* JADX INFO: renamed from: a */
    public prh f242317a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f242318b;

    /* JADX INFO: renamed from: c */
    public final hj30 f242319c;

    /* JADX INFO: renamed from: d */
    public final LinearLayoutManager f242320d;

    /* JADX INFO: renamed from: e */
    public int f242321e;

    /* JADX INFO: renamed from: f */
    public int f242322f;

    /* JADX INFO: renamed from: g */
    public final uky0 f242323g;

    /* JADX INFO: renamed from: h */
    public int f242324h;

    /* JADX INFO: renamed from: i */
    public int f242325i;

    /* JADX INFO: renamed from: t */
    public boolean f242326t;

    public vky0(ViewPager2 viewPager2) {
        this.f242318b = viewPager2;
        hj30 hj30Var = viewPager2.f1400t;
        this.f242319c = hj30Var;
        this.f242320d = (LinearLayoutManager) hj30Var.getLayoutManager();
        this.f242323g = new uky0();
        m85939n();
    }

    @Override // p204p.sjv0
    /* JADX INFO: renamed from: a */
    public final void mo35393a(RecyclerView recyclerView, int i) {
        prh prhVar;
        prh prhVar2;
        int i2 = this.f242321e;
        if (!(i2 == 1 && this.f242322f == 1) && i == 1) {
            this.f242321e = 1;
            int i3 = this.f242325i;
            if (i3 != -1) {
                this.f242324h = i3;
                this.f242325i = -1;
            } else if (this.f242324h == -1) {
                this.f242324h = this.f242320d.m939g1();
            }
            m85934g(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f242315X) {
                m85934g(2);
                this.f242326t = true;
                return;
            }
            return;
        }
        uky0 uky0Var = this.f242323g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m85941p();
            if (!this.f242315X) {
                int i4 = uky0Var.f231390b;
                if (i4 != -1 && (prhVar2 = this.f242317a) != null) {
                    prhVar2.mo26275b(i4, 0, 0.0f);
                }
            } else if (uky0Var.f231391c == 0) {
                int i5 = this.f242324h;
                int i6 = uky0Var.f231390b;
                if (i5 != i6 && (prhVar = this.f242317a) != null) {
                    prhVar.mo26276c(i6);
                }
            }
            m85934g(0);
            m85939n();
        }
        if (this.f242321e == 2 && i == 0 && this.f242316Y) {
            m85941p();
            if (uky0Var.f231391c == 0) {
                int i7 = this.f242325i;
                int i8 = uky0Var.f231390b;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    prh prhVar3 = this.f242317a;
                    if (prhVar3 != null) {
                        prhVar3.mo26276c(i8);
                    }
                }
                m85934g(0);
                m85939n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // p204p.sjv0
    /* JADX INFO: renamed from: f */
    public final void mo35394f(RecyclerView recyclerView, int i, int i2) {
        int i3;
        prh prhVar;
        this.f242315X = true;
        m85941p();
        boolean z = this.f242326t;
        uky0 uky0Var = this.f242323g;
        if (z) {
            this.f242326t = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.f242318b.f1397g.m1106S() == 1)) {
                        if (uky0Var.f231391c != 0) {
                            i3 = uky0Var.f231390b + 1;
                        }
                    }
                }
                i3 = uky0Var.f231390b;
            } else if (uky0Var.f231391c != 0) {
                i3 = uky0Var.f231390b + 1;
            } else {
                i3 = uky0Var.f231390b;
            }
            this.f242325i = i3;
            if (this.f242324h != i3 && (prhVar = this.f242317a) != null) {
                prhVar.mo26276c(i3);
            }
        } else if (this.f242321e == 0) {
            int i4 = uky0Var.f231390b;
            if (i4 == -1) {
                i4 = 0;
            }
            prh prhVar2 = this.f242317a;
            if (prhVar2 != null) {
                prhVar2.mo26276c(i4);
            }
        }
        int i5 = uky0Var.f231390b;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = uky0Var.f231389a;
        int i6 = uky0Var.f231391c;
        prh prhVar3 = this.f242317a;
        if (prhVar3 != null) {
            prhVar3.mo26275b(i5, i6, f);
        }
        int i7 = uky0Var.f231390b;
        int i8 = this.f242325i;
        if ((i7 == i8 || i8 == -1) && uky0Var.f231391c == 0 && this.f242322f != 1) {
            m85934g(0);
            m85939n();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m85934g(int i) {
        if ((this.f242321e == 3 && this.f242322f == 0) || this.f242322f == i) {
            return;
        }
        this.f242322f = i;
        prh prhVar = this.f242317a;
        if (prhVar != null) {
            prhVar.mo26274a(i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final double m85935h() {
        m85941p();
        uky0 uky0Var = this.f242323g;
        return ((double) uky0Var.f231390b) + ((double) uky0Var.f231389a);
    }

    /* JADX INFO: renamed from: j */
    public final int m85936j() {
        return this.f242322f;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m85937l() {
        return this.f242322f == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m85938m(int i, boolean z) {
        prh prhVar;
        this.f242321e = z ? 2 : 3;
        boolean z2 = this.f242325i != i;
        this.f242325i = i;
        m85934g(2);
        if (!z2 || (prhVar = this.f242317a) == null) {
            return;
        }
        prhVar.mo26276c(i);
    }

    /* JADX INFO: renamed from: n */
    public final void m85939n() {
        this.f242321e = 0;
        this.f242322f = 0;
        uky0 uky0Var = this.f242323g;
        uky0Var.f231390b = -1;
        uky0Var.f231389a = 0.0f;
        uky0Var.f231391c = 0;
        this.f242324h = -1;
        this.f242325i = -1;
        this.f242326t = false;
        this.f242315X = false;
        this.f242316Y = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m85940o(prh prhVar) {
        this.f242317a = prhVar;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149 A[LOOP:2: B:64:0x013d->B:67:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final void m85941p() {
        int top;
        int iM1097I;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.f242320d;
        int iM939g1 = linearLayoutManager.m939g1();
        uky0 uky0Var = this.f242323g;
        uky0Var.f231390b = iM939g1;
        if (iM939g1 == -1) {
            uky0Var.f231390b = -1;
            uky0Var.f231389a = 0.0f;
            uky0Var.f231391c = 0;
            return;
        }
        View viewMo923D = linearLayoutManager.mo923D(iM939g1);
        if (viewMo923D == null) {
            uky0Var.f231390b = -1;
            uky0Var.f231389a = 0.0f;
            uky0Var.f231391c = 0;
            return;
        }
        int i3 = ((ojv0) viewMo923D.getLayoutParams()).f166148b.left;
        int i4 = ((ojv0) viewMo923D.getLayoutParams()).f166148b.right;
        int i5 = ((ojv0) viewMo923D.getLayoutParams()).f166148b.top;
        int i6 = ((ojv0) viewMo923D.getLayoutParams()).f166148b.bottom;
        ViewGroup.LayoutParams layoutParams = viewMo923D.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewMo923D.getHeight() + i5 + i6;
        int width = viewMo923D.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.f1163O0;
        hj30 hj30Var = this.f242319c;
        if (i7 == 0) {
            top = (viewMo923D.getLeft() - i3) - hj30Var.getPaddingLeft();
            if (this.f242318b.f1397g.m1106S() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewMo923D.getTop() - i5) - hj30Var.getPaddingTop();
        }
        int i8 = -top;
        uky0Var.f231391c = i8;
        if (i8 >= 0) {
            uky0Var.f231389a = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int iM1097I2 = linearLayoutManager.m1097I();
        if (iM1097I2 != 0) {
            boolean z = linearLayoutManager.f1163O0 == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM1097I2, 2);
            for (int i9 = 0; i9 < iM1097I2; i9++) {
                View viewM1096H = linearLayoutManager.m1096H(i9);
                if (viewM1096H == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewM1096H.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : tw4.f224309a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewM1096H.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewM1096H.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewM1096H.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewM1096H.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new ecb(17));
            int i10 = 1;
            while (true) {
                if (i10 >= iM1097I2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[iM1097I2 - 1][1] >= i13) {
                        if (linearLayoutManager.m1097I() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                iM1097I = linearLayoutManager.m1097I();
                for (int i14 = 0; i14 < iM1097I; i14++) {
                    if (!tw4.m81626a(linearLayoutManager.m1096H(i14))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.m1097I() <= 1) {
            iM1097I = linearLayoutManager.m1097I();
            while (i14 < iM1097I) {
                if (!tw4.m81626a(linearLayoutManager.m1096H(i14))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(s571.m77246e(uky0Var.f231391c, "Page can only be offset by a positive amount, not by "));
    }
}
