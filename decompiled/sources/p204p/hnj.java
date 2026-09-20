package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class hnj extends onj {
    public static final Parcelable.Creator<hnj> CREATOR = new dnj(3);

    /* JADX INFO: renamed from: a */
    public final String f93346a;

    /* JADX INFO: renamed from: b */
    public final jyn0 f93347b;

    /* JADX INFO: renamed from: c */
    public final int f93348c;

    public hnj(String str, jyn0 jyn0Var, int i) {
        this.f93346a = str;
        this.f93347b = jyn0Var;
        this.f93348c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnj)) {
            return false;
        }
        hnj hnjVar = (hnj) obj;
        return wj50.m88271j(this.f93346a, hnjVar.f93346a) && wj50.m88271j(this.f93347b, hnjVar.f93347b) && this.f93348c == hnjVar.f93348c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93348c) + ((this.f93347b.hashCode() + (this.f93346a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f93346a);
        parcel.writeParcelable(this.f93347b, i);
        parcel.writeInt(this.f93348c);
    }
}
