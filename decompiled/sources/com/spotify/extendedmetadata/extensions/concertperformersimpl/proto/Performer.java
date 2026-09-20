package com.spotify.extendedmetadata.extensions.concertperformersimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.EnumC2144my;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Performer extends AbstractC0269h implements sre0 {
    public static final int ACT_FIELD_NUMBER = 2;
    public static final int ARTIST_NAME_FIELD_NUMBER = 3;
    public static final int ARTIST_URI_FIELD_NUMBER = 1;
    private static final Performer DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int act_;
    private String artistUri_ = "";
    private String artistName_ = "";

    static {
        Performer performer = new Performer();
        DEFAULT_INSTANCE = performer;
        AbstractC0269h.registerDefaultInstance(Performer.class, performer);
    }

    private Performer() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"artistUri_", "act_", "artistName_"});
        }
        if (iOrdinal == 3) {
            return new Performer();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 26);
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
        synchronized (Performer.class) {
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
    public final EnumC2144my m10061n() {
        EnumC2144my enumC2144my;
        int i = this.act_;
        if (i == 0) {
            enumC2144my = EnumC2144my.ACT_UNKNOWN;
        } else if (i != 1) {
            enumC2144my = i != 2 ? null : EnumC2144my.ACT_SUPPORTING;
        } else {
            enumC2144my = EnumC2144my.ACT_HEADLINER;
        }
        return enumC2144my == null ? EnumC2144my.UNRECOGNIZED : enumC2144my;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10062o() {
        return this.artistName_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10063p() {
        return this.artistUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
