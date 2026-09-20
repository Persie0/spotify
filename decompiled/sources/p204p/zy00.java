package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class zy00 extends az00 {
    public static final Parcelable.Creator<zy00> CREATOR = new k700(25);

    /* JADX INFO: renamed from: a */
    public final String f287437a;

    public zy00(String str) {
        this.f287437a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy00) && wj50.m88271j(this.f287437a, ((zy00) obj).f287437a);
    }

    public final int hashCode() {
        return this.f287437a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f287437a);
    }
}
