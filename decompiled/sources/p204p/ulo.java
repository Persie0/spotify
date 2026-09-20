package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class ulo implements wlo {

    /* JADX INFO: renamed from: a */
    public final String f231597a;

    /* JADX INFO: renamed from: b */
    public final View f231598b;

    public ulo(View view, String str) {
        this.f231597a = str;
        this.f231598b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulo)) {
            return false;
        }
        ulo uloVar = (ulo) obj;
        return wj50.m88271j(this.f231597a, uloVar.f231597a) && wj50.m88271j(this.f231598b, uloVar.f231598b);
    }

    public final int hashCode() {
        return this.f231598b.hashCode() + (this.f231597a.hashCode() * 31);
    }
}
