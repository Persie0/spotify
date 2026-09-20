package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ox90 implements Parcelable {
    public static final Parcelable.Creator<ox90> CREATOR = new ra90(23);

    /* JADX INFO: renamed from: a */
    public final String f170937a;

    /* JADX INFO: renamed from: b */
    public final int f170938b;

    public ox90(String str, int i) {
        this.f170937a = str;
        this.f170938b = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m68200c() {
        return this.f170938b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox90)) {
            return false;
        }
        ox90 ox90Var = (ox90) obj;
        return wj50.m88271j(this.f170937a, ox90Var.f170937a) && this.f170938b == ox90Var.f170938b;
    }

    /* JADX INFO: renamed from: g */
    public final String m68201g() {
        return this.f170937a;
    }

    public final int hashCode() {
        int iHashCode = this.f170937a.hashCode() * 31;
        int i = this.f170938b;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170937a);
        int i2 = this.f170938b;
        if (i2 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        if (i2 != 1) {
            throw null;
        }
        parcel.writeString("SHARE");
    }
}
