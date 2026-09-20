package com.spotify.extendedmetadata.extensions.watchfeedshowexplorerimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ShowExplorerEntrypointResponse extends AbstractC0269h implements sre0 {
    private static final ShowExplorerEntrypointResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_EXPLORER_BUTTON_FIELD_NUMBER = 1;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        ShowExplorerEntrypointResponse showExplorerEntrypointResponse = new ShowExplorerEntrypointResponse();
        DEFAULT_INSTANCE = showExplorerEntrypointResponse;
        AbstractC0269h.registerDefaultInstance(ShowExplorerEntrypointResponse.class, showExplorerEntrypointResponse);
    }

    private ShowExplorerEntrypointResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static ShowExplorerEntrypointResponse m10531o(byte[] bArr) {
        return (ShowExplorerEntrypointResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"payload_", "payloadCase_", ShowExplorerButtonComponent.class});
        }
        if (iOrdinal == 3) {
            return new ShowExplorerEntrypointResponse();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 14);
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
        synchronized (ShowExplorerEntrypointResponse.class) {
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
    public final ShowExplorerButtonComponent m10532n() {
        return this.payloadCase_ == 1 ? (ShowExplorerButtonComponent) this.payload_ : ShowExplorerButtonComponent.m10528o();
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
