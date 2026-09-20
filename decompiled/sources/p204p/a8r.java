package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a8r implements Parcelable {
    public static final Parcelable.Creator<a8r> CREATOR = new o5r(5);

    /* JADX INFO: renamed from: a */
    public final c8r f13344a;

    public a8r(c8r c8rVar) {
        this.f13344a = c8rVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8r) && this.f13344a == ((a8r) obj).f13344a;
    }

    public final int hashCode() {
        return this.f13344a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13344a.name());
    }
}
