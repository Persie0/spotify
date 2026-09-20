package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class RankedList2 extends AbstractC0269h implements sre0 {
    private static final RankedList2 DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SECTION_1_FIELD_NUMBER = 1;
    public static final int SECTION_2_FIELD_NUMBER = 2;
    public static final int SUBTITLE_TEXT_FIELD_NUMBER = 4;
    public static final int TITLE_TEXT_FIELD_NUMBER = 3;
    private int bitField0_;
    private RankedListSection section1_;
    private RankedListSection section2_;
    private String titleText_ = "";
    private String subtitleText_ = "";

    static {
        RankedList2 rankedList2 = new RankedList2();
        DEFAULT_INSTANCE = rankedList2;
        AbstractC0269h.registerDefaultInstance(RankedList2.class, rankedList2);
    }

    private RankedList2() {
    }

    /* JADX INFO: renamed from: n */
    public static RankedList2 m11589n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "section1_", "section2_", "titleText_", "subtitleText_"});
        }
        if (iOrdinal == 3) {
            return new RankedList2();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 27);
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
        synchronized (RankedList2.class) {
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
    public final RankedListSection m11590o() {
        RankedListSection rankedListSection = this.section1_;
        return rankedListSection == null ? RankedListSection.m11596o() : rankedListSection;
    }

    /* JADX INFO: renamed from: p */
    public final RankedListSection m11591p() {
        RankedListSection rankedListSection = this.section2_;
        return rankedListSection == null ? RankedListSection.m11596o() : rankedListSection;
    }

    /* JADX INFO: renamed from: q */
    public final String m11592q() {
        return this.subtitleText_;
    }

    /* JADX INFO: renamed from: r */
    public final String m11593r() {
        return this.titleText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
