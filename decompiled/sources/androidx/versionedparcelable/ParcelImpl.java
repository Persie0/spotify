package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p204p.cpl0;
import p204p.mfb1;
import p204p.nfb1;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new cpl0(25);

    /* JADX INFO: renamed from: a */
    public final nfb1 f1344a;

    public ParcelImpl(nfb1 nfb1Var) {
        this.f1344a = nfb1Var;
    }

    /* JADX INFO: renamed from: c */
    public final nfb1 m1129c() {
        return this.f1344a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new mfb1(parcel).m58861l(this.f1344a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f1344a = new mfb1(parcel).m58857h();
    }
}
