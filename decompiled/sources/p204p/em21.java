package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class em21 implements Parcelable {
    public static final Parcelable.Creator<em21> CREATOR = new q321(21);

    /* JADX INFO: renamed from: a */
    public final String f60799a;

    public em21(String str) {
        this.f60799a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em21) && wj50.m88271j(this.f60799a, ((em21) obj).f60799a);
    }

    public final int hashCode() {
        String str = this.f60799a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60799a);
    }
}
