package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p204p.pum0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new pum0(8);

    /* JADX INFO: renamed from: a */
    public int f25a;

    /* JADX INFO: renamed from: b */
    public int f26b;

    /* JADX INFO: renamed from: c */
    public int f27c;

    /* JADX INFO: renamed from: d */
    public int f28d;

    /* JADX INFO: renamed from: e */
    public int f29e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25a);
        parcel.writeInt(this.f27c);
        parcel.writeInt(this.f28d);
        parcel.writeInt(this.f29e);
        parcel.writeInt(this.f26b);
    }
}
