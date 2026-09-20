package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class pa6 implements ra6 {
    public static final Parcelable.Creator<pa6> CREATOR = new vp5(18);

    /* JADX INFO: renamed from: a */
    public final String f175403a;

    public /* synthetic */ pa6(String str) {
        this.f175403a = str;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ pa6 m69435c(String str) {
        return new pa6(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pa6) {
            return wj50.m88271j(this.f175403a, ((pa6) obj).f175403a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String m69436g() {
        return this.f175403a;
    }

    public final int hashCode() {
        return this.f175403a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("Url(value=", this.f175403a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175403a);
    }
}
