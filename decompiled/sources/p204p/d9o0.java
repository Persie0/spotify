package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class d9o0 extends c9o0 {
    public static final Parcelable.Creator<d9o0> CREATOR = new o2o0(10);

    /* JADX INFO: renamed from: a */
    public final String f46868a;

    public d9o0(String str) {
        this.f46868a = str;
    }

    @Override // p204p.c9o0
    /* JADX INFO: renamed from: c */
    public final String mo28528c() {
        return this.f46868a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9o0) && wj50.m88271j(this.f46868a, ((d9o0) obj).f46868a);
    }

    public final int hashCode() {
        return this.f46868a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46868a);
    }
}
