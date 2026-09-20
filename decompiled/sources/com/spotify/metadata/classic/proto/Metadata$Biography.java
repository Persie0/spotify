package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.n5f0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$Biography extends AbstractC0269h implements sre0 {
    private static final Metadata$Biography DEFAULT_INSTANCE;
    public static final int LOCALIZED_TEXT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PORTRAIT_FIELD_NUMBER = 2;
    public static final int PORTRAIT_GROUP_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private ae50 portrait_ = AbstractC0269h.emptyProtobufList();
    private ae50 portraitGroup_ = AbstractC0269h.emptyProtobufList();
    private ae50 localizedText_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$Biography metadata$Biography = new Metadata$Biography();
        DEFAULT_INSTANCE = metadata$Biography;
        AbstractC0269h.registerDefaultInstance(Metadata$Biography.class, metadata$Biography);
    }

    private Metadata$Biography() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"bitField0_", "text_", "portrait_", Metadata$Image.class, "portraitGroup_", Metadata$ImageGroup.class, "localizedText_", Metadata$LocalizedString.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$Biography();
        }
        if (iOrdinal == 4) {
            return new n5f0(DEFAULT_INSTANCE, 2);
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
        synchronized (Metadata$Biography.class) {
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
