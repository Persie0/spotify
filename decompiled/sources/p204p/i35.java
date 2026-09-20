package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class i35 implements Parcelable {
    public static final Parcelable.Creator<i35> CREATOR = new bc3(24);

    /* JADX INFO: renamed from: a */
    public final List f98033a;

    /* JADX INFO: renamed from: b */
    public final int f98034b;

    public i35(int i, List list) {
        this.f98033a = list;
        this.f98034b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i35)) {
            return false;
        }
        i35 i35Var = (i35) obj;
        return wj50.m88271j(this.f98033a, i35Var.f98033a) && this.f98034b == i35Var.f98034b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98034b) + (this.f98033a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f98033a);
        parcel.writeInt(this.f98034b);
    }
}
