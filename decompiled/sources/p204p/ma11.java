package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ma11 {

    /* JADX INFO: renamed from: a */
    public final String f141429a;

    /* JADX INFO: renamed from: b */
    public final List f141430b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public ma11(String str, List list) {
        this.f141429a = str;
        this.f141430b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma11)) {
            return false;
        }
        ma11 ma11Var = (ma11) obj;
        return wj50.m88271j(this.f141429a, ma11Var.f141429a) && wj50.m88271j(this.f141430b, ma11Var.f141430b);
    }

    public final int hashCode() {
        return this.f141430b.hashCode() + (this.f141429a.hashCode() * 31);
    }
}
