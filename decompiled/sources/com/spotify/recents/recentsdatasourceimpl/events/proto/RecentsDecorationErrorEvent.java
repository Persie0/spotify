package com.spotify.recents.recentsdatasourceimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.k5v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentsDecorationErrorEvent extends AbstractC0269h implements sre0 {
    private static final RecentsDecorationErrorEvent DEFAULT_INSTANCE;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 3;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 1;
    public static final int ERROR_SOURCE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String errorDescription_ = "";
    private String errorSource_ = "";
    private String errorCategory_ = "";

    static {
        RecentsDecorationErrorEvent recentsDecorationErrorEvent = new RecentsDecorationErrorEvent();
        DEFAULT_INSTANCE = recentsDecorationErrorEvent;
        AbstractC0269h.registerDefaultInstance(RecentsDecorationErrorEvent.class, recentsDecorationErrorEvent);
    }

    private RecentsDecorationErrorEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20345n(RecentsDecorationErrorEvent recentsDecorationErrorEvent, String str) {
        recentsDecorationErrorEvent.getClass();
        str.getClass();
        recentsDecorationErrorEvent.bitField0_ |= 4;
        recentsDecorationErrorEvent.errorCategory_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m20346o(RecentsDecorationErrorEvent recentsDecorationErrorEvent, String str) {
        recentsDecorationErrorEvent.getClass();
        str.getClass();
        recentsDecorationErrorEvent.bitField0_ |= 1;
        recentsDecorationErrorEvent.errorDescription_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m20347p(RecentsDecorationErrorEvent recentsDecorationErrorEvent, String str) {
        recentsDecorationErrorEvent.getClass();
        recentsDecorationErrorEvent.bitField0_ |= 2;
        recentsDecorationErrorEvent.errorSource_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static k5v0 m20348q() {
        return (k5v0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "errorDescription_", "errorSource_", "errorCategory_"});
        }
        if (iOrdinal == 3) {
            return new RecentsDecorationErrorEvent();
        }
        if (iOrdinal == 4) {
            return new k5v0(DEFAULT_INSTANCE);
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
        synchronized (RecentsDecorationErrorEvent.class) {
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
