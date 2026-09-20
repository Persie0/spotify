package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.dhk0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class NpvScrollStructure extends AbstractC0269h implements sre0 {
    private static final NpvScrollStructure DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 1;
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();

    static {
        NpvScrollStructure npvScrollStructure = new NpvScrollStructure();
        DEFAULT_INSTANCE = npvScrollStructure;
        AbstractC0269h.registerDefaultInstance(NpvScrollStructure.class, npvScrollStructure);
    }

    private NpvScrollStructure() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20547n(NpvScrollStructure npvScrollStructure, Section section) {
        npvScrollStructure.getClass();
        section.getClass();
        ae50 ae50Var = npvScrollStructure.sections_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            npvScrollStructure.sections_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        npvScrollStructure.sections_.add(section);
    }

    /* JADX INFO: renamed from: o */
    public static NpvScrollStructure m20548o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static dhk0 m20549q() {
        return (dhk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sections_", Section.class});
        }
        if (iOrdinal == 3) {
            return new NpvScrollStructure();
        }
        if (iOrdinal == 4) {
            return new dhk0(DEFAULT_INSTANCE);
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
        synchronized (NpvScrollStructure.class) {
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

    /* JADX INFO: renamed from: p */
    public final ae50 m20550p() {
        return this.sections_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
