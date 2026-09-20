package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class bx71 implements z5z0, Parcelable {
    public static final Parcelable.Creator<bx71> CREATOR = new sr71(13);

    /* JADX INFO: renamed from: a */
    public final String f31800a;

    /* JADX INFO: renamed from: b */
    public final String f31801b;

    public bx71(String str, String str2) {
        this.f31800a = str;
        this.f31801b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx71)) {
            return false;
        }
        bx71 bx71Var = (bx71) obj;
        return wj50.m88271j(this.f31800a, bx71Var.f31800a) && wj50.m88271j(this.f31801b, bx71Var.f31801b);
    }

    public final int hashCode() {
        return this.f31801b.hashCode() + (this.f31800a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31800a);
        parcel.writeString(this.f31801b);
    }
}
