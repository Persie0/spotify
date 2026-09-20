package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class n990 implements q990 {
    public static final Parcelable.Creator<n990> CREATOR = new x390(16);

    /* JADX INFO: renamed from: a */
    public final String f151750a;

    public n990(String str) {
        this.f151750a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n990) && wj50.m88271j(this.f151750a, ((n990) obj).f151750a);
    }

    public final int hashCode() {
        return this.f151750a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f151750a);
    }
}
