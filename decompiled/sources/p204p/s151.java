package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class s151 implements Parcelable {
    public static final Parcelable.Creator<s151> CREATOR = new q051(10);

    /* JADX INFO: renamed from: a */
    public final String f204603a;

    /* JADX INFO: renamed from: b */
    public final List f204604b;

    /* JADX INFO: renamed from: c */
    public final List f204605c;

    public s151(String str, List list, List list2) {
        this.f204603a = str;
        this.f204604b = list;
        this.f204605c = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s151)) {
            return false;
        }
        s151 s151Var = (s151) obj;
        return wj50.m88271j(this.f204603a, s151Var.f204603a) && wj50.m88271j(this.f204604b, s151Var.f204604b) && wj50.m88271j(this.f204605c, s151Var.f204605c);
    }

    public final int hashCode() {
        return this.f204605c.hashCode() + s571.m77244c(this.f204603a.hashCode() * 31, 31, this.f204604b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f204603a);
        parcel.writeStringList(this.f204604b);
        parcel.writeStringList(this.f204605c);
    }
}
