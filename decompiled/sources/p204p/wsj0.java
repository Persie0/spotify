package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class wsj0 extends AbstractC2206o9 {
    public static final Parcelable.Creator<wsj0> CREATOR = new g7g1(22);

    /* JADX INFO: renamed from: a */
    public final String f254643a;

    /* JADX INFO: renamed from: b */
    public final int f254644b;

    /* JADX INFO: renamed from: c */
    public final String f254645c;

    public wsj0(String str, int i, String str2) {
        this.f254643a = str;
        this.f254644b = i;
        this.f254645c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 2, this.f254643a);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f254644b);
        alf1.m26308N(parcel, 4, this.f254645c);
        alf1.m26316V(iM26314T, parcel);
    }
}
