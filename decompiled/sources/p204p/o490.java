package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class o490 implements Parcelable {
    public static final Parcelable.Creator<o490> CREATOR = new x390(8);

    /* JADX INFO: renamed from: a */
    public final String f161593a;

    /* JADX INFO: renamed from: b */
    public final String f161594b;

    /* JADX INFO: renamed from: c */
    public final hz80 f161595c;

    public o490(String str, String str2, hz80 hz80Var) {
        this.f161593a = str;
        this.f161594b = str2;
        this.f161595c = hz80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o490)) {
            return false;
        }
        o490 o490Var = (o490) obj;
        return wj50.m88271j(this.f161593a, o490Var.f161593a) && wj50.m88271j(this.f161594b, o490Var.f161594b) && wj50.m88271j(this.f161595c, o490Var.f161595c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f161593a.hashCode() * 31, 31, this.f161594b);
        hz80 hz80Var = this.f161595c;
        return iM77243b + (hz80Var == null ? 0 : hz80Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161593a);
        parcel.writeString(this.f161594b);
        parcel.writeParcelable(this.f161595c, i);
    }
}
