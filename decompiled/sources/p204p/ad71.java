package p204p;

import android.graphics.Rect;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ad71 {

    /* JADX INFO: renamed from: a */
    public final String f14557a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f14558b;

    /* JADX INFO: renamed from: c */
    public final Rect f14559c;

    public ad71(String str, ArrayList arrayList, Rect rect) {
        this.f14557a = str;
        this.f14558b = arrayList;
        this.f14559c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad71)) {
            return false;
        }
        ad71 ad71Var = (ad71) obj;
        return this.f14557a.equals(ad71Var.f14557a) && this.f14558b.equals(ad71Var.f14558b) && wj50.m88271j(this.f14559c, ad71Var.f14559c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f14558b, this.f14557a.hashCode() * 31, 31);
        Rect rect = this.f14559c;
        return iM59700f + (rect == null ? 0 : rect.hashCode());
    }
}
