package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class CardLayout extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 4;
    public static final int BACKGROUND_IMAGE_URI_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final CardLayout DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ActionableButton primaryButton_;
    private String title_ = "";
    private ae50 body_ = AbstractC0269h.emptyProtobufList();
    private String backgroundColor_ = "";
    private String backgroundImageUri_ = "";

    static {
        CardLayout cardLayout = new CardLayout();
        DEFAULT_INSTANCE = cardLayout;
        AbstractC0269h.registerDefaultInstance(CardLayout.class, cardLayout);
    }

    private CardLayout() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004ለ\u0001\u0005ለ\u0002", new Object[]{"bitField0_", "title_", "body_", "primaryButton_", "backgroundColor_", "backgroundImageUri_"});
        }
        if (iOrdinal == 3) {
            return new CardLayout();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 14);
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
        synchronized (CardLayout.class) {
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
