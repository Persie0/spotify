package com.spotify.reinventfree.cappingmetadataimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.b910;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetHardCapEducationResponse extends AbstractC0269h implements sre0 {
    private static final GetHardCapEducationResponse DEFAULT_INSTANCE;
    public static final int EDUCATION_TYPE_FIELD_NUMBER = 1;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int educationType_;
    private String messageId_ = "";

    static {
        GetHardCapEducationResponse getHardCapEducationResponse = new GetHardCapEducationResponse();
        DEFAULT_INSTANCE = getHardCapEducationResponse;
        AbstractC0269h.registerDefaultInstance(GetHardCapEducationResponse.class, getHardCapEducationResponse);
    }

    private GetHardCapEducationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"educationType_", "messageId_"});
        }
        if (iOrdinal == 3) {
            return new GetHardCapEducationResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 11);
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
        synchronized (GetHardCapEducationResponse.class) {
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

    public final String getMessageId() {
        return this.messageId_;
    }

    /* JADX INFO: renamed from: n */
    public final b910 m20377n() {
        b910 b910Var;
        int i = this.educationType_;
        if (i == 0) {
            b910Var = b910.EDUCATION_UNSPECIFIED;
        } else if (i == 1) {
            b910Var = b910.EDUCATION_AGGRESSIVE;
        } else if (i == 2) {
            b910Var = b910.EDUCATION_MEDIUM;
        } else if (i != 3) {
            b910Var = i != 4 ? null : b910.EDUCATION_NONE;
        } else {
            b910Var = b910.EDUCATION_PASSIVE;
        }
        return b910Var == null ? b910.UNRECOGNIZED : b910Var;
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
