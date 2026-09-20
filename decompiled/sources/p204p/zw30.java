package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zw30 extends fx30 {
    public static final Parcelable.Creator<zw30> CREATOR = new bw30(21);

    /* JADX INFO: renamed from: c */
    public final List f286901c;

    /* JADX INFO: renamed from: d */
    public final int f286902d;

    /* JADX INFO: renamed from: e */
    public final String f286903e;

    public zw30(int i, String str, ArrayList arrayList) {
        super(8, 2);
        this.f286901c = arrayList;
        this.f286902d = i;
        this.f286903e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw30)) {
            return false;
        }
        zw30 zw30Var = (zw30) obj;
        return wj50.m88271j(this.f286901c, zw30Var.f286901c) && this.f286902d == zw30Var.f286902d && wj50.m88271j(this.f286903e, zw30Var.f286903e);
    }

    public final int hashCode() {
        return this.f286903e.hashCode() + mt60.m62800g(this.f286902d, this.f286901c.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f286901c);
        parcel.writeInt(this.f286902d);
        parcel.writeString(this.f286903e);
    }
}
