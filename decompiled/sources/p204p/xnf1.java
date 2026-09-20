package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class xnf1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<xnf1> CREATOR = new nlf1(11);

    /* JADX INFO: renamed from: a */
    public final int f263601a;

    /* JADX INFO: renamed from: b */
    public final boolean f263602b;

    /* JADX INFO: renamed from: c */
    public final boolean f263603c;

    /* JADX INFO: renamed from: d */
    public final boolean f263604d;

    /* JADX INFO: renamed from: e */
    public final boolean f263605e;

    public xnf1(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f263601a = i;
        this.f263602b = z;
        this.f263603c = z2;
        this.f263604d = z3;
        this.f263605e = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(this.f263601a);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f263602b ? 1 : 0);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f263603c ? 1 : 0);
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(this.f263604d ? 1 : 0);
        alf1.m26313S(parcel, 5, 4);
        parcel.writeInt(this.f263605e ? 1 : 0);
        alf1.m26316V(iM26314T, parcel);
    }
}
