package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class yyk implements Parcelable {
    public static final Parcelable.Creator<yyk> CREATOR = new kck(29);

    /* JADX INFO: renamed from: a */
    public final String f277528a;

    /* JADX INFO: renamed from: b */
    public final String f277529b;

    public yyk(String str, String str2) {
        this.f277528a = str;
        this.f277529b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyk)) {
            return false;
        }
        yyk yykVar = (yyk) obj;
        return wj50.m88271j(this.f277528a, yykVar.f277528a) && wj50.m88271j(this.f277529b, yykVar.f277529b);
    }

    public final String getUri() {
        return this.f277528a;
    }

    public final int hashCode() {
        return this.f277529b.hashCode() + (this.f277528a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f277528a);
        parcel.writeString(this.f277529b);
    }
}
