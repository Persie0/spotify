package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ListeningStatsSection extends AbstractC0269h implements sre0 {
    public static final int CARDS_FIELD_NUMBER = 3;
    private static final ListeningStatsSection DEFAULT_INSTANCE;
    public static final int HEADING_SUBTITLE_FIELD_NUMBER = 2;
    public static final int HEADING_TITLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String headingTitle_ = "";
    private String headingSubtitle_ = "";
    private ae50 cards_ = AbstractC0269h.emptyProtobufList();

    static {
        ListeningStatsSection listeningStatsSection = new ListeningStatsSection();
        DEFAULT_INSTANCE = listeningStatsSection;
        AbstractC0269h.registerDefaultInstance(ListeningStatsSection.class, listeningStatsSection);
    }

    private ListeningStatsSection() {
    }

    /* JADX INFO: renamed from: o */
    public static ListeningStatsSection m16285o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"headingTitle_", "headingSubtitle_", "cards_", StatsCard.class});
        }
        if (iOrdinal == 3) {
            return new ListeningStatsSection();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 1);
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
        synchronized (ListeningStatsSection.class) {
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
    public final ae50 m16286n() {
        return this.cards_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m16287p() {
        return this.headingSubtitle_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16288q() {
        return this.headingTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
