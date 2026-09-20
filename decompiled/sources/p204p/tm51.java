package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tm51 implements hn51 {
    public static final Parcelable.Creator<tm51> CREATOR = new nc51(9);

    /* JADX INFO: renamed from: a */
    public final String f221605a;

    /* JADX INFO: renamed from: b */
    public final List f221606b;

    /* JADX INFO: renamed from: c */
    public final int f221607c;

    public tm51(String str, int i, List list) {
        this.f221605a = str;
        this.f221606b = list;
        this.f221607c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm51)) {
            return false;
        }
        tm51 tm51Var = (tm51) obj;
        return wj50.m88271j(this.f221605a, tm51Var.f221605a) && wj50.m88271j(this.f221606b, tm51Var.f221606b) && this.f221607c == tm51Var.f221607c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f221607c) + s571.m77244c(this.f221605a.hashCode() * 31, 31, this.f221606b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f221605a);
        parcel.writeStringList(this.f221606b);
        parcel.writeInt(this.f221607c);
    }
}
