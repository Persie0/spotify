package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class StaticEnrichedHeading extends AbstractC0269h implements sre0 {
    private static final StaticEnrichedHeading DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTEXT_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String subtext_ = "";
    private String imageUrl_ = "";
    private String navigationUri_ = "";

    static {
        StaticEnrichedHeading staticEnrichedHeading = new StaticEnrichedHeading();
        DEFAULT_INSTANCE = staticEnrichedHeading;
        AbstractC0269h.registerDefaultInstance(StaticEnrichedHeading.class, staticEnrichedHeading);
    }

    private StaticEnrichedHeading() {
    }

    /* JADX INFO: renamed from: o */
    public static StaticEnrichedHeading m5848o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"text_", "subtext_", "imageUrl_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new StaticEnrichedHeading();
        }
        if (iOrdinal == 4) {
            return new nr41(3);
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
        synchronized (StaticEnrichedHeading.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m5849p() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m5850q() {
        return this.subtext_;
    }

    /* JADX INFO: renamed from: r */
    public final String m5851r() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
