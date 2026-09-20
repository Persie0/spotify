package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.cow;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsRestrictions$ModeRestrictions extends AbstractC0269h implements sre0 {
    private static final EsRestrictions$ModeRestrictions DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private ihc0 values_ = ihc0.f102235b;

    static {
        EsRestrictions$ModeRestrictions esRestrictions$ModeRestrictions = new EsRestrictions$ModeRestrictions();
        DEFAULT_INSTANCE = esRestrictions$ModeRestrictions;
        AbstractC0269h.registerDefaultInstance(EsRestrictions$ModeRestrictions.class, esRestrictions$ModeRestrictions);
    }

    private EsRestrictions$ModeRestrictions() {
    }

    /* JADX INFO: renamed from: o */
    public static EsRestrictions$ModeRestrictions m17865o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", cow.f40359a});
        }
        if (iOrdinal == 3) {
            return new EsRestrictions$ModeRestrictions();
        }
        if (iOrdinal == 4) {
            return new vnw(6);
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
        synchronized (EsRestrictions$ModeRestrictions.class) {
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
    public final Map m17866p() {
        return Collections.unmodifiableMap(this.values_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
