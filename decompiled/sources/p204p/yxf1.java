package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yxf1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<yxf1> CREATOR = new xvf1(6);

    /* JADX INFO: renamed from: a */
    public final int f277245a;

    /* JADX INFO: renamed from: b */
    public final List f277246b;

    public yxf1(int i, ArrayList arrayList) {
        this.f277245a = i;
        this.f277246b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f277245a);
        alf1.m26312R(parcel, 3, this.f277246b);
        alf1.m26316V(iM26314T, parcel);
    }
}
