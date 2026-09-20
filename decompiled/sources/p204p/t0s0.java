package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class t0s0 implements Parcelable {
    public static final Parcelable.Creator<t0s0> CREATOR = new uir0(25);

    /* JADX INFO: renamed from: a */
    public final String f215975a;

    /* JADX INFO: renamed from: b */
    public final String f215976b;

    public t0s0(String str, String str2) {
        this.f215975a = str;
        this.f215976b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getUri() {
        return this.f215975a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f215975a);
        parcel.writeString(this.f215976b);
    }
}
