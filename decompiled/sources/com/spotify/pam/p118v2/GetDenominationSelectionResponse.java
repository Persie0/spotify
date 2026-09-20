package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetDenominationSelectionResponse extends AbstractC0269h implements sre0 {
    private static final GetDenominationSelectionResponse DEFAULT_INSTANCE;
    public static final int LIST_AND_SECTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int layoutCase_ = 0;
    private Object layout_;

    static {
        GetDenominationSelectionResponse getDenominationSelectionResponse = new GetDenominationSelectionResponse();
        DEFAULT_INSTANCE = getDenominationSelectionResponse;
        AbstractC0269h.registerDefaultInstance(GetDenominationSelectionResponse.class, getDenominationSelectionResponse);
    }

    private GetDenominationSelectionResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"layout_", "layoutCase_", DenominationSelectionWithListAndSections.class});
        }
        if (iOrdinal == 3) {
            return new GetDenominationSelectionResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 0);
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
        synchronized (GetDenominationSelectionResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final int m16482n() {
        int i = this.layoutCase_;
        if (i != 0) {
            return i != 1 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DenominationSelectionWithListAndSections m16483o() {
        return this.layoutCase_ == 1 ? (DenominationSelectionWithListAndSections) this.layout_ : DenominationSelectionWithListAndSections.m16434n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
