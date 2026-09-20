package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class w1u extends b2u {
    public static final Parcelable.Creator<w1u> CREATOR = new qct(9);

    /* JADX INFO: renamed from: a */
    public final String f247182a;

    /* JADX INFO: renamed from: b */
    public final int f247183b;

    public w1u(String str, int i) {
        this.f247182a = str;
        this.f247183b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1u)) {
            return false;
        }
        w1u w1uVar = (w1u) obj;
        return wj50.m88271j(this.f247182a, w1uVar.f247182a) && this.f247183b == w1uVar.f247183b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f247183b) + (this.f247182a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f247182a);
        parcel.writeInt(this.f247183b);
    }
}
