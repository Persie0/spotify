package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class jvw0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f116536a;

    /* JADX INFO: renamed from: b */
    public static final wp6 f116535b = new wp6(ivw0.f106293h);
    public static final Parcelable.Creator<jvw0> CREATOR = new b8w0(27);

    public /* synthetic */ jvw0(String str) {
        this.f116536a = str;
    }

    /* JADX INFO: renamed from: c */
    public static String m54393c(String str) {
        return s571.m77251j("RequestId(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jvw0) {
            return wj50.m88271j(this.f116536a, ((jvw0) obj).f116536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f116536a.hashCode();
    }

    public final String toString() {
        return m54393c(this.f116536a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116536a);
    }
}
