package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.n5f0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Metadata extends AbstractC0269h implements sre0 {
    public static final int ARTWORK_FIELD_NUMBER = 3;
    public static final int CONTRIBUTORS_FIELD_NUMBER = 4;
    public static final int DEEPLINK_URI_FIELD_NUMBER = 2;
    private static final Metadata DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PARENT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 6;
    private int bitField0_;
    private int type_;
    private String name_ = "";
    private String deeplinkUri_ = "";
    private ae50 artwork_ = AbstractC0269h.emptyProtobufList();
    private ae50 contributors_ = AbstractC0269h.emptyProtobufList();
    private String parent_ = "";

    static {
        Metadata metadata = new Metadata();
        DEFAULT_INSTANCE = metadata;
        AbstractC0269h.registerDefaultInstance(Metadata.class, metadata);
    }

    private Metadata() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static Metadata m3055s() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ț\u0005ለ\u0000\u0006\f", new Object[]{"bitField0_", "name_", "deeplinkUri_", "artwork_", Image.class, "contributors_", "parent_", "type_"});
        }
        if (iOrdinal == 3) {
            return new Metadata();
        }
        if (iOrdinal == 4) {
            return new n5f0(DEFAULT_INSTANCE, 4);
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
        synchronized (Metadata.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final int getTypeValue() {
        return this.type_;
    }

    /* JADX INFO: renamed from: n */
    public final int m3056n() {
        return this.artwork_.size();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m3057o() {
        return this.artwork_;
    }

    /* JADX INFO: renamed from: p */
    public final int m3058p() {
        return this.contributors_.size();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m3059q() {
        return this.contributors_;
    }

    /* JADX INFO: renamed from: r */
    public final String m3060r() {
        return this.deeplinkUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
