package com.spotify.watchfeedentrypoints.api.p188v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PivotsStructure extends AbstractC0269h implements sre0 {
    private static final PivotsStructure DEFAULT_INSTANCE;
    public static final int FILTERS_SECTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_SECTION_FIELD_NUMBER = 3;
    public static final int SECTIONS_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private FiltersSection filtersSection_;
    private PromptSection promptSection_;
    private String title_ = "";
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();

    static {
        PivotsStructure pivotsStructure = new PivotsStructure();
        DEFAULT_INSTANCE = pivotsStructure;
        AbstractC0269h.registerDefaultInstance(PivotsStructure.class, pivotsStructure);
    }

    private PivotsStructure() {
    }

    /* JADX INFO: renamed from: n */
    public static PivotsStructure m22964n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "title_", "sections_", PivotsSection.class, "promptSection_", "filtersSection_"});
        }
        if (iOrdinal == 3) {
            return new PivotsStructure();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 17);
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
        synchronized (PivotsStructure.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final FiltersSection m22965o() {
        FiltersSection filtersSection = this.filtersSection_;
        return filtersSection == null ? FiltersSection.m22945n() : filtersSection;
    }

    /* JADX INFO: renamed from: p */
    public final PromptSection m22966p() {
        PromptSection promptSection = this.promptSection_;
        return promptSection == null ? PromptSection.m22970n() : promptSection;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m22967q() {
        return this.sections_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22968r() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22969s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
