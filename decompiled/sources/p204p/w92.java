package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class w92 implements Parcelable {
    public static final Parcelable.Creator<w92> CREATOR = new zt1(26);

    /* JADX INFO: renamed from: a */
    public final zr9 f249056a;

    /* JADX INFO: renamed from: b */
    public final Integer f249057b;

    /* JADX INFO: renamed from: c */
    public final boolean f249058c;

    public w92(zr9 zr9Var, Integer num, boolean z) {
        this.f249056a = zr9Var;
        this.f249057b = num;
        this.f249058c = z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87481c() {
        return this.f249058c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w92)) {
            return false;
        }
        w92 w92Var = (w92) obj;
        return this.f249056a == w92Var.f249056a && wj50.m88271j(this.f249057b, w92Var.f249057b) && this.f249058c == w92Var.f249058c;
    }

    public final int hashCode() {
        int iHashCode = this.f249056a.hashCode() * 31;
        Integer num = this.f249057b;
        return Boolean.hashCode(this.f249058c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f249056a.name());
        Integer num = this.f249057b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f249058c ? 1 : 0);
    }
}
