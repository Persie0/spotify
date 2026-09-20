package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class d2z implements Parcelable {
    public static final Parcelable.Creator<d2z> CREATOR = new c2z(0);

    /* JADX INFO: renamed from: a */
    public final f2z f44698a;

    public d2z(f2z f2zVar) {
        this.f44698a = f2zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2z) && this.f44698a == ((d2z) obj).f44698a;
    }

    public final int hashCode() {
        return this.f44698a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44698a.name());
    }
}
