package com.spotify.extendedmetadata.extensions.podcastratingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Rating extends AbstractC0269h implements sre0 {
    private static final Rating DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RATED_AT_FIELD_NUMBER = 4;
    public static final int RATING_FIELD_NUMBER = 3;
    public static final int SHOW_URI_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp ratedAt_;
    private int rating_;
    private String userId_ = "";
    private String showUri_ = "";

    static {
        Rating rating = new Rating();
        DEFAULT_INSTANCE = rating;
        AbstractC0269h.registerDefaultInstance(Rating.class, rating);
    }

    private Rating() {
    }

    /* JADX INFO: renamed from: n */
    public static Rating m10288n() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004ဉ\u0000", new Object[]{"bitField0_", "userId_", "showUri_", "rating_", "ratedAt_"});
        }
        if (iOrdinal == 3) {
            return new Rating();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 1);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (Rating.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m10289o() {
        return this.rating_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
