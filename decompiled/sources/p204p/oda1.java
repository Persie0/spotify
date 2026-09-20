package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes10.dex */
public final class oda1 implements Parcelable {
    public static final Parcelable.Creator<oda1> CREATOR = new u2a1(4);

    /* JADX INFO: renamed from: a */
    public final vda1 f164140a;

    /* JADX INFO: renamed from: b */
    public final qfy0 f164141b;

    /* JADX INFO: renamed from: c */
    public final ResultReceiver f164142c;

    public oda1(vda1 vda1Var, qfy0 qfy0Var, ResultReceiver resultReceiver) {
        this.f164140a = vda1Var;
        this.f164141b = qfy0Var;
        this.f164142c = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oda1)) {
            return false;
        }
        oda1 oda1Var = (oda1) obj;
        return wj50.m88271j(this.f164140a, oda1Var.f164140a) && this.f164141b == oda1Var.f164141b && wj50.m88271j(this.f164142c, oda1Var.f164142c);
    }

    public final int hashCode() {
        int iHashCode = (this.f164141b.hashCode() + (this.f164140a.hashCode() * 31)) * 31;
        ResultReceiver resultReceiver = this.f164142c;
        return iHashCode + (resultReceiver == null ? 0 : resultReceiver.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f164140a, i);
        parcel.writeParcelable(this.f164141b, i);
        parcel.writeParcelable(this.f164142c, i);
    }
}
