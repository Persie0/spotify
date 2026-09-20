package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.g6f0;
import p204p.ore0;
import p204p.pr11;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowShowRequest$NextBestEpisodeSection extends AbstractC0269h implements sre0 {
    private static final ShowShowRequest$NextBestEpisodeSection DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ShowShowRequest$ProtoShowRequestItem item_;
    private int label_;

    static {
        ShowShowRequest$NextBestEpisodeSection showShowRequest$NextBestEpisodeSection = new ShowShowRequest$NextBestEpisodeSection();
        DEFAULT_INSTANCE = showShowRequest$NextBestEpisodeSection;
        AbstractC0269h.registerDefaultInstance(ShowShowRequest$NextBestEpisodeSection.class, showShowRequest$NextBestEpisodeSection);
    }

    private ShowShowRequest$NextBestEpisodeSection() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowShowRequest$NextBestEpisodeSection m15505n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "label_", g6f0.f77040m, "item_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$NextBestEpisodeSection();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 27);
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
        synchronized (ShowShowRequest$NextBestEpisodeSection.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShowShowRequest$ProtoShowRequestItem m15506o() {
        ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem = this.item_;
        return showShowRequest$ProtoShowRequestItem == null ? ShowShowRequest$ProtoShowRequestItem.m15519n() : showShowRequest$ProtoShowRequestItem;
    }

    /* JADX INFO: renamed from: p */
    public final pr11 m15507p() {
        pr11 pr11VarM70698a = pr11.m70698a(this.label_);
        return pr11VarM70698a == null ? pr11.UNKNOWN : pr11VarM70698a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
