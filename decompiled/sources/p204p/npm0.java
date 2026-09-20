package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class npm0 implements Parcelable {
    public static final Parcelable.Creator<npm0> CREATOR = new cpl0(15);

    /* JADX INFO: renamed from: a */
    public final boolean f157031a;

    /* JADX INFO: renamed from: b */
    public final String f157032b;

    public npm0(boolean z, String str) {
        this.f157031a = z;
        this.f157032b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npm0)) {
            return false;
        }
        npm0 npm0Var = (npm0) obj;
        return this.f157031a == npm0Var.f157031a && wj50.m88271j(this.f157032b, npm0Var.f157032b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f157031a) * 31;
        String str = this.f157032b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f157031a ? 1 : 0);
        parcel.writeString(this.f157032b);
    }

    public /* synthetic */ npm0(int i) {
        this((i & 1) == 0, (i & 2) != 0 ? null : "Failed to load next page");
    }
}
