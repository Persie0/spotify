package p204p;

import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ez40 {

    /* JADX INFO: renamed from: a */
    public final String f64266a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f64267b;

    /* JADX INFO: renamed from: c */
    public final String f64268c;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public ez40(String str, String str2, ArrayList arrayList) {
        this.f64266a = str;
        this.f64267b = arrayList;
        this.f64268c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez40)) {
            return false;
        }
        ez40 ez40Var = (ez40) obj;
        return wj50.m88271j(this.f64266a, ez40Var.f64266a) && this.f64267b.equals(ez40Var.f64267b) && wj50.m88271j(this.f64268c, ez40Var.f64268c);
    }

    public final int hashCode() {
        return this.f64268c.hashCode() + lq51.m59700f(this.f64267b, this.f64266a.hashCode() * 31, 31);
    }
}
