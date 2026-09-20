package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q4m0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PageStrings extends AbstractC0269h implements sre0 {
    private static final PageStrings DEFAULT_INSTANCE;
    public static final int PAGE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 2;
    private int page_;
    private ae50 strings_ = AbstractC0269h.emptyProtobufList();

    static {
        PageStrings pageStrings = new PageStrings();
        DEFAULT_INSTANCE = pageStrings;
        AbstractC0269h.registerDefaultInstance(PageStrings.class, pageStrings);
    }

    private PageStrings() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"page_", "strings_", LocalizedString.class});
        }
        if (iOrdinal == 3) {
            return new PageStrings();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 21);
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
        synchronized (PageStrings.class) {
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
    public final q4m0 m15874n() {
        q4m0 q4m0VarM72172a = q4m0.m72172a(this.page_);
        return q4m0VarM72172a == null ? q4m0.UNRECOGNIZED : q4m0VarM72172a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m15875o() {
        return this.strings_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
