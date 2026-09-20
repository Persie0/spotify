package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.i97;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r910;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetLocalizedStringsRequest extends AbstractC0269h implements sre0 {
    private static final GetLocalizedStringsRequest DEFAULT_INSTANCE;
    public static final int PAGES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int QUIZ_URI_FIELD_NUMBER = 1;
    private static final vd50 pages_converter_ = new i97(12);
    private int pagesMemoizedSerializedSize;
    private String quizUri_ = "";
    private ud50 pages_ = AbstractC0269h.emptyIntList();

    static {
        GetLocalizedStringsRequest getLocalizedStringsRequest = new GetLocalizedStringsRequest();
        DEFAULT_INSTANCE = getLocalizedStringsRequest;
        AbstractC0269h.registerDefaultInstance(GetLocalizedStringsRequest.class, getLocalizedStringsRequest);
    }

    private GetLocalizedStringsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15808n(GetLocalizedStringsRequest getLocalizedStringsRequest, String str) {
        getLocalizedStringsRequest.getClass();
        str.getClass();
        getLocalizedStringsRequest.quizUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static r910 m15809o() {
        return (r910) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"quizUri_", "pages_"});
        }
        if (iOrdinal == 3) {
            return new GetLocalizedStringsRequest();
        }
        if (iOrdinal == 4) {
            return new r910(DEFAULT_INSTANCE);
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
        synchronized (GetLocalizedStringsRequest.class) {
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
