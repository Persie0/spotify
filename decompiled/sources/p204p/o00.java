package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00 extends e10 {
    public static final Parcelable.Creator<o00> CREATOR = new C2267ps(13);

    /* JADX INFO: renamed from: a */
    public final String f160196a;

    public o00(String str) {
        super(str);
        this.f160196a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o00) && wj50.m88271j(this.f160196a, ((o00) obj).f160196a);
    }

    public final int hashCode() {
        return this.f160196a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f160196a);
    }
}
