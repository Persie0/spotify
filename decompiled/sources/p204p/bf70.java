package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class bf70 implements Parcelable {
    public static final Parcelable.Creator<bf70> CREATOR = new w270(7);

    /* JADX INFO: renamed from: a */
    public final String f26620a;

    /* JADX INFO: renamed from: b */
    public final String f26621b;

    public bf70(String str, String str2) {
        this.f26620a = str;
        this.f26621b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m28998c() {
        return this.f26621b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf70)) {
            return false;
        }
        bf70 bf70Var = (bf70) obj;
        return wj50.m88271j(this.f26620a, bf70Var.f26620a) && wj50.m88271j(this.f26621b, bf70Var.f26621b);
    }

    public final int hashCode() {
        return this.f26621b.hashCode() + (this.f26620a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26620a);
        parcel.writeString(this.f26621b);
    }
}
