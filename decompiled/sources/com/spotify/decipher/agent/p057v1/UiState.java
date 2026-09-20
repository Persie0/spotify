package com.spotify.decipher.agent.p057v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yx91;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class UiState extends AbstractC0269h implements sre0 {
    private static final UiState DEFAULT_INSTANCE;
    public static final int IS_FOREGROUNDED_FIELD_NUMBER = 5;
    public static final int ITEMS_FIELD_NUMBER = 6;
    public static final int PAGE_ID_FIELD_NUMBER = 2;
    public static final int PAGE_STATUS_FIELD_NUMBER = 4;
    public static final int PAGE_TITLE_FIELD_NUMBER = 3;
    public static final int PAGE_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean isForegrounded_;
    private String pageUri_ = "";
    private String pageId_ = "";
    private String pageTitle_ = "";
    private String pageStatus_ = "";
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        UiState uiState = new UiState();
        DEFAULT_INSTANCE = uiState;
        AbstractC0269h.registerDefaultInstance(UiState.class, uiState);
    }

    private UiState() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9158n(UiState uiState) {
        uiState.isForegrounded_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static yx91 m9159o() {
        return (yx91) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005\u0007\u0006\u001b", new Object[]{"bitField0_", "pageUri_", "pageId_", "pageTitle_", "pageStatus_", "isForegrounded_", "items_", UiItem.class});
        }
        if (iOrdinal == 3) {
            return new UiState();
        }
        if (iOrdinal == 4) {
            return new yx91(DEFAULT_INSTANCE);
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
        synchronized (UiState.class) {
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
