package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class t4f1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<t4f1> CREATOR = new tne1(28);

    /* JADX INFO: renamed from: a */
    public final int f216993a;

    /* JADX INFO: renamed from: b */
    public final lzi f216994b;

    /* JADX INFO: renamed from: c */
    public final d5f1 f216995c;

    public t4f1(int i, lzi lziVar, d5f1 d5f1Var) {
        this.f216993a = i;
        this.f216994b = lziVar;
        this.f216995c = d5f1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(this.f216993a);
        alf1.m26307M(parcel, 2, this.f216994b, i);
        alf1.m26307M(parcel, 3, this.f216995c, i);
        alf1.m26316V(iM26314T, parcel);
    }
}
