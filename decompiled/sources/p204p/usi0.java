package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class usi0 implements Parcelable {
    public static final Parcelable.Creator<usi0> CREATOR = new rri0(3);

    /* JADX INFO: renamed from: a */
    public final boolean f233640a;

    public usi0(boolean z) {
        this.f233640a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usi0) && this.f233640a == ((usi0) obj).f233640a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233640a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f233640a ? 1 : 0);
    }
}
