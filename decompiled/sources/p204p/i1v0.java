package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i1v0 extends j1v0 {
    public static final Parcelable.Creator<i1v0> CREATOR = new h1v0(0);

    /* JADX INFO: renamed from: a */
    public final List f97610a;

    public i1v0(List list) {
        this.f97610a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1v0) && wj50.m88271j(this.f97610a, ((i1v0) obj).f97610a);
    }

    public final int hashCode() {
        List list = this.f97610a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f97610a);
    }
}
