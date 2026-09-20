package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class uri0 implements Parcelable {
    public static final Parcelable.Creator<uri0> CREATOR = new rri0(2);

    /* JADX INFO: renamed from: a */
    public final boolean f233383a;

    public uri0(boolean z) {
        this.f233383a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uri0) && this.f233383a == ((uri0) obj).f233383a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233383a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f233383a ? 1 : 0);
    }
}
