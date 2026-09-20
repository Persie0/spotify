package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import p204p.ikc0;
import p204p.jfd0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new jfd0(6);

    /* JADX INFO: renamed from: a */
    public final MediaDescriptionCompat f17a;

    /* JADX INFO: renamed from: b */
    public final long f18b;

    /* JADX INFO: renamed from: c */
    public MediaSession.QueueItem f19c;

    public MediaSessionCompat$QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f17a = mediaDescriptionCompat;
        this.f18b = j;
        this.f19c = queueItem;
    }

    /* JADX INFO: renamed from: c */
    public final long m33c() {
        return this.f18b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f17a);
        sb.append(", Id=");
        return ikc0.m50938j(this.f18b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f17a.writeToParcel(parcel, i);
        parcel.writeLong(this.f18b);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f17a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f18b = parcel.readLong();
    }
}
