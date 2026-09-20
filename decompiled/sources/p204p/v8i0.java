package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class v8i0 implements Parcelable {
    public static final Parcelable.Creator<v8i0> CREATOR = new ruh0(23);

    /* JADX INFO: renamed from: a */
    public final String f238583a;

    /* JADX INFO: renamed from: b */
    public final String f238584b;

    public v8i0(String str, String str2) {
        this.f238583a = str;
        this.f238584b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m84921a() {
        return this.f238583a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8i0)) {
            return false;
        }
        v8i0 v8i0Var = (v8i0) obj;
        return wj50.m88271j(this.f238583a, v8i0Var.f238583a) && wj50.m88271j(this.f238584b, v8i0Var.f238584b);
    }

    public final int hashCode() {
        return this.f238584b.hashCode() + (this.f238583a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238583a);
        parcel.writeString(this.f238584b);
    }
}
