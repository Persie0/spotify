package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p204p.C2449ud;
import p204p.b2u0;
import p204p.c7j;
import p204p.c8j;
import p204p.f6j;
import p204p.h6j;
import p204p.i6j;
import p204p.jq20;
import p204p.ka20;
import p204p.kl80;
import p204p.qd11;
import p204p.u7j;
import p204p.v7j;
import p204p.w7j;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: Q0 */
    public static qd11 f727Q0;

    /* JADX INFO: renamed from: L0 */
    public C2449ud f728L0;

    /* JADX INFO: renamed from: M0 */
    public int f729M0;

    /* JADX INFO: renamed from: N0 */
    public HashMap f730N0;

    /* JADX INFO: renamed from: O0 */
    public final SparseArray f731O0;

    /* JADX INFO: renamed from: P0 */
    public final i6j f732P0;

    /* JADX INFO: renamed from: a */
    public final SparseArray f733a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f734b;

    /* JADX INFO: renamed from: c */
    public final w7j f735c;

    /* JADX INFO: renamed from: d */
    public int f736d;

    /* JADX INFO: renamed from: e */
    public int f737e;

    /* JADX INFO: renamed from: f */
    public int f738f;

    /* JADX INFO: renamed from: g */
    public int f739g;

    /* JADX INFO: renamed from: h */
    public boolean f740h;

    /* JADX INFO: renamed from: i */
    public int f741i;

    /* JADX INFO: renamed from: t */
    public c7j f742t;

    public ConstraintLayout(Context context) {
        super(context);
        this.f733a = new SparseArray();
        this.f734b = new ArrayList(4);
        this.f735c = new w7j();
        this.f736d = 0;
        this.f737e = 0;
        this.f738f = Alert.DURATION_SHOW_INDEFINITELY;
        this.f739g = Alert.DURATION_SHOW_INDEFINITELY;
        this.f740h = true;
        this.f741i = 257;
        this.f742t = null;
        this.f728L0 = null;
        this.f729M0 = -1;
        this.f730N0 = new HashMap();
        this.f731O0 = new SparseArray();
        this.f732P0 = new i6j(this, this);
        m358q(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static qd11 getSharedValues() {
        if (f727Q0 == null) {
            f727Q0 = new qd11();
        }
        return f727Q0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX INFO: renamed from: b */
    public final void m354b(boolean z, View view, v7j v7jVar, h6j h6jVar, SparseArray sparseArray) {
        ConstraintLayout constraintLayout;
        int i;
        v7j v7jVar2;
        int i2;
        int i3;
        int i4;
        v7j v7jVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        v7j v7jVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        v7j v7jVar5;
        int i14;
        int i15;
        h6j h6jVar2;
        int i16;
        int i17;
        v7j v7jVar6;
        int i18;
        float f;
        v7j v7jVar7;
        v7j v7jVar8;
        v7j v7jVar9;
        int i19;
        v7j v7jVar10 = v7jVar;
        h6jVar.m46730a();
        v7jVar10.f238243i0 = view.getVisibility();
        v7jVar10.f238241h0 = view;
        if (view instanceof f6j) {
            constraintLayout = this;
            ((f6j) view).mo314k(v7jVar10, constraintLayout.f735c.f248713z0);
        } else {
            constraintLayout = this;
        }
        if (h6jVar.f88136d0) {
            ka20 ka20Var = (ka20) v7jVar10;
            int i20 = h6jVar.f88154m0;
            int i21 = h6jVar.f88156n0;
            float f2 = h6jVar.f88158o0;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    ka20Var.f120760u0 = f2;
                    ka20Var.f120761v0 = -1;
                    ka20Var.f120762w0 = -1;
                    return;
                }
                return;
            }
            if (i20 != -1) {
                if (i20 > -1) {
                    ka20Var.f120760u0 = -1.0f;
                    ka20Var.f120761v0 = i20;
                    ka20Var.f120762w0 = -1;
                    return;
                }
                return;
            }
            if (i21 == -1 || i21 <= -1) {
                return;
            }
            ka20Var.f120760u0 = -1.0f;
            ka20Var.f120761v0 = -1;
            ka20Var.f120762w0 = i21;
            return;
        }
        int i22 = h6jVar.f88140f0;
        int i23 = h6jVar.f88142g0;
        int i24 = h6jVar.f88144h0;
        int i25 = h6jVar.f88146i0;
        int i26 = h6jVar.f88148j0;
        int i27 = h6jVar.f88150k0;
        float f3 = h6jVar.f88152l0;
        int i28 = h6jVar.f88159p;
        if (i28 != -1) {
            v7j v7jVar11 = (v7j) sparseArray.get(i28);
            if (v7jVar11 != null) {
                float f4 = h6jVar.f88162r;
                v7jVar.m84891x(7, 7, h6jVar.f88161q, 0, v7jVar11);
                v7jVar10 = v7jVar;
                v7jVar10.f238204E = f4;
            }
            v7jVar6 = v7jVar10;
            h6jVar2 = h6jVar;
            i5 = 4;
            i4 = 2;
            i18 = 5;
            i12 = 3;
        } else {
            if (i22 != -1) {
                v7j v7jVar12 = (v7j) sparseArray.get(i22);
                if (v7jVar12 != null) {
                    i = 2;
                    v7jVar10.m84891x(2, 2, ((ViewGroup.MarginLayoutParams) h6jVar).leftMargin, i26, v7jVar12);
                } else {
                    i = 2;
                }
            } else {
                i = 2;
                if (i23 != -1 && (v7jVar2 = (v7j) sparseArray.get(i23)) != null) {
                    v7jVar.m84891x(2, 4, ((ViewGroup.MarginLayoutParams) h6jVar).leftMargin, i26, v7jVar2);
                    i2 = 2;
                    i3 = 4;
                }
                if (i24 != -1) {
                    v7jVar9 = (v7j) sparseArray.get(i24);
                    if (v7jVar9 != null) {
                        v7jVar.m84891x(i3, i2, ((ViewGroup.MarginLayoutParams) h6jVar).rightMargin, i27, v7jVar9);
                    }
                    i4 = i2;
                } else {
                    i4 = i2;
                    if (i25 != -1 && (v7jVar3 = (v7j) sparseArray.get(i25)) != null) {
                        v7jVar.m84891x(i3, i3, ((ViewGroup.MarginLayoutParams) h6jVar).rightMargin, i27, v7jVar3);
                    }
                }
                i5 = i3;
                i6 = h6jVar.f88145i;
                if (i6 != -1) {
                    v7jVar8 = (v7j) sparseArray.get(i6);
                    if (v7jVar8 != null) {
                        i7 = 3;
                        v7jVar.m84891x(3, 3, ((ViewGroup.MarginLayoutParams) h6jVar).topMargin, h6jVar.f88168x, v7jVar8);
                    } else {
                        i7 = 3;
                    }
                } else {
                    i7 = 3;
                    i8 = h6jVar.f88147j;
                    if (i8 == -1 && (v7jVar4 = (v7j) sparseArray.get(i8)) != null) {
                        v7jVar.m84891x(3, 5, ((ViewGroup.MarginLayoutParams) h6jVar).topMargin, h6jVar.f88168x, v7jVar4);
                        i9 = 3;
                        i10 = 5;
                    }
                    i11 = h6jVar.f88149k;
                    if (i11 != -1) {
                        v7jVar7 = (v7j) sparseArray.get(i11);
                        if (v7jVar7 != null) {
                            v7jVar.m84891x(i10, i9, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin, h6jVar.f88170z, v7jVar7);
                        }
                        i12 = i9;
                    } else {
                        i12 = i9;
                        i13 = h6jVar.f88151l;
                        if (i13 != -1 && (v7jVar5 = (v7j) sparseArray.get(i13)) != null) {
                            v7jVar.m84891x(i10, i10, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin, h6jVar.f88170z, v7jVar5);
                        }
                    }
                    i14 = i10;
                    i15 = h6jVar.f88153m;
                    if (i15 != -1) {
                        h6jVar2 = h6jVar;
                        constraintLayout.m362w(v7jVar, h6jVar2, sparseArray, i15, 6);
                    } else {
                        h6jVar2 = h6jVar;
                        i16 = h6jVar2.f88155n;
                        if (i16 != -1) {
                            m362w(v7jVar, h6jVar2, sparseArray, i16, i12);
                        } else {
                            i17 = h6jVar2.f88157o;
                            if (i17 != -1) {
                                m362w(v7jVar, h6jVar2, sparseArray, i17, i14);
                                v7jVar6 = v7jVar;
                                i18 = i14;
                            }
                            if (f3 >= 0.0f) {
                                v7jVar6.f238237f0 = f3;
                            }
                            f = h6jVar2.f88108F;
                            if (f >= 0.0f) {
                                v7jVar6.f238239g0 = f;
                            }
                        }
                    }
                    v7jVar6 = v7jVar;
                    i18 = i14;
                    if (f3 >= 0.0f) {
                        v7jVar6.f238237f0 = f3;
                    }
                    f = h6jVar2.f88108F;
                    if (f >= 0.0f) {
                        v7jVar6.f238239g0 = f;
                    }
                }
                i9 = i7;
                i10 = 5;
                i11 = h6jVar.f88149k;
                if (i11 != -1) {
                    v7jVar7 = (v7j) sparseArray.get(i11);
                    if (v7jVar7 != null) {
                        v7jVar.m84891x(i10, i9, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin, h6jVar.f88170z, v7jVar7);
                    }
                    i12 = i9;
                } else {
                    i12 = i9;
                    i13 = h6jVar.f88151l;
                    if (i13 != -1) {
                        v7jVar.m84891x(i10, i10, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin, h6jVar.f88170z, v7jVar5);
                    }
                }
                i14 = i10;
                i15 = h6jVar.f88153m;
                if (i15 != -1) {
                    h6jVar2 = h6jVar;
                    constraintLayout.m362w(v7jVar, h6jVar2, sparseArray, i15, 6);
                } else {
                    h6jVar2 = h6jVar;
                    i16 = h6jVar2.f88155n;
                    if (i16 != -1) {
                        m362w(v7jVar, h6jVar2, sparseArray, i16, i12);
                    } else {
                        i17 = h6jVar2.f88157o;
                        if (i17 != -1) {
                            m362w(v7jVar, h6jVar2, sparseArray, i17, i14);
                            v7jVar6 = v7jVar;
                            i18 = i14;
                        }
                        if (f3 >= 0.0f) {
                            v7jVar6.f238237f0 = f3;
                        }
                        f = h6jVar2.f88108F;
                        if (f >= 0.0f) {
                            v7jVar6.f238239g0 = f;
                        }
                    }
                }
                v7jVar6 = v7jVar;
                i18 = i14;
                if (f3 >= 0.0f) {
                    v7jVar6.f238237f0 = f3;
                }
                f = h6jVar2.f88108F;
                if (f >= 0.0f) {
                    v7jVar6.f238239g0 = f;
                }
            }
            i2 = i;
            i3 = 4;
            if (i24 != -1) {
                v7jVar9 = (v7j) sparseArray.get(i24);
                if (v7jVar9 != null) {
                    v7jVar.m84891x(i3, i2, ((ViewGroup.MarginLayoutParams) h6jVar).rightMargin, i27, v7jVar9);
                }
                i4 = i2;
            } else {
                i4 = i2;
                if (i25 != -1) {
                    v7jVar.m84891x(i3, i3, ((ViewGroup.MarginLayoutParams) h6jVar).rightMargin, i27, v7jVar3);
                }
            }
            i5 = i3;
            i6 = h6jVar.f88145i;
            if (i6 != -1) {
                v7jVar8 = (v7j) sparseArray.get(i6);
                if (v7jVar8 != null) {
                    i7 = 3;
                    v7jVar.m84891x(3, 3, ((ViewGroup.MarginLayoutParams) h6jVar).topMargin, h6jVar.f88168x, v7jVar8);
                } else {
                    i7 = 3;
                }
            } else {
                i7 = 3;
                i8 = h6jVar.f88147j;
                if (i8 == -1) {
                }
                i11 = h6jVar.f88149k;
                if (i11 != -1) {
                    v7jVar7 = (v7j) sparseArray.get(i11);
                    if (v7jVar7 != null) {
                        v7jVar.m84891x(i10, i9, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin, h6jVar.f88170z, v7jVar7);
                    }
                    i12 = i9;
                } else {
                    i12 = i9;
                    i13 = h6jVar.f88151l;
                    if (i13 != -1) {
                        v7jVar.m84891x(i10, i10, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin, h6jVar.f88170z, v7jVar5);
                    }
                }
                i14 = i10;
                i15 = h6jVar.f88153m;
                if (i15 != -1) {
                    h6jVar2 = h6jVar;
                    constraintLayout.m362w(v7jVar, h6jVar2, sparseArray, i15, 6);
                } else {
                    h6jVar2 = h6jVar;
                    i16 = h6jVar2.f88155n;
                    if (i16 != -1) {
                        m362w(v7jVar, h6jVar2, sparseArray, i16, i12);
                    } else {
                        i17 = h6jVar2.f88157o;
                        if (i17 != -1) {
                            m362w(v7jVar, h6jVar2, sparseArray, i17, i14);
                            v7jVar6 = v7jVar;
                            i18 = i14;
                        }
                        if (f3 >= 0.0f) {
                            v7jVar6.f238237f0 = f3;
                        }
                        f = h6jVar2.f88108F;
                        if (f >= 0.0f) {
                            v7jVar6.f238239g0 = f;
                        }
                    }
                }
                v7jVar6 = v7jVar;
                i18 = i14;
                if (f3 >= 0.0f) {
                    v7jVar6.f238237f0 = f3;
                }
                f = h6jVar2.f88108F;
                if (f >= 0.0f) {
                    v7jVar6.f238239g0 = f;
                }
            }
            i9 = i7;
            i10 = 5;
            i11 = h6jVar.f88149k;
            if (i11 != -1) {
                v7jVar7 = (v7j) sparseArray.get(i11);
                if (v7jVar7 != null) {
                    v7jVar.m84891x(i10, i9, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin, h6jVar.f88170z, v7jVar7);
                }
                i12 = i9;
            } else {
                i12 = i9;
                i13 = h6jVar.f88151l;
                if (i13 != -1) {
                    v7jVar.m84891x(i10, i10, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin, h6jVar.f88170z, v7jVar5);
                }
            }
            i14 = i10;
            i15 = h6jVar.f88153m;
            if (i15 != -1) {
                h6jVar2 = h6jVar;
                constraintLayout.m362w(v7jVar, h6jVar2, sparseArray, i15, 6);
            } else {
                h6jVar2 = h6jVar;
                i16 = h6jVar2.f88155n;
                if (i16 != -1) {
                    m362w(v7jVar, h6jVar2, sparseArray, i16, i12);
                } else {
                    i17 = h6jVar2.f88157o;
                    if (i17 != -1) {
                        m362w(v7jVar, h6jVar2, sparseArray, i17, i14);
                        v7jVar6 = v7jVar;
                        i18 = i14;
                    }
                    if (f3 >= 0.0f) {
                        v7jVar6.f238237f0 = f3;
                    }
                    f = h6jVar2.f88108F;
                    if (f >= 0.0f) {
                        v7jVar6.f238239g0 = f;
                    }
                }
            }
            v7jVar6 = v7jVar;
            i18 = i14;
            if (f3 >= 0.0f) {
                v7jVar6.f238237f0 = f3;
            }
            f = h6jVar2.f88108F;
            if (f >= 0.0f) {
                v7jVar6.f238239g0 = f;
            }
        }
        if (z && ((i19 = h6jVar2.f88122T) != -1 || h6jVar2.f88123U != -1)) {
            int i29 = h6jVar2.f88123U;
            v7jVar6.f238227a0 = i19;
            v7jVar6.f238229b0 = i29;
        }
        boolean z2 = h6jVar2.f88130a0;
        u7j u7jVar = u7j.f227711b;
        u7j u7jVar2 = u7j.f227710a;
        u7j u7jVar3 = u7j.f227713d;
        u7j u7jVar4 = u7j.f227712c;
        if (z2) {
            v7jVar6.m84868P(u7jVar2);
            v7jVar6.m84872T(((ViewGroup.MarginLayoutParams) h6jVar2).width);
            if (((ViewGroup.MarginLayoutParams) h6jVar2).width == -2) {
                v7jVar6.m84868P(u7jVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) h6jVar2).width == -1) {
            if (h6jVar2.f88125W) {
                v7jVar6.m84868P(u7jVar4);
            } else {
                v7jVar6.m84868P(u7jVar3);
            }
            v7jVar6.mo55866k(i4).f34552g = ((ViewGroup.MarginLayoutParams) h6jVar2).leftMargin;
            v7jVar6.mo55866k(i5).f34552g = ((ViewGroup.MarginLayoutParams) h6jVar2).rightMargin;
        } else {
            v7jVar6.m84868P(u7jVar4);
            v7jVar6.m84872T(0);
        }
        if (h6jVar2.f88132b0) {
            v7jVar6.m84870R(u7jVar2);
            v7jVar6.m84867O(((ViewGroup.MarginLayoutParams) h6jVar2).height);
            if (((ViewGroup.MarginLayoutParams) h6jVar2).height == -2) {
                v7jVar6.m84870R(u7jVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) h6jVar2).height == -1) {
            if (h6jVar2.f88126X) {
                v7jVar6.m84870R(u7jVar4);
            } else {
                v7jVar6.m84870R(u7jVar3);
            }
            v7jVar6.mo55866k(i12).f34552g = ((ViewGroup.MarginLayoutParams) h6jVar2).topMargin;
            v7jVar6.mo55866k(i18).f34552g = ((ViewGroup.MarginLayoutParams) h6jVar2).bottomMargin;
        } else {
            v7jVar6.m84870R(u7jVar4);
            v7jVar6.m84867O(0);
        }
        v7jVar6.m84864L(h6jVar2.f88109G);
        float f5 = h6jVar2.f88110H;
        float[] fArr = v7jVar6.f238253n0;
        fArr[0] = f5;
        fArr[1] = h6jVar2.f88111I;
        v7jVar6.f238249l0 = h6jVar2.f88112J;
        v7jVar6.f238251m0 = h6jVar2.f88113K;
        int i30 = h6jVar2.f88128Z;
        if (i30 >= 0 && i30 <= 3) {
            v7jVar6.f238260r = i30;
        }
        v7jVar6.m84869Q(h6jVar2.f88120R, h6jVar2.f88114L, h6jVar2.f88116N, h6jVar2.f88118P);
        v7jVar6.m84871S(h6jVar2.f88121S, h6jVar2.f88115M, h6jVar2.f88117O, h6jVar2.f88119Q);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h6j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f734b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((f6j) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f740h = true;
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f739g;
    }

    public int getMaxWidth() {
        return this.f738f;
    }

    public int getMinHeight() {
        return this.f737e;
    }

    public int getMinWidth() {
        return this.f736d;
    }

    public int getOptimizationLevel() {
        return this.f735c.f248699H0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        w7j w7jVar = this.f735c;
        if (w7jVar.f238246k == null) {
            int id2 = getId();
            if (id2 != -1) {
                w7jVar.f238246k = getContext().getResources().getResourceEntryName(id2);
            } else {
                w7jVar.f238246k = "parent";
            }
        }
        if (w7jVar.f238247k0 == null) {
            w7jVar.f238247k0 = w7jVar.f238246k;
        }
        for (v7j v7jVar : w7jVar.m87393Z()) {
            View view = (View) v7jVar.f238241h0;
            if (view != null) {
                if (v7jVar.f238246k == null && (id = view.getId()) != -1) {
                    v7jVar.f238246k = getContext().getResources().getResourceEntryName(id);
                }
                if (v7jVar.f238247k0 == null) {
                    v7jVar.f238247k0 = v7jVar.f238246k;
                }
            }
        }
        w7jVar.mo84885p(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public h6j generateDefaultLayoutParams() {
        return new h6j(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public h6j generateLayoutParams(AttributeSet attributeSet) {
        return new h6j(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            h6j h6jVar = (h6j) childAt.getLayoutParams();
            v7j v7jVar = h6jVar.f88160p0;
            if (childAt.getVisibility() != 8 || h6jVar.f88136d0 || h6jVar.f88138e0 || zIsInEditMode) {
                int iM84887t = v7jVar.m84887t();
                int iM84888u = v7jVar.m84888u();
                childAt.layout(iM84887t, iM84888u, v7jVar.m84886s() + iM84887t, v7jVar.m84882m() + iM84888u);
            }
        }
        ArrayList arrayList = this.f734b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((f6j) arrayList.get(i6)).mo364l();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        String str;
        int iM40866g;
        v7j v7jVar;
        boolean z2 = this.f740h;
        this.f740h = z2;
        if (!z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.f740h = true;
                    break;
                }
            }
        }
        boolean zM359r = m359r();
        w7j w7jVar = this.f735c;
        w7jVar.f248713z0 = zM359r;
        if (this.f740h) {
            this.f740h = false;
            int childCount2 = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i4).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (z) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i5 = 0; i5 < childCount3; i5++) {
                    v7j v7jVarM357p = m357p(getChildAt(i5));
                    if (v7jVarM357p != null) {
                        v7jVarM357p.mo84859E();
                    }
                }
                Object obj = null;
                SparseArray sparseArray = this.f733a;
                if (zIsInEditMode) {
                    for (int i6 = 0; i6 < childCount3; i6++) {
                        View childAt = getChildAt(i6);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.f730N0 == null) {
                                    this.f730N0 = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                this.f730N0.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                v7jVar = viewFindViewById == this ? w7jVar : viewFindViewById == null ? null : ((h6j) viewFindViewById.getLayoutParams()).f88160p0;
                            }
                            v7jVar.f238247k0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f729M0 != -1) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        getChildAt(i7).getId();
                    }
                }
                c7j c7jVar = this.f742t;
                if (c7jVar != null) {
                    c7jVar.m31734c(this);
                }
                w7jVar.m87397e0();
                ArrayList arrayList = this.f734b;
                int size = arrayList.size();
                if (size > 0) {
                    int i8 = 0;
                    while (i8 < size) {
                        f6j f6jVar = (f6j) arrayList.get(i8);
                        HashMap map = f6jVar.f66424g;
                        if (f6jVar.isInEditMode()) {
                            f6jVar.setIds(f6jVar.f66422e);
                        }
                        jq20 jq20Var = f6jVar.f66421d;
                        if (jq20Var != null) {
                            jq20Var.f114775v0 = 0;
                            Arrays.fill(jq20Var.f114774u0, obj);
                            for (int i9 = 0; i9 < f6jVar.f66419b; i9++) {
                                int i10 = f6jVar.f66418a[i9];
                                View view = (View) sparseArray.get(i10);
                                if (view == null && (iM40866g = f6jVar.m40866g(this, (str = (String) map.get(Integer.valueOf(i10))))) != 0) {
                                    f6jVar.f66418a[i9] = iM40866g;
                                    map.put(Integer.valueOf(iM40866g), str);
                                    view = (View) sparseArray.get(iM40866g);
                                }
                                if (view != null) {
                                    f6jVar.f66421d.m54027W(m357p(view));
                                }
                            }
                            f6jVar.f66421d.mo54029Y();
                        }
                        i8++;
                        obj = null;
                    }
                }
                for (int i11 = 0; i11 < childCount3; i11++) {
                    getChildAt(i11);
                }
                SparseArray sparseArray2 = this.f731O0;
                sparseArray2.clear();
                sparseArray2.put(0, w7jVar);
                sparseArray2.put(getId(), w7jVar);
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt2 = getChildAt(i12);
                    sparseArray2.put(childAt2.getId(), m357p(childAt2));
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    v7j v7jVarM357p2 = m357p(childAt3);
                    if (v7jVarM357p2 != null) {
                        h6j h6jVar = (h6j) childAt3.getLayoutParams();
                        w7jVar.m87390W(v7jVarM357p2);
                        m354b(zIsInEditMode, childAt3, v7jVarM357p2, h6jVar, sparseArray2);
                    }
                }
            }
            if (z) {
                w7jVar.f248709v0.m49454C(w7jVar);
            }
        }
        w7jVar.f248692A0.getClass();
        m361v(w7jVar, this.f741i, i, i2);
        m360u(i, i2, w7jVar.m84886s(), w7jVar.m84882m(), w7jVar.f248700I0, w7jVar.f248701J0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        v7j v7jVarM357p = m357p(view);
        if ((view instanceof Guideline) && !(v7jVarM357p instanceof ka20)) {
            h6j h6jVar = (h6j) view.getLayoutParams();
            ka20 ka20Var = new ka20();
            h6jVar.f88160p0 = ka20Var;
            h6jVar.f88136d0 = true;
            ka20Var.m55865X(h6jVar.f88124V);
        }
        if (view instanceof f6j) {
            f6j f6jVar = (f6j) view;
            f6jVar.m40868m();
            ((h6j) view.getLayoutParams()).f88138e0 = true;
            ArrayList arrayList = this.f734b;
            if (!arrayList.contains(f6jVar)) {
                arrayList.add(f6jVar);
            }
        }
        this.f733a.put(view.getId(), view);
        this.f740h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f733a.remove(view.getId());
        this.f735c.m87396d0(m357p(view));
        this.f734b.remove(view);
        this.f740h = true;
    }

    /* JADX INFO: renamed from: p */
    public final v7j m357p(View view) {
        if (view == this) {
            return this.f735c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof h6j) {
            return ((h6j) view.getLayoutParams()).f88160p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof h6j) {
            return ((h6j) view.getLayoutParams()).f88160p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m358q(AttributeSet attributeSet, int i, int i2) {
        w7j w7jVar = this.f735c;
        w7jVar.f238241h0 = this;
        i6j i6jVar = this.f732P0;
        w7jVar.f248712y0 = i6jVar;
        w7jVar.f248710w0.m92359u(i6jVar);
        this.f733a.put(getId(), this);
        this.f742t = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b2u0.f22698b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f736d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f736d);
                } else if (index == 17) {
                    this.f737e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f737e);
                } else if (index == 14) {
                    this.f738f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f738f);
                } else if (index == 15) {
                    this.f739g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f739g);
                } else if (index == 113) {
                    this.f741i = typedArrayObtainStyledAttributes.getInt(index, this.f741i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo344t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f728L0 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c7j c7jVar = new c7j();
                        this.f742t = c7jVar;
                        c7jVar.m31742n(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f742t = null;
                    }
                    this.f729M0 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        w7jVar.f248699H0 = this.f741i;
        kl80.f123823p = w7jVar.m87395c0(512);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m359r() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f740h = true;
        super.requestLayout();
    }

    public void setConstraintSet(c7j c7jVar) {
        this.f742t = c7jVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f733a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f739g) {
            return;
        }
        this.f739g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f738f) {
            return;
        }
        this.f738f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f737e) {
            return;
        }
        this.f737e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f736d) {
            return;
        }
        this.f736d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(c8j c8jVar) {
        C2449ud c2449ud = this.f728L0;
        if (c2449ud != null) {
            c2449ud.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f741i = i;
        w7j w7jVar = this.f735c;
        w7jVar.f248699H0 = i;
        kl80.f123823p = w7jVar.m87395c0(512);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public void mo344t(int i) {
        this.f728L0 = new C2449ud(getContext(), this, i);
    }

    /* JADX INFO: renamed from: u */
    public final void m360u(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        i6j i6jVar = this.f732P0;
        int i5 = i6jVar.f99254e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + i6jVar.f99253d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f738f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f739g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    /* JADX INFO: renamed from: v */
    public final void m361v(w7j w7jVar, int i, int i2, int i3) {
        int iMax;
        u7j u7jVar;
        int iMax2;
        int i4;
        int i5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i6 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        i6j i6jVar = this.f732P0;
        i6jVar.f99251b = iMax3;
        i6jVar.f99252c = iMax4;
        i6jVar.f99253d = paddingWidth;
        i6jVar.f99254e = i6;
        i6jVar.f99255f = i2;
        i6jVar.f99256g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if (m359r()) {
            iMax5 = iMax6;
        }
        int i7 = size - paddingWidth;
        int i8 = size2 - i6;
        int i9 = i6jVar.f99254e;
        int i10 = i6jVar.f99253d;
        int childCount = getChildCount();
        u7j u7jVar2 = u7j.f227711b;
        u7j u7jVar3 = u7j.f227710a;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                iMax = mode != 1073741824 ? 0 : Math.min(this.f738f - i10, i7);
                u7jVar = u7jVar3;
            } else {
                iMax = childCount == 0 ? Math.max(0, this.f736d) : 0;
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.f739g - i9, i8);
                    }
                    u7jVar2 = u7jVar3;
                } else if (childCount == 0) {
                    iMax2 = Math.max(0, this.f737e);
                } else {
                    iMax2 = 0;
                }
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.f737e);
            } else {
                iMax2 = i8;
            }
            if (iMax == w7jVar.m84886s() || iMax2 != w7jVar.m84882m()) {
                w7jVar.f248710w0.m92352n();
            }
            w7jVar.f238227a0 = 0;
            w7jVar.f238229b0 = 0;
            int i11 = this.f738f - i10;
            int[] iArr = w7jVar.f238203D;
            iArr[0] = i11;
            iArr[1] = this.f739g - i9;
            w7jVar.f238233d0 = 0;
            w7jVar.f238235e0 = 0;
            w7jVar.m84868P(u7jVar);
            w7jVar.m84872T(iMax);
            w7jVar.m84870R(u7jVar2);
            w7jVar.m84867O(iMax2);
            i4 = this.f736d - i10;
            if (i4 < 0) {
                w7jVar.f238233d0 = 0;
            } else {
                w7jVar.f238233d0 = i4;
            }
            i5 = this.f737e - i9;
            if (i5 < 0) {
                w7jVar.f238235e0 = 0;
            } else {
                w7jVar.f238235e0 = i5;
            }
            w7jVar.f248693B0 = iMax5;
            w7jVar.f248694C0 = iMax3;
            w7jVar.f248709v0.m49453B(w7jVar, i, mode, i7, mode2, i8);
        }
        iMax = childCount == 0 ? Math.max(0, this.f736d) : i7;
        u7jVar = u7jVar2;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.f739g - i9, i8);
                }
                u7jVar2 = u7jVar3;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.f737e);
            } else {
                iMax2 = 0;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.f737e);
        } else {
            iMax2 = i8;
        }
        if (iMax == w7jVar.m84886s()) {
            w7jVar.f248710w0.m92352n();
        } else {
            w7jVar.f248710w0.m92352n();
        }
        w7jVar.f238227a0 = 0;
        w7jVar.f238229b0 = 0;
        int i12 = this.f738f - i10;
        int[] iArr2 = w7jVar.f238203D;
        iArr2[0] = i12;
        iArr2[1] = this.f739g - i9;
        w7jVar.f238233d0 = 0;
        w7jVar.f238235e0 = 0;
        w7jVar.m84868P(u7jVar);
        w7jVar.m84872T(iMax);
        w7jVar.m84870R(u7jVar2);
        w7jVar.m84867O(iMax2);
        i4 = this.f736d - i10;
        if (i4 < 0) {
            w7jVar.f238233d0 = 0;
        } else {
            w7jVar.f238233d0 = i4;
        }
        i5 = this.f737e - i9;
        if (i5 < 0) {
            w7jVar.f238235e0 = 0;
        } else {
            w7jVar.f238235e0 = i5;
        }
        w7jVar.f248693B0 = iMax5;
        w7jVar.f248694C0 = iMax3;
        w7jVar.f248709v0.m49453B(w7jVar, i, mode, i7, mode2, i8);
    }

    /* JADX INFO: renamed from: w */
    public final void m362w(v7j v7jVar, h6j h6jVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f733a.get(i);
        v7j v7jVar2 = (v7j) sparseArray.get(i);
        if (v7jVar2 == null || view == null || !(view.getLayoutParams() instanceof h6j)) {
            return;
        }
        h6jVar.f88134c0 = true;
        if (i2 == 6) {
            h6j h6jVar2 = (h6j) view.getLayoutParams();
            h6jVar2.f88134c0 = true;
            h6jVar2.f88160p0.f238205F = true;
        }
        v7jVar.mo55866k(6).m31568b(v7jVar2.mo55866k(i2), h6jVar.f88106D, h6jVar.f88105C, true);
        v7jVar.f238205F = true;
        v7jVar.mo55866k(3).m31576j();
        v7jVar.mo55866k(5).m31576j();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new h6j(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f733a = new SparseArray();
        this.f734b = new ArrayList(4);
        this.f735c = new w7j();
        this.f736d = 0;
        this.f737e = 0;
        this.f738f = Alert.DURATION_SHOW_INDEFINITELY;
        this.f739g = Alert.DURATION_SHOW_INDEFINITELY;
        this.f740h = true;
        this.f741i = 257;
        this.f742t = null;
        this.f728L0 = null;
        this.f729M0 = -1;
        this.f730N0 = new HashMap();
        this.f731O0 = new SparseArray();
        this.f732P0 = new i6j(this, this);
        m358q(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f733a = new SparseArray();
        this.f734b = new ArrayList(4);
        this.f735c = new w7j();
        this.f736d = 0;
        this.f737e = 0;
        this.f738f = Alert.DURATION_SHOW_INDEFINITELY;
        this.f739g = Alert.DURATION_SHOW_INDEFINITELY;
        this.f740h = true;
        this.f741i = 257;
        this.f742t = null;
        this.f728L0 = null;
        this.f729M0 = -1;
        this.f730N0 = new HashMap();
        this.f731O0 = new SparseArray();
        this.f732P0 = new i6j(this, this);
        m358q(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f733a = new SparseArray();
        this.f734b = new ArrayList(4);
        this.f735c = new w7j();
        this.f736d = 0;
        this.f737e = 0;
        this.f738f = Alert.DURATION_SHOW_INDEFINITELY;
        this.f739g = Alert.DURATION_SHOW_INDEFINITELY;
        this.f740h = true;
        this.f741i = 257;
        this.f742t = null;
        this.f728L0 = null;
        this.f729M0 = -1;
        this.f730N0 = new HashMap();
        this.f731O0 = new SparseArray();
        this.f732P0 = new i6j(this, this);
        m358q(attributeSet, i, i2);
    }
}
