package p204p;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ond1 extends FrameLayout implements jx51 {

    /* JADX INFO: renamed from: a */
    public final osb f167233a;

    /* JADX INFO: renamed from: b */
    public final ild1 f167234b;

    /* JADX INFO: renamed from: c */
    public List f167235c;

    /* JADX INFO: renamed from: d */
    public dvb f167236d;

    /* JADX INFO: renamed from: e */
    public float f167237e;

    /* JADX INFO: renamed from: f */
    public float f167238f;

    public ond1(Context context) {
        super(context, null);
        this.f167235c = Collections.EMPTY_LIST;
        this.f167236d = dvb.f53409g;
        this.f167237e = 0.0533f;
        this.f167238f = 0.08f;
        osb osbVar = new osb(context, 0);
        this.f167233a = osbVar;
        ild1 ild1Var = new ild1(context, null);
        this.f167234b = ild1Var;
        ild1Var.setBackgroundColor(0);
        ild1Var.getSettings().setAllowContentAccess(false);
        addView(osbVar);
        addView(ild1Var);
    }

    @Override // p204p.jx51
    /* JADX INFO: renamed from: a */
    public final void mo54496a(List list, dvb dvbVar, float f, float f2) {
        this.f167236d = dvbVar;
        this.f167237e = f;
        this.f167238f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b0m b0mVar = (b0m) list.get(i);
            if (b0mVar.f21970d != null) {
                arrayList.add(b0mVar);
            } else {
                arrayList2.add(b0mVar);
            }
        }
        if (!this.f167235c.isEmpty() || !arrayList2.isEmpty()) {
            this.f167235c = arrayList2;
            m67407c();
        }
        this.f167233a.mo54496a(arrayList, dvbVar, f, f2);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final String m67406b(float f, int i) {
        float fM61855H = mif1.m61855H(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fM61855H == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fM61855H / getContext().getResources().getDisplayMetrics().density)};
        String str = h0b1.f86200a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0232  */
    /* JADX WARN: Code duplicated, block: B:104:0x0246  */
    /* JADX WARN: Code duplicated, block: B:106:0x024c  */
    /* JADX WARN: Code duplicated, block: B:107:0x025e  */
    /* JADX WARN: Code duplicated, block: B:109:0x027a A[LOOP:2: B:108:0x0278->B:109:0x027a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x029d A[LOOP:3: B:111:0x0297->B:113:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:121:0x030e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0314  */
    /* JADX WARN: Code duplicated, block: B:124:0x032c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0332  */
    /* JADX WARN: Code duplicated, block: B:127:0x0348  */
    /* JADX WARN: Code duplicated, block: B:129:0x034e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0351  */
    /* JADX WARN: Code duplicated, block: B:132:0x0355  */
    /* JADX WARN: Code duplicated, block: B:134:0x035e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0364  */
    /* JADX WARN: Code duplicated, block: B:137:0x037e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0382  */
    /* JADX WARN: Code duplicated, block: B:140:0x039f  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0400  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:173:0x0408  */
    /* JADX WARN: Code duplicated, block: B:175:0x040c  */
    /* JADX WARN: Code duplicated, block: B:177:0x041d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0421  */
    /* JADX WARN: Code duplicated, block: B:181:0x0427  */
    /* JADX WARN: Code duplicated, block: B:183:0x042f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0432 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0434  */
    /* JADX WARN: Code duplicated, block: B:188:0x0437  */
    /* JADX WARN: Code duplicated, block: B:189:0x043b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0441  */
    /* JADX WARN: Code duplicated, block: B:191:0x0447  */
    /* JADX WARN: Code duplicated, block: B:192:0x044d  */
    /* JADX WARN: Code duplicated, block: B:195:0x045b  */
    /* JADX WARN: Code duplicated, block: B:196:0x045e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0471  */
    /* JADX WARN: Code duplicated, block: B:211:0x0489  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:243:0x0504  */
    /* JADX WARN: Code duplicated, block: B:246:0x0519  */
    /* JADX WARN: Code duplicated, block: B:252:0x054a  */
    /* JADX WARN: Code duplicated, block: B:255:0x0576 A[LOOP:6: B:253:0x0570->B:255:0x0576, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x0591 A[LOOP:7: B:257:0x058b->B:259:0x0591, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:271:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:275:0x060b  */
    /* JADX WARN: Code duplicated, block: B:277:0x060e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0615  */
    /* JADX WARN: Code duplicated, block: B:284:0x062e  */
    /* JADX WARN: Code duplicated, block: B:287:0x0649  */
    /* JADX WARN: Code duplicated, block: B:289:0x0654  */
    /* JADX WARN: Code duplicated, block: B:291:0x0657  */
    /* JADX WARN: Code duplicated, block: B:292:0x065a  */
    /* JADX WARN: Code duplicated, block: B:293:0x065d  */
    /* JADX WARN: Code duplicated, block: B:295:0x067b  */
    /* JADX WARN: Code duplicated, block: B:313:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0207  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x029d, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m67407c() {
        String strConcat;
        String str;
        String str2;
        int i;
        float f;
        String str3;
        Layout.Alignment alignment;
        String str4;
        int i2;
        int i3;
        Object obj;
        int i4;
        String str5;
        int i5;
        String str6;
        String str7;
        Object obj2;
        String str8;
        CharSequence charSequence;
        float f2;
        String str9;
        btv0 btv0Var;
        String str10;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i6;
        HashMap map;
        Iterator it;
        String str11;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i7;
        StringBuilder sb;
        int i8;
        int i9;
        sr31 sr31Var;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z;
        boolean z2;
        int i10;
        q571 q571Var;
        int i11;
        int i12;
        StringBuilder sb2;
        int i13;
        String str12;
        String strM77251j;
        int i14;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str13;
        int spanStart;
        int spanEnd;
        kw31 kw31Var;
        kw31 kw31Var2;
        String str14;
        float f3;
        String str15;
        Layout.Alignment alignment2;
        int i15;
        String str16;
        String str17;
        String str18;
        boolean z3;
        ond1 ond1Var = this;
        StringBuilder sb3 = new StringBuilder();
        String strM63414V = n0e1.m63414V(ond1Var.f167236d.f53410a);
        int i16 = 0;
        String strM67406b = ond1Var.m67406b(ond1Var.f167237e, 0);
        float f4 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        dvb dvbVar = ond1Var.f167236d;
        int i17 = dvbVar.f53413d;
        int i18 = dvbVar.f53414e;
        int i19 = 2;
        int i20 = 1;
        if (i17 == 1) {
            Object[] objArr = {n0e1.m63414V(i18)};
            String str19 = h0b1.f86200a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i17 == 2) {
            String strM63414V2 = n0e1.m63414V(i18);
            String str20 = h0b1.f86200a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strM63414V2);
        } else if (i17 == 3) {
            String strM63414V3 = n0e1.m63414V(i18);
            String str21 = h0b1.f86200a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strM63414V3);
        } else if (i17 != 4) {
            strConcat = "unset";
        } else {
            String strM63414V4 = n0e1.m63414V(i18);
            String str22 = h0b1.f86200a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strM63414V4);
        }
        Object[] objArr2 = {strM63414V, strM67406b, fValueOf, strConcat};
        String str23 = h0b1.f86200a;
        sb3.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strM63414V5 = n0e1.m63414V(ond1Var.f167236d.f53411b);
        String str24 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strM63414V5);
        String str25 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i21 = 0;
        while (i21 < ond1Var.f167235c.size()) {
            b0m b0mVar = (b0m) ond1Var.f167235c.get(i21);
            float f5 = b0mVar.f21974h;
            int i22 = b0mVar.f21973g;
            int i23 = b0mVar.f21982p;
            float f6 = f5 != -3.4028235E38f ? f5 * 100.0f : 50.0f;
            float f7 = f4;
            int i24 = b0mVar.f21975i;
            int i25 = -100;
            int i26 = i24 != i20 ? i24 != i19 ? i16 : -100 : -50;
            float f8 = b0mVar.f21971e;
            if (f8 != -3.4028235E38f) {
                if (b0mVar.f21972f != i20) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f8 * 100.0f));
                    if (i23 == i20) {
                        i25 = -(i22 != i20 ? i22 != 2 ? 0 : -100 : -50);
                    } else {
                        i25 = i22 != i20 ? i22 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    if (f8 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f8 * f7));
                        i = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f8) - 1.0f) * f7));
                        i = i20;
                    }
                    i25 = 0;
                }
                f = b0mVar.f21976j;
                if (f != -3.4028235E38f) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str26 = str3;
                alignment = b0mVar.f21968b;
                str4 = "end";
                if (alignment == null) {
                    i4 = i20;
                    obj = "center";
                    i3 = 2;
                } else {
                    i2 = nnd1.f156407a[alignment.ordinal()];
                    if (i2 != i20) {
                        i3 = 2;
                        if (i2 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i3 = 2;
                        obj = "start";
                    }
                    i4 = 1;
                }
                if (i23 != i4) {
                    str5 = "vertical-rl";
                } else if (i23 != i3) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str27 = str5;
                String strM67406b2 = ond1Var.m67406b(b0mVar.f21981o, b0mVar.f21980n);
                if (b0mVar.f21978l) {
                    i5 = b0mVar.f21979m;
                } else {
                    i5 = ond1Var.f167236d.f53412c;
                }
                String strM63414V6 = n0e1.m63414V(i5);
                if (i23 != 1) {
                    if (i != 0) {
                        str6 = "left";
                    } else {
                        str6 = "right";
                    }
                    str7 = str6;
                    obj2 = "top";
                } else if (i23 != 2) {
                    str7 = i != 0 ? "bottom" : "top";
                    obj2 = "left";
                } else {
                    if (i != 0) {
                        str6 = "right";
                    } else {
                        str6 = "left";
                    }
                    str7 = str6;
                    obj2 = "top";
                }
                if (i23 != 2 || i23 == 1) {
                    str8 = "height";
                    int i27 = i25;
                    i25 = i26;
                    i26 = i27;
                } else {
                    str8 = "width";
                }
                String str28 = str8;
                charSequence = b0mVar.f21967a;
                f2 = ond1Var.getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = lw31.f137443a;
                int i28 = i26;
                int i29 = i21;
                str9 = "";
                btv0Var = btv0.f30940g;
                if (charSequence == null) {
                    str10 = "start";
                    sr31Var = new sr31(2, str9, btv0Var);
                } else {
                    str10 = "start";
                    if (charSequence instanceof Spanned) {
                        str9 = "";
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i6 = 0;
                        while (i6 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i6].getBackgroundColor()));
                            i6++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strM77246e = s571.m77246e(iIntValue, "bg_");
                            Iterator it4 = it;
                            String strM36615o = dq60.m36615o(".", strM77246e, ",.", strM77246e, " *");
                            String strM63414V7 = n0e1.m63414V(iIntValue);
                            String str29 = h0b1.f86200a;
                            Locale locale4 = Locale.US;
                            map.put(strM36615o, str24 + strM63414V7 + str25);
                            it = it4;
                            str4 = str4;
                        }
                        str11 = str4;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i7 = 0;
                        for (length2 = spans.length; i7 < length2; length2 = i10) {
                            String str30 = str25;
                            obj3 = spans[i7];
                            String str31 = str24;
                            z = obj3 instanceof StrikethroughSpan;
                            String str32 = null;
                            if (z) {
                                z2 = z;
                                strM77251j = "<span style='text-decoration:line-through;'>";
                            } else {
                                z2 = z;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strM63414V8 = n0e1.m63414V(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str33 = h0b1.f86200a;
                                    Locale locale5 = Locale.US;
                                    strM77251j = s571.m77251j("<span style='color:", strM63414V8, ";'>");
                                } else {
                                    spans = spans;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str34 = h0b1.f86200a;
                                        Locale locale6 = Locale.US;
                                        i10 = length2;
                                        strM77251j = edb.m38563l("<span class='bg_", backgroundColor, "'>");
                                    } else {
                                        i10 = length2;
                                        if (obj3 instanceof b730) {
                                            strM77251j = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr3 = {Float.valueOf(size)};
                                            String str35 = h0b1.f86200a;
                                            strM77251j = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr3);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str36 = h0b1.f86200a;
                                            strM77251j = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr4);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str37 = h0b1.f86200a;
                                                Locale locale7 = Locale.US;
                                                strM77251j = s571.m77251j("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strM77251j = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strM77251j = "<b>";
                                            } else if (style != 2) {
                                                strM77251j = "<i>";
                                            } else if (style != 3) {
                                                strM77251j = null;
                                            } else {
                                                strM77251j = "<b><i>";
                                            }
                                        } else if (obj3 instanceof wtx0) {
                                            i14 = ((wtx0) obj3).f255033b;
                                            if (i14 != -1) {
                                                strM77251j = "<ruby style='ruby-position:unset;'>";
                                            } else if (i14 != 1) {
                                                strM77251j = "<ruby style='ruby-position:over;'>";
                                            } else if (i14 != 2) {
                                                strM77251j = null;
                                            } else {
                                                strM77251j = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strM77251j = "<u>";
                                        } else if (obj3 instanceof q571) {
                                            q571Var = (q571) obj3;
                                            i11 = q571Var.f185452a;
                                            i12 = q571Var.f185453b;
                                            sb2 = new StringBuilder();
                                            if (i12 != 1) {
                                                i13 = 2;
                                                if (i12 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i13 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i11 != 0) {
                                                sb2.append("none");
                                            } else if (i11 != 1) {
                                                sb2.append("circle");
                                            } else if (i11 != i13) {
                                                sb2.append("dot");
                                            } else if (i11 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (q571Var.f185454c != 2) {
                                                str12 = "over right";
                                            } else {
                                                str12 = "under left";
                                            }
                                            Object[] objArr5 = {string, str12};
                                            String str38 = h0b1.f86200a;
                                            strM77251j = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr5);
                                        } else {
                                            strM77251j = null;
                                        }
                                    }
                                }
                                if (z2 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof b730) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof q571)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str13 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str32 = "</b>";
                                            } else if (style2 == 2) {
                                                str32 = "</i>";
                                            } else if (style2 == 3) {
                                                str32 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof wtx0) {
                                            str32 = "<rt>" + lw31.m60099a(((wtx0) obj3).f255032a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str32 = "</u>";
                                        }
                                        str13 = str32;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strM77251j != null) {
                                    str13.getClass();
                                    jw31 jw31Var = new jw31(spanStart, strM77251j, spanEnd, str13);
                                    kw31Var = (kw31) sparseArray.get(spanStart);
                                    if (kw31Var == null) {
                                        kw31Var = new kw31();
                                        sparseArray.put(spanStart, kw31Var);
                                    }
                                    kw31Var.f127001a.add(jw31Var);
                                    kw31Var2 = (kw31) sparseArray.get(spanEnd);
                                    if (kw31Var2 == null) {
                                        kw31Var2 = new kw31();
                                        sparseArray.put(spanEnd, kw31Var2);
                                    }
                                    kw31Var2.f127002b.add(jw31Var);
                                }
                                i7++;
                                str25 = str30;
                                str24 = str31;
                                spans = spans;
                            }
                            i10 = length2;
                            str13 = z2 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM77251j != null) {
                                str13.getClass();
                                jw31 jw31Var2 = new jw31(spanStart, strM77251j, spanEnd, str13);
                                kw31Var = (kw31) sparseArray.get(spanStart);
                                if (kw31Var == null) {
                                    kw31Var = new kw31();
                                    sparseArray.put(spanStart, kw31Var);
                                }
                                kw31Var.f127001a.add(jw31Var2);
                                kw31Var2 = (kw31) sparseArray.get(spanEnd);
                                if (kw31Var2 == null) {
                                    kw31Var2 = new kw31();
                                    sparseArray.put(spanEnd, kw31Var2);
                                }
                                kw31Var2.f127002b.add(jw31Var2);
                            }
                            i7++;
                            str25 = str30;
                            str24 = str31;
                            spans = spans;
                        }
                        str25 = str25;
                        str24 = str24;
                        sb = new StringBuilder(spanned.length());
                        i8 = 0;
                        i9 = 0;
                        while (i9 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i9);
                            sb.append(lw31.m60099a(spanned.subSequence(i8, iKeyAt)));
                            kw31 kw31Var3 = (kw31) sparseArray.get(iKeyAt);
                            ArrayList arrayList = kw31Var3.f127002b;
                            ArrayList arrayList2 = kw31Var3.f127001a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, jw31.f116567f);
                            it2 = kw31Var3.f127002b.iterator();
                            while (it2.hasNext()) {
                                sb.append(((jw31) it2.next()).f116571d);
                            }
                            Collections.sort(arrayList2, jw31.f116566e);
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                sb.append(((jw31) it3.next()).f116570c);
                            }
                            i9++;
                            i8 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb.append(lw31.m60099a(spanned.subSequence(i8, spanned.length())));
                        sr31Var = new sr31(2, sb.toString(), map);
                    } else {
                        sr31Var = new sr31(2, lw31.m60099a(charSequence), btv0Var);
                    }
                    str14 = (String) sr31Var.f213224b;
                    for (String str39 : map2.keySet()) {
                        str18 = (String) map2.put(str39, (String) map2.get(str39));
                        if (str18 != null || str18.equals(map2.get(str39))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c95.m31855u(z3);
                    }
                    Integer numValueOf = Integer.valueOf(i29);
                    Float fValueOf2 = Float.valueOf(f6);
                    Integer numValueOf2 = Integer.valueOf(i28);
                    Integer numValueOf3 = Integer.valueOf(i25);
                    f3 = b0mVar.f21983q;
                    if (f3 != 0.0f) {
                        if (i23 != 2 || i23 == 1) {
                            str17 = "skewY";
                        } else {
                            str17 = "skewX";
                        }
                        Object[] objArr6 = {str17, Float.valueOf(f3)};
                        String str40 = h0b1.f86200a;
                        str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr6);
                    } else {
                        str15 = str9;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str7, str2, str28, str26, obj, str27, strM67406b2, strM63414V6, numValueOf2, numValueOf3, str15));
                    sb3.append("<span class='default_bg'>");
                    alignment2 = b0mVar.f21969c;
                    if (alignment2 != null) {
                        i15 = nnd1.f156407a[alignment2.ordinal()];
                        if (i15 != 1) {
                            i19 = 2;
                            if (i15 != 2) {
                                str16 = "center";
                            } else {
                                str16 = str11;
                            }
                        } else {
                            i19 = 2;
                            str16 = str10;
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                        sb3.append(str14);
                        sb3.append("</span>");
                    } else {
                        i19 = 2;
                        sb3.append(str14);
                    }
                    sb3.append("</span></div>");
                    i21 = i29 + 1;
                    f4 = f7;
                    str25 = str25;
                    str24 = str24;
                    i16 = 0;
                    i20 = 1;
                    ond1Var = this;
                }
                str11 = "end";
                str14 = (String) sr31Var.f213224b;
                while (r3.hasNext()) {
                    str18 = (String) map2.put(str39, (String) map2.get(str39));
                    if (str18 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    c95.m31855u(z3);
                }
                Integer numValueOf4 = Integer.valueOf(i29);
                Float fValueOf3 = Float.valueOf(f6);
                Integer numValueOf5 = Integer.valueOf(i28);
                Integer numValueOf6 = Integer.valueOf(i25);
                f3 = b0mVar.f21983q;
                if (f3 != 0.0f) {
                    if (i23 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr7 = {str17, Float.valueOf(f3)};
                    String str41 = h0b1.f86200a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                } else {
                    str15 = str9;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str7, str2, str28, str26, obj, str27, strM67406b2, strM63414V6, numValueOf5, numValueOf6, str15));
                sb3.append("<span class='default_bg'>");
                alignment2 = b0mVar.f21969c;
                if (alignment2 != null) {
                    i15 = nnd1.f156407a[alignment2.ordinal()];
                    if (i15 != 1) {
                        i19 = 2;
                        if (i15 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str11;
                        }
                    } else {
                        i19 = 2;
                        str16 = str10;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb3.append(str14);
                    sb3.append("</span>");
                } else {
                    i19 = 2;
                    sb3.append(str14);
                }
                sb3.append("</span></div>");
                i21 = i29 + 1;
                f4 = f7;
                str25 = str25;
                str24 = str24;
                i16 = 0;
                i20 = 1;
                ond1Var = this;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - ond1Var.f167238f) * 100.0f));
            }
            str2 = str;
            i = 0;
            f = b0mVar.f21976j;
            if (f != -3.4028235E38f) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = b0mVar.f21968b;
            str4 = "end";
            if (alignment == null) {
                i4 = i20;
                obj = "center";
                i3 = 2;
            } else {
                i2 = nnd1.f156407a[alignment.ordinal()];
                if (i2 != i20) {
                    i3 = 2;
                    if (i2 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i3 = 2;
                    obj = "start";
                }
                i4 = 1;
            }
            if (i23 != i4) {
                str5 = "vertical-rl";
            } else if (i23 != i3) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str211 = str5;
            String strM67406b3 = ond1Var.m67406b(b0mVar.f21981o, b0mVar.f21980n);
            if (b0mVar.f21978l) {
                i5 = b0mVar.f21979m;
            } else {
                i5 = ond1Var.f167236d.f53412c;
            }
            String strM63414V9 = n0e1.m63414V(i5);
            if (i23 != 1) {
                if (i != 0) {
                    str6 = "left";
                } else {
                    str6 = "right";
                }
                str7 = str6;
                obj2 = "top";
            } else if (i23 != 2) {
                str7 = i != 0 ? "bottom" : "top";
                obj2 = "left";
            } else {
                if (i != 0) {
                    str6 = "right";
                } else {
                    str6 = "left";
                }
                str7 = str6;
                obj2 = "top";
            }
            if (i23 != 2) {
                str8 = "height";
                int i210 = i25;
                i25 = i26;
                i26 = i210;
            } else {
                str8 = "height";
                int i211 = i25;
                i25 = i26;
                i26 = i211;
            }
            String str212 = str8;
            charSequence = b0mVar.f21967a;
            f2 = ond1Var.getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = lw31.f137443a;
            int i212 = i26;
            int i213 = i21;
            str9 = "";
            btv0Var = btv0.f30940g;
            if (charSequence == null) {
                str10 = "start";
                sr31Var = new sr31(2, str9, btv0Var);
            } else {
                str10 = "start";
                if (charSequence instanceof Spanned) {
                    sr31Var = new sr31(2, lw31.m60099a(charSequence), btv0Var);
                } else {
                    str9 = "";
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i6 = 0;
                    while (i6 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i6].getBackgroundColor()));
                        i6++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strM77246e2 = s571.m77246e(iIntValue2, "bg_");
                        Iterator it5 = it;
                        String strM36615o2 = dq60.m36615o(".", strM77246e2, ",.", strM77246e2, " *");
                        String strM63414V10 = n0e1.m63414V(iIntValue2);
                        String str213 = h0b1.f86200a;
                        Locale locale8 = Locale.US;
                        map.put(strM36615o2, str24 + strM63414V10 + str25);
                        it = it5;
                        str4 = str4;
                    }
                    str11 = str4;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i7 = 0;
                    while (i7 < length2) {
                        String str310 = str25;
                        obj3 = spans[i7];
                        String str311 = str24;
                        z = obj3 instanceof StrikethroughSpan;
                        String str312 = null;
                        if (z) {
                            z2 = z;
                            strM77251j = "<span style='text-decoration:line-through;'>";
                        } else {
                            z2 = z;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strM63414V11 = n0e1.m63414V(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str313 = h0b1.f86200a;
                                Locale locale9 = Locale.US;
                                strM77251j = s571.m77251j("<span style='color:", strM63414V11, ";'>");
                            } else {
                                spans = spans;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str314 = h0b1.f86200a;
                                    Locale locale10 = Locale.US;
                                    i10 = length2;
                                    strM77251j = edb.m38563l("<span class='bg_", backgroundColor2, "'>");
                                } else {
                                    i10 = length2;
                                    if (obj3 instanceof b730) {
                                        strM77251j = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr8 = {Float.valueOf(size)};
                                        String str315 = h0b1.f86200a;
                                        strM77251j = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str316 = h0b1.f86200a;
                                        strM77251j = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str317 = h0b1.f86200a;
                                            Locale locale11 = Locale.US;
                                            strM77251j = s571.m77251j("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strM77251j = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strM77251j = "<b>";
                                        } else if (style != 2) {
                                            strM77251j = "<i>";
                                        } else if (style != 3) {
                                            strM77251j = null;
                                        } else {
                                            strM77251j = "<b><i>";
                                        }
                                    } else if (obj3 instanceof wtx0) {
                                        i14 = ((wtx0) obj3).f255033b;
                                        if (i14 != -1) {
                                            strM77251j = "<ruby style='ruby-position:unset;'>";
                                        } else if (i14 != 1) {
                                            strM77251j = "<ruby style='ruby-position:over;'>";
                                        } else if (i14 != 2) {
                                            strM77251j = null;
                                        } else {
                                            strM77251j = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strM77251j = "<u>";
                                    } else if (obj3 instanceof q571) {
                                        q571Var = (q571) obj3;
                                        i11 = q571Var.f185452a;
                                        i12 = q571Var.f185453b;
                                        sb2 = new StringBuilder();
                                        if (i12 != 1) {
                                            i13 = 2;
                                            if (i12 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i13 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i11 != 0) {
                                            sb2.append("none");
                                        } else if (i11 != 1) {
                                            sb2.append("circle");
                                        } else if (i11 != i13) {
                                            sb2.append("dot");
                                        } else if (i11 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (q571Var.f185454c != 2) {
                                            str12 = "over right";
                                        } else {
                                            str12 = "under left";
                                        }
                                        Object[] objArr10 = {string2, str12};
                                        String str318 = h0b1.f86200a;
                                        strM77251j = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                    } else {
                                        strM77251j = null;
                                    }
                                }
                            }
                            if (z2) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM77251j != null) {
                                str13.getClass();
                                jw31 jw31Var3 = new jw31(spanStart, strM77251j, spanEnd, str13);
                                kw31Var = (kw31) sparseArray.get(spanStart);
                                if (kw31Var == null) {
                                    kw31Var = new kw31();
                                    sparseArray.put(spanStart, kw31Var);
                                }
                                kw31Var.f127001a.add(jw31Var3);
                                kw31Var2 = (kw31) sparseArray.get(spanEnd);
                                if (kw31Var2 == null) {
                                    kw31Var2 = new kw31();
                                    sparseArray.put(spanEnd, kw31Var2);
                                }
                                kw31Var2.f127002b.add(jw31Var3);
                            }
                            i7++;
                            str25 = str310;
                            str24 = str311;
                            spans = spans;
                        }
                        i10 = length2;
                        if (z2) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strM77251j != null) {
                            str13.getClass();
                            jw31 jw31Var4 = new jw31(spanStart, strM77251j, spanEnd, str13);
                            kw31Var = (kw31) sparseArray.get(spanStart);
                            if (kw31Var == null) {
                                kw31Var = new kw31();
                                sparseArray.put(spanStart, kw31Var);
                            }
                            kw31Var.f127001a.add(jw31Var4);
                            kw31Var2 = (kw31) sparseArray.get(spanEnd);
                            if (kw31Var2 == null) {
                                kw31Var2 = new kw31();
                                sparseArray.put(spanEnd, kw31Var2);
                            }
                            kw31Var2.f127002b.add(jw31Var4);
                        }
                        i7++;
                        str25 = str310;
                        str24 = str311;
                        spans = spans;
                    }
                    str25 = str25;
                    str24 = str24;
                    sb = new StringBuilder(spanned.length());
                    i8 = 0;
                    i9 = 0;
                    while (i9 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i9);
                        sb.append(lw31.m60099a(spanned.subSequence(i8, iKeyAt2)));
                        kw31 kw31Var4 = (kw31) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = kw31Var4.f127002b;
                        ArrayList arrayList4 = kw31Var4.f127001a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList3, jw31.f116567f);
                        it2 = kw31Var4.f127002b.iterator();
                        while (it2.hasNext()) {
                            sb.append(((jw31) it2.next()).f116571d);
                        }
                        Collections.sort(arrayList4, jw31.f116566e);
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            sb.append(((jw31) it3.next()).f116570c);
                        }
                        i9++;
                        i8 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb.append(lw31.m60099a(spanned.subSequence(i8, spanned.length())));
                    sr31Var = new sr31(2, sb.toString(), map);
                }
                str14 = (String) sr31Var.f213224b;
                while (r3.hasNext()) {
                    str18 = (String) map2.put(str39, (String) map2.get(str39));
                    if (str18 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    c95.m31855u(z3);
                }
                Integer numValueOf7 = Integer.valueOf(i213);
                Float fValueOf4 = Float.valueOf(f6);
                Integer numValueOf8 = Integer.valueOf(i212);
                Integer numValueOf9 = Integer.valueOf(i25);
                f3 = b0mVar.f21983q;
                if (f3 != 0.0f) {
                    if (i23 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr11 = {str17, Float.valueOf(f3)};
                    String str42 = h0b1.f86200a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr11);
                } else {
                    str15 = str9;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str7, str2, str212, str210, obj, str211, strM67406b3, strM63414V9, numValueOf8, numValueOf9, str15));
                sb3.append("<span class='default_bg'>");
                alignment2 = b0mVar.f21969c;
                if (alignment2 != null) {
                    i15 = nnd1.f156407a[alignment2.ordinal()];
                    if (i15 != 1) {
                        i19 = 2;
                        if (i15 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str11;
                        }
                    } else {
                        i19 = 2;
                        str16 = str10;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb3.append(str14);
                    sb3.append("</span>");
                } else {
                    i19 = 2;
                    sb3.append(str14);
                }
                sb3.append("</span></div>");
                i21 = i213 + 1;
                f4 = f7;
                str25 = str25;
                str24 = str24;
                i16 = 0;
                i20 = 1;
                ond1Var = this;
            }
            str11 = "end";
            str14 = (String) sr31Var.f213224b;
            while (r3.hasNext()) {
                str18 = (String) map2.put(str39, (String) map2.get(str39));
                if (str18 != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                c95.m31855u(z3);
            }
            Integer numValueOf10 = Integer.valueOf(i213);
            Float fValueOf5 = Float.valueOf(f6);
            Integer numValueOf11 = Integer.valueOf(i212);
            Integer numValueOf12 = Integer.valueOf(i25);
            f3 = b0mVar.f21983q;
            if (f3 != 0.0f) {
                if (i23 != 2) {
                    str17 = "skewY";
                } else {
                    str17 = "skewY";
                }
                Object[] objArr12 = {str17, Float.valueOf(f3)};
                String str43 = h0b1.f86200a;
                str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
            } else {
                str15 = str9;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str7, str2, str212, str210, obj, str211, strM67406b3, strM63414V9, numValueOf11, numValueOf12, str15));
            sb3.append("<span class='default_bg'>");
            alignment2 = b0mVar.f21969c;
            if (alignment2 != null) {
                i15 = nnd1.f156407a[alignment2.ordinal()];
                if (i15 != 1) {
                    i19 = 2;
                    if (i15 != 2) {
                        str16 = "center";
                    } else {
                        str16 = str11;
                    }
                } else {
                    i19 = 2;
                    str16 = str10;
                }
                sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                sb3.append(str14);
                sb3.append("</span>");
            } else {
                i19 = 2;
                sb3.append(str14);
            }
            sb3.append("</span></div>");
            i21 = i213 + 1;
            f4 = f7;
            str25 = str25;
            str24 = str24;
            i16 = 0;
            i20 = 1;
            ond1Var = this;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str44 : map2.keySet()) {
            sb5.append(str44);
            sb5.append("{");
            sb5.append((String) map2.get(str44));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, (CharSequence) sb5);
        this.f167234b.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f167235c.isEmpty()) {
            return;
        }
        m67407c();
    }
}
