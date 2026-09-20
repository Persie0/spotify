package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class kui0 extends lui0 {
    public static final Parcelable.Creator<kui0> CREATOR = new rri0(6);

    /* JADX INFO: renamed from: b */
    public final String f126621b;

    public kui0(String str) {
        super(str);
        this.f126621b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kui0) && wj50.m88271j(this.f126621b, ((kui0) obj).f126621b);
    }

    @Override // p204p.lui0
    public final String getName() {
        return this.f126621b;
    }

    public final int hashCode() {
        return this.f126621b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f126621b);
    }
}
