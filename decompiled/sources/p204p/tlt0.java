package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class tlt0 implements f251 {
    public static final Parcelable.Creator<tlt0> CREATOR = new vit0(9);

    /* JADX INFO: renamed from: a */
    public final String f221520a;

    /* JADX INFO: renamed from: b */
    public final List f221521b;

    /* JADX INFO: renamed from: c */
    public final List f221522c;

    public tlt0(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f221520a = str;
        this.f221521b = arrayList;
        this.f221522c = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlt0)) {
            return false;
        }
        tlt0 tlt0Var = (tlt0) obj;
        return wj50.m88271j(this.f221520a, tlt0Var.f221520a) && wj50.m88271j(this.f221521b, tlt0Var.f221521b) && wj50.m88271j(this.f221522c, tlt0Var.f221522c);
    }

    public final int hashCode() {
        return this.f221522c.hashCode() + s571.m77244c(this.f221520a.hashCode() * 31, 31, this.f221521b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f221520a);
        parcel.writeStringList(this.f221521b);
        parcel.writeStringList(this.f221522c);
    }
}
