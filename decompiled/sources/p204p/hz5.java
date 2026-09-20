package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hz5 implements Parcelable {
    public static final Parcelable.Creator<hz5> CREATOR = new vp5(13);

    /* JADX INFO: renamed from: a */
    public final String f96792a;

    /* JADX INFO: renamed from: b */
    public final List f96793b;

    public hz5(String str, List list) {
        this.f96792a = str;
        this.f96793b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz5)) {
            return false;
        }
        hz5 hz5Var = (hz5) obj;
        return wj50.m88271j(this.f96792a, hz5Var.f96792a) && wj50.m88271j(this.f96793b, hz5Var.f96793b);
    }

    public final int hashCode() {
        String str = this.f96792a;
        return this.f96793b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96792a);
        parcel.writeStringList(this.f96793b);
    }
}
