package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class y251 implements a351 {
    public static final Parcelable.Creator<y251> CREATOR = new q051(16);

    /* JADX INFO: renamed from: a */
    public final String f268461a;

    /* JADX INFO: renamed from: b */
    public final String f268462b;

    public y251(String str, String str2) {
        this.f268461a = str;
        this.f268462b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y251)) {
            return false;
        }
        y251 y251Var = (y251) obj;
        return wj50.m88271j(this.f268461a, y251Var.f268461a) && wj50.m88271j(this.f268462b, y251Var.f268462b);
    }

    public final int hashCode() {
        int iHashCode = this.f268461a.hashCode() * 31;
        String str = this.f268462b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f268461a);
        parcel.writeString(this.f268462b);
    }
}
