package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p204p.jfd0;
import p204p.nfb1;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new jfd0(7);

    /* JADX INFO: renamed from: b */
    public final Object f22b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0002a f23c;

    /* JADX INFO: renamed from: a */
    public final Object f21a = new Object();

    /* JADX INFO: renamed from: d */
    public nfb1 f24d = null;

    public MediaSessionCompat$Token(Object obj, InterfaceC0002a interfaceC0002a, int i) {
        this.f22b = obj;
        this.f23c = interfaceC0002a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0002a m34c() {
        InterfaceC0002a interfaceC0002a;
        synchronized (this.f21a) {
            interfaceC0002a = this.f23c;
        }
        return interfaceC0002a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).f22b;
        Object obj3 = this.f22b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f22b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f22b, i);
    }
}
