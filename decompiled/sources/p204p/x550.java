package p204p;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x550 implements Parcelable {
    public static final Parcelable.Creator<x550> CREATOR = new y240(28);

    /* JADX INFO: renamed from: a */
    public final IntentSender f258301a;

    /* JADX INFO: renamed from: b */
    public final Intent f258302b;

    /* JADX INFO: renamed from: c */
    public final int f258303c;

    /* JADX INFO: renamed from: d */
    public final int f258304d;

    public x550(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f258301a = intentSender;
        this.f258302b = intent;
        this.f258303c = i;
        this.f258304d = i2;
    }

    /* JADX INFO: renamed from: c */
    public final Intent m89964c() {
        return this.f258302b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m89965g() {
        return this.f258303c;
    }

    /* JADX INFO: renamed from: h */
    public final int m89966h() {
        return this.f258304d;
    }

    /* JADX INFO: renamed from: j */
    public final IntentSender m89967j() {
        return this.f258301a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f258301a, i);
        parcel.writeParcelable(this.f258302b, i);
        parcel.writeInt(this.f258303c);
        parcel.writeInt(this.f258304d);
    }
}
