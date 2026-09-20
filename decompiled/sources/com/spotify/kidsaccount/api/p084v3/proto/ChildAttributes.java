package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.f3e;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ChildAttributes extends AbstractC0269h implements sre0 {
    public static final int ALLOW_CHILD_VIDEO_FIELD_NUMBER = 2;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 1;
    private static final ChildAttributes DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private boolean allowChildVideo_;
    private boolean allowExplicitContent_;

    static {
        ChildAttributes childAttributes = new ChildAttributes();
        DEFAULT_INSTANCE = childAttributes;
        AbstractC0269h.registerDefaultInstance(ChildAttributes.class, childAttributes);
    }

    private ChildAttributes() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12125n(ChildAttributes childAttributes, boolean z) {
        childAttributes.allowChildVideo_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m12126o(ChildAttributes childAttributes, boolean z) {
        childAttributes.allowExplicitContent_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static f3e m12127p() {
        return (f3e) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"allowExplicitContent_", "allowChildVideo_"});
        }
        if (iOrdinal == 3) {
            return new ChildAttributes();
        }
        if (iOrdinal == 4) {
            return new f3e(DEFAULT_INSTANCE);
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
        synchronized (ChildAttributes.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
