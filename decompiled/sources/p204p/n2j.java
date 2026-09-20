package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class n2j implements Parcelable {
    public static final Parcelable.Creator<n2j> CREATOR = new f2i(15);

    /* JADX INFO: renamed from: a */
    public final String f149772a;

    /* JADX INFO: renamed from: b */
    public final boolean f149773b;

    public n2j(String str, boolean z) {
        this.f149772a = str;
        this.f149773b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2j)) {
            return false;
        }
        n2j n2jVar = (n2j) obj;
        return wj50.m88271j(this.f149772a, n2jVar.f149772a) && this.f149773b == n2jVar.f149773b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149773b) + (this.f149772a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149772a);
        parcel.writeInt(this.f149773b ? 1 : 0);
    }
}
