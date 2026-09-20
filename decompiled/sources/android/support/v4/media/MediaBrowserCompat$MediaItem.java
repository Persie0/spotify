package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p204p.f4c0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new f4c0(23);

    /* JADX INFO: renamed from: a */
    public final int f0a;

    /* JADX INFO: renamed from: b */
    public final MediaDescriptionCompat f1b;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (TextUtils.isEmpty(mediaDescriptionCompat.f2a)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f0a = i;
        this.f1b = mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f0a + ", mDescription=" + this.f1b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f0a);
        this.f1b.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f0a = parcel.readInt();
        this.f1b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
