package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class h6j extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public int f88103A;

    /* JADX INFO: renamed from: B */
    public int f88104B;

    /* JADX INFO: renamed from: C */
    public final int f88105C;

    /* JADX INFO: renamed from: D */
    public final int f88106D;

    /* JADX INFO: renamed from: E */
    public float f88107E;

    /* JADX INFO: renamed from: F */
    public float f88108F;

    /* JADX INFO: renamed from: G */
    public String f88109G;

    /* JADX INFO: renamed from: H */
    public float f88110H;

    /* JADX INFO: renamed from: I */
    public float f88111I;

    /* JADX INFO: renamed from: J */
    public int f88112J;

    /* JADX INFO: renamed from: K */
    public int f88113K;

    /* JADX INFO: renamed from: L */
    public int f88114L;

    /* JADX INFO: renamed from: M */
    public int f88115M;

    /* JADX INFO: renamed from: N */
    public int f88116N;

    /* JADX INFO: renamed from: O */
    public int f88117O;

    /* JADX INFO: renamed from: P */
    public int f88118P;

    /* JADX INFO: renamed from: Q */
    public int f88119Q;

    /* JADX INFO: renamed from: R */
    public float f88120R;

    /* JADX INFO: renamed from: S */
    public float f88121S;

    /* JADX INFO: renamed from: T */
    public int f88122T;

    /* JADX INFO: renamed from: U */
    public int f88123U;

    /* JADX INFO: renamed from: V */
    public int f88124V;

    /* JADX INFO: renamed from: W */
    public boolean f88125W;

    /* JADX INFO: renamed from: X */
    public boolean f88126X;

    /* JADX INFO: renamed from: Y */
    public String f88127Y;

    /* JADX INFO: renamed from: Z */
    public int f88128Z;

    /* JADX INFO: renamed from: a */
    public int f88129a;

    /* JADX INFO: renamed from: a0 */
    public boolean f88130a0;

    /* JADX INFO: renamed from: b */
    public int f88131b;

    /* JADX INFO: renamed from: b0 */
    public boolean f88132b0;

    /* JADX INFO: renamed from: c */
    public float f88133c;

    /* JADX INFO: renamed from: c0 */
    public boolean f88134c0;

    /* JADX INFO: renamed from: d */
    public final boolean f88135d;

    /* JADX INFO: renamed from: d0 */
    public boolean f88136d0;

    /* JADX INFO: renamed from: e */
    public int f88137e;

    /* JADX INFO: renamed from: e0 */
    public boolean f88138e0;

    /* JADX INFO: renamed from: f */
    public int f88139f;

    /* JADX INFO: renamed from: f0 */
    public int f88140f0;

    /* JADX INFO: renamed from: g */
    public int f88141g;

    /* JADX INFO: renamed from: g0 */
    public int f88142g0;

    /* JADX INFO: renamed from: h */
    public int f88143h;

    /* JADX INFO: renamed from: h0 */
    public int f88144h0;

    /* JADX INFO: renamed from: i */
    public int f88145i;

    /* JADX INFO: renamed from: i0 */
    public int f88146i0;

    /* JADX INFO: renamed from: j */
    public int f88147j;

    /* JADX INFO: renamed from: j0 */
    public int f88148j0;

    /* JADX INFO: renamed from: k */
    public int f88149k;

    /* JADX INFO: renamed from: k0 */
    public int f88150k0;

    /* JADX INFO: renamed from: l */
    public int f88151l;

    /* JADX INFO: renamed from: l0 */
    public float f88152l0;

    /* JADX INFO: renamed from: m */
    public int f88153m;

    /* JADX INFO: renamed from: m0 */
    public int f88154m0;

    /* JADX INFO: renamed from: n */
    public int f88155n;

    /* JADX INFO: renamed from: n0 */
    public int f88156n0;

    /* JADX INFO: renamed from: o */
    public int f88157o;

    /* JADX INFO: renamed from: o0 */
    public float f88158o0;

    /* JADX INFO: renamed from: p */
    public int f88159p;

    /* JADX INFO: renamed from: p0 */
    public v7j f88160p0;

    /* JADX INFO: renamed from: q */
    public int f88161q;

    /* JADX INFO: renamed from: r */
    public float f88162r;

    /* JADX INFO: renamed from: s */
    public int f88163s;

    /* JADX INFO: renamed from: t */
    public int f88164t;

    /* JADX INFO: renamed from: u */
    public int f88165u;

    /* JADX INFO: renamed from: v */
    public int f88166v;

    /* JADX INFO: renamed from: w */
    public final int f88167w;

    /* JADX INFO: renamed from: x */
    public int f88168x;

    /* JADX INFO: renamed from: y */
    public final int f88169y;

    /* JADX INFO: renamed from: z */
    public int f88170z;

    public h6j(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f88129a = -1;
        this.f88131b = -1;
        this.f88133c = -1.0f;
        this.f88135d = true;
        this.f88137e = -1;
        this.f88139f = -1;
        this.f88141g = -1;
        this.f88143h = -1;
        this.f88145i = -1;
        this.f88147j = -1;
        this.f88149k = -1;
        this.f88151l = -1;
        this.f88153m = -1;
        this.f88155n = -1;
        this.f88157o = -1;
        this.f88159p = -1;
        this.f88161q = 0;
        this.f88162r = 0.0f;
        this.f88163s = -1;
        this.f88164t = -1;
        this.f88165u = -1;
        this.f88166v = -1;
        this.f88167w = Integer.MIN_VALUE;
        this.f88168x = Integer.MIN_VALUE;
        this.f88169y = Integer.MIN_VALUE;
        this.f88170z = Integer.MIN_VALUE;
        this.f88103A = Integer.MIN_VALUE;
        this.f88104B = Integer.MIN_VALUE;
        this.f88105C = Integer.MIN_VALUE;
        this.f88106D = 0;
        this.f88107E = 0.5f;
        this.f88108F = 0.5f;
        this.f88109G = null;
        this.f88110H = -1.0f;
        this.f88111I = -1.0f;
        this.f88112J = 0;
        this.f88113K = 0;
        this.f88114L = 0;
        this.f88115M = 0;
        this.f88116N = 0;
        this.f88117O = 0;
        this.f88118P = 0;
        this.f88119Q = 0;
        this.f88120R = 1.0f;
        this.f88121S = 1.0f;
        this.f88122T = -1;
        this.f88123U = -1;
        this.f88124V = -1;
        this.f88125W = false;
        this.f88126X = false;
        this.f88127Y = null;
        this.f88128Z = 0;
        this.f88130a0 = true;
        this.f88132b0 = true;
        this.f88134c0 = false;
        this.f88136d0 = false;
        this.f88138e0 = false;
        this.f88140f0 = -1;
        this.f88142g0 = -1;
        this.f88144h0 = -1;
        this.f88146i0 = -1;
        this.f88148j0 = Integer.MIN_VALUE;
        this.f88150k0 = Integer.MIN_VALUE;
        this.f88152l0 = 0.5f;
        this.f88160p0 = new v7j();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
            setMarginStart(marginLayoutParams.getMarginStart());
            setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (layoutParams instanceof h6j) {
            h6j h6jVar = (h6j) layoutParams;
            this.f88129a = h6jVar.f88129a;
            this.f88131b = h6jVar.f88131b;
            this.f88133c = h6jVar.f88133c;
            this.f88135d = h6jVar.f88135d;
            this.f88137e = h6jVar.f88137e;
            this.f88139f = h6jVar.f88139f;
            this.f88141g = h6jVar.f88141g;
            this.f88143h = h6jVar.f88143h;
            this.f88145i = h6jVar.f88145i;
            this.f88147j = h6jVar.f88147j;
            this.f88149k = h6jVar.f88149k;
            this.f88151l = h6jVar.f88151l;
            this.f88153m = h6jVar.f88153m;
            this.f88155n = h6jVar.f88155n;
            this.f88157o = h6jVar.f88157o;
            this.f88159p = h6jVar.f88159p;
            this.f88161q = h6jVar.f88161q;
            this.f88162r = h6jVar.f88162r;
            this.f88163s = h6jVar.f88163s;
            this.f88164t = h6jVar.f88164t;
            this.f88165u = h6jVar.f88165u;
            this.f88166v = h6jVar.f88166v;
            this.f88167w = h6jVar.f88167w;
            this.f88168x = h6jVar.f88168x;
            this.f88169y = h6jVar.f88169y;
            this.f88170z = h6jVar.f88170z;
            this.f88103A = h6jVar.f88103A;
            this.f88104B = h6jVar.f88104B;
            this.f88105C = h6jVar.f88105C;
            this.f88106D = h6jVar.f88106D;
            this.f88107E = h6jVar.f88107E;
            this.f88108F = h6jVar.f88108F;
            this.f88109G = h6jVar.f88109G;
            this.f88110H = h6jVar.f88110H;
            this.f88111I = h6jVar.f88111I;
            this.f88112J = h6jVar.f88112J;
            this.f88113K = h6jVar.f88113K;
            this.f88125W = h6jVar.f88125W;
            this.f88126X = h6jVar.f88126X;
            this.f88114L = h6jVar.f88114L;
            this.f88115M = h6jVar.f88115M;
            this.f88116N = h6jVar.f88116N;
            this.f88118P = h6jVar.f88118P;
            this.f88117O = h6jVar.f88117O;
            this.f88119Q = h6jVar.f88119Q;
            this.f88120R = h6jVar.f88120R;
            this.f88121S = h6jVar.f88121S;
            this.f88122T = h6jVar.f88122T;
            this.f88123U = h6jVar.f88123U;
            this.f88124V = h6jVar.f88124V;
            this.f88130a0 = h6jVar.f88130a0;
            this.f88132b0 = h6jVar.f88132b0;
            this.f88134c0 = h6jVar.f88134c0;
            this.f88136d0 = h6jVar.f88136d0;
            this.f88140f0 = h6jVar.f88140f0;
            this.f88142g0 = h6jVar.f88142g0;
            this.f88144h0 = h6jVar.f88144h0;
            this.f88146i0 = h6jVar.f88146i0;
            this.f88148j0 = h6jVar.f88148j0;
            this.f88150k0 = h6jVar.f88150k0;
            this.f88152l0 = h6jVar.f88152l0;
            this.f88127Y = h6jVar.f88127Y;
            this.f88128Z = h6jVar.f88128Z;
            this.f88160p0 = h6jVar.f88160p0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m46730a() {
        this.f88136d0 = false;
        this.f88130a0 = true;
        this.f88132b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f88125W) {
            this.f88130a0 = false;
            if (this.f88114L == 0) {
                this.f88114L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f88126X) {
            this.f88132b0 = false;
            if (this.f88115M == 0) {
                this.f88115M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f88130a0 = false;
            if (i == 0 && this.f88114L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f88125W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f88132b0 = false;
            if (i2 == 0 && this.f88115M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f88126X = true;
            }
        }
        if (this.f88133c == -1.0f && this.f88129a == -1 && this.f88131b == -1) {
            return;
        }
        this.f88136d0 = true;
        this.f88130a0 = true;
        this.f88132b0 = true;
        if (!(this.f88160p0 instanceof ka20)) {
            this.f88160p0 = new ka20();
        }
        ((ka20) this.f88160p0).m55865X(this.f88124V);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.f88144h0 = -1;
        this.f88146i0 = -1;
        this.f88140f0 = -1;
        this.f88142g0 = -1;
        this.f88148j0 = this.f88167w;
        this.f88150k0 = this.f88169y;
        float f = this.f88107E;
        this.f88152l0 = f;
        int i8 = this.f88129a;
        this.f88154m0 = i8;
        int i9 = this.f88131b;
        this.f88156n0 = i9;
        float f2 = this.f88133c;
        this.f88158o0 = f2;
        if (z2) {
            int i10 = this.f88163s;
            if (i10 != -1) {
                this.f88144h0 = i10;
            } else {
                int i11 = this.f88164t;
                if (i11 != -1) {
                    this.f88146i0 = i11;
                } else {
                    i2 = this.f88165u;
                    if (i2 != -1) {
                        this.f88142g0 = i2;
                        z = true;
                    }
                    i3 = this.f88166v;
                    if (i3 != -1) {
                        this.f88140f0 = i3;
                        z = true;
                    }
                    i4 = this.f88103A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.f88150k0 = i4;
                    }
                    i5 = this.f88104B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.f88148j0 = i5;
                    }
                    if (z) {
                        this.f88152l0 = 1.0f - f;
                    }
                    if (this.f88136d0 && this.f88124V == 1 && this.f88135d) {
                        if (f2 != -1.0f) {
                            this.f88158o0 = 1.0f - f2;
                            this.f88154m0 = -1;
                            this.f88156n0 = -1;
                        } else if (i8 != -1) {
                            this.f88156n0 = i8;
                            this.f88154m0 = -1;
                            this.f88158o0 = -1.0f;
                        } else if (i9 != -1) {
                            this.f88154m0 = i9;
                            this.f88156n0 = -1;
                            this.f88158o0 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.f88165u;
            if (i2 != -1) {
                this.f88142g0 = i2;
                z = true;
            }
            i3 = this.f88166v;
            if (i3 != -1) {
                this.f88140f0 = i3;
                z = true;
            }
            i4 = this.f88103A;
            if (i4 != Integer.MIN_VALUE) {
                this.f88150k0 = i4;
            }
            i5 = this.f88104B;
            if (i5 != Integer.MIN_VALUE) {
                this.f88148j0 = i5;
            }
            if (z) {
                this.f88152l0 = 1.0f - f;
            }
            if (this.f88136d0) {
                if (f2 != -1.0f) {
                    this.f88158o0 = 1.0f - f2;
                    this.f88154m0 = -1;
                    this.f88156n0 = -1;
                } else if (i8 != -1) {
                    this.f88156n0 = i8;
                    this.f88154m0 = -1;
                    this.f88158o0 = -1.0f;
                } else if (i9 != -1) {
                    this.f88154m0 = i9;
                    this.f88156n0 = -1;
                    this.f88158o0 = -1.0f;
                }
            }
        } else {
            int i12 = this.f88163s;
            if (i12 != -1) {
                this.f88142g0 = i12;
            }
            int i13 = this.f88164t;
            if (i13 != -1) {
                this.f88140f0 = i13;
            }
            int i14 = this.f88165u;
            if (i14 != -1) {
                this.f88144h0 = i14;
            }
            int i15 = this.f88166v;
            if (i15 != -1) {
                this.f88146i0 = i15;
            }
            int i16 = this.f88103A;
            if (i16 != Integer.MIN_VALUE) {
                this.f88148j0 = i16;
            }
            int i17 = this.f88104B;
            if (i17 != Integer.MIN_VALUE) {
                this.f88150k0 = i17;
            }
        }
        if (this.f88165u == -1 && this.f88166v == -1 && this.f88164t == -1 && this.f88163s == -1) {
            int i18 = this.f88141g;
            if (i18 != -1) {
                this.f88144h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f88143h;
                if (i19 != -1) {
                    this.f88146i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f88137e;
            if (i20 != -1) {
                this.f88140f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f88139f;
            if (i21 != -1) {
                this.f88142g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }

    public h6j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88129a = -1;
        this.f88131b = -1;
        this.f88133c = -1.0f;
        this.f88135d = true;
        this.f88137e = -1;
        this.f88139f = -1;
        this.f88141g = -1;
        this.f88143h = -1;
        this.f88145i = -1;
        this.f88147j = -1;
        this.f88149k = -1;
        this.f88151l = -1;
        this.f88153m = -1;
        this.f88155n = -1;
        this.f88157o = -1;
        this.f88159p = -1;
        this.f88161q = 0;
        this.f88162r = 0.0f;
        this.f88163s = -1;
        this.f88164t = -1;
        this.f88165u = -1;
        this.f88166v = -1;
        this.f88167w = Integer.MIN_VALUE;
        this.f88168x = Integer.MIN_VALUE;
        this.f88169y = Integer.MIN_VALUE;
        this.f88170z = Integer.MIN_VALUE;
        this.f88103A = Integer.MIN_VALUE;
        this.f88104B = Integer.MIN_VALUE;
        this.f88105C = Integer.MIN_VALUE;
        this.f88106D = 0;
        this.f88107E = 0.5f;
        this.f88108F = 0.5f;
        this.f88109G = null;
        this.f88110H = -1.0f;
        this.f88111I = -1.0f;
        this.f88112J = 0;
        this.f88113K = 0;
        this.f88114L = 0;
        this.f88115M = 0;
        this.f88116N = 0;
        this.f88117O = 0;
        this.f88118P = 0;
        this.f88119Q = 0;
        this.f88120R = 1.0f;
        this.f88121S = 1.0f;
        this.f88122T = -1;
        this.f88123U = -1;
        this.f88124V = -1;
        this.f88125W = false;
        this.f88126X = false;
        this.f88127Y = null;
        this.f88128Z = 0;
        this.f88130a0 = true;
        this.f88132b0 = true;
        this.f88134c0 = false;
        this.f88136d0 = false;
        this.f88138e0 = false;
        this.f88140f0 = -1;
        this.f88142g0 = -1;
        this.f88144h0 = -1;
        this.f88146i0 = -1;
        this.f88148j0 = Integer.MIN_VALUE;
        this.f88150k0 = Integer.MIN_VALUE;
        this.f88152l0 = 0.5f;
        this.f88160p0 = new v7j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22698b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = g6j.f77060a.get(index);
            switch (i2) {
                case 1:
                    this.f88124V = typedArrayObtainStyledAttributes.getInt(index, this.f88124V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f88159p);
                    this.f88159p = resourceId;
                    if (resourceId == -1) {
                        this.f88159p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.f88161q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88161q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f88162r) % 360.0f;
                    this.f88162r = f;
                    if (f < 0.0f) {
                        this.f88162r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    this.f88129a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f88129a);
                    break;
                case 6:
                    this.f88131b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f88131b);
                    break;
                case 7:
                    this.f88133c = typedArrayObtainStyledAttributes.getFloat(index, this.f88133c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88137e);
                    this.f88137e = resourceId2;
                    if (resourceId2 == -1) {
                        this.f88137e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88139f);
                    this.f88139f = resourceId3;
                    if (resourceId3 == -1) {
                        this.f88139f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88141g);
                    this.f88141g = resourceId4;
                    if (resourceId4 == -1) {
                        this.f88141g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88143h);
                    this.f88143h = resourceId5;
                    if (resourceId5 == -1) {
                        this.f88143h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88145i);
                    this.f88145i = resourceId6;
                    if (resourceId6 == -1) {
                        this.f88145i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88147j);
                    this.f88147j = resourceId7;
                    if (resourceId7 == -1) {
                        this.f88147j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88149k);
                    this.f88149k = resourceId8;
                    if (resourceId8 == -1) {
                        this.f88149k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88151l);
                    this.f88151l = resourceId9;
                    if (resourceId9 == -1) {
                        this.f88151l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88153m);
                    this.f88153m = resourceId10;
                    if (resourceId10 == -1) {
                        this.f88153m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88163s);
                    this.f88163s = resourceId11;
                    if (resourceId11 == -1) {
                        this.f88163s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88164t);
                    this.f88164t = resourceId12;
                    if (resourceId12 == -1) {
                        this.f88164t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88165u);
                    this.f88165u = resourceId13;
                    if (resourceId13 == -1) {
                        this.f88165u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88166v);
                    this.f88166v = resourceId14;
                    if (resourceId14 == -1) {
                        this.f88166v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.f88167w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88167w);
                    break;
                case 22:
                    this.f88168x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88168x);
                    break;
                case 23:
                    this.f88169y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88169y);
                    break;
                case 24:
                    this.f88170z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88170z);
                    break;
                case 25:
                    this.f88103A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88103A);
                    break;
                case 26:
                    this.f88104B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88104B);
                    break;
                case 27:
                    this.f88125W = typedArrayObtainStyledAttributes.getBoolean(index, this.f88125W);
                    break;
                case 28:
                    this.f88126X = typedArrayObtainStyledAttributes.getBoolean(index, this.f88126X);
                    break;
                case 29:
                    this.f88107E = typedArrayObtainStyledAttributes.getFloat(index, this.f88107E);
                    break;
                case 30:
                    this.f88108F = typedArrayObtainStyledAttributes.getFloat(index, this.f88108F);
                    break;
                case 31:
                    this.f88114L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    this.f88115M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        this.f88116N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88116N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f88116N) == -2) {
                            this.f88116N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        this.f88118P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88118P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f88118P) == -2) {
                            this.f88118P = -2;
                        }
                    }
                    break;
                case 35:
                    this.f88120R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f88120R));
                    this.f88114L = 2;
                    break;
                case 36:
                    try {
                        this.f88117O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88117O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f88117O) == -2) {
                            this.f88117O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.f88119Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88119Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f88119Q) == -2) {
                            this.f88119Q = -2;
                        }
                    }
                    break;
                case 38:
                    this.f88121S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f88121S));
                    this.f88115M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            c7j.m31729r(this, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            this.f88110H = typedArrayObtainStyledAttributes.getFloat(index, this.f88110H);
                            break;
                        case 46:
                            this.f88111I = typedArrayObtainStyledAttributes.getFloat(index, this.f88111I);
                            break;
                        case 47:
                            this.f88112J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.f88113K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.f88122T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f88122T);
                            break;
                        case 50:
                            this.f88123U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f88123U);
                            break;
                        case 51:
                            this.f88127Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88155n);
                            this.f88155n = resourceId15;
                            if (resourceId15 == -1) {
                                this.f88155n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f88157o);
                            this.f88157o = resourceId16;
                            if (resourceId16 == -1) {
                                this.f88157o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            this.f88106D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88106D);
                            break;
                        case 55:
                            this.f88105C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f88105C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    c7j.m31728q(this, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    c7j.m31728q(this, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    this.f88128Z = typedArrayObtainStyledAttributes.getInt(index, this.f88128Z);
                                    break;
                                case 67:
                                    this.f88135d = typedArrayObtainStyledAttributes.getBoolean(index, this.f88135d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        m46730a();
    }

    public h6j(int i, int i2) {
        super(i, i2);
        this.f88129a = -1;
        this.f88131b = -1;
        this.f88133c = -1.0f;
        this.f88135d = true;
        this.f88137e = -1;
        this.f88139f = -1;
        this.f88141g = -1;
        this.f88143h = -1;
        this.f88145i = -1;
        this.f88147j = -1;
        this.f88149k = -1;
        this.f88151l = -1;
        this.f88153m = -1;
        this.f88155n = -1;
        this.f88157o = -1;
        this.f88159p = -1;
        this.f88161q = 0;
        this.f88162r = 0.0f;
        this.f88163s = -1;
        this.f88164t = -1;
        this.f88165u = -1;
        this.f88166v = -1;
        this.f88167w = Integer.MIN_VALUE;
        this.f88168x = Integer.MIN_VALUE;
        this.f88169y = Integer.MIN_VALUE;
        this.f88170z = Integer.MIN_VALUE;
        this.f88103A = Integer.MIN_VALUE;
        this.f88104B = Integer.MIN_VALUE;
        this.f88105C = Integer.MIN_VALUE;
        this.f88106D = 0;
        this.f88107E = 0.5f;
        this.f88108F = 0.5f;
        this.f88109G = null;
        this.f88110H = -1.0f;
        this.f88111I = -1.0f;
        this.f88112J = 0;
        this.f88113K = 0;
        this.f88114L = 0;
        this.f88115M = 0;
        this.f88116N = 0;
        this.f88117O = 0;
        this.f88118P = 0;
        this.f88119Q = 0;
        this.f88120R = 1.0f;
        this.f88121S = 1.0f;
        this.f88122T = -1;
        this.f88123U = -1;
        this.f88124V = -1;
        this.f88125W = false;
        this.f88126X = false;
        this.f88127Y = null;
        this.f88128Z = 0;
        this.f88130a0 = true;
        this.f88132b0 = true;
        this.f88134c0 = false;
        this.f88136d0 = false;
        this.f88138e0 = false;
        this.f88140f0 = -1;
        this.f88142g0 = -1;
        this.f88144h0 = -1;
        this.f88146i0 = -1;
        this.f88148j0 = Integer.MIN_VALUE;
        this.f88150k0 = Integer.MIN_VALUE;
        this.f88152l0 = 0.5f;
        this.f88160p0 = new v7j();
    }
}
