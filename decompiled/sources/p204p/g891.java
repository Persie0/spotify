package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class g891 implements h891 {
    public static final Parcelable.Creator<g891> CREATOR = new f891(0);

    /* JADX INFO: renamed from: a */
    public final String f77444a;

    public g891(String str) {
        this.f77444a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g891) && wj50.m88271j(this.f77444a, ((g891) obj).f77444a);
    }

    @Override // p204p.h891
    public final String getValue() {
        return this.f77444a;
    }

    public final int hashCode() {
        return this.f77444a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f77444a);
    }
}
