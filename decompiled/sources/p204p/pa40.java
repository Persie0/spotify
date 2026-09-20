package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes9.dex */
public final class pa40 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f175386a;

    /* JADX INFO: renamed from: b */
    public final boolean f175387b;

    /* JADX INFO: renamed from: c */
    public final boolean f175388c;

    public pa40(Bitmap bitmap, boolean z, boolean z2) {
        this.f175386a = bitmap;
        this.f175387b = z;
        this.f175388c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa40)) {
            return false;
        }
        pa40 pa40Var = (pa40) obj;
        return wj50.m88271j(this.f175386a, pa40Var.f175386a) && this.f175387b == pa40Var.f175387b && this.f175388c == pa40Var.f175388c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f175386a;
        return Boolean.hashCode(this.f175388c) + s571.m77245d((bitmap == null ? 0 : bitmap.hashCode()) * 31, 31, this.f175387b);
    }
}
