package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ypy implements Parcelable {
    public static final Parcelable.Creator<ypy> CREATOR = new p7y(28);

    /* JADX INFO: renamed from: a */
    public final String f275091a;

    /* JADX INFO: renamed from: b */
    public final String f275092b;

    public ypy(String str, String str2) {
        this.f275091a = str;
        this.f275092b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypy)) {
            return false;
        }
        ypy ypyVar = (ypy) obj;
        return wj50.m88271j(this.f275091a, ypyVar.f275091a) && wj50.m88271j(this.f275092b, ypyVar.f275092b);
    }

    public final int hashCode() {
        return this.f275092b.hashCode() + (this.f275091a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f275091a);
        parcel.writeString(this.f275092b);
    }
}
