package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class e451 implements Parcelable {
    public static final Parcelable.Creator<e451> CREATOR = new q051(19);

    /* JADX INFO: renamed from: a */
    public final String f55984a;

    /* JADX INFO: renamed from: b */
    public final String f55985b;

    public e451(String str, String str2) {
        this.f55984a = str;
        this.f55985b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e451)) {
            return false;
        }
        e451 e451Var = (e451) obj;
        return wj50.m88271j(this.f55984a, e451Var.f55984a) && wj50.m88271j(this.f55985b, e451Var.f55985b);
    }

    public final int hashCode() {
        return this.f55985b.hashCode() + (this.f55984a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55984a);
        parcel.writeString(this.f55985b);
    }
}
