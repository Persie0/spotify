package com.spotify.wrapped.p194v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ConsumerShareRequestParameters extends AbstractC0269h implements sre0 {
    public static final int ARCHIVE_FIELD_NUMBER = 1;
    private static final ConsumerShareRequestParameters DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int consumerShareRequestParametersCase_ = 0;
    private Object consumerShareRequestParameters_;

    static {
        ConsumerShareRequestParameters consumerShareRequestParameters = new ConsumerShareRequestParameters();
        DEFAULT_INSTANCE = consumerShareRequestParameters;
        AbstractC0269h.registerDefaultInstance(ConsumerShareRequestParameters.class, consumerShareRequestParameters);
    }

    private ConsumerShareRequestParameters() {
    }

    /* JADX INFO: renamed from: n */
    public static ConsumerShareRequestParameters m23144n(byte[] bArr) {
        return (ConsumerShareRequestParameters) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"consumerShareRequestParameters_", "consumerShareRequestParametersCase_", ArchiveStoryParameters.class});
        }
        if (iOrdinal == 3) {
            return new ConsumerShareRequestParameters();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 26);
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
        synchronized (ConsumerShareRequestParameters.class) {
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
