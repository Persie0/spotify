package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class eh41 implements sv31, Parcelable {
    public static final Parcelable.Creator<eh41> CREATOR = new ln31(26);

    /* JADX INFO: renamed from: a */
    public final String f59500a;

    /* JADX INFO: renamed from: b */
    public final String f59501b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f59502c;

    public eh41(String str, String str2, ArrayList arrayList) {
        this.f59500a = str;
        this.f59501b = str2;
        this.f59502c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.sv31
    public final String getKey() {
        return this.f59500a;
    }

    public final String toString() {
        String str = this.f59501b;
        return str != null ? str : "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59500a);
        parcel.writeString(this.f59501b);
        parcel.writeTypedList(this.f59502c);
    }
}
