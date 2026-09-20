package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hm80;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class LinkPreview extends AbstractC0269h implements sre0 {
    private static final LinkPreview DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String title_ = "";
    private String description_ = "";
    private String imageUrl_ = "";

    static {
        LinkPreview linkPreview = new LinkPreview();
        DEFAULT_INSTANCE = linkPreview;
        AbstractC0269h.registerDefaultInstance(LinkPreview.class, linkPreview);
    }

    private LinkPreview() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21022n(LinkPreview linkPreview, String str) {
        linkPreview.getClass();
        str.getClass();
        linkPreview.bitField0_ |= 4;
        linkPreview.imageUrl_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21023o(LinkPreview linkPreview, String str) {
        linkPreview.getClass();
        str.getClass();
        linkPreview.bitField0_ |= 1;
        linkPreview.title_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static hm80 m21024p() {
        return (hm80) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "title_", "description_", "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new LinkPreview();
        }
        if (iOrdinal == 4) {
            return new hm80(DEFAULT_INSTANCE);
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
        synchronized (LinkPreview.class) {
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
