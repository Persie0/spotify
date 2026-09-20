package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioPromo extends AbstractC0269h implements sre0 {
    public static final int AD_METADATA_FIELD_NUMBER = 3;
    private static final AudioPromo DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_ENTITY_URI_FIELD_NUMBER = 4;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private Heading heading_;
    private Item item_;
    private String previewEntityUri_ = "";

    static {
        AudioPromo audioPromo = new AudioPromo();
        DEFAULT_INSTANCE = audioPromo;
        AbstractC0269h.registerDefaultInstance(AudioPromo.class, audioPromo);
    }

    private AudioPromo() {
    }

    /* JADX INFO: renamed from: o */
    public static AudioPromo m4053o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ", new Object[]{"bitField0_", "heading_", "item_", "adMetadata_", "previewEntityUri_"});
        }
        if (iOrdinal == 3) {
            return new AudioPromo();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 24);
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
        synchronized (AudioPromo.class) {
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
    public final EmbeddedAdMetadata m4054n() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.m4071o() : embeddedAdMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Heading m4055p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m4080n() : heading;
    }

    /* JADX INFO: renamed from: q */
    public final Item m4056q() {
        Item item = this.item_;
        return item == null ? Item.m4084n() : item;
    }

    /* JADX INFO: renamed from: r */
    public final String m4057r() {
        return this.previewEntityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
