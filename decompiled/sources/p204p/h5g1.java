package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class h5g1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<h5g1> CREATOR = new xvf1(26);

    /* JADX INFO: renamed from: a */
    public final int f87837a;

    /* JADX INFO: renamed from: b */
    public final boolean f87838b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f87839c;

    /* JADX INFO: renamed from: d */
    public final int f87840d;

    /* JADX INFO: renamed from: e */
    public final String f87841e;

    /* JADX INFO: renamed from: f */
    public final boolean f87842f;

    public h5g1(int i, boolean z, ArrayList arrayList, int i2, String str, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        this.f87839c = arrayList2;
        this.f87837a = i;
        this.f87838b = z;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f87840d = i2;
        this.f87841e = str;
        this.f87842f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f87837a);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f87838b ? 1 : 0);
        alf1.m26310P(parcel, 4, this.f87839c);
        alf1.m26313S(parcel, 5, 4);
        parcel.writeInt(this.f87840d);
        alf1.m26308N(parcel, 6, this.f87841e);
        alf1.m26313S(parcel, 7, 4);
        parcel.writeInt(this.f87842f ? 1 : 0);
        alf1.m26316V(iM26314T, parcel);
    }
}
