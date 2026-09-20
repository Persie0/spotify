package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ass0 implements Parcelable {
    public static final Parcelable.Creator<ass0> CREATOR = new wds0(9);

    /* JADX INFO: renamed from: a */
    public final List f19496a;

    public ass0(List list) {
        this.f19496a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ass0) && wj50.m88271j(this.f19496a, ((ass0) obj).f19496a);
    }

    public final int hashCode() {
        return this.f19496a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f19496a);
    }
}
