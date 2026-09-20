package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class l640 implements Parcelable {
    public static final Parcelable.Creator<l640> CREATOR = new y240(3);

    /* JADX INFO: renamed from: a */
    public final String f130175a;

    /* JADX INFO: renamed from: b */
    public final String f130176b;

    public l640(String str, String str2) {
        this.f130175a = str;
        this.f130176b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l640)) {
            return false;
        }
        l640 l640Var = (l640) obj;
        return wj50.m88271j(this.f130175a, l640Var.f130175a) && wj50.m88271j(this.f130176b, l640Var.f130176b);
    }

    public final int hashCode() {
        int iHashCode = this.f130175a.hashCode() * 31;
        String str = this.f130176b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f130175a);
        parcel.writeString(this.f130176b);
    }
}
