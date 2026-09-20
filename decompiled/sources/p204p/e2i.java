package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class e2i extends h2i {
    public static final Parcelable.Creator<e2i> CREATOR = new rae(29);

    /* JADX INFO: renamed from: a */
    public final String f55474a;

    public e2i(String str) {
        this.f55474a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2i) && wj50.m88271j(this.f55474a, ((e2i) obj).f55474a);
    }

    public final int hashCode() {
        return this.f55474a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55474a);
    }
}
