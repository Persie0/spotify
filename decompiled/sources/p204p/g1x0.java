package p204p;

import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontWeight;

/* JADX INFO: loaded from: classes3.dex */
public final class g1x0 implements czz {

    /* JADX INFO: renamed from: a */
    public final int f75764a;

    /* JADX INFO: renamed from: b */
    public final FontWeight f75765b;

    /* JADX INFO: renamed from: c */
    public final k000 f75766c;

    public g1x0(int i, FontWeight fontWeight, k000 k000Var) {
        this.f75764a = i;
        this.f75765b = fontWeight;
        this.f75766c = k000Var;
    }

    @Override // p204p.czz
    /* JADX INFO: renamed from: a */
    public final int mo34478a() {
        return 0;
    }

    @Override // p204p.czz
    /* JADX INFO: renamed from: b */
    public final int mo34479b() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final k000 m43367c() {
        return this.f75766c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1x0)) {
            return false;
        }
        g1x0 g1x0Var = (g1x0) obj;
        return this.f75764a == g1x0Var.f75764a && wj50.m88271j(this.f75765b, g1x0Var.f75765b) && this.f75766c.equals(g1x0Var.f75766c);
    }

    @Override // p204p.czz
    public final FontWeight getWeight() {
        return this.f75765b;
    }

    public final int hashCode() {
        return this.f75766c.f117832a.hashCode() + mt60.m62800g(0, mt60.m62800g(0, ((this.f75764a * 31) + this.f75765b.f533a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f75764a + ", weight=" + this.f75765b + ", style=" + ((Object) FontStyle.m302a(0)) + ", loadingStrategy=" + ((Object) ybg1.m93285v(0)) + ')';
    }
}
