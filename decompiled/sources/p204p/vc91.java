package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vc91 implements yc91 {
    public static final Parcelable.Creator<vc91> CREATOR = new f891(11);

    /* JADX INFO: renamed from: a */
    public final String f240092a;

    public vc91(String str) {
        this.f240092a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc91) && wj50.m88271j(this.f240092a, ((vc91) obj).f240092a);
    }

    public final int hashCode() {
        return this.f240092a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240092a);
    }
}
