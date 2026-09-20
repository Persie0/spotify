package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class mlt0 implements nlt0 {
    public static final Parcelable.Creator<mlt0> CREATOR = new vit0(7);

    /* JADX INFO: renamed from: a */
    public final String f144920a;

    /* JADX INFO: renamed from: b */
    public final boolean f144921b;

    /* JADX INFO: renamed from: c */
    public final String f144922c;

    public mlt0(String str, String str2, boolean z) {
        this.f144920a = str;
        this.f144921b = z;
        this.f144922c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlt0)) {
            return false;
        }
        mlt0 mlt0Var = (mlt0) obj;
        return wj50.m88271j(this.f144920a, mlt0Var.f144920a) && this.f144921b == mlt0Var.f144921b && wj50.m88271j(this.f144922c, mlt0Var.f144922c);
    }

    @Override // p204p.nlt0
    /* JADX INFO: renamed from: f */
    public final boolean mo59313f() {
        return this.f144921b;
    }

    @Override // p204p.nlt0
    public final String getDescription() {
        return this.f144922c;
    }

    @Override // p204p.nlt0
    public final String getText() {
        return this.f144920a;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f144920a.hashCode() * 31, 31, this.f144921b);
        String str = this.f144922c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f144920a);
        parcel.writeInt(this.f144921b ? 1 : 0);
        parcel.writeString(this.f144922c);
    }
}
