package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tit0 implements Parcelable {
    public static final Parcelable.Creator<tit0> CREATOR = new wds0(29);

    /* JADX INFO: renamed from: a */
    public final nuf f220741a;

    public tit0(nuf nufVar) {
        this.f220741a = nufVar;
    }

    /* JADX INFO: renamed from: c */
    public final nuf m80928c() {
        return this.f220741a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tit0) && this.f220741a == ((tit0) obj).f220741a;
    }

    public final int hashCode() {
        nuf nufVar = this.f220741a;
        if (nufVar == null) {
            return 0;
        }
        return nufVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nuf nufVar = this.f220741a;
        if (nufVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(nufVar.name());
        }
    }
}
