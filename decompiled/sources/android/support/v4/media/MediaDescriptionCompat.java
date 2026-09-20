package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p204p.f4c0;
import p204p.ood0;
import p204p.tcd0;
import p204p.ucd0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new f4c0(24);

    /* JADX INFO: renamed from: a */
    public final String f2a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f3b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f4c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f5d;

    /* JADX INFO: renamed from: e */
    public final Bitmap f6e;

    /* JADX INFO: renamed from: f */
    public final Uri f7f;

    /* JADX INFO: renamed from: g */
    public final Bundle f8g;

    /* JADX INFO: renamed from: h */
    public final Uri f9h;

    /* JADX INFO: renamed from: i */
    public MediaDescription f10i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2a = str;
        this.f3b = charSequence;
        this.f4c = charSequence2;
        this.f5d = charSequence3;
        this.f6e = bitmap;
        this.f7f = uri;
        this.f8g = bundle;
        this.f9h = uri2;
    }

    /* JADX INFO: renamed from: c */
    public static MediaDescriptionCompat m28c(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strM80447g = tcd0.m80447g(mediaDescription);
        CharSequence charSequenceM80449i = tcd0.m80449i(mediaDescription);
        CharSequence charSequenceM80448h = tcd0.m80448h(mediaDescription);
        CharSequence charSequenceM80443c = tcd0.m80443c(mediaDescription);
        Bitmap bitmapM80445e = tcd0.m80445e(mediaDescription);
        Uri uriM80446f = tcd0.m80446f(mediaDescription);
        Bundle bundleM80444d = tcd0.m80444d(mediaDescription);
        if (bundleM80444d != null) {
            ood0.m67479k(bundleM80444d);
            try {
                bundleM80444d.isEmpty();
            } catch (BadParcelableException unused) {
                bundleM80444d = null;
            }
        }
        Uri uriM82771a = bundleM80444d != null ? (Uri) bundleM80444d.getParcelable(androidx.media3.session.legacy.MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI) : null;
        if (uriM82771a == null) {
            bundle = bundleM80444d;
        } else if (bundleM80444d.containsKey(androidx.media3.session.legacy.MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && bundleM80444d.size() == 2) {
            bundle = null;
        } else {
            bundleM80444d.remove(androidx.media3.session.legacy.MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
            bundleM80444d.remove(androidx.media3.session.legacy.MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
            bundle = bundleM80444d;
        }
        if (uriM82771a == null) {
            uriM82771a = ucd0.m82771a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM80447g, charSequenceM80449i, charSequenceM80448h, charSequenceM80443c, bitmapM80445e, uriM80446f, bundle, uriM82771a);
        mediaDescriptionCompat.f10i = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final MediaDescription m29g() {
        MediaDescription mediaDescription = this.f10i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderM80442b = tcd0.m80442b();
        tcd0.m80454n(builderM80442b, this.f2a);
        tcd0.m80456p(builderM80442b, this.f3b);
        tcd0.m80455o(builderM80442b, this.f4c);
        tcd0.m80450j(builderM80442b, this.f5d);
        tcd0.m80452l(builderM80442b, this.f6e);
        tcd0.m80453m(builderM80442b, this.f7f);
        tcd0.m80451k(builderM80442b, this.f8g);
        ucd0.m82772b(builderM80442b, this.f9h);
        MediaDescription mediaDescriptionM80441a = tcd0.m80441a(builderM80442b);
        this.f10i = mediaDescriptionM80441a;
        return mediaDescriptionM80441a;
    }

    public final String toString() {
        return ((Object) this.f3b) + ", " + ((Object) this.f4c) + ", " + ((Object) this.f5d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m29g().writeToParcel(parcel, i);
    }
}
