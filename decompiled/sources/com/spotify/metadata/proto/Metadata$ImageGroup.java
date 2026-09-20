package com.spotify.metadata.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.n5f0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$ImageGroup extends AbstractC0269h implements sre0 {
    private static final Metadata$ImageGroup DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 image_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$ImageGroup metadata$ImageGroup = new Metadata$ImageGroup();
        DEFAULT_INSTANCE = metadata$ImageGroup;
        AbstractC0269h.registerDefaultInstance(Metadata$ImageGroup.class, metadata$ImageGroup);
    }

    private Metadata$ImageGroup() {
    }

    /* JADX INFO: renamed from: n */
    public static Metadata$ImageGroup m15442n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"image_", Metadata$Image.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$ImageGroup();
        }
        if (iOrdinal == 4) {
            return new n5f0(DEFAULT_INSTANCE, 26);
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
        synchronized (Metadata$ImageGroup.class) {
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

    public final int getImageCount() {
        return this.image_.size();
    }

    public final List getImageList() {
        return this.image_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Metadata$Image m15443o() {
        return (Metadata$Image) this.image_.get(0);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
