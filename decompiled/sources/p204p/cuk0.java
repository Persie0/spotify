package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cuk0 implements Parcelable {
    public static final Parcelable.Creator<cuk0> CREATOR = new fgj0(27);

    /* JADX INFO: renamed from: a */
    public final String f42144a;

    /* JADX INFO: renamed from: b */
    public final String f42145b;

    /* JADX INFO: renamed from: c */
    public final String f42146c;

    /* JADX INFO: renamed from: d */
    public final List f42147d;

    public cuk0(String str, List list, String str2, String str3) {
        this.f42144a = str;
        this.f42145b = str2;
        this.f42146c = str3;
        this.f42147d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuk0)) {
            return false;
        }
        cuk0 cuk0Var = (cuk0) obj;
        return wj50.m88271j(this.f42144a, cuk0Var.f42144a) && wj50.m88271j(this.f42145b, cuk0Var.f42145b) && wj50.m88271j(this.f42146c, cuk0Var.f42146c) && wj50.m88271j(this.f42147d, cuk0Var.f42147d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f42144a.hashCode() * 31, 31, this.f42145b);
        String str = this.f42146c;
        return this.f42147d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42144a);
        parcel.writeString(this.f42145b);
        parcel.writeString(this.f42146c);
        parcel.writeStringList(this.f42147d);
    }
}
