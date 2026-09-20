package com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.p024v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchProto$EntityViewUriResponse extends AbstractC0269h implements sre0 {
    private static final SearchProto$EntityViewUriResponse DEFAULT_INSTANCE;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URIS_FIELD_NUMBER = 1;
    private ae50 uris_ = AbstractC0269h.emptyProtobufList();
    private String pageToken_ = "";

    static {
        SearchProto$EntityViewUriResponse searchProto$EntityViewUriResponse = new SearchProto$EntityViewUriResponse();
        DEFAULT_INSTANCE = searchProto$EntityViewUriResponse;
        AbstractC0269h.registerDefaultInstance(SearchProto$EntityViewUriResponse.class, searchProto$EntityViewUriResponse);
    }

    private SearchProto$EntityViewUriResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"uris_", "pageToken_"});
        }
        if (iOrdinal == 3) {
            return new SearchProto$EntityViewUriResponse();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 23);
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
        synchronized (SearchProto$EntityViewUriResponse.class) {
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

    public final String getPageToken() {
        return this.pageToken_;
    }

    public final List getUrisList() {
        return this.uris_;
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
