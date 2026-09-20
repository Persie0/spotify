package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Content extends AbstractC0269h implements sre0 {
    public static final int ADDEDURIS_FIELD_NUMBER = 4;
    public static final int CONTENTURIS_FIELD_NUMBER = 3;
    private static final Content DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVEDURIS_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int UPDATE_NOTIFICATION_FIELD_NUMBER = 6;
    private int typeCase_ = 0;
    private Object type_;

    static {
        Content content = new Content();
        DEFAULT_INSTANCE = content;
        AbstractC0269h.registerDefaultInstance(Content.class, content);
    }

    private Content() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"type_", "typeCase_", ContentUris.class, CuratedUris.class, CuratedUris.class, UpdateNotification.class});
        }
        if (iOrdinal == 3) {
            return new Content();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 5);
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
        synchronized (Content.class) {
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
    public final CuratedUris m2867n() {
        return this.typeCase_ == 4 ? (CuratedUris) this.type_ : CuratedUris.m2904n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ContentUris m2868o() {
        return this.typeCase_ == 3 ? (ContentUris) this.type_ : ContentUris.m2874n();
    }

    /* JADX INFO: renamed from: p */
    public final String m2869p() {
        return this.typeCase_ == 1 ? (String) this.type_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final CuratedUris m2870q() {
        return this.typeCase_ == 5 ? (CuratedUris) this.type_ : CuratedUris.m2904n();
    }

    /* JADX INFO: renamed from: r */
    public final String m2871r() {
        return this.typeCase_ == 2 ? (String) this.type_ : "";
    }

    /* JADX INFO: renamed from: s */
    public final int m2872s() {
        switch (this.typeCase_) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: t */
    public final UpdateNotification m2873t() {
        return this.typeCase_ == 6 ? (UpdateNotification) this.type_ : UpdateNotification.m2985o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
