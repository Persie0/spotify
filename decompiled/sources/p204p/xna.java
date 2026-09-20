package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class xna implements Parcelable {
    public static final Parcelable.Creator<xna> CREATOR = new jja(3);

    /* JADX INFO: renamed from: a */
    public final String f263568a;

    /* JADX INFO: renamed from: b */
    public final String f263569b;

    public xna(String str, String str2) {
        this.f263568a = str;
        this.f263569b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xna)) {
            return false;
        }
        xna xnaVar = (xna) obj;
        return wj50.m88271j(this.f263568a, xnaVar.f263568a) && wj50.m88271j(this.f263569b, xnaVar.f263569b);
    }

    public final int hashCode() {
        return this.f263569b.hashCode() + (this.f263568a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f263568a);
        parcel.writeString(this.f263569b);
    }
}
