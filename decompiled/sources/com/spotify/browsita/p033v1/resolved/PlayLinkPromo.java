package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class PlayLinkPromo extends AbstractC0269h implements sre0 {
    public static final int AD_METADATA_FIELD_NUMBER = 3;
    private static final PlayLinkPromo DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private Heading heading_;
    private Item item_;

    static {
        PlayLinkPromo playLinkPromo = new PlayLinkPromo();
        DEFAULT_INSTANCE = playLinkPromo;
        AbstractC0269h.registerDefaultInstance(PlayLinkPromo.class, playLinkPromo);
    }

    private PlayLinkPromo() {
    }

    /* JADX INFO: renamed from: o */
    public static PlayLinkPromo m4088o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "heading_", "item_", "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new PlayLinkPromo();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 26);
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
        synchronized (PlayLinkPromo.class) {
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

    public final boolean hasItem() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final EmbeddedAdMetadata m4089n() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.m4071o() : embeddedAdMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Heading m4090p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m4080n() : heading;
    }

    /* JADX INFO: renamed from: q */
    public final Item m4091q() {
        Item item = this.item_;
        return item == null ? Item.m4084n() : item;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4092r() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4093s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
