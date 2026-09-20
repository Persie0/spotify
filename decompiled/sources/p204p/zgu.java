package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zgu extends AbstractC2202o5 {
    public static final Parcelable.ClassLoaderCreator<zgu> CREATOR = new fb31(8);

    /* JADX INFO: renamed from: c */
    public String f282715c;

    public zgu(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f282715c = "";
        String string = parcel.readString();
        this.f282715c = string == null ? "1:1" : string;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f161807a, i);
        parcel.writeString(this.f282715c);
    }
}
