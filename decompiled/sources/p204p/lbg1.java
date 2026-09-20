package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class lbg1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<lbg1> CREATOR = new g7g1(11);

    /* JADX INFO: renamed from: a */
    public final byte f131663a;

    /* JADX INFO: renamed from: b */
    public final byte f131664b;

    /* JADX INFO: renamed from: c */
    public final String f131665c;

    public lbg1(byte b, byte b2, String str) {
        this.f131663a = b;
        this.f131664b = b2;
        this.f131665c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lbg1.class != obj.getClass()) {
            return false;
        }
        lbg1 lbg1Var = (lbg1) obj;
        return this.f131663a == lbg1Var.f131663a && this.f131664b == lbg1Var.f131664b && this.f131665c.equals(lbg1Var.f131665c);
    }

    public final int hashCode() {
        return this.f131665c.hashCode() + ((((this.f131663a + 31) * 31) + this.f131664b) * 31);
    }

    public final String toString() {
        return dq60.m36616p(this.f131665c, "'}", dq60.m36619s(this.f131663a, this.f131664b, "AmsEntityUpdateParcelable{, mEntityId=", ", mAttributeId=", ", mValue='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f131663a);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f131664b);
        alf1.m26308N(parcel, 4, this.f131665c);
        alf1.m26316V(iM26314T, parcel);
    }
}
