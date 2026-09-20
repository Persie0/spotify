package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VenueLinkRow extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_FIELD_NUMBER = 4;
    private static final VenueLinkRow DEFAULT_INSTANCE;
    public static final int LOGO_URL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int VENUE_URI_FIELD_NUMBER = 1;
    private String venueUri_ = "";
    private String logoUrl_ = "";
    private String name_ = "";
    private String address_ = "";

    static {
        VenueLinkRow venueLinkRow = new VenueLinkRow();
        DEFAULT_INSTANCE = venueLinkRow;
        AbstractC0269h.registerDefaultInstance(VenueLinkRow.class, venueLinkRow);
    }

    private VenueLinkRow() {
    }

    /* JADX INFO: renamed from: o */
    public static VenueLinkRow m7200o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"venueUri_", "logoUrl_", "name_", "address_"});
        }
        if (iOrdinal == 3) {
            return new VenueLinkRow();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 11);
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
        synchronized (VenueLinkRow.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m7201n() {
        return this.address_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m7202p() {
        return this.logoUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7203q() {
        return this.venueUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
