package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jl71 implements Parcelable {
    public static final Parcelable.Creator<jl71> CREATOR = new c071(13);

    /* JADX INFO: renamed from: a */
    public final String f113512a;

    /* JADX INFO: renamed from: b */
    public final String f113513b;

    public jl71(String str, String str2) {
        this.f113512a = str;
        this.f113513b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m53652a() {
        return this.f113512a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl71)) {
            return false;
        }
        jl71 jl71Var = (jl71) obj;
        return wj50.m88271j(this.f113512a, jl71Var.f113512a) && wj50.m88271j(this.f113513b, jl71Var.f113513b);
    }

    public final int hashCode() {
        return this.f113513b.hashCode() + (this.f113512a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f113512a);
        parcel.writeString(this.f113513b);
    }
}
