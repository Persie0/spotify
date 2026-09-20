package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class sq50 implements Parcelable {
    public static final Parcelable.Creator<sq50> CREATOR = new pq50(1);

    /* JADX INFO: renamed from: a */
    public final String f213018a;

    /* JADX INFO: renamed from: b */
    public final String f213019b;

    public sq50(String str, String str2) {
        this.f213018a = str;
        this.f213019b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq50)) {
            return false;
        }
        sq50 sq50Var = (sq50) obj;
        return wj50.m88271j(this.f213018a, sq50Var.f213018a) && wj50.m88271j(this.f213019b, sq50Var.f213019b);
    }

    public final int hashCode() {
        return this.f213019b.hashCode() + (this.f213018a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f213018a);
        parcel.writeString(this.f213019b);
    }
}
