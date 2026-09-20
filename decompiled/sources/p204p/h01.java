package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class h01 extends z01 {
    public static final Parcelable.Creator<h01> CREATOR = new zz0(7);

    /* JADX INFO: renamed from: a */
    public final String f86096a;

    /* JADX INFO: renamed from: b */
    public final List f86097b;

    /* JADX INFO: renamed from: c */
    public final List f86098c;

    public h01(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f86096a = str;
        this.f86097b = arrayList;
        this.f86098c = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h01)) {
            return false;
        }
        h01 h01Var = (h01) obj;
        return wj50.m88271j(this.f86096a, h01Var.f86096a) && wj50.m88271j(this.f86097b, h01Var.f86097b) && wj50.m88271j(this.f86098c, h01Var.f86098c);
    }

    public final int hashCode() {
        return this.f86098c.hashCode() + s571.m77244c(this.f86096a.hashCode() * 31, 31, this.f86097b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f86096a);
        parcel.writeStringList(this.f86097b);
        parcel.writeStringList(this.f86098c);
    }
}
