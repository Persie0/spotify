package p204p;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.TextUnit;

/* JADX INFO: loaded from: classes.dex */
public final class if71 {

    /* JADX INFO: renamed from: d */
    public static final if71 f101703d = new if71(0, 0, null, null, 0, 0, 0, 0, 0, null, 0, 16777215);

    /* JADX INFO: renamed from: a */
    public final ew31 f101704a;

    /* JADX INFO: renamed from: b */
    public final vsm0 f101705b;

    /* JADX INFO: renamed from: c */
    public final eeo0 f101706c;

    public if71(ew31 ew31Var, vsm0 vsm0Var, eeo0 eeo0Var) {
        this.f101704a = ew31Var;
        this.f101705b = vsm0Var;
        this.f101706c = eeo0Var;
    }

    /* JADX INFO: renamed from: a */
    public static if71 m50418a(if71 if71Var, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, TextGeometricTransform textGeometricTransform, long j4, TextDecoration textDecoration, Shadow shadow, em51 em51Var, int i, long j5, ca71 ca71Var, eeo0 eeo0Var, dk80 dk80Var, int i2, int i3) {
        long jMo38247a = (i3 & 1) != 0 ? if71Var.f101704a.f63410a.mo38247a() : j;
        long j6 = (i3 & 2) != 0 ? if71Var.f101704a.f63411b : j2;
        FontWeight fontWeight2 = (i3 & 4) != 0 ? if71Var.f101704a.f63412c : fontWeight;
        FontStyle fontStyle2 = (i3 & 8) != 0 ? if71Var.f101704a.f63413d : fontStyle;
        FontSynthesis fontSynthesis2 = (i3 & 16) != 0 ? if71Var.f101704a.f63414e : fontSynthesis;
        FontFamily fontFamily2 = (i3 & 32) != 0 ? if71Var.f101704a.f63415f : fontFamily;
        String str2 = (i3 & 64) != 0 ? if71Var.f101704a.f63416g : str;
        long j7 = (i3 & 128) != 0 ? if71Var.f101704a.f63417h : j3;
        ew31 ew31Var = if71Var.f101704a;
        BaselineShift baselineShift = ew31Var.f63418i;
        TextGeometricTransform textGeometricTransform2 = (i3 & 512) != 0 ? ew31Var.f63419j : textGeometricTransform;
        long j8 = j6;
        LocaleList localeList = ew31Var.f63420k;
        long j9 = (i3 & 2048) != 0 ? ew31Var.f63421l : j4;
        TextDecoration textDecoration2 = (i3 & 4096) != 0 ? ew31Var.f63422m : textDecoration;
        Shadow shadow2 = (i3 & 8192) != 0 ? ew31Var.f63423n : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle = (i3 & 16384) != 0 ? ew31Var.f63425p : em51Var;
        int i4 = (i3 & 32768) != 0 ? if71Var.f101705b.f244463a : i;
        int i5 = (i3 & 65536) != 0 ? if71Var.f101705b.f244464b : 3;
        long j10 = (i3 & 131072) != 0 ? if71Var.f101705b.f244465c : j5;
        ca71 ca71Var2 = (i3 & 262144) != 0 ? if71Var.f101705b.f244466d : ca71Var;
        eeo0 eeo0Var2 = (i3 & 524288) != 0 ? if71Var.f101706c : eeo0Var;
        dk80 dk80Var2 = (i3 & 1048576) != 0 ? if71Var.f101705b.f244468f : dk80Var;
        int i6 = (i3 & 2097152) != 0 ? if71Var.f101705b.f244469g : i2;
        dk80 dk80Var3 = dk80Var2;
        int i7 = (i3 & 4194304) != 0 ? if71Var.f101705b.f244470h : 2;
        bc71 bc71Var = if71Var.f101705b.f244471i;
        int i8 = i7;
        int i9 = i6;
        long jMo38247a2 = ew31Var.f63410a.mo38247a();
        int i10 = n6f.f150872l;
        return new if71(new ew31(as91.m27074b(jMo38247a, jMo38247a2) ? ew31Var.f63410a : onq0.m67420d(jMo38247a), j8, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift, textGeometricTransform2, localeList, j9, textDecoration3, shadow2, eeo0Var2 != null ? eeo0Var2.f58825a : null, drawStyle), new vsm0(i4, i5, j10, ca71Var2, eeo0Var2 != null ? eeo0Var2.f58826b : null, dk80Var3, i9, i8, bc71Var), eeo0Var2);
    }

    /* JADX INFO: renamed from: f */
    public static if71 m50419f(if71 if71Var, long j, long j2, FontWeight fontWeight, long j3, int i, long j4, int i2) {
        long jM60224n;
        long jM57539k;
        long jM57539k2;
        long jM57539k3;
        if ((i2 & 1) != 0) {
            int i3 = n6f.f150872l;
            jM60224n = ly5.m60224n();
        } else {
            jM60224n = j;
        }
        if ((i2 & 2) != 0) {
            tf71[] tf71VarArr = TextUnit.f546b;
            jM57539k = kwg1.m57539k();
        } else {
            jM57539k = j2;
        }
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        if ((i2 & 128) != 0) {
            tf71[] tf71VarArr2 = TextUnit.f546b;
            jM57539k2 = kwg1.m57539k();
        } else {
            jM57539k2 = j3;
        }
        int i4 = n6f.f150872l;
        long jM60224n2 = ly5.m60224n();
        int i5 = (32768 & i2) != 0 ? 0 : i;
        if ((i2 & 131072) != 0) {
            tf71[] tf71VarArr3 = TextUnit.f546b;
            jM57539k3 = kwg1.m57539k();
        } else {
            jM57539k3 = j4;
        }
        int i6 = xj80.f262066b;
        b04.m27742x();
        ew31 ew31VarM42911a = fw31.m42911a(if71Var.f101704a, jM60224n, null, Float.NaN, jM57539k, fontWeight2, null, null, null, null, jM57539k2, null, null, null, jM60224n2, null, null, null, null);
        vsm0 vsm0VarM88898a = wsm0.m88898a(if71Var.f101705b, i5, 0, jM57539k3, null, null, null, 0, 0, null);
        return (if71Var.f101704a == ew31VarM42911a && if71Var.f101705b == vsm0VarM88898a) ? if71Var : new if71(ew31VarM42911a, vsm0VarM88898a);
    }

    /* JADX INFO: renamed from: b */
    public final Brush m50420b() {
        return this.f101704a.f63410a.mo38249c();
    }

    /* JADX INFO: renamed from: c */
    public final long m50421c() {
        return this.f101704a.f63410a.mo38247a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m50422d(if71 if71Var) {
        if (this != if71Var) {
            return wj50.m88271j(this.f101705b, if71Var.f101705b) && this.f101704a.m40129b(if71Var.f101704a);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final if71 m50423e(if71 if71Var) {
        return (if71Var == null || if71Var.equals(f101703d)) ? this : new if71(this.f101704a.m40131d(if71Var.f101704a), this.f101705b.m86363a(if71Var.f101705b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if71)) {
            return false;
        }
        if71 if71Var = (if71) obj;
        return wj50.m88271j(this.f101704a, if71Var.f101704a) && wj50.m88271j(this.f101705b, if71Var.f101705b) && wj50.m88271j(this.f101706c, if71Var.f101706c);
    }

    public final int hashCode() {
        int iHashCode = (this.f101705b.hashCode() + (this.f101704a.hashCode() * 31)) * 31;
        eeo0 eeo0Var = this.f101706c;
        return iHashCode + (eeo0Var != null ? eeo0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) n6f.m63771h(m50421c()));
        sb.append(", brush=");
        sb.append(m50420b());
        sb.append(", alpha=");
        ew31 ew31Var = this.f101704a;
        sb.append(ew31Var.f63410a.mo38248b());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.m311f(ew31Var.f63411b));
        sb.append(", fontWeight=");
        sb.append(ew31Var.f63412c);
        sb.append(", fontStyle=");
        sb.append(ew31Var.f63413d);
        sb.append(", fontSynthesis=");
        sb.append(ew31Var.f63414e);
        sb.append(", fontFamily=");
        sb.append(ew31Var.f63415f);
        sb.append(", fontFeatureSettings=");
        sb.append(ew31Var.f63416g);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.m311f(ew31Var.f63417h));
        sb.append(", baselineShift=");
        sb.append(ew31Var.f63418i);
        sb.append(", textGeometricTransform=");
        sb.append(ew31Var.f63419j);
        sb.append(", localeList=");
        sb.append(ew31Var.f63420k);
        sb.append(", background=");
        y8a0.m93103h(ew31Var.f63421l, ", textDecoration=", sb);
        sb.append(ew31Var.f63422m);
        sb.append(", shadow=");
        sb.append(ew31Var.f63423n);
        sb.append(", drawStyle=");
        sb.append(ew31Var.f63425p);
        sb.append(", textAlign=");
        vsm0 vsm0Var = this.f101705b;
        sb.append((Object) h171.m46410a(vsm0Var.f244463a));
        sb.append(", textDirection=");
        sb.append((Object) k571.m55428d(vsm0Var.f244464b));
        sb.append(", lineHeight=");
        sb.append((Object) TextUnit.m311f(vsm0Var.f244465c));
        sb.append(", textIndent=");
        sb.append(vsm0Var.f244466d);
        sb.append(", platformStyle=");
        sb.append(this.f101706c);
        sb.append(", lineHeightStyle=");
        sb.append(vsm0Var.f244468f);
        sb.append(", lineBreak=");
        sb.append((Object) xj80.m91208a(vsm0Var.f244469g));
        sb.append(", hyphens=");
        sb.append((Object) xt30.m92006d(vsm0Var.f244470h));
        sb.append(", textMotion=");
        sb.append(vsm0Var.f244471i);
        sb.append(')');
        return sb.toString();
    }

    public if71(ew31 ew31Var, vsm0 vsm0Var) {
        this(ew31Var, vsm0Var, gwg1.m45946r(ew31Var.f63424o, vsm0Var.f244467e));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public if71(long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, long j4, int i, int i2, long j5, dk80 dk80Var, int i3, int i4) {
        long jM60224n;
        long jM57539k;
        long jM57539k2;
        long jM60224n2;
        long jM57539k3;
        if ((i4 & 1) != 0) {
            int i5 = n6f.f150872l;
            jM60224n = ly5.m60224n();
        } else {
            jM60224n = j;
        }
        if ((i4 & 2) != 0) {
            tf71[] tf71VarArr = TextUnit.f546b;
            jM57539k = kwg1.m57539k();
        } else {
            jM57539k = j2;
        }
        FontWeight fontWeight2 = (i4 & 4) != 0 ? null : fontWeight;
        FontFamily fontFamily2 = (i4 & 32) != 0 ? null : fontFamily;
        String str = (i4 & 64) != 0 ? null : "liga 1";
        if ((i4 & 128) != 0) {
            tf71[] tf71VarArr2 = TextUnit.f546b;
            jM57539k2 = kwg1.m57539k();
        } else {
            jM57539k2 = j3;
        }
        if ((i4 & 2048) != 0) {
            int i6 = n6f.f150872l;
            jM60224n2 = ly5.m60224n();
        } else {
            jM60224n2 = j4;
        }
        TextDecoration textDecoration = (i4 & 4096) != 0 ? null : TextDecoration.f539c;
        int i7 = 0;
        int i8 = (32768 & i4) != 0 ? 0 : i;
        int i9 = (65536 & i4) != 0 ? 0 : i2;
        if ((131072 & i4) != 0) {
            tf71[] tf71VarArr3 = TextUnit.f546b;
            jM57539k3 = kwg1.m57539k();
        } else {
            jM57539k3 = j5;
        }
        dk80 dk80Var2 = (1048576 & i4) != 0 ? null : dk80Var;
        if ((i4 & 2097152) != 0) {
            int i10 = xj80.f262066b;
            b04.m27742x();
        } else {
            i7 = i3;
        }
        this(new ew31(jM60224n, jM57539k, fontWeight2, null, null, fontFamily2, str, jM57539k2, null, null, null, jM60224n2, textDecoration, null, null), new vsm0(i8, i9, jM57539k3, null, null, dk80Var2, i7, 0, null), null);
    }
}
