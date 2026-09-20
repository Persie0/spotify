package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class kcb1 implements Parcelable {
    public static final Parcelable.Creator<kcb1> CREATOR = new c8b1(3);

    /* JADX INFO: renamed from: a */
    public final String f121424a;

    public kcb1(String str) {
        this.f121424a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m56038c() {
        return this.f121424a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcb1) && wj50.m88271j(this.f121424a, ((kcb1) obj).f121424a);
    }

    public final int hashCode() {
        return this.f121424a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121424a);
    }
}
