package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tns0 extends uns0 {
    public static final Parcelable.Creator<tns0> CREATOR = new wds0(5);

    /* JADX INFO: renamed from: b */
    public final String f222072b;

    /* JADX INFO: renamed from: c */
    public final String f222073c;

    /* JADX INFO: renamed from: d */
    public final List f222074d;

    public tns0(String str, List list, String str2) {
        super(str2);
        this.f222072b = str;
        this.f222073c = str2;
        this.f222074d = list;
    }

    @Override // p204p.uns0
    /* JADX INFO: renamed from: c */
    public final String mo73361c() {
        return this.f222072b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tns0)) {
            return false;
        }
        tns0 tns0Var = (tns0) obj;
        return wj50.m88271j(this.f222072b, tns0Var.f222072b) && wj50.m88271j(this.f222073c, tns0Var.f222073c) && wj50.m88271j(this.f222074d, tns0Var.f222074d);
    }

    @Override // p204p.uns0
    public final String getTitle() {
        return this.f222073c;
    }

    public final int hashCode() {
        return this.f222074d.hashCode() + s571.m77243b(this.f222072b.hashCode() * 31, 31, this.f222073c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f222072b);
        parcel.writeString(this.f222073c);
        parcel.writeStringList(this.f222074d);
    }
}
