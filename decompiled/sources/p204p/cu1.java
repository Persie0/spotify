package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class cu1 implements du1 {
    public static final Parcelable.Creator<cu1> CREATOR = new zt1(2);

    /* JADX INFO: renamed from: a */
    public final j891 f42013a;

    public cu1(j891 j891Var) {
        this.f42013a = j891Var;
    }

    /* JADX INFO: renamed from: c */
    public final j891 m33855c() {
        return this.f42013a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu1) && wj50.m88271j(this.f42013a, ((cu1) obj).f42013a);
    }

    public final int hashCode() {
        return this.f42013a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f42013a.writeToParcel(parcel, i);
    }
}
