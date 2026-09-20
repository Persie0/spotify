package com.spotify.daylistsharing.sharingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class OriginIds extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_MENU_SHARE_ORIGIN_ID_FIELD_NUMBER = 2;
    private static final OriginIds DEFAULT_INSTANCE;
    public static final int HEADER_SHARE_ORIGIN_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SCREENSHOT_SHARE_ORIGIN_ID_FIELD_NUMBER = 3;
    private String headerShareOriginId_ = "";
    private String contextMenuShareOriginId_ = "";
    private String screenshotShareOriginId_ = "";

    static {
        OriginIds originIds = new OriginIds();
        DEFAULT_INSTANCE = originIds;
        AbstractC0269h.registerDefaultInstance(OriginIds.class, originIds);
    }

    private OriginIds() {
    }

    /* JADX INFO: renamed from: o */
    public static OriginIds m9108o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"headerShareOriginId_", "contextMenuShareOriginId_", "screenshotShareOriginId_"});
        }
        if (iOrdinal == 3) {
            return new OriginIds();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 9);
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
        synchronized (OriginIds.class) {
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
    public final String m9109n() {
        return this.contextMenuShareOriginId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m9110p() {
        return this.headerShareOriginId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m9111q() {
        return this.screenshotShareOriginId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
