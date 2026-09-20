package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class v7b1 implements Parcelable {
    public static final Parcelable.Creator<v7b1> CREATOR = new u2a1(29);

    /* JADX INFO: renamed from: a */
    public final String f238136a;

    /* JADX INFO: renamed from: b */
    public final String f238137b;

    public v7b1(String str, String str2) {
        this.f238136a = str;
        this.f238137b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7b1)) {
            return false;
        }
        v7b1 v7b1Var = (v7b1) obj;
        return wj50.m88271j(this.f238136a, v7b1Var.f238136a) && wj50.m88271j(this.f238137b, v7b1Var.f238137b);
    }

    public final String getUri() {
        return this.f238136a;
    }

    public final int hashCode() {
        return this.f238137b.hashCode() + (this.f238136a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238136a);
        parcel.writeString(this.f238137b);
    }
}
