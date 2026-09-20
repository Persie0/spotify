package com.spotify.music.spotlets.offline.util.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6s;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class DownloadInteraction extends AbstractC0269h implements sre0 {
    private static final DownloadInteraction DEFAULT_INSTANCE;
    public static final int DOWNLOAD_URI_FIELD_NUMBER = 2;
    public static final int ELEMENT_TYPE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTED_STATE_FIELD_NUMBER = 4;
    public static final int VIEW_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean requestedState_;
    private String viewUri_ = "";
    private String downloadUri_ = "";
    private String elementType_ = "";

    static {
        DownloadInteraction downloadInteraction = new DownloadInteraction();
        DEFAULT_INSTANCE = downloadInteraction;
        AbstractC0269h.registerDefaultInstance(DownloadInteraction.class, downloadInteraction);
    }

    private DownloadInteraction() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15761n(DownloadInteraction downloadInteraction, String str) {
        downloadInteraction.getClass();
        str.getClass();
        downloadInteraction.bitField0_ |= 2;
        downloadInteraction.downloadUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15762o(DownloadInteraction downloadInteraction, String str) {
        downloadInteraction.getClass();
        downloadInteraction.bitField0_ |= 4;
        downloadInteraction.elementType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m15763p(DownloadInteraction downloadInteraction, boolean z) {
        downloadInteraction.bitField0_ |= 8;
        downloadInteraction.requestedState_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15764q(DownloadInteraction downloadInteraction, String str) {
        downloadInteraction.getClass();
        str.getClass();
        downloadInteraction.bitField0_ |= 1;
        downloadInteraction.viewUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static u6s m15765r() {
        return (u6s) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "viewUri_", "downloadUri_", "elementType_", "requestedState_"});
        }
        if (iOrdinal == 3) {
            return new DownloadInteraction();
        }
        if (iOrdinal == 4) {
            return new u6s(DEFAULT_INSTANCE);
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
        synchronized (DownloadInteraction.class) {
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
