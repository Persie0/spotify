package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class had implements lad {

    /* JADX INFO: renamed from: a */
    public final pla1 f89194a;

    /* JADX INFO: renamed from: b */
    public final boolean f89195b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public had(pla1 pla1Var, boolean z) {
        this.f89194a = pla1Var;
        this.f89195b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof had)) {
            return false;
        }
        had hadVar = (had) obj;
        return wj50.m88271j(this.f89194a, hadVar.f89194a) && this.f89195b == hadVar.f89195b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89195b) + (this.f89194a.hashCode() * 31);
    }
}
