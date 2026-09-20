package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class qb1 implements zb1 {

    /* JADX INFO: renamed from: a */
    public final List f186977a;

    static {
        Parcelable.Creator<ubl0> creator = ubl0.CREATOR;
    }

    public qb1(List list) {
        this.f186977a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb1) && wj50.m88271j(this.f186977a, ((qb1) obj).f186977a);
    }

    public final int hashCode() {
        return this.f186977a.hashCode();
    }
}
