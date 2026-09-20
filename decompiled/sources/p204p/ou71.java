package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ou71 implements Parcelable {
    public static final Parcelable.Creator<ou71> CREATOR = new sr71(2);

    /* JADX INFO: renamed from: a */
    public final long f170187a;

    public ou71(long j) {
        this.f170187a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou71) && this.f170187a == ((ou71) obj).f170187a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f170187a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f170187a);
    }
}
