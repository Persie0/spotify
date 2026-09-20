package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class t1x0 {

    /* JADX INFO: renamed from: a */
    public final Resources f216378a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f216379b;

    public t1x0(Resources resources, Resources.Theme theme) {
        this.f216378a = resources;
        this.f216379b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t1x0.class == obj.getClass()) {
            t1x0 t1x0Var = (t1x0) obj;
            if (this.f216378a.equals(t1x0Var.f216378a) && p1m0.m68831l(this.f216379b, t1x0Var.f216379b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return p1m0.m68832m(this.f216378a, this.f216379b);
    }
}
