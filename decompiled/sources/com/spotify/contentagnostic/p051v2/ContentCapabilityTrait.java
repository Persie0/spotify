package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentCapabilityTrait extends AbstractC0269h implements sre0 {
    private static final ContentCapabilityTrait DEFAULT_INSTANCE;
    public static final int DOWNLOADABILITY_FIELD_NUMBER = 2;
    public static final int LAYERABILITY_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int RATEABILITY_FIELD_NUMBER = 1;
    public static final int RECORDABILITY_FIELD_NUMBER = 3;
    public static final int WATCHABILITY_FIELD_NUMBER = 4;
    private int bitField0_;
    private Capability downloadability_;
    private Capability layerability_;
    private Capability rateability_;
    private Capability recordability_;
    private Capability watchability_;

    static {
        ContentCapabilityTrait contentCapabilityTrait = new ContentCapabilityTrait();
        DEFAULT_INSTANCE = contentCapabilityTrait;
        AbstractC0269h.registerDefaultInstance(ContentCapabilityTrait.class, contentCapabilityTrait);
    }

    private ContentCapabilityTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static ContentCapabilityTrait m7818s(byte[] bArr) {
        return (ContentCapabilityTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0004", new Object[]{"bitField0_", "rateability_", "downloadability_", "recordability_", "watchability_", "layerability_"});
        }
        if (iOrdinal == 3) {
            return new ContentCapabilityTrait();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 9);
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
        synchronized (ContentCapabilityTrait.class) {
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
    public final Capability m7819n() {
        Capability capability = this.downloadability_;
        return capability == null ? Capability.m7782n() : capability;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Capability m7820o() {
        Capability capability = this.layerability_;
        return capability == null ? Capability.m7782n() : capability;
    }

    /* JADX INFO: renamed from: p */
    public final Capability m7821p() {
        Capability capability = this.rateability_;
        return capability == null ? Capability.m7782n() : capability;
    }

    /* JADX INFO: renamed from: q */
    public final Capability m7822q() {
        Capability capability = this.recordability_;
        return capability == null ? Capability.m7782n() : capability;
    }

    /* JADX INFO: renamed from: r */
    public final Capability m7823r() {
        Capability capability = this.watchability_;
        return capability == null ? Capability.m7782n() : capability;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
