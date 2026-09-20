package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class mqs implements Parcelable {
    public static final Parcelable.Creator<mqs> CREATOR = new f9s(10);

    /* JADX INFO: renamed from: a */
    public final int f146348a;

    /* JADX INFO: renamed from: b */
    public final String f146349b;

    public mqs(int i, String str) {
        this.f146348a = i;
        this.f146349b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqs)) {
            return false;
        }
        mqs mqsVar = (mqs) obj;
        return this.f146348a == mqsVar.f146348a && wj50.m88271j(this.f146349b, mqsVar.f146349b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f146348a) * 31;
        String str = this.f146349b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f146348a);
        parcel.writeString(this.f146349b);
    }
}
