package com.spotify.reflection.surveysheet.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.iqv0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ReflectionEvent extends AbstractC0269h implements sre0 {
    private static final ReflectionEvent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int FREE_TEXT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERCEPTIONS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ae50 perceptions_ = AbstractC0269h.emptyProtobufList();
    private String entityUri_ = "";
    private String freeText_ = "";

    static {
        ReflectionEvent reflectionEvent = new ReflectionEvent();
        DEFAULT_INSTANCE = reflectionEvent;
        AbstractC0269h.registerDefaultInstance(ReflectionEvent.class, reflectionEvent);
    }

    private ReflectionEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20370n(ReflectionEvent reflectionEvent, ArrayList arrayList) {
        ae50 ae50Var = reflectionEvent.perceptions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            reflectionEvent.perceptions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, reflectionEvent.perceptions_);
    }

    /* JADX INFO: renamed from: o */
    public static void m20371o(ReflectionEvent reflectionEvent, String str) {
        reflectionEvent.getClass();
        str.getClass();
        reflectionEvent.bitField0_ |= 1;
        reflectionEvent.entityUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m20372p(ReflectionEvent reflectionEvent, String str) {
        reflectionEvent.getClass();
        str.getClass();
        reflectionEvent.bitField0_ |= 2;
        reflectionEvent.freeText_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static iqv0 m20373q() {
        return (iqv0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"bitField0_", "perceptions_", "entityUri_", "freeText_"});
        }
        if (iOrdinal == 3) {
            return new ReflectionEvent();
        }
        if (iOrdinal == 4) {
            return new iqv0(DEFAULT_INSTANCE);
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
        synchronized (ReflectionEvent.class) {
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
