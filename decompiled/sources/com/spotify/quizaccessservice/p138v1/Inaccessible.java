package com.spotify.quizaccessservice.p138v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ol40;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes10.dex */
public final class Inaccessible extends AbstractC0269h implements sre0 {
    private static final Inaccessible DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int reason_;
    private String message_ = "";
    private String title_ = "";

    static {
        Inaccessible inaccessible = new Inaccessible();
        DEFAULT_INSTANCE = inaccessible;
        AbstractC0269h.registerDefaultInstance(Inaccessible.class, inaccessible);
    }

    private Inaccessible() {
    }

    /* JADX INFO: renamed from: n */
    public static Inaccessible m20035n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002\f\u0003Ȉ", new Object[]{"bitField0_", "message_", "reason_", "title_"});
        }
        if (iOrdinal == 3) {
            return new Inaccessible();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 4);
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
        synchronized (Inaccessible.class) {
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

    public final String getMessage() {
        return this.message_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ol40 m20036o() {
        ol40 ol40Var;
        int i = this.reason_;
        if (i != 0) {
            ol40Var = i != 1 ? null : ol40.REQUIRES_PREMIUM;
        } else {
            ol40Var = ol40.INACCESSIBLE_REASON_UNSPECIFIED;
        }
        return ol40Var == null ? ol40.UNRECOGNIZED : ol40Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
