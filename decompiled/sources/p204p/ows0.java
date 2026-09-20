package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ows0 extends as01 {
    public static final Parcelable.Creator<ows0> CREATOR = new wds0(15);

    /* JADX INFO: renamed from: a */
    public final String f170781a;

    public ows0(String str) {
        this.f170781a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ows0) && wj50.m88271j(this.f170781a, ((ows0) obj).f170781a);
    }

    public final int hashCode() {
        return this.f170781a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170781a);
    }
}
