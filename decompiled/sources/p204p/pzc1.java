package p204p;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class pzc1 extends rzc1 {

    /* JADX INFO: renamed from: a */
    public final String f183666a;

    /* JADX INFO: renamed from: b */
    public final BitmapDrawable f183667b;

    /* JADX INFO: renamed from: c */
    public final double f183668c;

    public pzc1(String str, BitmapDrawable bitmapDrawable, double d) {
        this.f183666a = str;
        this.f183667b = bitmapDrawable;
        this.f183668c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzc1)) {
            return false;
        }
        pzc1 pzc1Var = (pzc1) obj;
        return wj50.m88271j(this.f183666a, pzc1Var.f183666a) && this.f183667b.equals(pzc1Var.f183667b) && Double.compare(this.f183668c, pzc1Var.f183668c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f183668c) + ((this.f183667b.hashCode() + (this.f183666a.hashCode() * 31)) * 31);
    }
}
