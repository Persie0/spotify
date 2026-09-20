package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ul21 implements vl21 {
    public static final Parcelable.Creator<ul21> CREATOR = new q321(19);

    /* JADX INFO: renamed from: a */
    public final ol21 f231418a;

    public ul21(ol21 ol21Var) {
        this.f231418a = ol21Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul21) && this.f231418a == ((ul21) obj).f231418a;
    }

    public final int hashCode() {
        return this.f231418a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f231418a.name());
    }
}
