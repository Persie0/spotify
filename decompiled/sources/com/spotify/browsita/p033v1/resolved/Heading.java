package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class Heading extends AbstractC0269h implements sre0 {
    private static final Heading DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SPONSORED_HEADING_FIELD_NUMBER = 2;
    public static final int TEXT_HEADING_FIELD_NUMBER = 1;
    private int headingCase_ = 0;
    private Object heading_;

    static {
        Heading heading = new Heading();
        DEFAULT_INSTANCE = heading;
        AbstractC0269h.registerDefaultInstance(Heading.class, heading);
    }

    private Heading() {
    }

    /* JADX INFO: renamed from: n */
    public static Heading m4080n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"heading_", "headingCase_", TextHeading.class, SponsoredHeading.class});
        }
        if (iOrdinal == 3) {
            return new Heading();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 6);
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
        synchronized (Heading.class) {
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
    public final int m4081o() {
        int i = this.headingCase_;
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

    /* JADX INFO: renamed from: p */
    public final SponsoredHeading m4082p() {
        return this.headingCase_ == 2 ? (SponsoredHeading) this.heading_ : SponsoredHeading.m4135n();
    }

    /* JADX INFO: renamed from: q */
    public final TextHeading m4083q() {
        return this.headingCase_ == 1 ? (TextHeading) this.heading_ : TextHeading.m4137n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
