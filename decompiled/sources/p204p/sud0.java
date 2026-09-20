package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class sud0 implements wud0 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f214055a;

    public sud0(Bitmap bitmap) {
        this.f214055a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sud0) && wj50.m88271j(this.f214055a, ((sud0) obj).f214055a);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f214055a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }
}
