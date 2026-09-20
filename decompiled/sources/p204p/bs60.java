package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bs60 extends zq50 {
    public static final Parcelable.Creator<bs60> CREATOR = new pq50(21);

    /* JADX INFO: renamed from: a */
    public final boolean f30239a;

    /* JADX INFO: renamed from: b */
    public final boolean f30240b;

    /* JADX INFO: renamed from: c */
    public final String f30241c;

    /* JADX INFO: renamed from: d */
    public final List f30242d;

    public bs60(boolean z, boolean z2, String str, ArrayList arrayList) {
        this.f30239a = z;
        this.f30240b = z2;
        this.f30241c = str;
        this.f30242d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs60)) {
            return false;
        }
        bs60 bs60Var = (bs60) obj;
        return this.f30239a == bs60Var.f30239a && this.f30240b == bs60Var.f30240b && wj50.m88271j(this.f30241c, bs60Var.f30241c) && wj50.m88271j(this.f30242d, bs60Var.f30242d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f30239a) * 31, 31, this.f30240b);
        String str = this.f30241c;
        return this.f30242d.hashCode() + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30239a ? 1 : 0);
        parcel.writeInt(this.f30240b ? 1 : 0);
        parcel.writeString(this.f30241c);
        parcel.writeStringList(this.f30242d);
    }
}
