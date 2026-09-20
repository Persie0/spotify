package p204p;

import android.media.Rating;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j7u0 {
    /* JADX INFO: renamed from: a */
    public static float m52635a(Rating rating) {
        return rating.getPercentRating();
    }

    /* JADX INFO: renamed from: b */
    public static int m52636b(Rating rating) {
        return rating.getRatingStyle();
    }

    /* JADX INFO: renamed from: c */
    public static float m52637c(Rating rating) {
        return rating.getStarRating();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m52638d(Rating rating) {
        return rating.hasHeart();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m52639e(Rating rating) {
        return rating.isRated();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m52640f(Rating rating) {
        return rating.isThumbUp();
    }

    /* JADX INFO: renamed from: g */
    public static Rating m52641g(boolean z) {
        return Rating.newHeartRating(z);
    }

    /* JADX INFO: renamed from: h */
    public static Rating m52642h(float f) {
        return Rating.newPercentageRating(f);
    }

    /* JADX INFO: renamed from: i */
    public static Rating m52643i(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    /* JADX INFO: renamed from: j */
    public static Rating m52644j(boolean z) {
        return Rating.newThumbRating(z);
    }

    /* JADX INFO: renamed from: k */
    public static Rating m52645k(int i) {
        return Rating.newUnratedRating(i);
    }
}
