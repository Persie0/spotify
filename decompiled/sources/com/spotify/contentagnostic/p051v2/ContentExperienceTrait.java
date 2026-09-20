package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.shj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentExperienceTrait extends AbstractC0269h implements sre0 {
    public static final int CONTENT_EXPERIENCE_FIELD_NUMBER = 1;
    private static final ContentExperienceTrait DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int contentExperience_;

    static {
        ContentExperienceTrait contentExperienceTrait = new ContentExperienceTrait();
        DEFAULT_INSTANCE = contentExperienceTrait;
        AbstractC0269h.registerDefaultInstance(ContentExperienceTrait.class, contentExperienceTrait);
    }

    private ContentExperienceTrait() {
    }

    /* JADX INFO: renamed from: o */
    public static ContentExperienceTrait m7824o(byte[] bArr) {
        return (ContentExperienceTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"contentExperience_"});
        }
        if (iOrdinal == 3) {
            return new ContentExperienceTrait();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 12);
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
        synchronized (ContentExperienceTrait.class) {
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
    public final shj m7825n() {
        shj shjVar;
        int i = this.contentExperience_;
        if (i == 0) {
            shjVar = shj.CONTENT_EXPERIENCE_UNSPECIFIED;
        } else if (i != 1) {
            shjVar = i != 2 ? null : shj.CONTENT_EXPERIENCE_TALK;
        } else {
            shjVar = shj.CONTENT_EXPERIENCE_MUSIC;
        }
        return shjVar == null ? shj.UNRECOGNIZED : shjVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
