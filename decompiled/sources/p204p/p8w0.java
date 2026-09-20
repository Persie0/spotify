package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class p8w0 implements r8w0 {
    public static final Parcelable.Creator<p8w0> CREATOR = new b8w0(6);

    /* JADX INFO: renamed from: a */
    public final String f175076a;

    public p8w0(String str) {
        this.f175076a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8w0) && wj50.m88271j(this.f175076a, ((p8w0) obj).f175076a);
    }

    @Override // p204p.r8w0
    public final String getId() {
        return this.f175076a;
    }

    public final int hashCode() {
        return this.f175076a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175076a);
    }
}
