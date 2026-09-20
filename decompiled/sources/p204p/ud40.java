package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class ud40 {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f229166a;

    /* JADX INFO: renamed from: b */
    public final int f229167b;

    public ud40(Resources.Theme theme, int i) {
        this.f229166a = theme;
        this.f229167b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud40)) {
            return false;
        }
        ud40 ud40Var = (ud40) obj;
        return wj50.m88271j(this.f229166a, ud40Var.f229166a) && this.f229167b == ud40Var.f229167b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f229167b) + (this.f229166a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f229166a);
        sb.append(", id=");
        return edb.m38567p(sb, this.f229167b, ')');
    }
}
