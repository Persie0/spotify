package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PersonalizePresetResponse extends AbstractC0269h implements sre0 {
    private static final PersonalizePresetResponse DEFAULT_INSTANCE;
    public static final int GENERATION_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 1;
    public static final int SHOWS_TO_PUBLISH_TO_FIELD_NUMBER = 3;
    private int bitField0_;
    private Preset preset_;
    private String generationId_ = "";
    private ae50 showsToPublishTo_ = AbstractC0269h.emptyProtobufList();

    static {
        PersonalizePresetResponse personalizePresetResponse = new PersonalizePresetResponse();
        DEFAULT_INSTANCE = personalizePresetResponse;
        AbstractC0269h.registerDefaultInstance(PersonalizePresetResponse.class, personalizePresetResponse);
    }

    private PersonalizePresetResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b", new Object[]{"bitField0_", "preset_", "generationId_", "showsToPublishTo_", ShowItem.class});
        }
        if (iOrdinal == 3) {
            return new PersonalizePresetResponse();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 6);
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
        synchronized (PersonalizePresetResponse.class) {
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
    public final String m17434n() {
        return this.generationId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Preset m17435o() {
        Preset preset = this.preset_;
        return preset == null ? Preset.m17446q() : preset;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m17436p() {
        return this.showsToPublishTo_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17437q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
