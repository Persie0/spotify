package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VerificationFailureViewContents extends AbstractC0269h implements sre0 {
    public static final int CONTENTS_FIELD_NUMBER = 2;
    private static final VerificationFailureViewContents DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private ae50 contents_ = AbstractC0269h.emptyProtobufList();

    static {
        VerificationFailureViewContents verificationFailureViewContents = new VerificationFailureViewContents();
        DEFAULT_INSTANCE = verificationFailureViewContents;
        AbstractC0269h.registerDefaultInstance(VerificationFailureViewContents.class, verificationFailureViewContents);
    }

    private VerificationFailureViewContents() {
    }

    /* JADX INFO: renamed from: o */
    public static VerificationFailureViewContents m10655o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"title_", "contents_", BlockElement.class});
        }
        if (iOrdinal == 3) {
            return new VerificationFailureViewContents();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 17);
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
        synchronized (VerificationFailureViewContents.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m10656n() {
        return this.contents_;
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
