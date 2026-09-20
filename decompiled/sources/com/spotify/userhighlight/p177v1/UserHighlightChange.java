package com.spotify.userhighlight.p177v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.oqa1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class UserHighlightChange extends AbstractC0269h implements sre0 {
    private static final UserHighlightChange DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int END_OFFSET_FIELD_NUMBER = 4;
    public static final int PARENT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int START_OFFSET_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration endOffset_;
    private EntityReference parent_;
    private Duration startOffset_;
    private String uri_ = "";
    private String description_ = "";
    private String title_ = "";

    static {
        UserHighlightChange userHighlightChange = new UserHighlightChange();
        DEFAULT_INSTANCE = userHighlightChange;
        AbstractC0269h.registerDefaultInstance(UserHighlightChange.class, userHighlightChange);
    }

    private UserHighlightChange() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22120n(UserHighlightChange userHighlightChange, Duration duration) {
        userHighlightChange.getClass();
        userHighlightChange.endOffset_ = duration;
        userHighlightChange.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: o */
    public static void m22121o(UserHighlightChange userHighlightChange, EntityReference entityReference) {
        userHighlightChange.getClass();
        entityReference.getClass();
        userHighlightChange.parent_ = entityReference;
        userHighlightChange.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m22122p(UserHighlightChange userHighlightChange, Duration duration) {
        userHighlightChange.getClass();
        userHighlightChange.startOffset_ = duration;
        userHighlightChange.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m22123q(UserHighlightChange userHighlightChange, String str) {
        userHighlightChange.getClass();
        str.getClass();
        userHighlightChange.bitField0_ |= 32;
        userHighlightChange.title_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m22124r(UserHighlightChange userHighlightChange, String str) {
        userHighlightChange.getClass();
        str.getClass();
        userHighlightChange.bitField0_ |= 1;
        userHighlightChange.uri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static oqa1 m22125s() {
        return (oqa1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ለ\u0004\u0006ለ\u0005", new Object[]{"bitField0_", "uri_", "parent_", "startOffset_", "endOffset_", "description_", "title_"});
        }
        if (iOrdinal == 3) {
            return new UserHighlightChange();
        }
        if (iOrdinal == 4) {
            return new oqa1(DEFAULT_INSTANCE);
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
        synchronized (UserHighlightChange.class) {
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
