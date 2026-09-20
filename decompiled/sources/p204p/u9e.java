package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class u9e implements dae {
    public static final Parcelable.Creator<u9e> CREATOR = new n6e(16);

    /* JADX INFO: renamed from: a */
    public final String f228147a;

    public u9e(String str) {
        this.f228147a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u9e) && wj50.m88271j(this.f228147a, ((u9e) obj).f228147a);
    }

    public final int hashCode() {
        String str = this.f228147a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f228147a);
    }
}
