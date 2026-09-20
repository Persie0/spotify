package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a8d1 implements Parcelable {
    public static final Parcelable.Creator<a8d1> CREATOR = new vmc1(26);

    /* JADX INFO: renamed from: a */
    public final String f13264a;

    /* JADX INFO: renamed from: b */
    public final b8d1 f13265b;

    /* JADX INFO: renamed from: c */
    public final List f13266c;

    public a8d1(String str, b8d1 b8d1Var, List list) {
        this.f13264a = str;
        this.f13265b = b8d1Var;
        this.f13266c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8d1)) {
            return false;
        }
        a8d1 a8d1Var = (a8d1) obj;
        return wj50.m88271j(this.f13264a, a8d1Var.f13264a) && this.f13265b == a8d1Var.f13265b && wj50.m88271j(this.f13266c, a8d1Var.f13266c);
    }

    public final int hashCode() {
        String str = this.f13264a;
        return this.f13266c.hashCode() + ((this.f13265b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13264a);
        parcel.writeString(this.f13265b.name());
        parcel.writeStringList(this.f13266c);
    }
}
