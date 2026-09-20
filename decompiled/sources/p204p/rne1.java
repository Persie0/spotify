package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class rne1 implements wne1 {
    public static final Parcelable.Creator<rne1> CREATOR = new xed1(28);

    /* JADX INFO: renamed from: a */
    public final String f200904a;

    public rne1(String str) {
        this.f200904a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rne1) && wj50.m88271j(this.f200904a, ((rne1) obj).f200904a);
    }

    public final int hashCode() {
        return this.f200904a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f200904a);
    }
}
