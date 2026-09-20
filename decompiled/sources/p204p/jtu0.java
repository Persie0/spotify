package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class jtu0 implements Parcelable {
    public static final Parcelable.Creator<jtu0> CREATOR = new v5u0(24);

    /* JADX INFO: renamed from: a */
    public final String f115973a;

    public jtu0(String str) {
        this.f115973a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m54317c() {
        return this.f115973a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtu0) && wj50.m88271j(this.f115973a, ((jtu0) obj).f115973a);
    }

    public final int hashCode() {
        return this.f115973a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115973a);
    }
}
