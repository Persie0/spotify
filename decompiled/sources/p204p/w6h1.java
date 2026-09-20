package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w6h1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<w6h1> CREATOR = new n6h1(3);

    /* JADX INFO: renamed from: a */
    public final String f248386a;

    /* JADX INFO: renamed from: b */
    public final List f248387b;

    public w6h1(String str, ArrayList arrayList) {
        this.f248386a = str;
        this.f248387b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 1, this.f248386a);
        alf1.m26312R(parcel, 2, this.f248387b);
        alf1.m26316V(iM26314T, parcel);
    }
}
