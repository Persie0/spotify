package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class HarmonizeResponseBody extends AbstractC0269h implements sre0 {
    private static final HarmonizeResponseBody DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 2;
    public static final int ITEMIDS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 itemIds_ = AbstractC0269h.emptyProtobufList();
    private String etag_ = "";

    static {
        HarmonizeResponseBody harmonizeResponseBody = new HarmonizeResponseBody();
        DEFAULT_INSTANCE = harmonizeResponseBody;
        AbstractC0269h.registerDefaultInstance(HarmonizeResponseBody.class, harmonizeResponseBody);
    }

    private HarmonizeResponseBody() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001c\u0002Ȉ", new Object[]{"itemIds_", "etag_"});
        }
        if (iOrdinal == 3) {
            return new HarmonizeResponseBody();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 19);
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
        synchronized (HarmonizeResponseBody.class) {
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
    public final String m19398n() {
        return this.etag_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m19399o() {
        return this.itemIds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
