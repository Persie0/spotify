package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.von0;
import p204p.wd50;
import p204p.x74;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionsEsperanto$CanPlayContentResult extends AbstractC0269h implements sre0 {
    public static final int ASSURANCE_REQUIRED_DETAILS_FIELD_NUMBER = 4;
    public static final int CAN_PLAY_FIELD_NUMBER = 2;
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final PermissionsEsperanto$CanPlayContentResult DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int RESTRICTION_REASON_FIELD_NUMBER = 5;
    private static final vd50 restrictionReason_converter_ = new x74(20);
    private AssuranceRequiredDetails assuranceRequiredDetails_;
    private int bitField0_;
    private boolean canPlay_;
    private int reason_;
    private int restrictionReasonMemoizedSerializedSize;
    private String contentUri_ = "";
    private ud50 restrictionReason_ = AbstractC0269h.emptyIntList();

    public static final class AssuranceRequiredDetails extends AbstractC0269h implements sre0 {
        public static final int AGE_THRESHOLD_FIELD_NUMBER = 1;
        private static final AssuranceRequiredDetails DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private int ageThreshold_;

        static {
            AssuranceRequiredDetails assuranceRequiredDetails = new AssuranceRequiredDetails();
            DEFAULT_INSTANCE = assuranceRequiredDetails;
            AbstractC0269h.registerDefaultInstance(AssuranceRequiredDetails.class, assuranceRequiredDetails);
        }

        private AssuranceRequiredDetails() {
        }

        /* JADX INFO: renamed from: o */
        public static AssuranceRequiredDetails m97851o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"ageThreshold_"});
            }
            if (iOrdinal == 3) {
                return new AssuranceRequiredDetails();
            }
            if (iOrdinal == 4) {
                return new C2692a();
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
            synchronized (AssuranceRequiredDetails.class) {
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

        public final int getAgeThreshold() {
            return this.ageThreshold_;
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
        PermissionsEsperanto$CanPlayContentResult permissionsEsperanto$CanPlayContentResult = new PermissionsEsperanto$CanPlayContentResult();
        DEFAULT_INSTANCE = permissionsEsperanto$CanPlayContentResult;
        AbstractC0269h.registerDefaultInstance(PermissionsEsperanto$CanPlayContentResult.class, permissionsEsperanto$CanPlayContentResult);
    }

    private PermissionsEsperanto$CanPlayContentResult() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\f\u0004ဉ\u0000\u0005,", new Object[]{"bitField0_", "contentUri_", "canPlay_", "reason_", "assuranceRequiredDetails_", "restrictionReason_"});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$CanPlayContentResult();
        }
        if (iOrdinal == 4) {
            return new C2693b();
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
        synchronized (PermissionsEsperanto$CanPlayContentResult.class) {
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

    /* JADX INFO: renamed from: o */
    public final AssuranceRequiredDetails m97844o() {
        AssuranceRequiredDetails assuranceRequiredDetails = this.assuranceRequiredDetails_;
        return assuranceRequiredDetails == null ? AssuranceRequiredDetails.m97851o() : assuranceRequiredDetails;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m97845p() {
        return this.canPlay_;
    }

    /* JADX INFO: renamed from: q */
    public final String m97846q() {
        return this.contentUri_;
    }

    /* JADX INFO: renamed from: r */
    public final von0 m97847r() {
        von0 von0Var;
        int i = this.reason_;
        if (i == 0) {
            von0Var = von0.AGE_ASSURANCE_REASON_UNKNOWN;
        } else if (i == 1) {
            von0Var = von0.AGE_ASSURANCE_REASON_UNAVAILABLE;
        } else if (i != 2) {
            von0Var = i != 3 ? null : von0.AGE_ASSURANCE_REASON_ALLOW;
        } else {
            von0Var = von0.AGE_ASSURANCE_REASON_REQUIRES_AGE_ASSURANCE;
        }
        return von0Var == null ? von0.UNRECOGNIZED : von0Var;
    }

    /* JADX INFO: renamed from: s */
    public final wd50 m97848s() {
        return new wd50(this.restrictionReason_, restrictionReason_converter_);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m97849t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
