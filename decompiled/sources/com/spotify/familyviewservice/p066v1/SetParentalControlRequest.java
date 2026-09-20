package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q501;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class SetParentalControlRequest extends AbstractC0269h implements sre0 {
    private static final SetParentalControlRequest DEFAULT_INSTANCE;
    public static final int LOCK_CANVAS_FIELD_NUMBER = 5;
    public static final int LOCK_EXPLICIT_CONTENT_FIELD_NUMBER = 2;
    public static final int LOCK_MUSIC_VIDEOS_FIELD_NUMBER = 3;
    public static final int LOCK_OTHER_VIDEOS_FIELD_NUMBER = 4;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private Object type_;
    private int typeCase_ = 0;
    private String memberId_ = "";

    static {
        SetParentalControlRequest setParentalControlRequest = new SetParentalControlRequest();
        DEFAULT_INSTANCE = setParentalControlRequest;
        AbstractC0269h.registerDefaultInstance(SetParentalControlRequest.class, setParentalControlRequest);
    }

    private SetParentalControlRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10778n(SetParentalControlRequest setParentalControlRequest, boolean z) {
        setParentalControlRequest.typeCase_ = 5;
        setParentalControlRequest.type_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: o */
    public static void m10779o(SetParentalControlRequest setParentalControlRequest, boolean z) {
        setParentalControlRequest.typeCase_ = 2;
        setParentalControlRequest.type_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: p */
    public static void m10780p(SetParentalControlRequest setParentalControlRequest, boolean z) {
        setParentalControlRequest.typeCase_ = 3;
        setParentalControlRequest.type_ = Boolean.valueOf(z);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m10781q(SetParentalControlRequest setParentalControlRequest, boolean z) {
        setParentalControlRequest.typeCase_ = 4;
        setParentalControlRequest.type_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: r */
    public static void m10782r(SetParentalControlRequest setParentalControlRequest, String str) {
        setParentalControlRequest.getClass();
        str.getClass();
        setParentalControlRequest.memberId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static q501 m10784t() {
        return (q501) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002:\u0000\u0003:\u0000\u0004:\u0000\u0005:\u0000", new Object[]{"type_", "typeCase_", "memberId_"});
        }
        if (iOrdinal == 3) {
            return new SetParentalControlRequest();
        }
        if (iOrdinal == 4) {
            return new q501();
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
        synchronized (SetParentalControlRequest.class) {
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
