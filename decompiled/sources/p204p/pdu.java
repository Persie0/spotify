package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class pdu extends tdu {
    public static final Parcelable.Creator<pdu> CREATOR = new qct(15);

    /* JADX INFO: renamed from: a */
    public final Integer f176547a;

    /* JADX INFO: renamed from: b */
    public final String f176548b;

    public pdu(Integer num, String str) {
        this.f176547a = num;
        this.f176548b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdu)) {
            return false;
        }
        pdu pduVar = (pdu) obj;
        return wj50.m88271j(this.f176547a, pduVar.f176547a) && wj50.m88271j(this.f176548b, pduVar.f176548b);
    }

    public final int hashCode() {
        Integer num = this.f176547a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f176548b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.f176547a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f176548b);
    }
}
