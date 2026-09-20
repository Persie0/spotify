package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class z6h1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<z6h1> CREATOR = new n6h1(4);

    /* JADX INFO: renamed from: a */
    public final String f279908a;

    /* JADX INFO: renamed from: b */
    public final String f279909b;

    /* JADX INFO: renamed from: c */
    public final String f279910c;

    /* JADX INFO: renamed from: d */
    public final boolean f279911d;

    /* JADX INFO: renamed from: e */
    public final int f279912e;

    /* JADX INFO: renamed from: f */
    public final String f279913f;

    /* JADX INFO: renamed from: g */
    public final boolean f279914g;

    public z6h1(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f279908a = str;
        this.f279909b = str2;
        this.f279910c = str3;
        this.f279913f = str4;
        this.f279912e = i;
        this.f279911d = z;
        this.f279914g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 1, this.f279908a);
        alf1.m26308N(parcel, 2, this.f279909b);
        alf1.m26308N(parcel, 3, this.f279910c);
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(this.f279911d ? 1 : 0);
        alf1.m26313S(parcel, 5, 4);
        parcel.writeInt(this.f279912e);
        alf1.m26308N(parcel, 6, this.f279913f);
        alf1.m26313S(parcel, 7, 4);
        parcel.writeInt(this.f279914g ? 1 : 0);
        alf1.m26316V(iM26314T, parcel);
    }
}
