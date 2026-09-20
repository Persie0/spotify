package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zz71 extends a081 {
    public static final Parcelable.Creator<zz71> CREATOR = new sr71(15);

    /* JADX INFO: renamed from: a */
    public final boolean f287907a;

    public zz71(boolean z) {
        this.f287907a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zz71) && this.f287907a == ((zz71) obj).f287907a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f287907a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f287907a ? 1 : 0);
    }
}
