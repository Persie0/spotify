package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pjk {

    /* JADX INFO: renamed from: a */
    public final pla1 f178273a;

    /* JADX INFO: renamed from: b */
    public final boolean f178274b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public pjk(pla1 pla1Var, boolean z) {
        this.f178273a = pla1Var;
        this.f178274b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjk)) {
            return false;
        }
        pjk pjkVar = (pjk) obj;
        return wj50.m88271j(this.f178273a, pjkVar.f178273a) && this.f178274b == pjkVar.f178274b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178274b) + (this.f178273a.hashCode() * 31);
    }
}
