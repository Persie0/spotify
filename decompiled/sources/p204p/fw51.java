package p204p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fw51 {

    /* JADX INFO: renamed from: A */
    public int f73949A;

    /* JADX INFO: renamed from: B */
    public int f73950B;

    /* JADX INFO: renamed from: C */
    public int f73951C;

    /* JADX INFO: renamed from: D */
    public int f73952D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f73953E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f73954F;

    /* JADX INFO: renamed from: G */
    public int f73955G;

    /* JADX INFO: renamed from: H */
    public int f73956H;

    /* JADX INFO: renamed from: I */
    public int f73957I;

    /* JADX INFO: renamed from: J */
    public Rect f73958J;

    /* JADX INFO: renamed from: a */
    public final float f73959a;

    /* JADX INFO: renamed from: b */
    public final float f73960b;

    /* JADX INFO: renamed from: c */
    public final float f73961c;

    /* JADX INFO: renamed from: d */
    public final float f73962d;

    /* JADX INFO: renamed from: e */
    public final float f73963e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f73964f;

    /* JADX INFO: renamed from: g */
    public final Paint f73965g;

    /* JADX INFO: renamed from: h */
    public final Paint f73966h;

    /* JADX INFO: renamed from: i */
    public CharSequence f73967i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f73968j;

    /* JADX INFO: renamed from: k */
    public Bitmap f73969k;

    /* JADX INFO: renamed from: l */
    public float f73970l;

    /* JADX INFO: renamed from: m */
    public int f73971m;

    /* JADX INFO: renamed from: n */
    public int f73972n;

    /* JADX INFO: renamed from: o */
    public float f73973o;

    /* JADX INFO: renamed from: p */
    public int f73974p;

    /* JADX INFO: renamed from: q */
    public float f73975q;

    /* JADX INFO: renamed from: r */
    public float f73976r;

    /* JADX INFO: renamed from: s */
    public int f73977s;

    /* JADX INFO: renamed from: t */
    public int f73978t;

    /* JADX INFO: renamed from: u */
    public int f73979u;

    /* JADX INFO: renamed from: v */
    public int f73980v;

    /* JADX INFO: renamed from: w */
    public int f73981w;

    /* JADX INFO: renamed from: x */
    public float f73982x;

    /* JADX INFO: renamed from: y */
    public float f73983y;

    /* JADX INFO: renamed from: z */
    public float f73984z;

    public fw51(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f73963e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f73962d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f73959a = fRound;
        this.f73960b = fRound;
        this.f73961c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f73964f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f73965g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f73966h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Code duplicated, block: B:231:0x0514  */
    /* JADX WARN: Code duplicated, block: B:233:0x0517  */
    /* JADX WARN: Code duplicated, block: B:235:0x051a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [p.i741] */
    /* JADX WARN: Type inference failed for: r10v3, types: [p.i741] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m42940a(b0m b0mVar, dvb dvbVar, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        float f4;
        int i5;
        TextPaint textPaint;
        Spanned spanned;
        Object[] objArr;
        int[] iArr;
        int[] iArr2;
        List listM49834c;
        int i6;
        int i7;
        float f5;
        int i8;
        float f6;
        int i9;
        int iMax;
        int iMin;
        int iRound;
        Bitmap bitmap = b0mVar.f21970d;
        float f7 = b0mVar.f21977k;
        float f8 = b0mVar.f21976j;
        int i10 = b0mVar.f21975i;
        float f9 = b0mVar.f21974h;
        int i11 = b0mVar.f21973g;
        int i12 = b0mVar.f21972f;
        float f10 = b0mVar.f21971e;
        Layout.Alignment alignment = b0mVar.f21968b;
        ?? spannableStringBuilder = b0mVar.f21967a;
        boolean z = bitmap == null;
        if (!z) {
            f4 = f9;
            i5 = -16777216;
        } else {
            if (TextUtils.isEmpty(spannableStringBuilder)) {
                return;
            }
            f4 = f9;
            i5 = b0mVar.f21978l ? b0mVar.f21979m : dvbVar.f53412c;
        }
        ?? r15 = this.f73967i;
        TextPaint textPaint2 = this.f73964f;
        if ((r15 == spannableStringBuilder || (r15 != 0 && r15.equals(spannableStringBuilder))) && Objects.equals(this.f73968j, alignment) && this.f73969k == bitmap && this.f73970l == f10 && this.f73971m == i12) {
            textPaint = textPaint2;
            if (Integer.valueOf(this.f73972n).equals(Integer.valueOf(i11)) && this.f73973o == f4 && Integer.valueOf(this.f73974p).equals(Integer.valueOf(i10)) && this.f73975q == f8 && this.f73976r == f7 && this.f73977s == dvbVar.f53410a && this.f73978t == dvbVar.f53411b && this.f73979u == i5 && this.f73981w == dvbVar.f53413d && this.f73980v == dvbVar.f53414e && Objects.equals(textPaint.getTypeface(), dvbVar.f53415f) && this.f73982x == f && this.f73983y == f2 && this.f73984z == f3 && this.f73949A == i && this.f73950B == i2 && this.f73951C == i3 && this.f73952D == i4) {
                m42941b(canvas, z);
                return;
            }
        } else {
            textPaint = textPaint2;
        }
        i741 i741Var = zb9.f281279a;
        if (spannableStringBuilder == 0) {
            z = z;
        } else {
            int length = spannableStringBuilder.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount < length) {
                    int iCodePointAt = Character.codePointAt((CharSequence) spannableStringBuilder, iCharCount);
                    int i13 = iCharCount;
                    byte directionality = Character.getDirectionality(iCodePointAt);
                    int i14 = length;
                    if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                        if (spannableStringBuilder instanceof Spanned) {
                            spanned = (Spanned) spannableStringBuilder;
                            Object[] spans = spanned.getSpans(0, spannableStringBuilder.length(), Object.class);
                            int[] iArr3 = new int[spans.length];
                            iArr = new int[spans.length];
                            Arrays.fill(iArr3, -1);
                            Arrays.fill(iArr, -1);
                            objArr = spans;
                            iArr2 = iArr3;
                        } else {
                            spanned = null;
                            objArr = null;
                            iArr = null;
                            iArr2 = null;
                        }
                        int[] iArr4 = iArr;
                        if (spannableStringBuilder.toString().contains("\r\n")) {
                            listM49834c = zb9.f281280b.m49834c(spannableStringBuilder);
                            i6 = 2;
                        } else {
                            listM49834c = zb9.f281279a.m49834c(spannableStringBuilder);
                            i6 = 1;
                        }
                        List<String> list = listM49834c;
                        ArrayList arrayList = new ArrayList(list.size());
                        int i15 = 0;
                        int i16 = 0;
                        for (String str : list) {
                            int i17 = i6;
                            String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int length2 = strUnicodeWrap.length() - str.length();
                                if (length2 > 0) {
                                    i16++;
                                }
                                for (int i18 = 0; i18 < objArr.length; i18 = i7 + 1) {
                                    if (iArr2[i18] >= 0 || spanned.getSpanStart(objArr[i18]) < i15) {
                                        i7 = i18;
                                    } else {
                                        i7 = i18;
                                        if (spanned.getSpanStart(objArr[i18]) < str.length() + i15) {
                                            iArr2[i7] = i16;
                                        }
                                    }
                                    if (iArr4[i7] < 0 && spanned.getSpanEnd(objArr[i7]) - 1 >= i15 && spanned.getSpanEnd(objArr[i7]) - 1 < str.length() + i15) {
                                        iArr4[i7] = i16;
                                    }
                                }
                                int length3 = str.length() + i17 + i15;
                                if (length2 > 0) {
                                    i16++;
                                }
                                i15 = length3;
                            }
                            arrayList.add(strUnicodeWrap);
                            i6 = i17;
                            bidiFormatter = bidiFormatter;
                        }
                        spannableStringBuilder = new SpannableStringBuilder(zb9.f281281c.m29645c(arrayList));
                        if (objArr != null) {
                            spanned.getClass();
                            iArr2.getClass();
                            iArr4.getClass();
                            int i19 = 0;
                            while (i19 < objArr.length) {
                                int spanStart = spanned.getSpanStart(objArr[i19]) + iArr2[i19];
                                int spanEnd = spanned.getSpanEnd(objArr[i19]) + iArr4[i19];
                                int spanFlags = spanned.getSpanFlags(objArr[i19]);
                                int i20 = i19;
                                if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                                    StringBuilder sbM36619s = dq60.m36619s(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                                    sbM36619s.append(spannableStringBuilder.length());
                                    yif1.m93819w0(sbM36619s.toString());
                                } else {
                                    spannableStringBuilder.setSpan(objArr[i20], spanStart, spanEnd, spanFlags);
                                }
                                i19 = i20 + 1;
                                objArr = objArr;
                            }
                        }
                    } else {
                        iCharCount = Character.charCount(iCodePointAt) + i13;
                        length = i14;
                    }
                } else {
                    z = z;
                }
            }
        }
        this.f73967i = spannableStringBuilder;
        this.f73968j = alignment;
        this.f73969k = bitmap;
        this.f73970l = f10;
        this.f73971m = i12;
        this.f73972n = i11;
        this.f73973o = f4;
        this.f73974p = i10;
        this.f73975q = f8;
        this.f73976r = f7;
        this.f73977s = dvbVar.f53410a;
        this.f73978t = dvbVar.f53411b;
        this.f73979u = i5;
        this.f73981w = dvbVar.f53413d;
        this.f73980v = dvbVar.f53414e;
        TextPaint textPaint3 = textPaint;
        textPaint3.setTypeface(dvbVar.f53415f);
        this.f73982x = f;
        this.f73983y = f2;
        this.f73984z = f3;
        this.f73949A = i;
        this.f73950B = i2;
        this.f73951C = i3;
        this.f73952D = i4;
        if (z) {
            this.f73967i.getClass();
            CharSequence charSequence = this.f73967i;
            SpannableStringBuilder spannableStringBuilder2 = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f73967i);
            int i21 = this.f73951C - this.f73949A;
            int i22 = this.f73952D - this.f73950B;
            textPaint3.setTextSize(this.f73982x);
            int i23 = (int) ((this.f73982x * 0.125f) + 0.5f);
            int i24 = i23 * 2;
            int i25 = i21 - i24;
            float f11 = this.f73975q;
            if (f11 != -3.4028235E38f) {
                i25 = (int) (i25 * f11);
            }
            int i26 = i25;
            if (i26 <= 0) {
                yif1.m93819w0("Skipped drawing subtitle cue (insufficient space)");
            } else {
                if (this.f73983y > 0.0f) {
                    i9 = 0;
                    spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) this.f73983y), 0, spannableStringBuilder2.length(), 16711680);
                } else {
                    i9 = 0;
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
                if (this.f73981w == 1) {
                    for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(i9, spannableStringBuilder3.length(), ForegroundColorSpan.class)) {
                        spannableStringBuilder3.removeSpan(foregroundColorSpan);
                    }
                }
                if (Color.alpha(this.f73978t) > 0) {
                    int i27 = this.f73981w;
                    if (i27 == 0 || i27 == 2) {
                        spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f73978t), 0, spannableStringBuilder2.length(), 16711680);
                    } else {
                        spannableStringBuilder3.setSpan(new BackgroundColorSpan(this.f73978t), 0, spannableStringBuilder3.length(), 16711680);
                    }
                }
                Layout.Alignment alignment2 = this.f73968j;
                if (alignment2 == null) {
                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                }
                Layout.Alignment alignment3 = alignment2;
                SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint3, i26, alignment3, this.f73962d, this.f73963e, true);
                this.f73953E = staticLayout;
                int height = staticLayout.getHeight();
                int lineCount = this.f73953E.getLineCount();
                int iMax2 = 0;
                for (int i28 = 0; i28 < lineCount; i28++) {
                    iMax2 = Math.max((int) Math.ceil(this.f73953E.getLineWidth(i28)), iMax2);
                }
                int i29 = ((this.f73975q == -3.4028235E38f || iMax2 >= i26) ? iMax2 : i26) + i24;
                float f12 = this.f73973o;
                if (f12 != -3.4028235E38f) {
                    int iRound2 = Math.round(i21 * f12);
                    int i30 = this.f73949A;
                    int i31 = iRound2 + i30;
                    int i32 = this.f73974p;
                    if (i32 == 1) {
                        i31 = ((i31 * 2) - i29) / 2;
                    } else if (i32 == 2) {
                        i31 -= i29;
                    }
                    iMax = Math.max(i31, i30);
                    iMin = Math.min(iMax + i29, this.f73951C);
                } else {
                    iMax = this.f73949A + ((i21 - i29) / 2);
                    iMin = iMax + i29;
                }
                int i33 = iMin - iMax;
                if (i33 <= 0) {
                    yif1.m93819w0("Skipped drawing subtitle cue (invalid horizontal positioning)");
                } else {
                    float f13 = this.f73970l;
                    if (f13 != -3.4028235E38f) {
                        if (this.f73971m == 0) {
                            iRound = Math.round(i22 * f13) + this.f73950B;
                            int i34 = this.f73972n;
                            if (i34 == 2) {
                                iRound -= height;
                            } else if (i34 == 1) {
                                iRound = ((iRound * 2) - height) / 2;
                            }
                        } else {
                            int lineBottom = this.f73953E.getLineBottom(0) - this.f73953E.getLineTop(0);
                            float f14 = this.f73970l;
                            if (f14 >= 0.0f) {
                                iRound = Math.round(f14 * lineBottom) + this.f73950B;
                            } else {
                                iRound = Math.round((f14 + 1.0f) * lineBottom) + this.f73952D;
                                iRound -= height;
                            }
                        }
                        int i35 = iRound + height;
                        int i36 = this.f73952D;
                        if (i35 > i36) {
                            iRound = i36 - height;
                        } else {
                            int i37 = this.f73950B;
                            if (iRound < i37) {
                                iRound = i37;
                            }
                        }
                    } else {
                        iRound = (this.f73952D - height) - ((int) (i22 * this.f73984z));
                    }
                    this.f73953E = new StaticLayout(spannableStringBuilder4, textPaint3, i33, alignment3, this.f73962d, this.f73963e, true);
                    this.f73954F = new StaticLayout(spannableStringBuilder3, textPaint3, i33, alignment3, this.f73962d, this.f73963e, true);
                    this.f73955G = iMax;
                    this.f73956H = iRound;
                    this.f73957I = i23;
                }
            }
        } else {
            this.f73969k.getClass();
            Bitmap bitmap2 = this.f73969k;
            int i38 = this.f73951C;
            int i39 = this.f73949A;
            int i40 = this.f73952D;
            int i41 = this.f73950B;
            float f15 = i38 - i39;
            float f16 = (this.f73973o * f15) + i39;
            float f17 = i40 - i41;
            float f18 = (this.f73970l * f17) + i41;
            int iRound3 = Math.round(f15 * this.f73975q);
            float f19 = this.f73976r;
            int iRound4 = f19 != -3.4028235E38f ? Math.round(f17 * f19) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
            int i42 = this.f73974p;
            if (i42 == 2) {
                f5 = iRound3;
            } else {
                if (i42 == 1) {
                    f5 = iRound3 / 2;
                }
                int iRound5 = Math.round(f16);
                i8 = this.f73972n;
                if (i8 == 2) {
                    f6 = iRound4;
                } else {
                    if (i8 == 1) {
                        f6 = iRound4 / 2;
                    }
                    int iRound6 = Math.round(f18);
                    this.f73958J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                }
                f18 -= f6;
                int iRound7 = Math.round(f18);
                this.f73958J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
            }
            f16 -= f5;
            int iRound8 = Math.round(f16);
            i8 = this.f73972n;
            if (i8 == 2) {
                f6 = iRound4;
            } else {
                if (i8 == 1) {
                    f6 = iRound4 / 2;
                }
                int iRound9 = Math.round(f18);
                this.f73958J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
            }
            f18 -= f6;
            int iRound10 = Math.round(f18);
            this.f73958J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
        }
        m42941b(canvas, z);
    }

    /* JADX INFO: renamed from: b */
    public final void m42941b(Canvas canvas, boolean z) {
        Canvas canvas2;
        if (!z) {
            this.f73958J.getClass();
            this.f73969k.getClass();
            canvas.drawBitmap(this.f73969k, (Rect) null, this.f73958J, this.f73966h);
            return;
        }
        StaticLayout staticLayout = this.f73953E;
        StaticLayout staticLayout2 = this.f73954F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f73955G, this.f73956H);
        if (Color.alpha(this.f73979u) > 0) {
            int i = this.f73979u;
            Paint paint = this.f73965g;
            paint.setColor(i);
            canvas2 = canvas;
            canvas2.drawRect(-this.f73957I, 0.0f, staticLayout.getWidth() + this.f73957I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i2 = this.f73981w;
        TextPaint textPaint = this.f73964f;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f73959a);
            textPaint.setColor(this.f73980v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f = this.f73960b;
            if (i2 == 2) {
                float f2 = this.f73961c;
                textPaint.setShadowLayer(f, f2, f2, this.f73980v);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.f73980v;
                int i4 = z2 ? this.f73980v : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f73977s);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.f73977s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
