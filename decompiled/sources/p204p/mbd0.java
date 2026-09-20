package p204p;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class mbd0 extends Binder implements fv30 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f141888a;

    public mbd0() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f141888a = new WeakReference(null);
    }

    @Override // p204p.fv30
    /* JADX INFO: renamed from: Y1 */
    public final void mo40087Y1(PlaybackStateCompat playbackStateCompat) {
        if (this.f141888a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // p204p.fv30
    public final void onRepeatModeChanged(int i) {
        if (this.f141888a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // p204p.fv30
    public final void onShuffleModeChanged(int i) {
        if (this.f141888a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                if (this.f141888a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 2:
                throw new AssertionError();
            case 3:
                mo40087Y1((PlaybackStateCompat) ex60.m40171e(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                throw new AssertionError();
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.f141888a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                onShuffleModeChanged(parcel.readInt());
                return true;
            case 13:
                if (this.f141888a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
