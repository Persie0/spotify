package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class lxs0 extends mxs0 {
    public static final Parcelable.Creator<lxs0> CREATOR = new wds0(20);

    /* JADX INFO: renamed from: a */
    public final String f137868a;

    public lxs0(String str) {
        this.f137868a = str;
    }

    @Override // p204p.mxs0
    /* JADX INFO: renamed from: c */
    public final String mo49039c() {
        return this.f137868a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxs0) && wj50.m88271j(this.f137868a, ((lxs0) obj).f137868a);
    }

    public final int hashCode() {
        return this.f137868a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f137868a);
    }
}
