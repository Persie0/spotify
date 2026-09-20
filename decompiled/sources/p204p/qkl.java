package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class qkl implements rkl {
    public static final Parcelable.Creator<qkl> CREATOR = new pkl(0);

    /* JADX INFO: renamed from: a */
    public final ekl f189614a;

    public qkl(ekl eklVar) {
        this.f189614a = eklVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkl) && wj50.m88271j(this.f189614a, ((qkl) obj).f189614a);
    }

    public final int hashCode() {
        return this.f189614a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f189614a.writeToParcel(parcel, i);
    }
}
