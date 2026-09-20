package com.spotify.homeagent.p079v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.d2i0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class MultiItemVideoPodcast extends AbstractC0269h implements sre0 {
    private static final MultiItemVideoPodcast DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int HEADING_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Heading heading_;
    private String title_ = "";
    private String description_ = "";
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        MultiItemVideoPodcast multiItemVideoPodcast = new MultiItemVideoPodcast();
        DEFAULT_INSTANCE = multiItemVideoPodcast;
        AbstractC0269h.registerDefaultInstance(MultiItemVideoPodcast.class, multiItemVideoPodcast);
    }

    private MultiItemVideoPodcast() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "title_", "description_", "items_", WorldItem.class, "heading_"});
        }
        if (iOrdinal == 3) {
            return new MultiItemVideoPodcast();
        }
        if (iOrdinal == 4) {
            return new d2i0(DEFAULT_INSTANCE, 6);
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
        synchronized (MultiItemVideoPodcast.class) {
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
