package com.spotify.kidssessions.p090v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.l301;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ParentalConsentSession extends AbstractC0269h implements sre0 {
    public static final int CHILD_ID_FIELD_NUMBER = 5;
    public static final int CREATED_AT_FIELD_NUMBER = 2;
    private static final ParentalConsentSession DEFAULT_INSTANCE;
    public static final int HAS_TRANSITIONING_MA_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 6;
    public static final int VALID_UNTIL_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp createdAt_;
    private boolean hasTransitioningMa_;
    private int status_;
    private Timestamp validUntil_;
    private String sessionId_ = "";
    private String spotifyId_ = "";
    private String childId_ = "";

    static {
        ParentalConsentSession parentalConsentSession = new ParentalConsentSession();
        DEFAULT_INSTANCE = parentalConsentSession;
        AbstractC0269h.registerDefaultInstance(ParentalConsentSession.class, parentalConsentSession);
    }

    private ParentalConsentSession() {
    }

    /* JADX INFO: renamed from: n */
    public static ParentalConsentSession m12257n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006\f\u0007\u0007", new Object[]{"bitField0_", "sessionId_", "createdAt_", "validUntil_", "spotifyId_", "childId_", "status_", "hasTransitioningMa_"});
        }
        if (iOrdinal == 3) {
            return new ParentalConsentSession();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 28);
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
        synchronized (ParentalConsentSession.class) {
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

    public final String getChildId() {
        return this.childId_;
    }

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12258o() {
        return this.hasTransitioningMa_;
    }

    /* JADX INFO: renamed from: p */
    public final String m12259p() {
        return this.spotifyId_;
    }

    /* JADX INFO: renamed from: q */
    public final l301 m12260q() {
        l301 l301Var;
        int i = this.status_;
        if (i == 0) {
            l301Var = l301.SESSION_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            l301Var = l301.SESSION_STATUS_PENDING;
        } else if (i == 2) {
            l301Var = l301.SESSION_STATUS_COMPLETE;
        } else if (i != 3) {
            l301Var = i != 4 ? null : l301.SESSION_STATUS_REDEEMED;
        } else {
            l301Var = l301.SESSION_STATUS_TERMINATED;
        }
        return l301Var == null ? l301.UNRECOGNIZED : l301Var;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m12261r() {
        Timestamp timestamp = this.validUntil_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
