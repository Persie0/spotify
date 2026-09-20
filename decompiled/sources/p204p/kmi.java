package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kmi implements Parcelable {
    public static final Parcelable.Creator<kmi> CREATOR = new f2i(12);

    /* JADX INFO: renamed from: a */
    public final String f124165a;

    /* JADX INFO: renamed from: b */
    public final String f124166b;

    public kmi(String str, String str2) {
        this.f124165a = str;
        this.f124166b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmi)) {
            return false;
        }
        kmi kmiVar = (kmi) obj;
        return wj50.m88271j(this.f124165a, kmiVar.f124165a) && wj50.m88271j(this.f124166b, kmiVar.f124166b);
    }

    public final int hashCode() {
        return this.f124166b.hashCode() + (this.f124165a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f124165a);
        parcel.writeString(this.f124166b);
    }
}
