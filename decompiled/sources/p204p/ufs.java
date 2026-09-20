package p204p;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ufs implements p340 {

    /* JADX INFO: renamed from: a */
    public final Drawable f229869a;

    public ufs(Drawable drawable) {
        this.f229869a = drawable;
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: a */
    public final long mo68985a() {
        Drawable drawable = this.f229869a;
        long jM46416b = ((long) h1b1.m46416b(drawable)) * 4 * ((long) h1b1.m46415a(drawable));
        if (jM46416b < 0) {
            return 0L;
        }
        return jM46416b;
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: b */
    public final int mo68986b() {
        return h1b1.m46415a(this.f229869a);
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: c */
    public final void mo68987c(Canvas canvas) {
        this.f229869a.draw(canvas);
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: d */
    public final int mo68988d() {
        return h1b1.m46416b(this.f229869a);
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: e */
    public final boolean mo68989e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufs) && wj50.m88271j(this.f229869a, ((ufs) obj).f229869a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f229869a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f229869a + ", shareable=false)";
    }
}
