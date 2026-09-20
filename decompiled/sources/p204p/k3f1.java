package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class k3f1 extends AbstractC2206o9 implements d7x0 {
    public static final Parcelable.Creator<k3f1> CREATOR = new tne1(18);

    /* JADX INFO: renamed from: a */
    public final int f118874a;

    /* JADX INFO: renamed from: b */
    public final int f118875b;

    /* JADX INFO: renamed from: c */
    public final Intent f118876c;

    public k3f1(int i, int i2, Intent intent) {
        this.f118874a = i;
        this.f118875b = i2;
        this.f118876c = intent;
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return this.f118875b == 0 ? Status.f1837e : Status.f1841i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(this.f118874a);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f118875b);
        alf1.m26307M(parcel, 3, this.f118876c, i);
        alf1.m26316V(iM26314T, parcel);
    }
}
