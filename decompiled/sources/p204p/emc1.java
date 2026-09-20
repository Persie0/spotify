package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class emc1 implements hnc1 {
    public static final Parcelable.Creator<emc1> CREATOR = new nlc1(14);

    /* JADX INFO: renamed from: a */
    public final String f60883a;

    /* JADX INFO: renamed from: b */
    public final sv50 f60884b;

    public emc1(String str, sv50 sv50Var) {
        this.f60883a = str;
        this.f60884b = sv50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emc1)) {
            return false;
        }
        emc1 emc1Var = (emc1) obj;
        return wj50.m88271j(this.f60883a, emc1Var.f60883a) && wj50.m88271j(this.f60884b, emc1Var.f60884b);
    }

    public final int hashCode() {
        return this.f60884b.hashCode() + (this.f60883a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60883a);
        parcel.writeParcelable(this.f60884b, i);
    }
}
