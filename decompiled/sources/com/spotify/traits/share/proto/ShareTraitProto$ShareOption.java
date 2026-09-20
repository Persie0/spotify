package com.spotify.traits.share.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareTraitProto$ShareOption extends AbstractC0269h implements sre0 {
    private static final ShareTraitProto$ShareOption DEFAULT_INSTANCE;
    public static final int EXTENSION_KIND_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_URI_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ShareTraitProto$ShareOption shareTraitProto$ShareOption = new ShareTraitProto$ShareOption();
        DEFAULT_INSTANCE = shareTraitProto$ShareOption;
        AbstractC0269h.registerDefaultInstance(ShareTraitProto$ShareOption.class, shareTraitProto$ShareOption);
    }

    private ShareTraitProto$ShareOption() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u00027\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iOrdinal == 3) {
            return new ShareTraitProto$ShareOption();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 20);
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
        synchronized (ShareTraitProto$ShareOption.class) {
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
    public final int m21833n() {
        if (this.valueCase_ == 2) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21834o() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: p */
    public final boolean m21835p() {
        return this.valueCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
