package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class is9 implements Parcelable {
    public static final Parcelable.Creator<is9> CREATOR = new dc9(12);

    /* JADX INFO: renamed from: a */
    public final boolean f105191a;

    /* JADX INFO: renamed from: b */
    public final List f105192b;

    public is9(List list, boolean z) {
        this.f105191a = z;
        this.f105192b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is9)) {
            return false;
        }
        is9 is9Var = (is9) obj;
        return this.f105191a == is9Var.f105191a && wj50.m88271j(this.f105192b, is9Var.f105192b);
    }

    public final int hashCode() {
        return this.f105192b.hashCode() + (Boolean.hashCode(this.f105191a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f105191a ? 1 : 0);
        parcel.writeStringList(this.f105192b);
    }
}
