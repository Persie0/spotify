package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class tmn0 implements zz41 {
    public static final Parcelable.Creator<tmn0> CREATOR = new ejn0(12);

    /* JADX INFO: renamed from: a */
    public final String f221761a;

    public /* synthetic */ tmn0() {
        this("PermissionBanner");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmn0) && wj50.m88271j(this.f221761a, ((tmn0) obj).f221761a);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f221761a;
    }

    public final int hashCode() {
        return this.f221761a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f221761a);
    }

    public tmn0(String str) {
        this.f221761a = str;
    }
}
