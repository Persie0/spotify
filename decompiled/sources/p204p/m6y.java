package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class m6y implements p6y {
    public static final Parcelable.Creator<m6y> CREATOR = new wfw(20);

    /* JADX INFO: renamed from: a */
    public final int f140598a;

    public m6y(int i) {
        this.f140598a = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m61036c() {
        return this.f140598a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6y) && this.f140598a == ((m6y) obj).f140598a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140598a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f140598a);
    }
}
