package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class sh9 implements ta40 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f209148a;

    public sh9(Bitmap bitmap) {
        this.f209148a = bitmap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.f209148a;
        sb.append(bitmap.getWidth());
        sb.append("px x ");
        sb.append(bitmap.getHeight());
        sb.append("px))");
        return sb.toString();
    }
}
