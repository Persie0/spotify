package com.spotify.extendedmetadata.extensions.contentalternativesimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentAlternative extends AbstractC0269h implements sre0 {
    public static final int AI_DUBBING_FIELD_NUMBER = 3;
    private static final ContentAlternative DEFAULT_INSTANCE;
    public static final int PARENT_CONTEXT_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private Object alternativeType_;
    private int alternativeTypeCase_ = 0;
    private String uri_ = "";
    private String parentContextUri_ = "";

    static {
        ContentAlternative contentAlternative = new ContentAlternative();
        DEFAULT_INSTANCE = contentAlternative;
        AbstractC0269h.registerDefaultInstance(ContentAlternative.class, contentAlternative);
    }

    private ContentAlternative() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000", new Object[]{"alternativeType_", "alternativeTypeCase_", "uri_", "parentContextUri_", AiDubbing.class});
        }
        if (iOrdinal == 3) {
            return new ContentAlternative();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 6);
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
        synchronized (ContentAlternative.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final AiDubbing m10069n() {
        return this.alternativeTypeCase_ == 3 ? (AiDubbing) this.alternativeType_ : AiDubbing.m10066n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m10070o() {
        int i = this.alternativeTypeCase_;
        if (i != 0) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: p */
    public final String m10071p() {
        return this.parentContextUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
