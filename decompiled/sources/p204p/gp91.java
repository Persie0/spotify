package p204p;

import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontWeight;

/* JADX INFO: loaded from: classes.dex */
public final class gp91 {

    /* JADX INFO: renamed from: a */
    public final FontFamily f83112a;

    /* JADX INFO: renamed from: b */
    public final FontWeight f83113b;

    /* JADX INFO: renamed from: c */
    public final int f83114c;

    /* JADX INFO: renamed from: d */
    public final int f83115d;

    /* JADX INFO: renamed from: e */
    public final Object f83116e;

    public gp91(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.f83112a = fontFamily;
        this.f83113b = fontWeight;
        this.f83114c = i;
        this.f83115d = i2;
        this.f83116e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp91)) {
            return false;
        }
        gp91 gp91Var = (gp91) obj;
        return wj50.m88271j(this.f83112a, gp91Var.f83112a) && wj50.m88271j(this.f83113b, gp91Var.f83113b) && this.f83114c == gp91Var.f83114c && this.f83115d == gp91Var.f83115d && wj50.m88271j(this.f83116e, gp91Var.f83116e);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.f83112a;
        int iM62800g = mt60.m62800g(this.f83115d, mt60.m62800g(this.f83114c, (((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.f83113b.f533a) * 31, 31), 31);
        Object obj = this.f83116e;
        return iM62800g + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f83112a);
        sb.append(", fontWeight=");
        sb.append(this.f83113b);
        sb.append(", fontStyle=");
        sb.append((Object) FontStyle.m302a(this.f83114c));
        sb.append(", fontSynthesis=");
        int i = this.f83115d;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Weight";
        } else if (i == 2) {
            str = "Style";
        } else {
            str = i == 65535 ? "All" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f83116e);
        sb.append(')');
        return sb.toString();
    }
}
