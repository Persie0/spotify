package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import p204p.j7u0;
import p204p.v5u0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new v5u0(3);

    /* JADX INFO: renamed from: a */
    public final int f14a;

    /* JADX INFO: renamed from: b */
    public final float f15b;

    public RatingCompat(int i, float f) {
        this.f14a = i;
        this.f15b = f;
    }

    /* JADX INFO: renamed from: c */
    public static RatingCompat m30c(Rating rating) {
        float f;
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int iM52636b = j7u0.m52636b(rating);
            if (j7u0.m52639e(rating)) {
                switch (iM52636b) {
                    case 1:
                        ratingCompat = new RatingCompat(1, j7u0.m52638d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, j7u0.m52640f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fM52637c = j7u0.m52637c(rating);
                        if (iM52636b == 3) {
                            f = 3.0f;
                        } else if (iM52636b == 4) {
                            f = 4.0f;
                        } else if (iM52636b == 5) {
                            f = 5.0f;
                        }
                        if (fM52637c >= 0.0f && fM52637c <= f) {
                            ratingCompat = new RatingCompat(iM52636b, fM52637c);
                        }
                        break;
                    case 6:
                        float fM52635a = j7u0.m52635a(rating);
                        if (fM52635a >= 0.0f && fM52635a <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fM52635a);
                        }
                        break;
                }
            } else {
                switch (iM52636b) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iM52636b, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        return ratingCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f14a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m31g() {
        return this.f15b >= 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m32h() {
        return this.f14a == 2 && this.f15b == 1.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f14a);
        sb.append(" rating=");
        float f = this.f15b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14a);
        parcel.writeFloat(this.f15b);
    }
}
