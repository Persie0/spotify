package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class v3o0 implements Parcelable {
    public static final Parcelable.Creator<v3o0> CREATOR = new o2o0(2);

    /* JADX INFO: renamed from: a */
    public final String f236914a;

    /* JADX INFO: renamed from: b */
    public final String f236915b;

    /* JADX INFO: renamed from: c */
    public final long f236916c;

    public v3o0(String str, String str2, long j) {
        this.f236914a = str;
        this.f236915b = str2;
        this.f236916c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3o0)) {
            return false;
        }
        v3o0 v3o0Var = (v3o0) obj;
        return wj50.m88271j(this.f236914a, v3o0Var.f236914a) && wj50.m88271j(this.f236915b, v3o0Var.f236915b) && this.f236916c == v3o0Var.f236916c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f236916c) + s571.m77243b(this.f236914a.hashCode() * 31, 31, this.f236915b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236914a);
        parcel.writeString(this.f236915b);
        parcel.writeLong(this.f236916c);
    }
}
