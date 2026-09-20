package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.c8s0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class PromptableSection extends AbstractC0269h implements sre0 {
    private static final PromptableSection DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_SUGGESTIONS_FIELD_NUMBER = 3;
    private int bitField0_;
    private Heading heading_;
    private Item item_;
    private ae50 promptSuggestions_ = AbstractC0269h.emptyProtobufList();

    static {
        PromptableSection promptableSection = new PromptableSection();
        DEFAULT_INSTANCE = promptableSection;
        AbstractC0269h.registerDefaultInstance(PromptableSection.class, promptableSection);
    }

    private PromptableSection() {
    }

    /* JADX INFO: renamed from: o */
    public static PromptableSection m5746o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"bitField0_", "heading_", "item_", "promptSuggestions_", PromptableSuggestion.class});
        }
        if (iOrdinal == 3) {
            return new PromptableSection();
        }
        if (iOrdinal == 4) {
            return new c8s0(12);
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
        synchronized (PromptableSection.class) {
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

    /* JADX INFO: renamed from: p */
    public final Heading m5747p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m5646o() : heading;
    }

    /* JADX INFO: renamed from: q */
    public final Item m5748q() {
        Item item = this.item_;
        return item == null ? Item.m5688o() : item;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m5749r() {
        return this.promptSuggestions_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
