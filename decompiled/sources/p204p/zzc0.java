package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc0 implements d0d0 {
    public static final Parcelable.Creator<zzc0> CREATOR = new f4c0(17);

    /* JADX INFO: renamed from: a */
    public final String f287950a;

    public zzc0(String str) {
        this.f287950a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzc0) && wj50.m88271j(this.f287950a, ((zzc0) obj).f287950a);
    }

    public final int hashCode() {
        String str = this.f287950a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f287950a);
    }
}
