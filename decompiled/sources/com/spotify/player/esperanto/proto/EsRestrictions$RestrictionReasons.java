package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.dow;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsRestrictions$RestrictionReasons extends AbstractC0269h implements sre0 {
    private static final EsRestrictions$RestrictionReasons DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 1;
    private ae50 reasons_ = AbstractC0269h.emptyProtobufList();

    static {
        EsRestrictions$RestrictionReasons esRestrictions$RestrictionReasons = new EsRestrictions$RestrictionReasons();
        DEFAULT_INSTANCE = esRestrictions$RestrictionReasons;
        AbstractC0269h.registerDefaultInstance(EsRestrictions$RestrictionReasons.class, esRestrictions$RestrictionReasons);
    }

    private EsRestrictions$RestrictionReasons() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17867n(EsRestrictions$RestrictionReasons esRestrictions$RestrictionReasons, List list) {
        ae50 ae50Var = esRestrictions$RestrictionReasons.reasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$RestrictionReasons.reasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, esRestrictions$RestrictionReasons.reasons_);
    }

    /* JADX INFO: renamed from: p */
    public static EsRestrictions$RestrictionReasons m17869p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static dow m17870r() {
        return (dow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"reasons_"});
        }
        if (iOrdinal == 3) {
            return new EsRestrictions$RestrictionReasons();
        }
        if (iOrdinal == 4) {
            return new dow();
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
        synchronized (EsRestrictions$RestrictionReasons.class) {
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

    /* JADX INFO: renamed from: q */
    public final List m17871q() {
        return this.reasons_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
