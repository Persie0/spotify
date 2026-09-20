package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class u7z implements zz41 {
    public static final Parcelable.Creator<u7z> CREATOR = new c2z(17);

    /* JADX INFO: renamed from: a */
    public final String f227772a;

    public /* synthetic */ u7z() {
        this("FindFriendsEntry");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7z) && wj50.m88271j(this.f227772a, ((u7z) obj).f227772a);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f227772a;
    }

    public final int hashCode() {
        return this.f227772a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f227772a);
    }

    public u7z(String str) {
        this.f227772a = str;
    }
}
