package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class sj41 implements Parcelable {
    public static final Parcelable.Creator<sj41> CREATOR = new ln31(29);

    /* JADX INFO: renamed from: a */
    public final String f209758a;

    public sj41(String str) {
        this.f209758a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj41) && wj50.m88271j(this.f209758a, ((sj41) obj).f209758a);
    }

    public final int hashCode() {
        return this.f209758a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f209758a);
    }
}
