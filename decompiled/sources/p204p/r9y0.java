package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r9y0 implements Parcelable {
    public static final Parcelable.Creator<r9y0> CREATOR = new csx0(14);

    /* JADX INFO: renamed from: a */
    public final String f197142a;

    /* JADX INFO: renamed from: b */
    public final List f197143b;

    /* JADX INFO: renamed from: c */
    public final boolean f197144c;

    public r9y0(String str, List list, boolean z) {
        this.f197142a = str;
        this.f197143b = list;
        this.f197144c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9y0)) {
            return false;
        }
        r9y0 r9y0Var = (r9y0) obj;
        return wj50.m88271j(this.f197142a, r9y0Var.f197142a) && wj50.m88271j(this.f197143b, r9y0Var.f197143b) && this.f197144c == r9y0Var.f197144c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197144c) + s571.m77244c(this.f197142a.hashCode() * 31, 31, this.f197143b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f197142a);
        parcel.writeStringList(this.f197143b);
        parcel.writeInt(this.f197144c ? 1 : 0);
    }
}
