package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public enum fte0 implements Parcelable {
    INVALID_CLICK_ACTION_IDENTIFIER("invalidClickActionIdentifier"),
    INVALID_BUTTON_CONFIGURATION("invalidButtonConfiguration"),
    UNSUPPORTED_TEMPLATE("unsupportedTemplate"),
    UNSUPPORTED_FORMAT("unsupportedFormat"),
    UNKNOWN_ERROR("unknownError");


    /* JADX INFO: renamed from: a */
    public final String f73200a;
    public static final ete0 Companion = new ete0();
    public static final Parcelable.Creator<fte0> CREATOR = new ube0(15);

    /* JADX INFO: renamed from: b */
    public static final Object f73193b = q3d0.m72078I(2, sfe0.f208569f);

    fte0(String str) {
        this.f73200a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m42599c() {
        return this.f73200a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
