package com.spotify.gating.dryrun;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GatingDryRunMismatchEvent extends AbstractC0269h implements sre0 {
    private static final GatingDryRunMismatchEvent DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    public static final int MISMATCHES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String featureId_ = "";
    private ae50 mismatches_ = AbstractC0269h.emptyProtobufList();

    public static final class Mismatches extends AbstractC0269h implements sre0 {
        public static final int ACTION_NAME_FIELD_NUMBER = 1;
        public static final int ACTUAL_DENIAL_REASON_FIELD_NUMBER = 4;
        public static final int ACTUAL_GRANTED_FIELD_NUMBER = 3;
        private static final Mismatches DEFAULT_INSTANCE;
        public static final int EXPECTED_GRANTED_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private String actionName_ = "";
        private String actualDenialReason_ = "";
        private boolean actualGranted_;
        private int bitField0_;
        private boolean expectedGranted_;

        static {
            Mismatches mismatches = new Mismatches();
            DEFAULT_INSTANCE = mismatches;
            AbstractC0269h.registerDefaultInstance(Mismatches.class, mismatches);
        }

        private Mismatches() {
        }

        /* JADX INFO: renamed from: n */
        public static void m11152n(Mismatches mismatches, String str) {
            mismatches.getClass();
            str.getClass();
            mismatches.bitField0_ |= 1;
            mismatches.actionName_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m11153o(Mismatches mismatches, String str) {
            mismatches.getClass();
            mismatches.bitField0_ |= 8;
            mismatches.actualDenialReason_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m11154p(Mismatches mismatches, boolean z) {
            mismatches.bitField0_ |= 4;
            mismatches.actualGranted_ = z;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m11155q(Mismatches mismatches, boolean z) {
            mismatches.bitField0_ |= 2;
            mismatches.expectedGranted_ = z;
        }

        /* JADX INFO: renamed from: r */
        public static C0771b m11156r() {
            return (C0771b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "actionName_", "expectedGranted_", "actualGranted_", "actualDenialReason_"});
            }
            if (iOrdinal == 3) {
                return new Mismatches();
            }
            if (iOrdinal == 4) {
                return new C0771b(DEFAULT_INSTANCE);
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
            synchronized (Mismatches.class) {
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
        GatingDryRunMismatchEvent gatingDryRunMismatchEvent = new GatingDryRunMismatchEvent();
        DEFAULT_INSTANCE = gatingDryRunMismatchEvent;
        AbstractC0269h.registerDefaultInstance(GatingDryRunMismatchEvent.class, gatingDryRunMismatchEvent);
    }

    private GatingDryRunMismatchEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11149n(GatingDryRunMismatchEvent gatingDryRunMismatchEvent, ArrayList arrayList) {
        ae50 ae50Var = gatingDryRunMismatchEvent.mismatches_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            gatingDryRunMismatchEvent.mismatches_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, gatingDryRunMismatchEvent.mismatches_);
    }

    /* JADX INFO: renamed from: o */
    public static void m11150o(GatingDryRunMismatchEvent gatingDryRunMismatchEvent, String str) {
        gatingDryRunMismatchEvent.getClass();
        gatingDryRunMismatchEvent.bitField0_ |= 1;
        gatingDryRunMismatchEvent.featureId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static C0770a m11151p() {
        return (C0770a) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "featureId_", "mismatches_", Mismatches.class});
        }
        if (iOrdinal == 3) {
            return new GatingDryRunMismatchEvent();
        }
        if (iOrdinal == 4) {
            return new C0770a(DEFAULT_INSTANCE);
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
        synchronized (GatingDryRunMismatchEvent.class) {
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
