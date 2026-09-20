package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class j9e implements l9e {
    public static final Parcelable.Creator<j9e> CREATOR = new n6e(6);

    /* JADX INFO: renamed from: a */
    public final f9e f110154a;

    /* JADX INFO: renamed from: b */
    public final tae f110155b;

    public j9e(f9e f9eVar, tae taeVar) {
        this.f110154a = f9eVar;
        this.f110155b = taeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9e)) {
            return false;
        }
        j9e j9eVar = (j9e) obj;
        return wj50.m88271j(this.f110154a, j9eVar.f110154a) && wj50.m88271j(this.f110155b, j9eVar.f110155b);
    }

    public final int hashCode() {
        return this.f110155b.hashCode() + (this.f110154a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f110154a.writeToParcel(parcel, i);
        this.f110155b.writeToParcel(parcel, i);
    }
}
