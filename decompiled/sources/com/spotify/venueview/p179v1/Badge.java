package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Badge extends AbstractC0269h implements sre0 {
    private static final Badge DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 4;
    public static final int IDENTIFIER_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int LOGO_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private BadgeDetails details_;
    private String logoUrl_ = "";
    private String label_ = "";
    private String identifier_ = "";

    static {
        Badge badge = new Badge();
        DEFAULT_INSTANCE = badge;
        AbstractC0269h.registerDefaultInstance(Badge.class, badge);
    }

    private Badge() {
    }

    /* JADX INFO: renamed from: n */
    public static Badge m22276n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "logoUrl_", "label_", "identifier_", "details_"});
        }
        if (iOrdinal == 3) {
            return new Badge();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 14);
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
        synchronized (Badge.class) {
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
    public final BadgeDetails m22277o() {
        BadgeDetails badgeDetails = this.details_;
        return badgeDetails == null ? BadgeDetails.m22281n() : badgeDetails;
    }

    /* JADX INFO: renamed from: p */
    public final String m22278p() {
        return this.identifier_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22279q() {
        return this.label_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22280r() {
        return this.logoUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
