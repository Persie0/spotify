package p204p;

import android.text.Html;
import android.text.Spanned;
import android.text.style.URLSpan;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class q15 {

    /* JADX INFO: renamed from: a */
    public static final ew31 f184209a = new ew31(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f539c, (Shadow) null, (PlatformSpanStyle) null, 61439);

    /* JADX INFO: renamed from: a */
    public static final j15 m71868a(String str, gh00 gh00Var) {
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        String string = wl51.m88493q1(spannedFromHtml.toString()).toString();
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM79995j = t3d1.m79995j();
        new ArrayList();
        sb.append(string);
        for (Object obj : spannedFromHtml.getSpans(0, string.length(), URLSpan.class)) {
            URLSpan uRLSpan = (URLSpan) obj;
            int spanStart = spannedFromHtml.getSpanStart(uRLSpan);
            int spanEnd = spannedFromHtml.getSpanEnd(uRLSpan);
            int length = string.length();
            if (spanEnd <= length) {
                length = spanEnd;
            }
            arrayListM79995j.add(new f15(spanStart, length, 8, new xl80(uRLSpan.getURL(), new sb71(f184209a, null, 14), new p15(0, uRLSpan, gh00Var)), null));
        }
        String string2 = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM79995j.size());
        int size = arrayListM79995j.size();
        for (int iM62683h = 0; iM62683h < size; iM62683h = ms2.m62683h(sb, (f15) arrayListM79995j.get(iM62683h), arrayList, iM62683h, 1)) {
        }
        return new j15(string2, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static final j15 m71869b(j15 j15Var, String str) {
        int iM88458H0 = wl51.m88458H0(j15Var.f107641b, "{{COUNTDOWN}}", 0, false, 6);
        if (iM88458H0 < 0) {
            return j15Var;
        }
        String strM29801l0 = bm51.m29801l0(j15Var.f107641b, "{{COUNTDOWN}}", str);
        int length = str.length() - 13;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM79995j = t3d1.m79995j();
        new ArrayList();
        sb.append(strM29801l0);
        for (i15 i15Var : j15Var.m52113b()) {
            int length2 = i15Var.f97389b;
            int length3 = i15Var.f97390c;
            int i = 13 + iM88458H0;
            if (length2 >= i) {
                length2 += length;
            } else if (length2 > iM88458H0) {
                length2 = str.length() + iM88458H0;
            }
            int i2 = length2;
            if (length3 > iM88458H0) {
                length3 = length3 <= i ? str.length() + iM88458H0 : length3 + length;
            }
            int i3 = length3;
            if (i2 < i3) {
                arrayListM79995j.add(new f15(i2, i3, 8, (ew31) i15Var.f97388a, null));
            }
        }
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM79995j.size());
        int size = arrayListM79995j.size();
        for (int iM62683h = 0; iM62683h < size; iM62683h = ms2.m62683h(sb, (f15) arrayListM79995j.get(iM62683h), arrayList, iM62683h, 1)) {
        }
        return new j15(string, arrayList);
    }
}
