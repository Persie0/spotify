package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class rh9 implements p340 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f199177a;

    public rh9(Bitmap bitmap) {
        this.f199177a = bitmap;
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: a */
    public final long mo68985a() {
        return n0b1.m63372l(this.f199177a);
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: b */
    public final int mo68986b() {
        return this.f199177a.getHeight();
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: c */
    public final void mo68987c(Canvas canvas) {
        canvas.drawBitmap(this.f199177a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: d */
    public final int mo68988d() {
        return this.f199177a.getWidth();
    }

    @Override // p204p.p340
    /* JADX INFO: renamed from: e */
    public final boolean mo68989e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh9) && wj50.m88271j(this.f199177a, ((rh9) obj).f199177a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f199177a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f199177a + ", shareable=true)";
    }
}
