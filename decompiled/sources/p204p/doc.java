package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class doc implements Parcelable {
    public static final Parcelable.Creator<doc> CREATOR = new n6f1(8);

    /* JADX INFO: renamed from: a */
    public final long f51008a;

    /* JADX INFO: renamed from: b */
    public final String f51009b;

    public doc(long j, String str) {
        this.f51008a = j;
        this.f51009b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doc)) {
            return false;
        }
        doc docVar = (doc) obj;
        return this.f51008a == docVar.f51008a && wj50.m88271j(this.f51009b, docVar.f51009b);
    }

    public final int hashCode() {
        return this.f51009b.hashCode() + (Long.hashCode(this.f51008a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f51008a);
        parcel.writeString(this.f51009b);
    }
}
