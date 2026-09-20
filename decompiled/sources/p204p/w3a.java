package p204p;

import android.graphics.Bitmap;
import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes8.dex */
public final class w3a {

    /* JADX INFO: renamed from: a */
    public final Bitmap f247528a;

    /* JADX INFO: renamed from: b */
    public final long f247529b;

    /* JADX INFO: renamed from: c */
    public final float f247530c;

    public w3a(Bitmap bitmap, long j, float f) {
        this.f247528a = bitmap;
        this.f247529b = j;
        this.f247530c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3a)) {
            return false;
        }
        w3a w3aVar = (w3a) obj;
        return wj50.m88271j(this.f247528a, w3aVar.f247528a) && Offset.m253c(this.f247529b, w3aVar.f247529b) && Float.compare(this.f247530c, w3aVar.f247530c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f247530c) + dq60.m36605e(this.f247528a.hashCode() * 31, this.f247529b, 31);
    }
}
