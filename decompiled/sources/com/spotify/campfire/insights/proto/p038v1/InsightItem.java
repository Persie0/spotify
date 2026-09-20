package com.spotify.campfire.insights.proto.p038v1;

import com.google.protobuf.AbstractC0269h;
import com.google.type.Interval;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes5.dex */
public final class InsightItem extends AbstractC0269h implements sre0 {
    private static final InsightItem DEFAULT_INSTANCE;
    public static final int ENTITY_MATCH_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MATCH_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTLIGHT_FIELD_NUMBER = 3;
    public static final int TIME_RANGE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object content_;
    private Interval timeRange_;
    private int contentCase_ = 0;
    private String id_ = "";

    static {
        InsightItem insightItem = new InsightItem();
        DEFAULT_INSTANCE = insightItem;
        AbstractC0269h.registerDefaultInstance(InsightItem.class, insightItem);
    }

    private InsightItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"content_", "contentCase_", "bitField0_", "id_", "timeRange_", SpotlightContent.class, TasteMatchContent.class, EntityMatchContent.class});
        }
        if (iOrdinal == 3) {
            return new InsightItem();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 13);
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
        synchronized (InsightItem.class) {
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

    public final String getId() {
        return this.id_;
    }

    /* JADX INFO: renamed from: n */
    public final int m5468n() {
        int i = this.contentCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EntityMatchContent m5469o() {
        return this.contentCase_ == 5 ? (EntityMatchContent) this.content_ : EntityMatchContent.m5462n();
    }

    /* JADX INFO: renamed from: p */
    public final TasteMatchContent m5470p() {
        return this.contentCase_ == 4 ? (TasteMatchContent) this.content_ : TasteMatchContent.m5479n();
    }

    /* JADX INFO: renamed from: q */
    public final SpotlightContent m5471q() {
        return this.contentCase_ == 3 ? (SpotlightContent) this.content_ : SpotlightContent.m5474n();
    }

    /* JADX INFO: renamed from: r */
    public final Interval m5472r() {
        Interval interval = this.timeRange_;
        return interval == null ? Interval.m2209n() : interval;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5473s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
