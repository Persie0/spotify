package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ecl implements gcl {
    public static final Parcelable.Creator<ecl> CREATOR = new z4l(12);

    /* JADX INFO: renamed from: a */
    public final String f58352a;

    public ecl(String str) {
        this.f58352a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecl) && wj50.m88271j(this.f58352a, ((ecl) obj).f58352a);
    }

    public final int hashCode() {
        String str = this.f58352a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f58352a);
    }
}
