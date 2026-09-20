package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class lqj implements mqj {
    public static final Parcelable.Creator<lqj> CREATOR = new dnj(13);

    /* JADX INFO: renamed from: a */
    public final String f136071a;

    public lqj(String str) {
        this.f136071a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqj) && wj50.m88271j(this.f136071a, ((lqj) obj).f136071a);
    }

    public final int hashCode() {
        return this.f136071a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f136071a);
    }
}
