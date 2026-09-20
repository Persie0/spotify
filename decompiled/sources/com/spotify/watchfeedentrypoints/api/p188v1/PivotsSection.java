package com.spotify.watchfeedentrypoints.api.p188v1;

import com.google.protobuf.AbstractC0269h;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PivotsSection extends AbstractC0269h implements sre0 {
    public static final int BENTO_SECTION_FIELD_NUMBER = 2;
    private static final PivotsSection DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SECTION_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private PivotsSectionInfo sectionInfo_;
    private int sectionTypeCase_ = 0;
    private Object sectionType_;

    static {
        PivotsSection pivotsSection = new PivotsSection();
        DEFAULT_INSTANCE = pivotsSection;
        AbstractC0269h.registerDefaultInstance(PivotsSection.class, pivotsSection);
    }

    private PivotsSection() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000", new Object[]{"sectionType_", "sectionTypeCase_", "bitField0_", "sectionInfo_", PivotsBentoSection.class});
        }
        if (iOrdinal == 3) {
            return new PivotsSection();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 15);
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
        synchronized (PivotsSection.class) {
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
    public final PivotsBentoSection m22959n() {
        return this.sectionTypeCase_ == 2 ? (PivotsBentoSection) this.sectionType_ : PivotsBentoSection.m22955n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PivotsSectionInfo m22960o() {
        PivotsSectionInfo pivotsSectionInfo = this.sectionInfo_;
        return pivotsSectionInfo == null ? PivotsSectionInfo.m22962n() : pivotsSectionInfo;
    }

    /* JADX INFO: renamed from: p */
    public final int m22961p() {
        int i = this.sectionTypeCase_;
        if (i != 0) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
