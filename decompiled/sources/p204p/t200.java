package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class t200 extends x200 {
    public static final Parcelable.Creator<t200> CREATOR = new ygz(20);

    /* JADX INFO: renamed from: a */
    public final int f216397a;

    public t200(int i) {
        this.f216397a = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m79888c() {
        return this.f216397a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f216397a);
    }
}
