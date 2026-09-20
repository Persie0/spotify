package p204p;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes10.dex */
public final class wd40 {

    /* JADX INFO: renamed from: a */
    public final uze1 f250203a;

    /* JADX INFO: renamed from: b */
    public final RectF f250204b;

    public wd40(uze1 uze1Var, RectF rectF) {
        this.f250203a = uze1Var;
        this.f250204b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd40)) {
            return false;
        }
        wd40 wd40Var = (wd40) obj;
        return wj50.m88271j(this.f250203a, wd40Var.f250203a) && wj50.m88271j(this.f250204b, wd40Var.f250204b);
    }

    public final int hashCode() {
        return this.f250204b.hashCode() + (this.f250203a.hashCode() * 31);
    }
}
