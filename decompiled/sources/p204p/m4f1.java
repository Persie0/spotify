package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m4f1 extends AbstractC2206o9 implements d7x0 {
    public static final Parcelable.Creator<m4f1> CREATOR = new tne1(26);

    /* JADX INFO: renamed from: a */
    public final List f139956a;

    /* JADX INFO: renamed from: b */
    public final String f139957b;

    public m4f1(ArrayList arrayList, String str) {
        this.f139956a = arrayList;
        this.f139957b = str;
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return this.f139957b != null ? Status.f1837e : Status.f1841i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26310P(parcel, 1, this.f139956a);
        alf1.m26308N(parcel, 2, this.f139957b);
        alf1.m26316V(iM26314T, parcel);
    }
}
