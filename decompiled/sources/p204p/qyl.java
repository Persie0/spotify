package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class qyl implements Parcelable {
    public static final Parcelable.Creator<qyl> CREATOR = new pkl(7);

    /* JADX INFO: renamed from: a */
    public final String f193922a;

    /* JADX INFO: renamed from: b */
    public final String f193923b;

    public qyl(String str, String str2) {
        this.f193922a = str;
        this.f193923b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyl)) {
            return false;
        }
        qyl qylVar = (qyl) obj;
        return wj50.m88271j(this.f193922a, qylVar.f193922a) && wj50.m88271j(this.f193923b, qylVar.f193923b);
    }

    public final int hashCode() {
        return this.f193923b.hashCode() + (this.f193922a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f193922a);
        parcel.writeString(this.f193923b);
    }
}
