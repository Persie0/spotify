package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class u511 implements Parcelable {
    public static final Parcelable.Creator<u511> CREATOR = new u111(15);

    /* JADX INFO: renamed from: a */
    public final up60 f226878a;

    public u511(up60 up60Var) {
        this.f226878a = up60Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u511) && wj50.m88271j(this.f226878a, ((u511) obj).f226878a);
    }

    public final int hashCode() {
        return this.f226878a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        up60 up60Var = this.f226878a;
        parcel.writeString(up60Var != null ? ((ife) up60Var).mo28587A().getName() : null);
    }
}
