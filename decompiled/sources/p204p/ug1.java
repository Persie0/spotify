package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ug1 implements wg1 {

    /* JADX INFO: renamed from: a */
    public final String f229943a;

    /* JADX INFO: renamed from: b */
    public final List f229944b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public ug1(String str, List list) {
        this.f229943a = str;
        this.f229944b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug1)) {
            return false;
        }
        ug1 ug1Var = (ug1) obj;
        return wj50.m88271j(this.f229943a, ug1Var.f229943a) && wj50.m88271j(this.f229944b, ug1Var.f229944b);
    }

    public final int hashCode() {
        return this.f229944b.hashCode() + (this.f229943a.hashCode() * 31);
    }
}
