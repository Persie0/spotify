package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cqh implements Parcelable {
    public static final Parcelable.Creator<cqh> CREATOR = new rae(21);

    /* JADX INFO: renamed from: a */
    public final String f40888a;

    /* JADX INFO: renamed from: b */
    public final String f40889b;

    public cqh(String str, String str2) {
        this.f40888a = str;
        this.f40889b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqh)) {
            return false;
        }
        cqh cqhVar = (cqh) obj;
        return wj50.m88271j(this.f40888a, cqhVar.f40888a) && wj50.m88271j(this.f40889b, cqhVar.f40889b);
    }

    public final String getUri() {
        return this.f40888a;
    }

    public final int hashCode() {
        return this.f40889b.hashCode() + (this.f40888a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40888a);
        parcel.writeString(this.f40889b);
    }
}
