package p204p;

import android.content.Context;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm6 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155305a;

    public /* synthetic */ nm6(int i) {
        this.f155305a = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        n6f n6fVar;
        n6f n6fVar2;
        int i = this.f155305a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return (tm6) obj;
            case 1:
                return w2a1Var;
            case 2:
                wy41 wy41Var = AndroidCompositionLocals_androidKt.f502b;
                wpn0 wpn0Var = (wpn0) obj;
                wpn0Var.getClass();
                if (((Context) rqg1.m76244o(wpn0Var, wy41Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return zka.f283693b;
                }
                xka.f262314a.getClass();
                return wka.f252172c;
            case 3:
                List list = (List) obj;
                return new dxp(((Float) list.get(1)).floatValue(), ((Integer) list.get(0)).intValue(), new cxp(0, list));
            case 4:
                cge cgeVar = (cge) obj;
                cgeVar.m32690a("JsonPrimitive", eng1.m39501g(new w73(25)), false);
                cgeVar.m32690a("JsonNull", eng1.m39501g(new w73(26)), false);
                cgeVar.m32690a("JsonLiteral", eng1.m39501g(new w73(27)), false);
                cgeVar.m32690a("JsonObject", eng1.m39501g(new w73(23)), false);
                cgeVar.m32690a("JsonArray", eng1.m39501g(new w73(24)), false);
                return w2a1Var;
            case 5:
                List list2 = (List) obj;
                return new yw70(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 6:
                int i2 = fk4.f70465a;
                wy41 wy41Var2 = AndroidCompositionLocals_androidKt.f502b;
                wpn0 wpn0Var2 = (wpn0) obj;
                wpn0Var2.getClass();
                Context context = (Context) rqg1.m76244o(wpn0Var2, wy41Var2);
                yqq yqqVar = (yqq) rqg1.m76244o(wpn0Var2, wsh.f254617h);
                a2m0 a2m0Var = (a2m0) rqg1.m76244o(wpn0Var2, b2m0.f22644a);
                if (a2m0Var == null) {
                    return null;
                }
                return new w24(context, yqqVar, a2m0Var.f11696a, a2m0Var.f11697b);
            case 7:
                return new c8y0((Map) obj);
            case 8:
                return obj;
            case 9:
                Boolean bool = Boolean.FALSE;
                if (wj50.m88271j(obj, bool)) {
                    tf71[] tf71VarArr = TextUnit.f546b;
                    return new TextUnit(kwg1.m57539k());
                }
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                wj50.m88279p(f);
                float fFloatValue = f.floatValue();
                Object obj3 = list3.get(1);
                y9y0 y9y0Var = z9y0.f280931y;
                wj50.m88271j(obj3, bool);
                tf71 tf71Var = obj3 != null ? (tf71) y9y0Var.f270692b.invoke(obj3) : null;
                wj50.m88279p(tf71Var);
                return new TextUnit(epv0.m39669E(tf71Var.f219878a, fFloatValue));
            case 10:
                if (wj50.m88271j(obj, 0)) {
                    return new tf71(8589934592L);
                }
                return wj50.m88271j(obj, 1) ? new tf71(4294967296L) : new tf71(0L);
            case 11:
                if (wj50.m88271j(obj, Boolean.FALSE)) {
                    return new Offset(9205357640488583168L);
                }
                List list4 = (List) obj;
                Object obj4 = list4.get(0);
                Float f2 = obj4 != null ? (Float) obj4 : null;
                wj50.m88279p(f2);
                float fFloatValue2 = f2.floatValue();
                Object obj5 = list4.get(1);
                Float f3 = obj5 != null ? (Float) obj5 : null;
                wj50.m88279p(f3);
                return new Offset((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f3.floatValue())) & 4294967295L));
            case 12:
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj6 = list5.get(i3);
                    hfa0 hfa0Var = (wj50.m88271j(obj6, Boolean.FALSE) || obj6 == null) ? null : (hfa0) z9y0.f280902B.f218397b.invoke(obj6);
                    wj50.m88279p(hfa0Var);
                    arrayList.add(hfa0Var);
                }
                return new LocaleList(arrayList);
            case 13:
                return new hfa0(ckf1.m33159h((String) obj));
            case 14:
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                float f4 = ak80.f16456b;
                y9y0 y9y0Var2 = z9y0.f280904D;
                Boolean bool2 = Boolean.FALSE;
                wj50.m88271j(obj7, bool2);
                ak80 ak80Var = obj7 != null ? (ak80) y9y0Var2.f270692b.invoke(obj7) : null;
                wj50.m88279p(ak80Var);
                float f5 = ak80Var.f16459a;
                Object obj8 = list6.get(1);
                y9y0 y9y0Var3 = z9y0.f280905E;
                wj50.m88271j(obj8, bool2);
                ck80 ck80Var = obj8 != null ? (ck80) y9y0Var3.f270692b.invoke(obj8) : null;
                wj50.m88279p(ck80Var);
                int iM33086e = ck80Var.m33086e();
                Object obj9 = list6.get(2);
                y9y0 y9y0Var4 = z9y0.f280906F;
                wj50.m88271j(obj9, bool2);
                bk80 bk80Var = obj9 != null ? (bk80) y9y0Var4.f270692b.invoke(obj9) : null;
                wj50.m88279p(bk80Var);
                return new dk80(iM33086e, bk80Var.m29650e(), f5);
            case 15:
                float fFloatValue3 = ((Float) obj).floatValue();
                ak80.m26200a(fFloatValue3);
                return new ak80(fFloatValue3);
            case 16:
                return ck80.m33082a(((Integer) obj).intValue());
            case 17:
                List list7 = (List) obj;
                Object obj10 = list7.get(0);
                e25 e25Var = obj10 != null ? (e25) obj10 : null;
                wj50.m88279p(e25Var);
                Object obj11 = list7.get(2);
                Integer num = obj11 != null ? (Integer) obj11 : null;
                wj50.m88279p(num);
                int iIntValue = num.intValue();
                Object obj12 = list7.get(3);
                Integer num2 = obj12 != null ? (Integer) obj12 : null;
                wj50.m88279p(num2);
                int iIntValue2 = num2.intValue();
                Object obj13 = list7.get(4);
                String str = obj13 != null ? (String) obj13 : null;
                wj50.m88279p(str);
                switch (e25Var.ordinal()) {
                    case 0:
                        Object obj14 = list7.get(1);
                        vsm0 vsm0Var = (wj50.m88271j(obj14, Boolean.FALSE) || obj14 == null) ? null : (vsm0) z9y0.f280914h.f218397b.invoke(obj14);
                        wj50.m88279p(vsm0Var);
                        return new i15(iIntValue, iIntValue2, vsm0Var, str);
                    case 1:
                        Object obj15 = list7.get(1);
                        ew31 ew31Var = (wj50.m88271j(obj15, Boolean.FALSE) || obj15 == null) ? null : (ew31) z9y0.f280915i.f218397b.invoke(obj15);
                        wj50.m88279p(ew31Var);
                        return new i15(iIntValue, iIntValue2, ew31Var, str);
                    case 2:
                        Object obj16 = list7.get(1);
                        n9b1 n9b1Var = (wj50.m88271j(obj16, Boolean.FALSE) || obj16 == null) ? null : (n9b1) z9y0.f280910d.f218397b.invoke(obj16);
                        wj50.m88279p(n9b1Var);
                        return new i15(iIntValue, iIntValue2, n9b1Var, str);
                    case 3:
                        Object obj17 = list7.get(1);
                        kka1 kka1Var = (wj50.m88271j(obj17, Boolean.FALSE) || obj17 == null) ? null : (kka1) z9y0.f280911e.f218397b.invoke(obj17);
                        wj50.m88279p(kka1Var);
                        return new i15(iIntValue, iIntValue2, kka1Var, str);
                    case 4:
                        Object obj18 = list7.get(1);
                        xl80 xl80Var = (wj50.m88271j(obj18, Boolean.FALSE) || obj18 == null) ? null : (xl80) z9y0.f280912f.f218397b.invoke(obj18);
                        wj50.m88279p(xl80Var);
                        return new i15(iIntValue, iIntValue2, xl80Var, str);
                    case 5:
                        Object obj19 = list7.get(1);
                        wl80 wl80Var = (wj50.m88271j(obj19, Boolean.FALSE) || obj19 == null) ? null : (wl80) z9y0.f280913g.f218397b.invoke(obj19);
                        wj50.m88279p(wl80Var);
                        return new i15(iIntValue, iIntValue2, wl80Var, str);
                    case 6:
                        Object obj20 = list7.get(1);
                        String str2 = obj20 != null ? (String) obj20 : null;
                        wj50.m88279p(str2);
                        return new i15(iIntValue, iIntValue2, cl51.m33218a(str2), str);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 18:
                return bk80.m29646a(((Integer) obj).intValue());
            case 19:
                String str3 = obj != null ? (String) obj : null;
                wj50.m88279p(str3);
                return new n9b1(str3);
            case 20:
                String str4 = obj != null ? (String) obj : null;
                wj50.m88279p(str4);
                return new kka1(str4);
            case 21:
                List list8 = (List) obj;
                Object obj21 = list8.get(0);
                String str5 = obj21 != null ? (String) obj21 : null;
                wj50.m88279p(str5);
                Object obj22 = list8.get(1);
                return new xl80(str5, (wj50.m88271j(obj22, Boolean.FALSE) || obj22 == null) ? null : (sb71) z9y0.f280916j.f218397b.invoke(obj22), null, 4);
            case 22:
                List list9 = (List) obj;
                Object obj23 = list9.get(0);
                String str6 = obj23 != null ? (String) obj23 : null;
                wj50.m88279p(str6);
                Object obj24 = list9.get(1);
                return new wl80(str6, (wj50.m88271j(obj24, Boolean.FALSE) || obj24 == null) ? null : (sb71) z9y0.f280916j.f218397b.invoke(obj24), null);
            case 23:
                List list10 = (List) obj;
                Object obj25 = list10.get(0);
                y9y0 y9y0Var5 = z9y0.f280925s;
                Boolean bool3 = Boolean.FALSE;
                wj50.m88271j(obj25, bool3);
                h171 h171Var = obj25 != null ? (h171) y9y0Var5.f270692b.invoke(obj25) : null;
                wj50.m88279p(h171Var);
                int i4 = h171Var.f86525a;
                Object obj26 = list10.get(1);
                y9y0 y9y0Var6 = z9y0.f280926t;
                wj50.m88271j(obj26, bool3);
                k571 k571Var = obj26 != null ? (k571) y9y0Var6.f270692b.invoke(obj26) : null;
                wj50.m88279p(k571Var);
                int iM55429e = k571Var.m55429e();
                Object obj27 = list10.get(2);
                tf71[] tf71VarArr2 = TextUnit.f546b;
                y9y0 y9y0Var7 = z9y0.f280930x;
                wj50.m88271j(obj27, bool3);
                TextUnit textUnit = obj27 != null ? (TextUnit) y9y0Var7.f270692b.invoke(obj27) : null;
                wj50.m88279p(textUnit);
                long j = textUnit.f548a;
                Object obj28 = list10.get(3);
                ca71 ca71Var = ca71.f35759c;
                ca71 ca71Var2 = (wj50.m88271j(obj28, bool3) || obj28 == null) ? null : (ca71) z9y0.f280919m.f218397b.invoke(obj28);
                Object obj29 = list10.get(4);
                ndo0 ndo0Var = (wj50.m88271j(obj29, bool3) || obj29 == null) ? null : (ndo0) kyf1.f127843a.f218397b.invoke(obj29);
                Object obj30 = list10.get(5);
                dk80 dk80Var = dk80.f49923d;
                dk80 dk80Var2 = (wj50.m88271j(obj30, bool3) || obj30 == null) ? null : (dk80) z9y0.f280903C.f218397b.invoke(obj30);
                Object obj31 = list10.get(6);
                int i5 = xj80.f262066b;
                xj80 xj80Var = (wj50.m88271j(obj31, bool3) || obj31 == null) ? null : (xj80) kyf1.f127845c.f218397b.invoke(obj31);
                wj50.m88279p(xj80Var);
                int i6 = xj80Var.f262069a;
                Object obj32 = list10.get(7);
                y9y0 y9y0Var8 = z9y0.f280927u;
                wj50.m88271j(obj32, bool3);
                xt30 xt30Var = obj32 != null ? (xt30) y9y0Var8.f270692b.invoke(obj32) : null;
                wj50.m88279p(xt30Var);
                int iM92007e = xt30Var.m92007e();
                Object obj33 = list10.get(8);
                return new vsm0(i4, iM55429e, j, ca71Var2, ndo0Var, dk80Var2, i6, iM92007e, (wj50.m88271j(obj33, bool3) || obj33 == null) ? null : (bc71) kyf1.f127846d.f218397b.invoke(obj33));
            case 24:
                List list11 = (List) obj;
                Object obj34 = list11.get(0);
                int i7 = n6f.f150872l;
                Boolean bool4 = Boolean.FALSE;
                wj50.m88271j(obj34, bool4);
                if (obj34 == null) {
                    n6fVar = null;
                } else if (obj34.equals(bool4)) {
                    int i8 = n6f.f150872l;
                    n6fVar = new n6f(ly5.m60224n());
                } else {
                    n6fVar = new n6f(rfg1.m75432b(((Integer) obj34).intValue()));
                }
                wj50.m88279p(n6fVar);
                long j2 = n6fVar.f150873a;
                Object obj35 = list11.get(1);
                tf71[] tf71VarArr3 = TextUnit.f546b;
                gh00 gh00Var = z9y0.f280930x.f270692b;
                wj50.m88271j(obj35, bool4);
                TextUnit textUnit2 = obj35 != null ? (TextUnit) gh00Var.invoke(obj35) : null;
                wj50.m88279p(textUnit2);
                long j3 = textUnit2.f548a;
                Object obj36 = list11.get(2);
                FontWeight fontWeight = FontWeight.f524b;
                FontWeight fontWeight2 = (wj50.m88271j(obj36, bool4) || obj36 == null) ? null : (FontWeight) z9y0.f280920n.f218397b.invoke(obj36);
                Object obj37 = list11.get(3);
                FontStyle fontStyle = (wj50.m88271j(obj37, bool4) || obj37 == null) ? null : (FontStyle) z9y0.f280928v.f218397b.invoke(obj37);
                Object obj38 = list11.get(4);
                FontSynthesis fontSynthesis = (wj50.m88271j(obj38, bool4) || obj38 == null) ? null : (FontSynthesis) z9y0.f280929w.f218397b.invoke(obj38);
                Object obj39 = list11.get(6);
                String str7 = obj39 != null ? (String) obj39 : null;
                Object obj40 = list11.get(7);
                wj50.m88271j(obj40, bool4);
                TextUnit textUnit3 = obj40 != null ? (TextUnit) gh00Var.invoke(obj40) : null;
                wj50.m88279p(textUnit3);
                long j4 = textUnit3.f548a;
                Object obj41 = list11.get(8);
                BaselineShift baselineShift = (wj50.m88271j(obj41, bool4) || obj41 == null) ? null : (BaselineShift) z9y0.f280921o.f218397b.invoke(obj41);
                Object obj42 = list11.get(9);
                TextGeometricTransform textGeometricTransform = (wj50.m88271j(obj42, bool4) || obj42 == null) ? null : (TextGeometricTransform) z9y0.f280918l.f218397b.invoke(obj42);
                Object obj43 = list11.get(10);
                LocaleList localeList = LocaleList.f534c;
                LocaleList localeList2 = (wj50.m88271j(obj43, bool4) || obj43 == null) ? null : (LocaleList) z9y0.f280901A.f218397b.invoke(obj43);
                Object obj44 = list11.get(11);
                wj50.m88271j(obj44, bool4);
                if (obj44 == null) {
                    n6fVar2 = null;
                } else if (obj44.equals(bool4)) {
                    int i9 = n6f.f150872l;
                    n6fVar2 = new n6f(ly5.m60224n());
                } else {
                    n6fVar2 = new n6f(rfg1.m75432b(((Integer) obj44).intValue()));
                }
                wj50.m88279p(n6fVar2);
                long j5 = n6fVar2.f150873a;
                Object obj45 = list11.get(12);
                TextDecoration textDecoration = (wj50.m88271j(obj45, bool4) || obj45 == null) ? null : (TextDecoration) z9y0.f280917k.f218397b.invoke(obj45);
                Object obj46 = list11.get(13);
                Shadow shadow = Shadow.f496d;
                return new ew31(j2, j3, fontWeight2, fontStyle, fontSynthesis, (FontFamily) null, str7, j4, baselineShift, textGeometricTransform, localeList2, j5, textDecoration, (wj50.m88271j(obj46, bool4) || obj46 == null) ? null : (Shadow) z9y0.f280923q.f218397b.invoke(obj46), (PlatformSpanStyle) null, 49184);
            case 25:
                List list12 = (List) obj;
                Object obj47 = list12.get(0);
                gh00 gh00Var2 = z9y0.f280915i.f218397b;
                Boolean bool5 = Boolean.FALSE;
                ew31 ew31Var2 = (wj50.m88271j(obj47, bool5) || obj47 == null) ? null : (ew31) gh00Var2.invoke(obj47);
                Object obj48 = list12.get(1);
                ew31 ew31Var3 = (wj50.m88271j(obj48, bool5) || obj48 == null) ? null : (ew31) gh00Var2.invoke(obj48);
                Object obj49 = list12.get(2);
                ew31 ew31Var4 = (wj50.m88271j(obj49, bool5) || obj49 == null) ? null : (ew31) gh00Var2.invoke(obj49);
                Object obj50 = list12.get(3);
                return new sb71(ew31Var2, ew31Var3, ew31Var4, (wj50.m88271j(obj50, bool5) || obj50 == null) ? null : (ew31) gh00Var2.invoke(obj50));
            case 26:
                List list13 = (List) obj;
                Object obj51 = list13.get(1);
                List list14 = (wj50.m88271j(obj51, Boolean.FALSE) || obj51 == null) ? null : (List) z9y0.f280908b.f218397b.invoke(obj51);
                Object obj52 = list13.get(0);
                String str8 = obj52 != null ? (String) obj52 : null;
                wj50.m88279p(str8);
                return new j15(list14, str8);
            case 27:
                return new TextDecoration(((Integer) obj).intValue());
            case 28:
                List list15 = (List) obj;
                return new TextGeometricTransform(((Number) list15.get(0)).floatValue(), ((Number) list15.get(1)).floatValue());
            default:
                List list16 = (List) obj;
                Object obj53 = list16.get(0);
                tf71[] tf71VarArr4 = TextUnit.f546b;
                gh00 gh00Var3 = z9y0.f280930x.f270692b;
                Boolean bool6 = Boolean.FALSE;
                wj50.m88271j(obj53, bool6);
                TextUnit textUnit4 = obj53 != null ? (TextUnit) gh00Var3.invoke(obj53) : null;
                wj50.m88279p(textUnit4);
                long j6 = textUnit4.f548a;
                Object obj54 = list16.get(1);
                wj50.m88271j(obj54, bool6);
                TextUnit textUnit5 = obj54 != null ? (TextUnit) gh00Var3.invoke(obj54) : null;
                wj50.m88279p(textUnit5);
                return new ca71(j6, textUnit5.f548a);
        }
    }
}
