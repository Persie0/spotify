package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class spj implements Parcelable {
    public static final Parcelable.Creator<spj> CREATOR = new dnj(11);

    /* JADX INFO: renamed from: a */
    public final String f212884a;

    /* JADX INFO: renamed from: b */
    public final String f212885b;

    public spj(String str, String str2) {
        this.f212884a = str;
        this.f212885b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m78917c() {
        return this.f212884a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spj)) {
            return false;
        }
        spj spjVar = (spj) obj;
        return wj50.m88271j(this.f212884a, spjVar.f212884a) && wj50.m88271j(this.f212885b, spjVar.f212885b);
    }

    public final int hashCode() {
        return this.f212885b.hashCode() + (this.f212884a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f212884a);
        parcel.writeString(this.f212885b);
    }
}
