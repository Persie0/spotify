package com.spotify.highlightsstats.data.proto.sharing.p074v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareMessaging extends AbstractC0269h implements sre0 {
    private static final ShareMessaging DEFAULT_INSTANCE;
    public static final int MESSAGE_URI_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PREFIX_FIELD_NUMBER = 1;
    public static final int QUERY_PARAMETERS_FIELD_NUMBER = 4;
    public static final int SUFFIX_FIELD_NUMBER = 2;
    private String prefix_ = "";
    private String suffix_ = "";
    private String messageUri_ = "";
    private ae50 queryParameters_ = AbstractC0269h.emptyProtobufList();

    static {
        ShareMessaging shareMessaging = new ShareMessaging();
        DEFAULT_INSTANCE = shareMessaging;
        AbstractC0269h.registerDefaultInstance(ShareMessaging.class, shareMessaging);
    }

    private ShareMessaging() {
    }

    /* JADX INFO: renamed from: n */
    public static ShareMessaging m11308n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"prefix_", "suffix_", "messageUri_", "queryParameters_", QueryParameters.class});
        }
        if (iOrdinal == 3) {
            return new ShareMessaging();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 14);
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
        synchronized (ShareMessaging.class) {
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

    public final String getMessageUri() {
        return this.messageUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11309o() {
        return this.prefix_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m11310p() {
        return this.queryParameters_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11311q() {
        return this.suffix_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
