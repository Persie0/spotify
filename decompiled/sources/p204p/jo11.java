package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jo11 implements lo11 {
    public static final Parcelable.Creator<jo11> CREATOR = new u111(21);

    /* JADX INFO: renamed from: a */
    public final String f114269a;

    /* JADX INFO: renamed from: b */
    public final String f114270b;

    /* JADX INFO: renamed from: c */
    public final String f114271c;

    /* JADX INFO: renamed from: d */
    public final List f114272d;

    public jo11(String str, List list, String str2, String str3) {
        this.f114269a = str;
        this.f114270b = str2;
        this.f114271c = str3;
        this.f114272d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo11)) {
            return false;
        }
        jo11 jo11Var = (jo11) obj;
        return wj50.m88271j(this.f114269a, jo11Var.f114269a) && wj50.m88271j(this.f114270b, jo11Var.f114270b) && wj50.m88271j(this.f114271c, jo11Var.f114271c) && wj50.m88271j(this.f114272d, jo11Var.f114272d);
    }

    public final int hashCode() {
        return this.f114272d.hashCode() + s571.m77243b(s571.m77243b(this.f114269a.hashCode() * 31, 31, this.f114270b), 31, this.f114271c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f114269a);
        parcel.writeString(this.f114270b);
        parcel.writeString(this.f114271c);
        parcel.writeStringList(this.f114272d);
    }
}
