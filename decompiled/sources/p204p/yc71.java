package p204p;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class yc71 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f271421a;

    /* JADX INFO: renamed from: b */
    public final Set f271422b;

    /* JADX INFO: renamed from: c */
    public final Rect f271423c;

    public yc71(ArrayList arrayList, Set set, Rect rect) {
        this.f271421a = arrayList;
        this.f271422b = set;
        this.f271423c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc71)) {
            return false;
        }
        yc71 yc71Var = (yc71) obj;
        return this.f271421a.equals(yc71Var.f271421a) && wj50.m88271j(this.f271422b, yc71Var.f271422b) && wj50.m88271j(this.f271423c, yc71Var.f271423c);
    }

    public final int hashCode() {
        int iM56830b = klh.m56830b(this.f271421a.hashCode() * 31, 31, this.f271422b);
        Rect rect = this.f271423c;
        return iM56830b + (rect == null ? 0 : rect.hashCode());
    }
}
