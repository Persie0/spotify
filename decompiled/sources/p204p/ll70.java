package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ll70 implements Parcelable {
    public static final Parcelable.Creator<ll70> CREATOR = new w270(16);

    /* JADX INFO: renamed from: a */
    public final String f134559a;

    /* JADX INFO: renamed from: b */
    public final kl70 f134560b;

    /* JADX INFO: renamed from: c */
    public final String f134561c;

    public ll70(String str, kl70 kl70Var, String str2) {
        this.f134559a = str;
        this.f134560b = kl70Var;
        this.f134561c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll70)) {
            return false;
        }
        ll70 ll70Var = (ll70) obj;
        return wj50.m88271j(this.f134559a, ll70Var.f134559a) && wj50.m88271j(this.f134560b, ll70Var.f134560b) && wj50.m88271j(this.f134561c, ll70Var.f134561c);
    }

    public final int hashCode() {
        return this.f134561c.hashCode() + ((this.f134560b.hashCode() + (this.f134559a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134559a);
        this.f134560b.writeToParcel(parcel, i);
        parcel.writeString(this.f134561c);
    }
}
