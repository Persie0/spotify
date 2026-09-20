package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SectionInfo extends AbstractC0269h implements sre0 {
    private static final SectionInfo DEFAULT_INSTANCE;
    public static final int DISPLAY_CONDITION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SECTION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private DisplayCondition displayCondition_;
    private String sectionId_ = "";

    static {
        SectionInfo sectionInfo = new SectionInfo();
        DEFAULT_INSTANCE = sectionInfo;
        AbstractC0269h.registerDefaultInstance(SectionInfo.class, sectionInfo);
    }

    private SectionInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static SectionInfo m20660n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "sectionId_", "displayCondition_"});
        }
        if (iOrdinal == 3) {
            return new SectionInfo();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 26);
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
        synchronized (SectionInfo.class) {
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
    public final DisplayCondition m20661o() {
        DisplayCondition displayCondition = this.displayCondition_;
        return displayCondition == null ? DisplayCondition.m20480o() : displayCondition;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20662p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
