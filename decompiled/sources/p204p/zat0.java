package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zat0 implements Parcelable {
    public static final Parcelable.Creator<zat0> CREATOR = new wds0(26);

    /* JADX INFO: renamed from: a */
    public final boolean f281153a;

    public zat0(boolean z) {
        this.f281153a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zat0) && this.f281153a == ((zat0) obj).f281153a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281153a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f281153a ? 1 : 0);
    }
}
