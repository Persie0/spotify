package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a940 implements k3r, Parcelable {
    public static final Parcelable.Creator<a940> CREATOR = new y240(5);

    /* JADX INFO: renamed from: a */
    public final String f13464a;

    /* JADX INFO: renamed from: b */
    public final String f13465b;

    /* JADX INFO: renamed from: c */
    public final List f13466c;

    /* JADX INFO: renamed from: d */
    public final int f13467d;

    public a940(int i, String str, String str2, ArrayList arrayList) {
        this.f13464a = str;
        this.f13465b = str2;
        this.f13466c = arrayList;
        this.f13467d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a940)) {
            return false;
        }
        a940 a940Var = (a940) obj;
        return wj50.m88271j(this.f13464a, a940Var.f13464a) && wj50.m88271j(this.f13465b, a940Var.f13465b) && wj50.m88271j(this.f13466c, a940Var.f13466c) && this.f13467d == a940Var.f13467d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13467d) + s571.m77244c(s571.m77243b(this.f13464a.hashCode() * 31, 31, this.f13465b), 31, this.f13466c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13464a);
        parcel.writeString(this.f13465b);
        parcel.writeStringList(this.f13466c);
        parcel.writeInt(this.f13467d);
    }
}
