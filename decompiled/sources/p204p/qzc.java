package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class qzc implements Parcelable {
    public static final Parcelable.Creator<qzc> CREATOR = new qvc(3);

    /* JADX INFO: renamed from: a */
    public final String f194178a;

    /* JADX INFO: renamed from: b */
    public final String f194179b;

    /* JADX INFO: renamed from: c */
    public final String f194180c;

    /* JADX INFO: renamed from: d */
    public final List f194181d;

    public qzc(String str, String str2, String str3, ArrayList arrayList) {
        this.f194178a = str;
        this.f194179b = str2;
        this.f194180c = str3;
        this.f194181d = arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final String m74324c() {
        return this.f194179b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzc)) {
            return false;
        }
        qzc qzcVar = (qzc) obj;
        return wj50.m88271j(this.f194178a, qzcVar.f194178a) && wj50.m88271j(this.f194179b, qzcVar.f194179b) && wj50.m88271j(this.f194180c, qzcVar.f194180c) && wj50.m88271j(this.f194181d, qzcVar.f194181d);
    }

    /* JADX INFO: renamed from: g */
    public final String m74325g() {
        return this.f194178a;
    }

    /* JADX INFO: renamed from: h */
    public final String m74326h() {
        return this.f194180c;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f194178a.hashCode() * 31, 31, this.f194179b);
        String str = this.f194180c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f194181d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j */
    public final List m74327j() {
        return this.f194181d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f194178a);
        parcel.writeString(this.f194179b);
        parcel.writeString(this.f194180c);
        parcel.writeStringList(this.f194181d);
    }
}
