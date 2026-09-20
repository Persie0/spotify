package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tir0 extends wir0 {
    public static final Parcelable.Creator<tir0> CREATOR = new vzq0(29);

    /* JADX INFO: renamed from: c */
    public final List f220736c;

    public tir0(List list) {
        super(1, list);
        this.f220736c = list;
    }

    @Override // p204p.wir0
    /* JADX INFO: renamed from: c */
    public final List mo80926c() {
        return this.f220736c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tir0) && wj50.m88271j(this.f220736c, ((tir0) obj).f220736c);
    }

    public final int hashCode() {
        return this.f220736c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f220736c);
    }
}
