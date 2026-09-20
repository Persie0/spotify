package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class k8s implements Parcelable {
    public static final Parcelable.Creator<k8s> CREATOR = new o5r(28);

    /* JADX INFO: renamed from: a */
    public final String f120416a;

    /* JADX INFO: renamed from: b */
    public final String f120417b;

    public k8s(String str, String str2) {
        this.f120416a = str;
        this.f120417b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8s)) {
            return false;
        }
        k8s k8sVar = (k8s) obj;
        return wj50.m88271j(this.f120416a, k8sVar.f120416a) && wj50.m88271j(this.f120417b, k8sVar.f120417b);
    }

    public final int hashCode() {
        return this.f120417b.hashCode() + (this.f120416a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120416a);
        parcel.writeString(this.f120417b);
    }
}
