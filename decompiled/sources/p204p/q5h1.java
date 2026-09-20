package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class q5h1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<q5h1> CREATOR = new g7g1(29);

    /* JADX INFO: renamed from: a */
    public final int f185535a;

    /* JADX INFO: renamed from: b */
    public final int f185536b;

    /* JADX INFO: renamed from: c */
    public final int f185537c;

    /* JADX INFO: renamed from: d */
    public final int f185538d;

    /* JADX INFO: renamed from: e */
    public final long f185539e;

    public q5h1(int i, int i2, int i3, int i4, long j) {
        this.f185535a = i;
        this.f185536b = i2;
        this.f185537c = i3;
        this.f185538d = i4;
        this.f185539e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(this.f185535a);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f185536b);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f185537c);
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(this.f185538d);
        alf1.m26313S(parcel, 5, 8);
        parcel.writeLong(this.f185539e);
        alf1.m26316V(iM26314T, parcel);
    }
}
