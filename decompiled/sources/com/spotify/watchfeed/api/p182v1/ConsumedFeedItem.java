package com.spotify.watchfeed.api.p182v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ConsumedFeedItem extends AbstractC0269h implements sre0 {
    public static final int CONSUMPTION_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int CONSUMPTION_TIME_MS_FIELD_NUMBER = 2;
    public static final int DECISION_ID_FIELD_NUMBER = 4;
    private static final ConsumedFeedItem DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int USER_INTERACTIONS_FIELD_NUMBER = 5;
    private int bitField0_;
    private Int64Value consumptionTimeMs_;
    private Timestamp consumptionTimestamp_;
    private String uri_ = "";
    private String decisionId_ = "";
    private ae50 userInteractions_ = AbstractC0269h.emptyProtobufList();

    public static final class UserInteraction extends AbstractC0269h implements sre0 {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final UserInteraction DEFAULT_INSTANCE;
        public static final int PARAMETERS_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int action_;
        private ihc0 parameters_ = ihc0.f102235b;

        static {
            UserInteraction userInteraction = new UserInteraction();
            DEFAULT_INSTANCE = userInteraction;
            AbstractC0269h.registerDefaultInstance(UserInteraction.class, userInteraction);
        }

        private UserInteraction() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\f\u00022", new Object[]{"action_", "parameters_", AbstractC1335c.f6922a});
            }
            if (iOrdinal == 3) {
                return new UserInteraction();
            }
            if (iOrdinal == 4) {
                return new C1334b(DEFAULT_INSTANCE);
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
            synchronized (UserInteraction.class) {
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

    static {
        ConsumedFeedItem consumedFeedItem = new ConsumedFeedItem();
        DEFAULT_INSTANCE = consumedFeedItem;
        AbstractC0269h.registerDefaultInstance(ConsumedFeedItem.class, consumedFeedItem);
    }

    private ConsumedFeedItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22463n(ConsumedFeedItem consumedFeedItem, Int64Value int64Value) {
        consumedFeedItem.getClass();
        int64Value.getClass();
        consumedFeedItem.consumptionTimeMs_ = int64Value;
        consumedFeedItem.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m22464o(ConsumedFeedItem consumedFeedItem, Timestamp timestamp) {
        consumedFeedItem.getClass();
        timestamp.getClass();
        consumedFeedItem.consumptionTimestamp_ = timestamp;
        consumedFeedItem.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m22465p(ConsumedFeedItem consumedFeedItem, String str) {
        consumedFeedItem.getClass();
        str.getClass();
        consumedFeedItem.decisionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m22466q(ConsumedFeedItem consumedFeedItem, String str) {
        consumedFeedItem.getClass();
        str.getClass();
        consumedFeedItem.uri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static C1333a m22467r() {
        return (C1333a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005\u001b", new Object[]{"bitField0_", "uri_", "consumptionTimeMs_", "consumptionTimestamp_", "decisionId_", "userInteractions_", UserInteraction.class});
        }
        if (iOrdinal == 3) {
            return new ConsumedFeedItem();
        }
        if (iOrdinal == 4) {
            return new C1333a(DEFAULT_INSTANCE);
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
        synchronized (ConsumedFeedItem.class) {
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
