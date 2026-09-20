package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.ShareConfiguration;
import java.util.List;
import p204p.ae50;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class HighlightsListResponse extends AbstractC0269h implements sre0 {
    private static final HighlightsListResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShareConfiguration shareConfiguration_;
    private String title_ = "";
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        HighlightsListResponse highlightsListResponse = new HighlightsListResponse();
        DEFAULT_INSTANCE = highlightsListResponse;
        AbstractC0269h.registerDefaultInstance(HighlightsListResponse.class, highlightsListResponse);
    }

    private HighlightsListResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "title_", "items_", HighlightsItem.class, "shareConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new HighlightsListResponse();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 28);
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
        synchronized (HighlightsListResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final ShareConfiguration m11548n() {
        ShareConfiguration shareConfiguration = this.shareConfiguration_;
        return shareConfiguration == null ? ShareConfiguration.m11293n() : shareConfiguration;
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
