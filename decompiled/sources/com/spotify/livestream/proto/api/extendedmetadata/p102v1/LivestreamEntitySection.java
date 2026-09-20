package com.spotify.livestream.proto.api.extendedmetadata.p102v1;

import com.google.protobuf.AbstractC0269h;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class LivestreamEntitySection extends AbstractC0269h implements sre0 {
    private static final LivestreamEntitySection DEFAULT_INSTANCE;
    public static final int ERR_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private LivestreamEntityError err_;
    private LivestreamEntityItem item_;

    static {
        LivestreamEntitySection livestreamEntitySection = new LivestreamEntitySection();
        DEFAULT_INSTANCE = livestreamEntitySection;
        AbstractC0269h.registerDefaultInstance(LivestreamEntitySection.class, livestreamEntitySection);
    }

    private LivestreamEntitySection() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static LivestreamEntitySection m13135q(byte[] bArr) {
        return (LivestreamEntitySection) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "item_", "err_"});
        }
        if (iOrdinal == 3) {
            return new LivestreamEntitySection();
        }
        if (iOrdinal == 4) {
            return new lj90(11);
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
        synchronized (LivestreamEntitySection.class) {
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

    /* JADX INFO: renamed from: o */
    public final LivestreamEntityError m13136o() {
        LivestreamEntityError livestreamEntityError = this.err_;
        return livestreamEntityError == null ? LivestreamEntityError.m13118p() : livestreamEntityError;
    }

    /* JADX INFO: renamed from: p */
    public final LivestreamEntityItem m13137p() {
        LivestreamEntityItem livestreamEntityItem = this.item_;
        return livestreamEntityItem == null ? LivestreamEntityItem.m13121r() : livestreamEntityItem;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
