package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class mrl implements Parcelable {
    public static final Parcelable.Creator<mrl> CREATOR = new pkl(3);

    /* JADX INFO: renamed from: a */
    public final String f146577a;

    /* JADX INFO: renamed from: b */
    public final String f146578b;

    public mrl(String str, String str2) {
        this.f146577a = str;
        this.f146578b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrl)) {
            return false;
        }
        mrl mrlVar = (mrl) obj;
        return wj50.m88271j(this.f146577a, mrlVar.f146577a) && wj50.m88271j(this.f146578b, mrlVar.f146578b);
    }

    public final int hashCode() {
        return this.f146578b.hashCode() + (this.f146577a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f146577a);
        parcel.writeString(this.f146578b);
    }
}
