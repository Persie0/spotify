package p204p;

import androidx.compose.p002ui.text.PlatformSpanStyle;

/* JADX INFO: loaded from: classes.dex */
public final class eeo0 {

    /* JADX INFO: renamed from: a */
    public final PlatformSpanStyle f58825a;

    /* JADX INFO: renamed from: b */
    public final ndo0 f58826b;

    public eeo0(PlatformSpanStyle platformSpanStyle, ndo0 ndo0Var) {
        this.f58825a = platformSpanStyle;
        this.f58826b = ndo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeo0)) {
            return false;
        }
        eeo0 eeo0Var = (eeo0) obj;
        return wj50.m88271j(this.f58826b, eeo0Var.f58826b) && wj50.m88271j(this.f58825a, eeo0Var.f58825a);
    }

    public final int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.f58825a;
        int iHashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        ndo0 ndo0Var = this.f58826b;
        return iHashCode + (ndo0Var != null ? ndo0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f58825a + ", paragraphSyle=" + this.f58826b + ')';
    }

    public eeo0() {
        this(null, new ndo0());
    }
}
