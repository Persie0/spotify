package com.spotify.share.resolved_share.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ResolvedShareProto$ResolvedShare extends AbstractC0269h implements sre0 {
    private static final ResolvedShareProto$ResolvedShare DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_URI_FIELD_NUMBER = 1;
    private String shareUri_ = "";

    static {
        ResolvedShareProto$ResolvedShare resolvedShareProto$ResolvedShare = new ResolvedShareProto$ResolvedShare();
        DEFAULT_INSTANCE = resolvedShareProto$ResolvedShare;
        AbstractC0269h.registerDefaultInstance(ResolvedShareProto$ResolvedShare.class, resolvedShareProto$ResolvedShare);
    }

    private ResolvedShareProto$ResolvedShare() {
    }

    /* JADX INFO: renamed from: p */
    public static ResolvedShareProto$ResolvedShare m21116p(byte[] bArr) {
        return (ResolvedShareProto$ResolvedShare) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"shareUri_"});
        }
        if (iOrdinal == 3) {
            return new ResolvedShareProto$ResolvedShare();
        }
        if (iOrdinal == 4) {
            return new i8w0(20);
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
        synchronized (ResolvedShareProto$ResolvedShare.class) {
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
    public final String m21117o() {
        return this.shareUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
