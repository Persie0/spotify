package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class rs10 implements Parcelable {
    public static final Parcelable.Creator<rs10> CREATOR = new km10(10);

    /* JADX INFO: renamed from: a */
    public final boolean f202156a;

    /* JADX INFO: renamed from: b */
    public final ss10 f202157b;

    /* JADX INFO: renamed from: c */
    public final Integer f202158c;

    public rs10(boolean z, ss10 ss10Var, Integer num) {
        this.f202156a = z;
        this.f202157b = ss10Var;
        this.f202158c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs10)) {
            return false;
        }
        rs10 rs10Var = (rs10) obj;
        return this.f202156a == rs10Var.f202156a && this.f202157b == rs10Var.f202157b && wj50.m88271j(this.f202158c, rs10Var.f202158c);
    }

    public final int hashCode() {
        int iHashCode = (this.f202157b.hashCode() + (Boolean.hashCode(this.f202156a) * 31)) * 31;
        Integer num = this.f202158c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f202156a ? 1 : 0);
        parcel.writeString(this.f202157b.name());
        Integer num = this.f202158c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
