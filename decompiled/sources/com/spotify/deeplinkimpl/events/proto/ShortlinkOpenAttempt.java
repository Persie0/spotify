package com.spotify.deeplinkimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yi11;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortlinkOpenAttempt extends AbstractC0269h implements sre0 {
    private static final ShortlinkOpenAttempt DEFAULT_INSTANCE;
    public static final int ORIGINAL_LINK_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHORTLINK_SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String shortlinkSessionId_ = "";
    private String originalLink_ = "";

    static {
        ShortlinkOpenAttempt shortlinkOpenAttempt = new ShortlinkOpenAttempt();
        DEFAULT_INSTANCE = shortlinkOpenAttempt;
        AbstractC0269h.registerDefaultInstance(ShortlinkOpenAttempt.class, shortlinkOpenAttempt);
    }

    private ShortlinkOpenAttempt() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9194n(ShortlinkOpenAttempt shortlinkOpenAttempt, String str) {
        shortlinkOpenAttempt.getClass();
        shortlinkOpenAttempt.bitField0_ |= 2;
        shortlinkOpenAttempt.originalLink_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9195o(ShortlinkOpenAttempt shortlinkOpenAttempt, String str) {
        shortlinkOpenAttempt.getClass();
        shortlinkOpenAttempt.bitField0_ |= 1;
        shortlinkOpenAttempt.shortlinkSessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static yi11 m9196p() {
        return (yi11) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "shortlinkSessionId_", "originalLink_"});
        }
        if (iOrdinal == 3) {
            return new ShortlinkOpenAttempt();
        }
        if (iOrdinal == 4) {
            return new yi11(DEFAULT_INSTANCE);
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
        synchronized (ShortlinkOpenAttempt.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
