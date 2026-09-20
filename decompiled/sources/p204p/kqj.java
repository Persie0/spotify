package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kqj implements mqj {
    public static final Parcelable.Creator<kqj> CREATOR = new dnj(12);

    /* JADX INFO: renamed from: a */
    public final String f125321a;

    public kqj(String str) {
        this.f125321a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqj) && wj50.m88271j(this.f125321a, ((kqj) obj).f125321a);
    }

    public final int hashCode() {
        return this.f125321a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f125321a);
    }
}
