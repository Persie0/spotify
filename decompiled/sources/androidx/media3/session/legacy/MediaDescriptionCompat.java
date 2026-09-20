package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p204p.h0b1;
import p204p.yif1;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: androidx.media3.session.legacy.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    @SuppressLint({"InlinedApi"})
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private byte[] compressedIcon;
    private final CharSequence description;
    private MediaDescription descriptionFwk;
    private final Bundle extras;
    private final Bitmap icon;
    private final Uri iconUri;
    private final String mediaId;
    private final Uri mediaUri;
    private final CharSequence subtitle;
    private final CharSequence title;

    public static final class Builder {
        private CharSequence description;
        private Bundle extras;
        private Bitmap icon;
        private Uri iconUri;
        private String mediaId;
        private Uri mediaUri;
        private CharSequence subtitle;
        private CharSequence title;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.mediaId, this.title, this.subtitle, this.description, this.icon, this.iconUri, this.extras, this.mediaUri);
        }

        public Builder setDescription(CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        public Builder setIconBitmap(Bitmap bitmap) {
            this.icon = bitmap;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setMediaId(String str) {
            this.mediaId = str;
            return this;
        }

        public Builder setMediaUri(Uri uri) {
            this.mediaUri = uri;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mediaId = str;
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.description = charSequence3;
        this.icon = bitmap;
        this.iconUri = uri;
        this.extras = bundle;
        this.mediaUri = uri2;
    }

    public static MediaDescriptionCompat fromMediaDescription(MediaDescription mediaDescription) {
        Builder builder = new Builder();
        builder.setMediaId(mediaDescription.getMediaId());
        builder.setTitle(mediaDescription.getTitle());
        builder.setSubtitle(mediaDescription.getSubtitle());
        builder.setDescription(mediaDescription.getDescription());
        builder.setIconBitmap(mediaDescription.getIconBitmap());
        builder.setIconUri(mediaDescription.getIconUri());
        Bundle bundleM46328p = h0b1.m46328p(mediaDescription.getExtras());
        Uri uri = null;
        Bundle bundle = null;
        uri = null;
        if (bundleM46328p != null) {
            try {
                Bundle bundle2 = new Bundle(bundleM46328p);
                Uri uri2 = (Uri) bundle2.getParcelable(DESCRIPTION_KEY_MEDIA_URI);
                if (uri2 == null) {
                    bundle = bundle2;
                } else if (!bundle2.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) || bundle2.size() != 2) {
                    bundle2.remove(DESCRIPTION_KEY_MEDIA_URI);
                    bundle2.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
                    bundle = bundle2;
                }
                Bundle bundle3 = bundle;
                uri = uri2;
                bundleM46328p = bundle3;
            } catch (RuntimeException e) {
                yif1.m93821x0("Failed to parse extras", e);
                bundleM46328p = null;
            }
        }
        builder.setExtras(bundleM46328p);
        if (uri != null) {
            builder.setMediaUri(uri);
        } else {
            builder.setMediaUri(mediaDescription.getMediaUri());
        }
        MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
        mediaDescriptionCompatBuild.descriptionFwk = mediaDescription;
        return mediaDescriptionCompatBuild;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.description;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public Bitmap getIconBitmap() {
        return this.icon;
    }

    public byte[] getIconBitmapData() {
        if (this.icon == null) {
            return null;
        }
        if (this.compressedIcon == null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    this.icon.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    this.compressedIcon = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                yif1.m93821x0("Failed to compress MediaDescriptionCompat artwork", e);
            }
        }
        return this.compressedIcon;
    }

    public Uri getIconUri() {
        return this.iconUri;
    }

    public MediaDescription getMediaDescription() {
        MediaDescription mediaDescription = this.descriptionFwk;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.mediaId);
        builder.setTitle(this.title);
        builder.setSubtitle(this.subtitle);
        builder.setDescription(this.description);
        builder.setIconBitmap(this.icon);
        builder.setIconUri(this.iconUri);
        builder.setExtras(this.extras);
        builder.setMediaUri(this.mediaUri);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.descriptionFwk = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public Uri getMediaUri() {
        return this.mediaUri;
    }

    public CharSequence getSubtitle() {
        return this.subtitle;
    }

    public CharSequence getTitle() {
        return this.title;
    }

    public void preserveIconBitmapData(MediaDescriptionCompat mediaDescriptionCompat) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (mediaDescriptionCompat.compressedIcon == null || (bitmap = this.icon) == null || (bitmap2 = mediaDescriptionCompat.icon) == null || !bitmap.sameAs(bitmap2)) {
            return;
        }
        this.compressedIcon = mediaDescriptionCompat.compressedIcon;
    }

    public String toString() {
        return ((Object) this.title) + ", " + ((Object) this.subtitle) + ", " + ((Object) this.description);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        getMediaDescription().writeToParcel(parcel, i);
    }
}
