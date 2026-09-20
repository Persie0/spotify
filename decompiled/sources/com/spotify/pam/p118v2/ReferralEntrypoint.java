package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vev0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ReferralEntrypoint extends AbstractC0269h implements sre0 {
    public static final int CTA_FIELD_NUMBER = 1;
    private static final ReferralEntrypoint DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SECTION_FIELD_NUMBER = 2;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ReferralEntrypoint referralEntrypoint = new ReferralEntrypoint();
        DEFAULT_INSTANCE = referralEntrypoint;
        AbstractC0269h.registerDefaultInstance(ReferralEntrypoint.class, referralEntrypoint);
    }

    private ReferralEntrypoint() {
    }

    /* JADX INFO: renamed from: o */
    public static ReferralEntrypoint m16582o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"value_", "valueCase_", ReferralEntrypointCta.class, ReferralEntrypointSection.class});
        }
        if (iOrdinal == 3) {
            return new ReferralEntrypoint();
        }
        if (iOrdinal == 4) {
            return new vev0(DEFAULT_INSTANCE, 9);
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
        synchronized (ReferralEntrypoint.class) {
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
    public final ReferralEntrypointCta m16583n() {
        return this.valueCase_ == 1 ? (ReferralEntrypointCta) this.value_ : ReferralEntrypointCta.m16586o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ReferralEntrypointSection m16584p() {
        return this.valueCase_ == 2 ? (ReferralEntrypointSection) this.value_ : ReferralEntrypointSection.m16589n();
    }

    /* JADX INFO: renamed from: q */
    public final int m16585q() {
        int i = this.valueCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
