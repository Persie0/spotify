package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hf31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialListeningClientSessionEnded extends AbstractC0269h implements sre0 {
    private static final SocialListeningClientSessionEnded DEFAULT_INSTANCE;
    public static final int END_REASON_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String sessionId_ = "";
    private String endReason_ = "";

    static {
        SocialListeningClientSessionEnded socialListeningClientSessionEnded = new SocialListeningClientSessionEnded();
        DEFAULT_INSTANCE = socialListeningClientSessionEnded;
        AbstractC0269h.registerDefaultInstance(SocialListeningClientSessionEnded.class, socialListeningClientSessionEnded);
    }

    private SocialListeningClientSessionEnded() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12896n(SocialListeningClientSessionEnded socialListeningClientSessionEnded, String str) {
        socialListeningClientSessionEnded.getClass();
        socialListeningClientSessionEnded.bitField0_ |= 2;
        socialListeningClientSessionEnded.endReason_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12897o(SocialListeningClientSessionEnded socialListeningClientSessionEnded, String str) {
        socialListeningClientSessionEnded.getClass();
        str.getClass();
        socialListeningClientSessionEnded.bitField0_ |= 1;
        socialListeningClientSessionEnded.sessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static hf31 m12898p() {
        return (hf31) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "sessionId_", "endReason_"});
        }
        if (iOrdinal == 3) {
            return new SocialListeningClientSessionEnded();
        }
        if (iOrdinal == 4) {
            return new hf31(DEFAULT_INSTANCE);
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
        synchronized (SocialListeningClientSessionEnded.class) {
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
