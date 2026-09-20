package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class xf0 implements Parcelable {
    public static final Parcelable.Creator<xf0> CREATOR = new C2267ps(23);

    /* JADX INFO: renamed from: a */
    public final int f260797a;

    /* JADX INFO: renamed from: b */
    public final Intent f260798b;

    public xf0(Intent intent, int i) {
        this.f260797a = i;
        this.f260798b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + mrg1.m62640o(this.f260797a) + ", data=" + this.f260798b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260797a);
        Intent intent = this.f260798b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
