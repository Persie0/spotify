package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class fq8 extends kq8 {

    /* JADX INFO: renamed from: a */
    public final View f72094a;

    /* JADX INFO: renamed from: b */
    public final int f72095b;

    /* JADX INFO: renamed from: c */
    public final String f72096c;

    public fq8(View view, int i, String str) {
        this.f72094a = view;
        this.f72095b = i;
        this.f72096c = str;
    }

    @Override // p204p.kq8
    /* JADX INFO: renamed from: a */
    public final int mo42399a() {
        return this.f72095b;
    }

    /* JADX INFO: renamed from: b */
    public final View m42400b() {
        return this.f72094a;
    }

    /* JADX INFO: renamed from: c */
    public final String m42401c() {
        return this.f72096c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq8)) {
            return false;
        }
        fq8 fq8Var = (fq8) obj;
        return this.f72094a.equals(fq8Var.f72094a) && this.f72095b == fq8Var.f72095b && this.f72096c.equals(fq8Var.f72096c);
    }

    public final int hashCode() {
        return this.f72096c.hashCode() + mt60.m62800g(this.f72095b, this.f72094a.hashCode() * 31, 31);
    }
}
