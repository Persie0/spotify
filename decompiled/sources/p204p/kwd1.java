package p204p;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class kwd1 extends jwd1 {
    public kwd1(swd1 swd1Var, WindowInsets windowInsets) {
        super(swd1Var, windowInsets);
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: a */
    public swd1 mo57526a() {
        return swd1.m79536g(null, this.f106406c.consumeDisplayCutout());
    }

    @Override // p204p.iwd1, p204p.pwd1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwd1)) {
            return false;
        }
        kwd1 kwd1Var = (kwd1) obj;
        return Objects.equals(this.f106406c, kwd1Var.f106406c) && Objects.equals(this.f106410g, kwd1Var.f106410g) && iwd1.m51799C(this.f106411h, kwd1Var.f106411h);
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: f */
    public evr mo57527f() {
        DisplayCutout displayCutout = this.f106406c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new evr(displayCutout);
    }

    @Override // p204p.pwd1
    public int hashCode() {
        return this.f106406c.hashCode();
    }

    public kwd1(swd1 swd1Var, kwd1 kwd1Var) {
        super(swd1Var, kwd1Var);
    }
}
