package com.spotify.extendedmetadata.extensions.gatedentityrelationsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GatedEntityRelations extends AbstractC0269h implements sre0 {
    private static final GatedEntityRelations DEFAULT_INSTANCE;
    public static final int ENTITIES_WITH_VALUE_PROPS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 entitiesWithValueProps_ = AbstractC0269h.emptyProtobufList();

    public static final class Entity extends AbstractC0269h implements sre0 {
        private static final Entity DEFAULT_INSTANCE;
        public static final int FALLBACK_NAVIGATION_FIELD_NUMBER = 4;
        private static volatile r2n0 PARSER = null;
        public static final int SUMMARY_FIELD_NUMBER = 3;
        public static final int URI_FIELD_NUMBER = 1;
        public static final int VALUE_PROPS_FIELD_NUMBER = 2;
        private int bitField0_;
        private FallbackNavigation fallbackNavigation_;
        private ValuePropSummary summary_;
        private String uri_ = "";
        private ae50 valueProps_ = AbstractC0269h.emptyProtobufList();

        static {
            Entity entity = new Entity();
            DEFAULT_INSTANCE = entity;
            AbstractC0269h.registerDefaultInstance(Entity.class, entity);
        }

        private Entity() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "uri_", "valueProps_", ValueProp.class, "summary_", "fallbackNavigation_"});
            }
            if (iOrdinal == 3) {
                return new Entity();
            }
            if (iOrdinal == 4) {
                return new C0750b(DEFAULT_INSTANCE);
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
            synchronized (Entity.class) {
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

        public final String getUri() {
            return this.uri_;
        }

        /* JADX INFO: renamed from: n */
        public final FallbackNavigation m10135n() {
            FallbackNavigation fallbackNavigation = this.fallbackNavigation_;
            return fallbackNavigation == null ? FallbackNavigation.m10132n() : fallbackNavigation;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final ValuePropSummary m10136o() {
            ValuePropSummary valuePropSummary = this.summary_;
            return valuePropSummary == null ? ValuePropSummary.m10139n() : valuePropSummary;
        }

        /* JADX INFO: renamed from: p */
        public final ae50 m10137p() {
            return this.valueProps_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GatedEntityRelations gatedEntityRelations = new GatedEntityRelations();
        DEFAULT_INSTANCE = gatedEntityRelations;
        AbstractC0269h.registerDefaultInstance(GatedEntityRelations.class, gatedEntityRelations);
    }

    private GatedEntityRelations() {
    }

    /* JADX INFO: renamed from: o */
    public static GatedEntityRelations m10133o(byte[] bArr) {
        return (GatedEntityRelations) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"entitiesWithValueProps_", Entity.class});
        }
        if (iOrdinal == 3) {
            return new GatedEntityRelations();
        }
        if (iOrdinal == 4) {
            return new C0749a(DEFAULT_INSTANCE);
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
        synchronized (GatedEntityRelations.class) {
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
    public final ae50 m10134n() {
        return this.entitiesWithValueProps_;
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
