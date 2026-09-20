package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class uab0 implements Parcelable {
    public static final Parcelable.Creator<uab0> CREATOR = new l0b0(19);

    /* JADX INFO: renamed from: a */
    public final String f228440a;

    /* JADX INFO: renamed from: b */
    public final List f228441b;

    /* JADX INFO: renamed from: c */
    public final boolean f228442c;

    public uab0(String str, List list, boolean z) {
        this.f228440a = str;
        this.f228441b = list;
        this.f228442c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uab0)) {
            return false;
        }
        uab0 uab0Var = (uab0) obj;
        return wj50.m88271j(this.f228440a, uab0Var.f228440a) && wj50.m88271j(this.f228441b, uab0Var.f228441b) && this.f228442c == uab0Var.f228442c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f228442c) + s571.m77244c(this.f228440a.hashCode() * 31, 31, this.f228441b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f228440a);
        parcel.writeStringList(this.f228441b);
        parcel.writeInt(this.f228442c ? 1 : 0);
    }
}
