package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class end implements ind {
    public static final Parcelable.Creator<end> CREATOR = new fjd(5);

    /* JADX INFO: renamed from: a */
    public final String f61141a;

    /* JADX INFO: renamed from: b */
    public final String f61142b;

    public /* synthetic */ end(String str) {
        this(str, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof end)) {
            return false;
        }
        end endVar = (end) obj;
        return wj50.m88271j(this.f61141a, endVar.f61141a) && wj50.m88271j(this.f61142b, endVar.f61142b);
    }

    public final int hashCode() {
        int iHashCode = this.f61141a.hashCode() * 31;
        String str = this.f61142b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61141a);
        parcel.writeString(this.f61142b);
    }

    public end(String str, String str2) {
        this.f61141a = str;
        this.f61142b = str2;
    }
}
