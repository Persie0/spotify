package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ais implements Parcelable {
    public static final Parcelable.Creator<ais> CREATOR = new f9s(7);

    /* JADX INFO: renamed from: a */
    public final String f16086a;

    /* JADX INFO: renamed from: b */
    public final String f16087b;

    public ais(String str, String str2) {
        this.f16086a = str;
        this.f16087b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ais)) {
            return false;
        }
        ais aisVar = (ais) obj;
        return wj50.m88271j(this.f16086a, aisVar.f16086a) && wj50.m88271j(this.f16087b, aisVar.f16087b);
    }

    public final int hashCode() {
        return this.f16087b.hashCode() + (this.f16086a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16086a);
        parcel.writeString(this.f16087b);
    }
}
