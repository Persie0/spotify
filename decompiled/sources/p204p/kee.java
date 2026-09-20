package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class kee implements Parcelable {
    public static final Parcelable.Creator<kee> CREATOR = new rae(2);

    /* JADX INFO: renamed from: a */
    public final String f121867a;

    /* JADX INFO: renamed from: b */
    public final boolean f121868b;

    public kee(String str, boolean z) {
        this.f121867a = str;
        this.f121868b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kee)) {
            return false;
        }
        kee keeVar = (kee) obj;
        return wj50.m88271j(this.f121867a, keeVar.f121867a) && this.f121868b == keeVar.f121868b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121868b) + (this.f121867a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121867a);
        parcel.writeInt(this.f121868b ? 1 : 0);
    }
}
