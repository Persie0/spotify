package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class c8w0 implements Parcelable {
    public static final Parcelable.Creator<c8w0> CREATOR = new b8w0(0);

    /* JADX INFO: renamed from: a */
    public final String f35323a;

    /* JADX INFO: renamed from: b */
    public final eil f35324b;

    /* JADX INFO: renamed from: c */
    public final String f35325c;

    public c8w0(String str, eil eilVar, String str2) {
        this.f35323a = str;
        this.f35324b = eilVar;
        this.f35325c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8w0)) {
            return false;
        }
        c8w0 c8w0Var = (c8w0) obj;
        return wj50.m88271j(this.f35323a, c8w0Var.f35323a) && wj50.m88271j(this.f35324b, c8w0Var.f35324b) && wj50.m88271j(this.f35325c, c8w0Var.f35325c);
    }

    public final int hashCode() {
        return this.f35325c.hashCode() + ((this.f35324b.hashCode() + (this.f35323a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35323a);
        parcel.writeParcelable(this.f35324b, i);
        parcel.writeString(this.f35325c);
    }
}
