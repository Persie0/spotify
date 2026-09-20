package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class RichBottomsheet extends AbstractC0269h implements sre0 {
    public static final int BODY_FIELD_NUMBER = 4;
    private static final RichBottomsheet DEFAULT_INSTANCE;
    public static final int HEADLINE_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 1;
    private int bitField0_;
    private Signifier signifier_;
    private String imageUrl_ = "";
    private String headline_ = "";
    private String body_ = "";

    static {
        RichBottomsheet richBottomsheet = new RichBottomsheet();
        DEFAULT_INSTANCE = richBottomsheet;
        AbstractC0269h.registerDefaultInstance(RichBottomsheet.class, richBottomsheet);
    }

    private RichBottomsheet() {
    }

    /* JADX INFO: renamed from: o */
    public static RichBottomsheet m17268o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "signifier_", "imageUrl_", "headline_", "body_"});
        }
        if (iOrdinal == 3) {
            return new RichBottomsheet();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 22);
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
        synchronized (RichBottomsheet.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m17269n() {
        return this.body_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m17270p() {
        return this.headline_;
    }

    /* JADX INFO: renamed from: q */
    public final Signifier m17271q() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.m17273o() : signifier;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
