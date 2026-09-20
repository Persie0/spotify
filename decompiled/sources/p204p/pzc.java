package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pzc implements Parcelable {
    public static final Parcelable.Creator<pzc> CREATOR = new qvc(2);

    /* JADX INFO: renamed from: a */
    public final String f183663a;

    public pzc(String str) {
        this.f183663a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzc) && wj50.m88271j(this.f183663a, ((pzc) obj).f183663a);
    }

    public final int hashCode() {
        return this.f183663a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f183663a);
    }
}
