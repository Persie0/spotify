package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class pxh0 extends AbstractC2206o9 {
    public static final Parcelable.Creator<pxh0> CREATOR = new tne1(21);

    /* JADX INFO: renamed from: a */
    public final int f182305a;

    /* JADX INFO: renamed from: b */
    public final boolean f182306b;

    public pxh0(int i, boolean z) {
        this.f182305a = i;
        this.f182306b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(this.f182305a);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f182306b ? 1 : 0);
        alf1.m26316V(iM26314T, parcel);
    }
}
