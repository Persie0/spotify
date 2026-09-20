package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cl71 implements Parcelable {
    public static final Parcelable.Creator<cl71> CREATOR = new c071(12);

    /* JADX INFO: renamed from: a */
    public final String f39203a;

    /* JADX INFO: renamed from: b */
    public final String f39204b;

    public cl71(String str, String str2) {
        this.f39203a = str;
        this.f39204b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m33229a() {
        return this.f39203a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl71)) {
            return false;
        }
        cl71 cl71Var = (cl71) obj;
        return wj50.m88271j(this.f39203a, cl71Var.f39203a) && wj50.m88271j(this.f39204b, cl71Var.f39204b);
    }

    public final int hashCode() {
        return this.f39204b.hashCode() + (this.f39203a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39203a);
        parcel.writeString(this.f39204b);
    }
}
