package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class qfa0 implements Parcelable {
    public static final Parcelable.Creator<qfa0> CREATOR = new z8a0(21);

    /* JADX INFO: renamed from: a */
    public final String f188157a;

    /* JADX INFO: renamed from: b */
    public final String f188158b;

    /* JADX INFO: renamed from: c */
    public final Integer f188159c;

    public qfa0(Integer num, String str, String str2) {
        this.f188157a = str;
        this.f188158b = str2;
        this.f188159c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfa0)) {
            return false;
        }
        qfa0 qfa0Var = (qfa0) obj;
        return wj50.m88271j(this.f188157a, qfa0Var.f188157a) && wj50.m88271j(this.f188158b, qfa0Var.f188158b) && wj50.m88271j(this.f188159c, qfa0Var.f188159c);
    }

    public final int hashCode() {
        int iHashCode = this.f188157a.hashCode() * 31;
        String str = this.f188158b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f188159c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f188157a);
        parcel.writeString(this.f188158b);
        Integer num = this.f188159c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
