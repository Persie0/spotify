package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class sd21 implements ud21 {
    public static final Parcelable.Creator<sd21> CREATOR = new q321(15);

    /* JADX INFO: renamed from: a */
    public final csc1 f207868a;

    public sd21(csc1 csc1Var) {
        this.f207868a = csc1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd21) && this.f207868a == ((sd21) obj).f207868a;
    }

    public final int hashCode() {
        return this.f207868a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f207868a.name());
    }
}
