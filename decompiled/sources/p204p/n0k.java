package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class n0k implements p0k {
    public static final Parcelable.Creator<n0k> CREATOR = new dnj(15);

    /* JADX INFO: renamed from: a */
    public final String f149104a;

    /* JADX INFO: renamed from: b */
    public final String f149105b;

    public n0k(String str, String str2) {
        this.f149104a = str;
        this.f149105b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0k)) {
            return false;
        }
        n0k n0kVar = (n0k) obj;
        return wj50.m88271j(this.f149104a, n0kVar.f149104a) && wj50.m88271j(this.f149105b, n0kVar.f149105b);
    }

    public final int hashCode() {
        return this.f149105b.hashCode() + (this.f149104a.hashCode() * 31);
    }

    @Override // p204p.p0k
    /* JADX INFO: renamed from: m1 */
    public final sef mo63457m1() {
        return new qef(this.f149105b, this.f149104a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149104a);
        parcel.writeString(this.f149105b);
    }
}
