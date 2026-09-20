package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class t6z extends u6z {
    public static final Parcelable.Creator<t6z> CREATOR = new c2z(13);

    /* JADX INFO: renamed from: a */
    public final String f217652a;

    public t6z(String str) {
        this.f217652a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6z) && wj50.m88271j(this.f217652a, ((t6z) obj).f217652a);
    }

    public final int hashCode() {
        return this.f217652a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f217652a);
    }
}
