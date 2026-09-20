package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ShareListRequest extends AbstractC0269h implements sre0 {
    private static final ShareListRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 3;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShareListFilter filter_;
    private ae50 username_ = AbstractC0269h.emptyProtobufList();
    private String hierarchyId_ = "";

    public static final class ShareListFilter extends AbstractC0269h implements sre0 {
        private static final ShareListFilter DEFAULT_INSTANCE;
        public static final int EXCLUDE_ACTIVE_CHATS_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private boolean excludeActiveChats_;

        static {
            ShareListFilter shareListFilter = new ShareListFilter();
            DEFAULT_INSTANCE = shareListFilter;
            AbstractC0269h.registerDefaultInstance(ShareListFilter.class, shareListFilter);
        }

        private ShareListFilter() {
        }

        /* JADX INFO: renamed from: n */
        public static void m5489n(ShareListFilter shareListFilter, boolean z) {
            shareListFilter.excludeActiveChats_ = z;
        }

        /* JADX INFO: renamed from: o */
        public static C0464b m5490o() {
            return (C0464b) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"excludeActiveChats_"});
            }
            if (iOrdinal == 3) {
                return new ShareListFilter();
            }
            if (iOrdinal == 4) {
                return new C0464b(DEFAULT_INSTANCE);
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
            synchronized (ShareListFilter.class) {
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

    static {
        ShareListRequest shareListRequest = new ShareListRequest();
        DEFAULT_INSTANCE = shareListRequest;
        AbstractC0269h.registerDefaultInstance(ShareListRequest.class, shareListRequest);
    }

    private ShareListRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5486n(ShareListRequest shareListRequest, ShareListFilter shareListFilter) {
        shareListRequest.getClass();
        shareListFilter.getClass();
        shareListRequest.filter_ = shareListFilter;
        shareListRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m5487o(ShareListRequest shareListRequest, String str) {
        shareListRequest.getClass();
        str.getClass();
        shareListRequest.bitField0_ |= 1;
        shareListRequest.hierarchyId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static C0463a m5488p() {
        return (C0463a) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "username_", "hierarchyId_", "filter_"});
        }
        if (iOrdinal == 3) {
            return new ShareListRequest();
        }
        if (iOrdinal == 4) {
            return new C0463a(DEFAULT_INSTANCE);
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
        synchronized (ShareListRequest.class) {
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
