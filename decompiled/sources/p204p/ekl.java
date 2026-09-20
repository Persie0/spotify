package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ekl implements Parcelable {
    public static final Parcelable.Creator<ekl> CREATOR = new z4l(22);

    /* JADX INFO: renamed from: a */
    public final String f60469a;

    /* JADX INFO: renamed from: b */
    public final j6y f60470b;

    /* JADX INFO: renamed from: c */
    public final boolean f60471c;

    public ekl(String str, j6y j6yVar, boolean z) {
        this.f60469a = str;
        this.f60470b = j6yVar;
        this.f60471c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekl)) {
            return false;
        }
        ekl eklVar = (ekl) obj;
        return wj50.m88271j(this.f60469a, eklVar.f60469a) && wj50.m88271j(this.f60470b, eklVar.f60470b) && this.f60471c == eklVar.f60471c;
    }

    public final int hashCode() {
        int iHashCode = this.f60469a.hashCode() * 31;
        j6y j6yVar = this.f60470b;
        return Boolean.hashCode(this.f60471c) + ((iHashCode + (j6yVar == null ? 0 : j6yVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60469a);
        parcel.writeParcelable(this.f60470b, i);
        parcel.writeInt(this.f60471c ? 1 : 0);
    }

    public ekl(String str, j6y j6yVar, int i) {
        this(str, (i & 2) != 0 ? new j6y(null, str, null, null) : j6yVar, true);
    }
}
