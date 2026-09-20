package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class v6l implements x6l {

    /* JADX INFO: renamed from: a */
    public final int f237917a;

    /* JADX INFO: renamed from: b */
    public final pla1 f237918b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public v6l(int i, pla1 pla1Var) {
        this.f237917a = i;
        this.f237918b = pla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6l)) {
            return false;
        }
        v6l v6lVar = (v6l) obj;
        return this.f237917a == v6lVar.f237917a && wj50.m88271j(this.f237918b, v6lVar.f237918b);
    }

    public final int hashCode() {
        return this.f237918b.hashCode() + (Integer.hashCode(this.f237917a) * 31);
    }
}
