package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dbk;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ContextualTarget extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 1;
    private static final ContextualTarget DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 3;
    public static final int ITEM_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String contextUri_ = "";
    private String itemUri_ = "";
    private String itemId_ = "";

    static {
        ContextualTarget contextualTarget = new ContextualTarget();
        DEFAULT_INSTANCE = contextualTarget;
        AbstractC0269h.registerDefaultInstance(ContextualTarget.class, contextualTarget);
    }

    private ContextualTarget() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4243n(ContextualTarget contextualTarget, String str) {
        contextualTarget.getClass();
        str.getClass();
        contextualTarget.contextUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m4244o(ContextualTarget contextualTarget, String str) {
        contextualTarget.getClass();
        str.getClass();
        contextualTarget.bitField0_ |= 2;
        contextualTarget.itemId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m4245p(ContextualTarget contextualTarget, String str) {
        contextualTarget.getClass();
        str.getClass();
        contextualTarget.bitField0_ |= 1;
        contextualTarget.itemUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ContextualTarget m4246r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static dbk m4247v() {
        return (dbk) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "contextUri_", "itemUri_", "itemId_"});
        }
        if (iOrdinal == 3) {
            return new ContextualTarget();
        }
        if (iOrdinal == 4) {
            return new dbk(DEFAULT_INSTANCE);
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
        synchronized (ContextualTarget.class) {
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

    public final boolean hasItemId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final String m4248q() {
        return this.contextUri_;
    }

    /* JADX INFO: renamed from: s */
    public final String m4249s() {
        return this.itemId_;
    }

    /* JADX INFO: renamed from: t */
    public final String m4250t() {
        return this.itemUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4251u() {
        return (this.bitField0_ & 1) != 0;
    }
}
