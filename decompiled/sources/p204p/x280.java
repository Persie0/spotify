package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaConstants;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.RatingCompat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x280 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f257392a = 0;

    static {
        hg40.m47412x(MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_DURATION, MediaMetadataCompat.METADATA_KEY_ALBUM, MediaMetadataCompat.METADATA_KEY_AUTHOR, MediaMetadataCompat.METADATA_KEY_WRITER, MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_COMPILATION, MediaMetadataCompat.METADATA_KEY_DATE, MediaMetadataCompat.METADATA_KEY_YEAR, MediaMetadataCompat.METADATA_KEY_GENRE, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_ART_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_USER_RATING, MediaMetadataCompat.METADATA_KEY_RATING, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, "android.media.metadata.ADVERTISEMENT", MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    /* JADX INFO: renamed from: a */
    public static MediaBrowserCompat.MediaItem m89719a(ufd0 ufd0Var, Bitmap bitmap) {
        MediaDescriptionCompat mediaDescriptionCompatM89723e = m89723e(ufd0Var, bitmap);
        phd0 phd0Var = ufd0Var.f229765d;
        Boolean bool = phd0Var.f177624r;
        int i = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = phd0Var.f177625s;
        if (bool2 != null && bool2.booleanValue()) {
            i |= 2;
        }
        return new MediaBrowserCompat.MediaItem(mediaDescriptionCompatM89723e, i);
    }

    /* JADX INFO: renamed from: b */
    public static long m89720b(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(s571.m77246e(i, "Unrecognized FolderType: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m89721c(int i) {
        if (i == -110) {
            return 8;
        }
        if (i == -109) {
            return 11;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -2) {
            return 1;
        }
        if (i == 1) {
            return 10;
        }
        switch (i) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static egd0 m89722d(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i = bundle.getInt(MediaConstants.BROWSER_ROOT_HINTS_KEY_ROOT_CHILDREN_SUPPORTED_FLAGS, -1);
            if (i >= 0) {
                bundle.remove(MediaConstants.BROWSER_ROOT_HINTS_KEY_ROOT_CHILDREN_SUPPORTED_FLAGS);
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z);
            }
            Bundle bundle2 = Bundle.EMPTY;
            return new egd0(bundle, bundle.getBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_RECENT), bundle.getBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_OFFLINE), bundle.getBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_SUGGESTED));
        } catch (Exception unused) {
            Bundle bundle3 = Bundle.EMPTY;
            return new egd0(bundle, false, false, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public static MediaDescriptionCompat m89723e(ufd0 ufd0Var, Bitmap bitmap) {
        int i;
        CharSequence charSequence;
        MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(ufd0Var.f229762a.equals("") ? null : ufd0Var.f229762a);
        phd0 phd0Var = ufd0Var.f229765d;
        if (bitmap != null) {
            mediaId.setIconBitmap(bitmap);
        }
        Bundle bundle = phd0Var.f177605K;
        CharSequence charSequence2 = phd0Var.f177607a;
        CharSequence charSequence3 = phd0Var.f177613g;
        CharSequence charSequence4 = phd0Var.f177612f;
        pf40 pf40Var = phd0Var.f177606L;
        Integer num = phd0Var.f177604J;
        Integer num2 = phd0Var.f177623q;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        boolean z = (num2 == null || num2.intValue() == -1) ? false : true;
        boolean z2 = num != null;
        if (z || z2) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z) {
                num2.getClass();
                i = 0;
                bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, m89720b(num2.intValue()));
            } else {
                i = 0;
            }
            if (z2) {
                num.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
            }
        } else {
            i = 0;
        }
        if (!pf40Var.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList(MediaConstants.DESCRIPTION_EXTRAS_KEY_CUSTOM_BROWSER_ACTION_ID_LIST, new ArrayList<>(pf40Var));
        }
        CharSequence charSequence5 = phd0Var.f177611e;
        if (charSequence5 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence2);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i2 = i;
            int i3 = i2;
            while (true) {
                int i4 = 2;
                if (i2 < 3) {
                    String[] strArr = MediaMetadataCompat.PREFERRED_DESCRIPTION_ORDER;
                    if (i3 < strArr.length) {
                        int i5 = i3 + 1;
                        String str = strArr[i3];
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1853648227:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ARTIST)) {
                                    i4 = -1;
                                } else {
                                    i4 = i;
                                }
                                break;
                            case -1850878751:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {
                                    i4 = -1;
                                } else {
                                    i4 = 1;
                                }
                                break;
                            case -1224124471:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_WRITER)) {
                                    i4 = -1;
                                }
                                break;
                            case 194702059:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE)) {
                                    i4 = -1;
                                } else {
                                    i4 = 3;
                                }
                                break;
                            case 1058837545:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION)) {
                                    i4 = -1;
                                } else {
                                    i4 = 4;
                                }
                                break;
                            case 1684534006:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {
                                    i4 = -1;
                                } else {
                                    i4 = 5;
                                }
                                break;
                            case 1879671865:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ALBUM)) {
                                    i4 = -1;
                                } else {
                                    i4 = 6;
                                }
                                break;
                            case 1897146402:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_TITLE)) {
                                    i4 = -1;
                                } else {
                                    i4 = 7;
                                }
                                break;
                            case 1965214221:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {
                                    i4 = -1;
                                } else {
                                    i4 = 8;
                                }
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                        switch (i4) {
                            case 0:
                                charSequence = phd0Var.f177608b;
                                break;
                            case 1:
                            default:
                                charSequence = null;
                                break;
                            case 2:
                                charSequence = phd0Var.f177595A;
                                break;
                            case 3:
                                charSequence = charSequence4;
                                break;
                            case 4:
                                charSequence = charSequence3;
                                break;
                            case 5:
                                charSequence = phd0Var.f177596B;
                                break;
                            case 6:
                                charSequence = phd0Var.f177609c;
                                break;
                            case 7:
                                charSequence = charSequence2;
                                break;
                            case 8:
                                charSequence = phd0Var.f177610d;
                                break;
                        }
                        if (!TextUtils.isEmpty(charSequence)) {
                            charSequenceArr[i2] = charSequence;
                            i2++;
                        }
                        i3 = i5;
                    }
                }
            }
            charSequence5 = charSequenceArr[i];
            charSequence4 = charSequenceArr[1];
            charSequence3 = charSequenceArr[2];
        }
        return mediaId.setTitle(charSequence5).setSubtitle(charSequence4).setDescription(charSequence3).setIconUri(phd0Var.f177620n).setMediaUri(ufd0Var.f229767f.f177036a).setExtras(bundle).build();
    }

    /* JADX INFO: renamed from: f */
    public static MediaMetadataCompat m89724f(phd0 phd0Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        MediaMetadataCompat.Builder builderPutString = new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = phd0Var.f177607a;
        Bundle bundle = phd0Var.f177605K;
        Integer num = phd0Var.f177623q;
        Uri uri2 = phd0Var.f177620n;
        if (charSequence != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_TITLE, charSequence);
        }
        CharSequence charSequence2 = phd0Var.f177611e;
        if (charSequence2 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, charSequence2);
        }
        CharSequence charSequence3 = phd0Var.f177612f;
        if (charSequence3 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, charSequence3);
        }
        CharSequence charSequence4 = phd0Var.f177613g;
        if (charSequence4 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, charSequence4);
        }
        CharSequence charSequence5 = phd0Var.f177608b;
        if (charSequence5 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ARTIST, charSequence5);
        }
        CharSequence charSequence6 = phd0Var.f177609c;
        if (charSequence6 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM, charSequence6);
        }
        CharSequence charSequence7 = phd0Var.f177610d;
        if (charSequence7 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, charSequence7);
        }
        Integer num2 = phd0Var.f177627u;
        if (num2 != null) {
            builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_YEAR, num2.intValue());
        }
        CharSequence charSequence8 = phd0Var.f177595A;
        if (charSequence8 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_WRITER, charSequence8);
        }
        CharSequence charSequence9 = phd0Var.f177596B;
        if (charSequence9 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_COMPOSER, charSequence9);
        }
        if (uri != null) {
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        if (uri2 != null) {
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, uri2.toString());
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_ART_URI, uri2.toString());
        }
        if (bitmap != null) {
            builderPutString.putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            builderPutString.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        if (num != null && num.intValue() != -1) {
            builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, m89720b(num.intValue()));
        }
        if (j == -9223372036854775807L && (l = phd0Var.f177614h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, j);
        RatingCompat ratingCompatM89726h = m89726h(phd0Var.f177615i);
        if (ratingCompatM89726h != null) {
            builderPutString.putRating(MediaMetadataCompat.METADATA_KEY_USER_RATING, ratingCompatM89726h);
        }
        RatingCompat ratingCompatM89726h2 = m89726h(phd0Var.f177616j);
        if (ratingCompatM89726h2 != null) {
            builderPutString.putRating(MediaMetadataCompat.METADATA_KEY_RATING, ratingCompatM89726h2);
        }
        Integer num3 = phd0Var.f177604J;
        if (num3 != null) {
            builderPutString.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num3.intValue());
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    builderPutString.putText(str2, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    builderPutString.putLong(str2, ((Number) obj).longValue());
                }
            }
        }
        return builderPutString.build();
    }

    /* JADX INFO: renamed from: g */
    public static a7u0 m89725g(RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        switch (ratingCompat.getRatingStyle()) {
            case 1:
                return ratingCompat.isRated() ? new xp20(ratingCompat.hasHeart()) : new xp20();
            case 2:
                return ratingCompat.isRated() ? new xh71(ratingCompat.isThumbUp()) : new xh71();
            case 3:
                return ratingCompat.isRated() ? new vo41(3, ratingCompat.getStarRating()) : new vo41(3);
            case 4:
                return ratingCompat.isRated() ? new vo41(4, ratingCompat.getStarRating()) : new vo41(4);
            case 5:
                return ratingCompat.isRated() ? new vo41(5, ratingCompat.getStarRating()) : new vo41(5);
            case 6:
                return ratingCompat.isRated() ? new jln0(ratingCompat.getPercentRating()) : new jln0();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static RatingCompat m89726h(a7u0 a7u0Var) {
        if (a7u0Var == null) {
            return null;
        }
        int iM89728j = m89728j(a7u0Var);
        if (!a7u0Var.mo24999b()) {
            return RatingCompat.newUnratedRating(iM89728j);
        }
        switch (iM89728j) {
            case 1:
                return RatingCompat.newHeartRating(((xp20) a7u0Var).f264414c);
            case 2:
                return RatingCompat.newThumbRating(((xh71) a7u0Var).f261465c);
            case 3:
            case 4:
            case 5:
                return RatingCompat.newStarRating(iM89728j, ((vo41) a7u0Var).f243368c);
            case 6:
                return RatingCompat.newPercentageRating(((jln0) a7u0Var).f113654b);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m89727i(u790 u790Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    u790Var.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j = 3000 - jElapsedRealtime2;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m89728j(a7u0 a7u0Var) {
        if (a7u0Var instanceof xp20) {
            return 1;
        }
        if (a7u0Var instanceof xh71) {
            return 2;
        }
        if (!(a7u0Var instanceof vo41)) {
            return a7u0Var instanceof jln0 ? 6 : 0;
        }
        int i = ((vo41) a7u0Var).f243367b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }
}
