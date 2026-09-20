package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.f0r0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PresentedTransition extends AbstractC0269h implements sre0 {
    private static final PresentedTransition DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSITION_BASE_64_FIELD_NUMBER = 2;
    private String identifier_ = "";
    private String transitionBase64_ = "";

    static {
        PresentedTransition presentedTransition = new PresentedTransition();
        DEFAULT_INSTANCE = presentedTransition;
        AbstractC0269h.registerDefaultInstance(PresentedTransition.class, presentedTransition);
    }

    private PresentedTransition() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19422n(PresentedTransition presentedTransition, String str) {
        presentedTransition.getClass();
        str.getClass();
        presentedTransition.identifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19423o(PresentedTransition presentedTransition, String str) {
        presentedTransition.getClass();
        presentedTransition.transitionBase64_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static f0r0 m19424p() {
        return (f0r0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"identifier_", "transitionBase64_"});
        }
        if (iOrdinal == 3) {
            return new PresentedTransition();
        }
        if (iOrdinal == 4) {
            return new f0r0(DEFAULT_INSTANCE);
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
        synchronized (PresentedTransition.class) {
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
