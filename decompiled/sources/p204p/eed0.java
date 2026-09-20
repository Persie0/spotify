package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class eed0 implements m6k {
    public static final Parcelable.Creator<eed0> CREATOR = new f4c0(25);

    /* JADX INFO: renamed from: a */
    public final String f58749a;

    /* JADX INFO: renamed from: b */
    public final String f58750b;

    /* JADX INFO: renamed from: c */
    public final List f58751c;

    /* JADX INFO: renamed from: d */
    public final List f58752d;

    /* JADX INFO: renamed from: e */
    public final boolean f58753e;

    public eed0(String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f58749a = str;
        this.f58750b = str2;
        this.f58751c = arrayList;
        this.f58752d = arrayList2;
        this.f58753e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eed0)) {
            return false;
        }
        eed0 eed0Var = (eed0) obj;
        return wj50.m88271j(this.f58749a, eed0Var.f58749a) && wj50.m88271j(this.f58750b, eed0Var.f58750b) && wj50.m88271j(this.f58751c, eed0Var.f58751c) && wj50.m88271j(this.f58752d, eed0Var.f58752d) && this.f58753e == eed0Var.f58753e;
    }

    @Override // p204p.m6k
    public final z6k getTarget() {
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58753e) + s571.m77244c(s571.m77244c(s571.m77243b(this.f58749a.hashCode() * 31, 31, this.f58750b), 31, this.f58751c), 31, this.f58752d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f58749a);
        parcel.writeString(this.f58750b);
        parcel.writeStringList(this.f58751c);
        parcel.writeStringList(this.f58752d);
        parcel.writeInt(this.f58753e ? 1 : 0);
    }
}
