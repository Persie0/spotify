package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowShowRequest$TrailerSection extends AbstractC0269h implements sre0 {
    private static final ShowShowRequest$TrailerSection DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ShowShowRequest$ProtoShowRequestItem item_;

    static {
        ShowShowRequest$TrailerSection showShowRequest$TrailerSection = new ShowShowRequest$TrailerSection();
        DEFAULT_INSTANCE = showShowRequest$TrailerSection;
        AbstractC0269h.registerDefaultInstance(ShowShowRequest$TrailerSection.class, showShowRequest$TrailerSection);
    }

    private ShowShowRequest$TrailerSection() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowShowRequest$TrailerSection m15541n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "item_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$TrailerSection();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 2);
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
        synchronized (ShowShowRequest$TrailerSection.class) {
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
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShowShowRequest$ProtoShowRequestItem m15542o() {
        ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem = this.item_;
        return showShowRequest$ProtoShowRequestItem == null ? ShowShowRequest$ProtoShowRequestItem.m15519n() : showShowRequest$ProtoShowRequestItem;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
