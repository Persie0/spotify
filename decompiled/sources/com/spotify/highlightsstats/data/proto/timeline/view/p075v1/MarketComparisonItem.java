package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketComparisonItem extends AbstractC0269h implements sre0 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 3;
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    private static final MarketComparisonItem DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIME_LISTENED_FIELD_NUMBER = 2;
    public static final int TOTAL_TIME_LISTENED_FIELD_NUMBER = 4;
    private int totalTimeListened_;
    private String name_ = "";
    private String timeListened_ = "";
    private String accentColor_ = "";
    private String accessibilityDescription_ = "";

    static {
        MarketComparisonItem marketComparisonItem = new MarketComparisonItem();
        DEFAULT_INSTANCE = marketComparisonItem;
        AbstractC0269h.registerDefaultInstance(MarketComparisonItem.class, marketComparisonItem);
    }

    private MarketComparisonItem() {
    }

    /* JADX INFO: renamed from: p */
    public static MarketComparisonItem m11380p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005Ȉ", new Object[]{"name_", "timeListened_", "accentColor_", "totalTimeListened_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new MarketComparisonItem();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 21);
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
        synchronized (MarketComparisonItem.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m11381n() {
        return this.accentColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11382o() {
        return this.accessibilityDescription_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11383q() {
        return this.timeListened_;
    }

    /* JADX INFO: renamed from: r */
    public final int m11384r() {
        return this.totalTimeListened_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
