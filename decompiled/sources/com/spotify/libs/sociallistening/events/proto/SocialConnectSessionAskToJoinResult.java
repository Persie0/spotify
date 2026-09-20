package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.gd31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialConnectSessionAskToJoinResult extends AbstractC0269h implements sre0 {
    private static final SocialConnectSessionAskToJoinResult DEFAULT_INSTANCE;
    public static final int DISCOVERY_METHODS_FIELD_NUMBER = 7;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 4;
    public static final int ERROR_DATA_FIELD_NUMBER = 3;
    public static final int JOIN_ATTEMPT_ID_FIELD_NUMBER = 8;
    public static final int JOIN_TYPE_FIELD_NUMBER = 5;
    public static final int JOIN_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PARTICIPATION_MODE_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String sessionId_ = "";
    private String joinUrl_ = "";
    private String errorData_ = "";
    private String errorCategory_ = "";
    private String joinType_ = "";
    private String participationMode_ = "";
    private ae50 discoveryMethods_ = AbstractC0269h.emptyProtobufList();
    private String joinAttemptId_ = "";

    static {
        SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult = new SocialConnectSessionAskToJoinResult();
        DEFAULT_INSTANCE = socialConnectSessionAskToJoinResult;
        AbstractC0269h.registerDefaultInstance(SocialConnectSessionAskToJoinResult.class, socialConnectSessionAskToJoinResult);
    }

    private SocialConnectSessionAskToJoinResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12871n(SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult, ArrayList arrayList) {
        ae50 ae50Var = socialConnectSessionAskToJoinResult.discoveryMethods_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            socialConnectSessionAskToJoinResult.discoveryMethods_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, socialConnectSessionAskToJoinResult.discoveryMethods_);
    }

    /* JADX INFO: renamed from: o */
    public static void m12872o(SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult, String str) {
        socialConnectSessionAskToJoinResult.getClass();
        socialConnectSessionAskToJoinResult.bitField0_ |= 8;
        socialConnectSessionAskToJoinResult.errorCategory_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12873p(SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult, String str) {
        socialConnectSessionAskToJoinResult.getClass();
        str.getClass();
        socialConnectSessionAskToJoinResult.bitField0_ |= 4;
        socialConnectSessionAskToJoinResult.errorData_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12874q(SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult, String str) {
        socialConnectSessionAskToJoinResult.getClass();
        socialConnectSessionAskToJoinResult.bitField0_ |= 64;
        socialConnectSessionAskToJoinResult.joinAttemptId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12875r(SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult, String str) {
        socialConnectSessionAskToJoinResult.getClass();
        str.getClass();
        socialConnectSessionAskToJoinResult.bitField0_ |= 16;
        socialConnectSessionAskToJoinResult.joinType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12876s(SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult, String str) {
        socialConnectSessionAskToJoinResult.getClass();
        str.getClass();
        socialConnectSessionAskToJoinResult.bitField0_ |= 2;
        socialConnectSessionAskToJoinResult.joinUrl_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m12877t(SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult, String str) {
        socialConnectSessionAskToJoinResult.getClass();
        socialConnectSessionAskToJoinResult.bitField0_ |= 32;
        socialConnectSessionAskToJoinResult.participationMode_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m12878u(SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult, String str) {
        socialConnectSessionAskToJoinResult.getClass();
        socialConnectSessionAskToJoinResult.bitField0_ |= 1;
        socialConnectSessionAskToJoinResult.sessionId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static gd31 m12879v() {
        return (gd31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007\u001a\bဈ\u0006", new Object[]{"bitField0_", "sessionId_", "joinUrl_", "errorData_", "errorCategory_", "joinType_", "participationMode_", "discoveryMethods_", "joinAttemptId_"});
        }
        if (iOrdinal == 3) {
            return new SocialConnectSessionAskToJoinResult();
        }
        if (iOrdinal == 4) {
            return new gd31(DEFAULT_INSTANCE);
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
        synchronized (SocialConnectSessionAskToJoinResult.class) {
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
