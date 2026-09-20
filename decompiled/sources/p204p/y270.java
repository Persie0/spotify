package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class y270 implements a370 {
    public static final Parcelable.Creator<y270> CREATOR = new w270(1);

    /* JADX INFO: renamed from: a */
    public final String f268477a;

    public y270(String str) {
        this.f268477a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y270) && wj50.m88271j(this.f268477a, ((y270) obj).f268477a);
    }

    public final int hashCode() {
        String str = this.f268477a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f268477a);
    }
}
