package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p5r implements Parcelable {
    public static final Parcelable.Creator<p5r> CREATOR = new o5r(0);

    /* JADX INFO: renamed from: a */
    public String f174208a;

    /* JADX INFO: renamed from: b */
    public String f174209b;

    /* JADX INFO: renamed from: c */
    public String f174210c;

    /* JADX INFO: renamed from: d */
    public long f174211d;

    /* JADX INFO: renamed from: e */
    public long f174212e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f174208a);
        parcel.writeString(this.f174209b);
        parcel.writeString(this.f174210c);
        parcel.writeLong(this.f174211d);
        parcel.writeLong(this.f174212e);
    }
}
