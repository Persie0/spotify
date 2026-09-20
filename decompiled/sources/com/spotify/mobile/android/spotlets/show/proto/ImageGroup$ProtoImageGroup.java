package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r240;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ImageGroup$ProtoImageGroup extends AbstractC0269h implements sre0 {
    private static final ImageGroup$ProtoImageGroup DEFAULT_INSTANCE;
    public static final int LARGE_LINK_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SMALL_LINK_FIELD_NUMBER = 2;
    public static final int STANDARD_LINK_FIELD_NUMBER = 1;
    public static final int XLARGE_LINK_FIELD_NUMBER = 4;
    private int bitField0_;
    private String standardLink_ = "";
    private String smallLink_ = "";
    private String largeLink_ = "";
    private String xlargeLink_ = "";

    static {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = new ImageGroup$ProtoImageGroup();
        DEFAULT_INSTANCE = imageGroup$ProtoImageGroup;
        AbstractC0269h.registerDefaultInstance(ImageGroup$ProtoImageGroup.class, imageGroup$ProtoImageGroup);
    }

    private ImageGroup$ProtoImageGroup() {
    }

    /* JADX INFO: renamed from: n */
    public static ImageGroup$ProtoImageGroup m15473n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "standardLink_", "smallLink_", "largeLink_", "xlargeLink_"});
        }
        if (iOrdinal == 3) {
            return new ImageGroup$ProtoImageGroup();
        }
        if (iOrdinal == 4) {
            return new r240(DEFAULT_INSTANCE, 22);
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
        synchronized (ImageGroup$ProtoImageGroup.class) {
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

    public final String getLargeLink() {
        return this.largeLink_;
    }

    public final String getSmallLink() {
        return this.smallLink_;
    }

    public final String getStandardLink() {
        return this.standardLink_;
    }

    public final String getXlargeLink() {
        return this.xlargeLink_;
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
