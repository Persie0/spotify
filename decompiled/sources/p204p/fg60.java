package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class fg60 implements Parcelable {
    public static final Parcelable.Creator<fg60> CREATOR = new pq50(18);

    /* JADX INFO: renamed from: a */
    public final hg60 f69234a;

    public fg60(hg60 hg60Var) {
        this.f69234a = hg60Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg60) && this.f69234a == ((fg60) obj).f69234a;
    }

    public final int hashCode() {
        return this.f69234a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69234a.name());
    }
}
