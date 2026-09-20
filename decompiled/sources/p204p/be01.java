package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class be01 implements Parcelable {
    public static final Parcelable.Creator<be01> CREATOR = new vcz0(23);

    /* JADX INFO: renamed from: a */
    public final String f26239a;

    public be01(String str) {
        this.f26239a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be01) && wj50.m88271j(this.f26239a, ((be01) obj).f26239a);
    }

    public final int hashCode() {
        return this.f26239a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26239a);
    }
}
