package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class yw40 implements ax40 {
    public static final Parcelable.Creator<yw40> CREATOR = new y240(20);

    /* JADX INFO: renamed from: a */
    public final String f276855a;

    /* JADX INFO: renamed from: b */
    public final String f276856b;

    public yw40(String str, String str2) {
        this.f276855a = str;
        this.f276856b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw40)) {
            return false;
        }
        yw40 yw40Var = (yw40) obj;
        return wj50.m88271j(this.f276855a, yw40Var.f276855a) && wj50.m88271j(this.f276856b, yw40Var.f276856b);
    }

    public final int hashCode() {
        return this.f276856b.hashCode() + (this.f276855a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f276855a);
        parcel.writeString(this.f276856b);
    }
}
