package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes9.dex */
public final class zc71 {

    /* JADX INFO: renamed from: a */
    public final String f281473a;

    /* JADX INFO: renamed from: b */
    public final Rect f281474b;

    public zc71(String str, Rect rect) {
        this.f281473a = str;
        this.f281474b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc71)) {
            return false;
        }
        zc71 zc71Var = (zc71) obj;
        return wj50.m88271j(this.f281473a, zc71Var.f281473a) && wj50.m88271j(this.f281474b, zc71Var.f281474b);
    }

    public final int hashCode() {
        int iHashCode = this.f281473a.hashCode() * 31;
        Rect rect = this.f281474b;
        return iHashCode + (rect == null ? 0 : rect.hashCode());
    }
}
