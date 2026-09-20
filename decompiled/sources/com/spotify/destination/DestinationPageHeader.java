package com.spotify.destination;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uro;
import p204p.wna;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DestinationPageHeader extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 2;
    public static final int CHIP_REFERENCES_FIELD_NUMBER = 3;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final DestinationPageHeader DEFAULT_INSTANCE;
    public static final int PAGE_TYPE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private int pageType_;
    private String color_ = "";
    private String backgroundImage_ = "";
    private ae50 chipReferences_ = AbstractC0269h.emptyProtobufList();

    static {
        DestinationPageHeader destinationPageHeader = new DestinationPageHeader();
        DEFAULT_INSTANCE = destinationPageHeader;
        AbstractC0269h.registerDefaultInstance(DestinationPageHeader.class, destinationPageHeader);
    }

    private DestinationPageHeader() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static DestinationPageHeader m9207r(byte[] bArr) {
        return (DestinationPageHeader) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\f", new Object[]{"color_", "backgroundImage_", "chipReferences_", ChipReference.class, "pageType_"});
        }
        if (iOrdinal == 3) {
            return new DestinationPageHeader();
        }
        if (iOrdinal == 4) {
            return new uro(DEFAULT_INSTANCE, 20);
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
        synchronized (DestinationPageHeader.class) {
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
    public final String m9208n() {
        return this.backgroundImage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m9209o() {
        return this.chipReferences_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9210p() {
        return this.color_;
    }

    /* JADX INFO: renamed from: q */
    public final wna m9211q() {
        wna wnaVar;
        int i = this.pageType_;
        if (i != 0) {
            wnaVar = i != 1 ? null : wna.PAGE_TYPE_ALL_CATEGORIES;
        } else {
            wnaVar = wna.PAGE_TYPE_DEFAULT;
        }
        return wnaVar == null ? wna.UNRECOGNIZED : wnaVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
