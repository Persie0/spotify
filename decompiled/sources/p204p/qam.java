package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qam implements Parcelable {
    public static final Parcelable.Creator<qam> CREATOR = new pkl(15);

    /* JADX INFO: renamed from: a */
    public final String f186901a;

    /* JADX INFO: renamed from: b */
    public final String f186902b;

    public qam(String str, String str2) {
        this.f186901a = str;
        this.f186902b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qam)) {
            return false;
        }
        qam qamVar = (qam) obj;
        return wj50.m88271j(this.f186901a, qamVar.f186901a) && wj50.m88271j(this.f186902b, qamVar.f186902b);
    }

    public final int hashCode() {
        return this.f186902b.hashCode() + (this.f186901a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f186901a);
        parcel.writeString(this.f186902b);
    }
}
