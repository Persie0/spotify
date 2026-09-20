package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uro;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class DenominationSelectionWithListAndSections extends AbstractC0269h implements sre0 {
    private static final DenominationSelectionWithListAndSections DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int ITEMS_FIELD_NUMBER = 4;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 5;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
    public static final int SECTIONS_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DenominationCta primaryButton_;
    private DenominationCta secondaryButton_;
    private String pageTitle_ = "";
    private String title_ = "";
    private String description_ = "";
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();

    static {
        DenominationSelectionWithListAndSections denominationSelectionWithListAndSections = new DenominationSelectionWithListAndSections();
        DEFAULT_INSTANCE = denominationSelectionWithListAndSections;
        AbstractC0269h.registerDefaultInstance(DenominationSelectionWithListAndSections.class, denominationSelectionWithListAndSections);
    }

    private DenominationSelectionWithListAndSections() {
    }

    /* JADX INFO: renamed from: n */
    public static DenominationSelectionWithListAndSections m16434n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007\u001b", new Object[]{"bitField0_", "pageTitle_", "title_", "description_", "items_", DenominationItem.class, "primaryButton_", "secondaryButton_", "sections_", DenominationSection.class});
        }
        if (iOrdinal == 3) {
            return new DenominationSelectionWithListAndSections();
        }
        if (iOrdinal == 4) {
            return new uro(DEFAULT_INSTANCE, 14);
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
        synchronized (DenominationSelectionWithListAndSections.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final List getItemsList() {
        return this.items_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DenominationCta m16435o() {
        DenominationCta denominationCta = this.primaryButton_;
        return denominationCta == null ? DenominationCta.m16423o() : denominationCta;
    }

    /* JADX INFO: renamed from: p */
    public final DenominationCta m16436p() {
        DenominationCta denominationCta = this.secondaryButton_;
        return denominationCta == null ? DenominationCta.m16423o() : denominationCta;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m16437q() {
        return this.sections_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
