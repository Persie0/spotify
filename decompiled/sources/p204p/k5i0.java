package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class k5i0 implements Parcelable {
    public static final Parcelable.Creator<k5i0> CREATOR = new ruh0(22);

    /* JADX INFO: renamed from: a */
    public final String f119528a;

    /* JADX INFO: renamed from: b */
    public final List f119529b;

    /* JADX INFO: renamed from: c */
    public final String f119530c;

    public k5i0(String str, List list, String str2) {
        this.f119528a = str;
        this.f119529b = list;
        this.f119530c = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m55440c() {
        return this.f119528a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5i0)) {
            return false;
        }
        k5i0 k5i0Var = (k5i0) obj;
        return wj50.m88271j(this.f119528a, k5i0Var.f119528a) && wj50.m88271j(this.f119529b, k5i0Var.f119529b) && wj50.m88271j(this.f119530c, k5i0Var.f119530c);
    }

    public final int hashCode() {
        return this.f119530c.hashCode() + s571.m77244c(this.f119528a.hashCode() * 31, 31, this.f119529b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f119528a);
        parcel.writeStringList(this.f119529b);
        parcel.writeString(this.f119530c);
    }
}
