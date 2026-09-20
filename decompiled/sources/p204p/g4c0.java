package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class g4c0 implements Parcelable {
    public static final Parcelable.Creator<g4c0> CREATOR = new f4c0(0);

    /* JADX INFO: renamed from: a */
    public final String f76387a;

    public g4c0(String str) {
        this.f76387a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m43526c() {
        return this.f76387a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4c0) && wj50.m88271j(this.f76387a, ((g4c0) obj).f76387a);
    }

    public final int hashCode() {
        return this.f76387a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f76387a);
    }
}
