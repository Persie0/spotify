package com.spotify.campfire.datasource.impl.proto;

import p204p.od50;
import p204p.rd50;
import p204p.sd50;

/* JADX INFO: loaded from: classes5.dex */
public enum GiphyAgeRating implements od50 {
    GIPHY_RATING_UNSPECIFIED(0),
    GIPHY_RATING_Y(1),
    GIPHY_RATING_G(2),
    GIPHY_RATING_PG(3),
    GIPHY_RATING_PG13(4),
    GIPHY_RATING_R(5),
    UNRECOGNIZED(-1);

    public static final int GIPHY_RATING_G_VALUE = 2;
    public static final int GIPHY_RATING_PG13_VALUE = 4;
    public static final int GIPHY_RATING_PG_VALUE = 3;
    public static final int GIPHY_RATING_R_VALUE = 5;
    public static final int GIPHY_RATING_UNSPECIFIED_VALUE = 0;
    public static final int GIPHY_RATING_Y_VALUE = 1;
    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.campfire.datasource.impl.proto.GiphyAgeRating.1
        @Override // p204p.rd50
        public GiphyAgeRating findValueByNumber(int i) {
            return GiphyAgeRating.forNumber(i);
        }
    };
    private final int value;

    public static final class GiphyAgeRatingVerifier implements sd50 {
        static final sd50 INSTANCE = new GiphyAgeRatingVerifier();

        private GiphyAgeRatingVerifier() {
        }

        @Override // p204p.sd50
        public boolean isInRange(int i) {
            return GiphyAgeRating.forNumber(i) != null;
        }
    }

    GiphyAgeRating(int i) {
        this.value = i;
    }

    public static GiphyAgeRating forNumber(int i) {
        if (i == 0) {
            return GIPHY_RATING_UNSPECIFIED;
        }
        if (i == 1) {
            return GIPHY_RATING_Y;
        }
        if (i == 2) {
            return GIPHY_RATING_G;
        }
        if (i == 3) {
            return GIPHY_RATING_PG;
        }
        if (i == 4) {
            return GIPHY_RATING_PG13;
        }
        if (i != 5) {
            return null;
        }
        return GIPHY_RATING_R;
    }

    public static rd50 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd50 internalGetVerifier() {
        return GiphyAgeRatingVerifier.INSTANCE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static GiphyAgeRating valueOf(int i) {
        return forNumber(i);
    }
}
