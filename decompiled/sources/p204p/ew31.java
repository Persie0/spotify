package p204p;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
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

/* JADX INFO: loaded from: classes.dex */
public final class ew31 implements e15 {

    /* JADX INFO: renamed from: a */
    public final v971 f63410a;

    /* JADX INFO: renamed from: b */
    public final long f63411b;

    /* JADX INFO: renamed from: c */
    public final FontWeight f63412c;

    /* JADX INFO: renamed from: d */
    public final FontStyle f63413d;

    /* JADX INFO: renamed from: e */
    public final FontSynthesis f63414e;

    /* JADX INFO: renamed from: f */
    public final FontFamily f63415f;

    /* JADX INFO: renamed from: g */
    public final String f63416g;

    /* JADX INFO: renamed from: h */
    public final long f63417h;

    /* JADX INFO: renamed from: i */
    public final BaselineShift f63418i;

    /* JADX INFO: renamed from: j */
    public final TextGeometricTransform f63419j;

    /* JADX INFO: renamed from: k */
    public final LocaleList f63420k;

    /* JADX INFO: renamed from: l */
    public final long f63421l;

    /* JADX INFO: renamed from: m */
    public final TextDecoration f63422m;

    /* JADX INFO: renamed from: n */
    public final Shadow f63423n;

    /* JADX INFO: renamed from: o */
    public final PlatformSpanStyle f63424o;

    /* JADX INFO: renamed from: p */
    public final DrawStyle f63425p;

    public ew31(v971 v971Var, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.f63410a = v971Var;
        this.f63411b = j;
        this.f63412c = fontWeight;
        this.f63413d = fontStyle;
        this.f63414e = fontSynthesis;
        this.f63415f = fontFamily;
        this.f63416g = str;
        this.f63417h = j2;
        this.f63418i = baselineShift;
        this.f63419j = textGeometricTransform;
        this.f63420k = localeList;
        this.f63421l = j3;
        this.f63422m = textDecoration;
        this.f63423n = shadow;
        this.f63424o = platformSpanStyle;
        this.f63425p = drawStyle;
    }

    /* JADX INFO: renamed from: a */
    public static ew31 m40128a(ew31 ew31Var, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontFamily fontFamily, long j3, int i) {
        long jMo38247a = (i & 1) != 0 ? ew31Var.f63410a.mo38247a() : j;
        long j4 = (i & 2) != 0 ? ew31Var.f63411b : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? ew31Var.f63412c : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? ew31Var.f63413d : fontStyle;
        FontSynthesis fontSynthesis = ew31Var.f63414e;
        FontFamily fontFamily2 = (i & 32) != 0 ? ew31Var.f63415f : fontFamily;
        String str = ew31Var.f63416g;
        long j5 = ew31Var.f63417h;
        BaselineShift baselineShift = ew31Var.f63418i;
        TextGeometricTransform textGeometricTransform = ew31Var.f63419j;
        LocaleList localeList = ew31Var.f63420k;
        long j6 = (i & 2048) != 0 ? ew31Var.f63421l : j3;
        TextDecoration textDecoration = ew31Var.f63422m;
        Shadow shadow = ew31Var.f63423n;
        PlatformSpanStyle platformSpanStyle = ew31Var.f63424o;
        DrawStyle drawStyle = ew31Var.f63425p;
        v971 v971Var = ew31Var.f63410a;
        long jMo38247a2 = v971Var.mo38247a();
        int i2 = n6f.f150872l;
        return new ew31(as91.m27074b(jMo38247a, jMo38247a2) ? v971Var : onq0.m67420d(jMo38247a), j4, fontWeight2, fontStyle2, fontSynthesis, fontFamily2, str, j5, baselineShift, textGeometricTransform, localeList, j6, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m40129b(ew31 ew31Var) {
        if (this == ew31Var) {
            return true;
        }
        if (!TextUnit.m306a(this.f63411b, ew31Var.f63411b) || !wj50.m88271j(this.f63412c, ew31Var.f63412c) || !wj50.m88271j(this.f63413d, ew31Var.f63413d) || !wj50.m88271j(this.f63414e, ew31Var.f63414e) || !wj50.m88271j(this.f63415f, ew31Var.f63415f) || !wj50.m88271j(this.f63416g, ew31Var.f63416g) || !TextUnit.m306a(this.f63417h, ew31Var.f63417h) || !wj50.m88271j(this.f63418i, ew31Var.f63418i) || !wj50.m88271j(this.f63419j, ew31Var.f63419j) || !wj50.m88271j(this.f63420k, ew31Var.f63420k)) {
            return false;
        }
        long j = ew31Var.f63421l;
        int i = n6f.f150872l;
        return as91.m27074b(this.f63421l, j) && wj50.m88271j(this.f63424o, ew31Var.f63424o);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m40130c(ew31 ew31Var) {
        return wj50.m88271j(this.f63410a, ew31Var.f63410a) && wj50.m88271j(this.f63422m, ew31Var.f63422m) && wj50.m88271j(this.f63423n, ew31Var.f63423n) && wj50.m88271j(this.f63425p, ew31Var.f63425p);
    }

    /* JADX INFO: renamed from: d */
    public final ew31 m40131d(ew31 ew31Var) {
        if (ew31Var == null) {
            return this;
        }
        v971 v971Var = ew31Var.f63410a;
        return fw31.m42911a(this, v971Var.mo38247a(), v971Var.mo38249c(), v971Var.mo38248b(), ew31Var.f63411b, ew31Var.f63412c, ew31Var.f63413d, ew31Var.f63414e, ew31Var.f63415f, ew31Var.f63416g, ew31Var.f63417h, ew31Var.f63418i, ew31Var.f63419j, ew31Var.f63420k, ew31Var.f63421l, ew31Var.f63422m, ew31Var.f63423n, ew31Var.f63424o, ew31Var.f63425p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew31)) {
            return false;
        }
        ew31 ew31Var = (ew31) obj;
        return m40129b(ew31Var) && m40130c(ew31Var);
    }

    public final int hashCode() {
        v971 v971Var = this.f63410a;
        long jMo38247a = v971Var.mo38247a();
        int i = n6f.f150872l;
        int iM27075c = as91.m27075c(jMo38247a) * 31;
        Brush brushMo38249c = v971Var.mo38249c();
        int iHashCode = (Float.hashCode(v971Var.mo38248b()) + ((iM27075c + (brushMo38249c != null ? brushMo38249c.hashCode() : 0)) * 31)) * 31;
        tf71[] tf71VarArr = TextUnit.f546b;
        int iM36605e = dq60.m36605e(iHashCode, this.f63411b, 31);
        FontWeight fontWeight = this.f63412c;
        int i2 = (iM36605e + (fontWeight != null ? fontWeight.f533a : 0)) * 31;
        FontStyle fontStyle = this.f63413d;
        int iHashCode2 = (i2 + (fontStyle != null ? Integer.hashCode(fontStyle.f516a) : 0)) * 31;
        FontSynthesis fontSynthesis = this.f63414e;
        int iHashCode3 = (iHashCode2 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.f517a) : 0)) * 31;
        FontFamily fontFamily = this.f63415f;
        int iHashCode4 = (iHashCode3 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.f63416g;
        int iM36605e2 = dq60.m36605e((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31, this.f63417h, 31);
        BaselineShift baselineShift = this.f63418i;
        int iHashCode5 = (iM36605e2 + (baselineShift != null ? Float.hashCode(baselineShift.f537a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.f63419j;
        int iHashCode6 = (iHashCode5 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.f63420k;
        int iM62682g = ms2.m62682g((iHashCode6 + (localeList != null ? localeList.f535a.hashCode() : 0)) * 31, this.f63421l, 31);
        TextDecoration textDecoration = this.f63422m;
        int i3 = (iM62682g + (textDecoration != null ? textDecoration.f541a : 0)) * 31;
        Shadow shadow = this.f63423n;
        int iHashCode7 = (i3 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.f63424o;
        int iHashCode8 = (iHashCode7 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.f63425p;
        return iHashCode8 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        v971 v971Var = this.f63410a;
        sb.append((Object) n6f.m63771h(v971Var.mo38247a()));
        sb.append(", brush=");
        sb.append(v971Var.mo38249c());
        sb.append(", alpha=");
        sb.append(v971Var.mo38248b());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.m311f(this.f63411b));
        sb.append(", fontWeight=");
        sb.append(this.f63412c);
        sb.append(", fontStyle=");
        sb.append(this.f63413d);
        sb.append(", fontSynthesis=");
        sb.append(this.f63414e);
        sb.append(", fontFamily=");
        sb.append(this.f63415f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f63416g);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.m311f(this.f63417h));
        sb.append(", baselineShift=");
        sb.append(this.f63418i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f63419j);
        sb.append(", localeList=");
        sb.append(this.f63420k);
        sb.append(", background=");
        y8a0.m93103h(this.f63421l, ", textDecoration=", sb);
        sb.append(this.f63422m);
        sb.append(", shadow=");
        sb.append(this.f63423n);
        sb.append(", platformStyle=");
        sb.append(this.f63424o);
        sb.append(", drawStyle=");
        sb.append(this.f63425p);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ew31(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i) {
        long jM60224n;
        long jM57539k;
        long jM57539k2;
        long jM60224n2;
        if ((i & 1) != 0) {
            int i2 = n6f.f150872l;
            jM60224n = ly5.m60224n();
        } else {
            jM60224n = j;
        }
        if ((i & 2) != 0) {
            tf71[] tf71VarArr = TextUnit.f546b;
            jM57539k = kwg1.m57539k();
        } else {
            jM57539k = j2;
        }
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        if ((i & 128) != 0) {
            tf71[] tf71VarArr2 = TextUnit.f546b;
            jM57539k2 = kwg1.m57539k();
        } else {
            jM57539k2 = j3;
        }
        BaselineShift baselineShift2 = (i & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? null : localeList;
        if ((i & 2048) != 0) {
            int i3 = n6f.f150872l;
            jM60224n2 = ly5.m60224n();
        } else {
            jM60224n2 = j4;
        }
        this(jM60224n, jM57539k, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, jM57539k2, baselineShift2, textGeometricTransform2, localeList2, jM60224n2, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : platformSpanStyle);
    }

    public ew31(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(onq0.m67420d(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, (DrawStyle) null);
    }
}
