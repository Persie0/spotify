package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.hy91;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalizedString extends AbstractC0269h implements sre0 {
    private static final LocalizedString DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int key_;
    private String value_ = "";

    static {
        LocalizedString localizedString = new LocalizedString();
        DEFAULT_INSTANCE = localizedString;
        AbstractC0269h.registerDefaultInstance(LocalizedString.class, localizedString);
    }

    private LocalizedString() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"key_", "value_"});
        }
        if (iOrdinal == 3) {
            return new LocalizedString();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 18);
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
        synchronized (LocalizedString.class) {
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

    public final String getValue() {
        return this.value_;
    }

    /* JADX INFO: renamed from: n */
    public final hy91 m15861n() {
        hy91 hy91Var;
        switch (this.key_) {
            case 0:
                hy91Var = hy91.UI_STRING_KEY_UNSPECIFIED;
                break;
            case 1:
                hy91Var = hy91.PREHEADLINE;
                break;
            case 2:
                hy91Var = hy91.HEADLINE;
                break;
            case 3:
                hy91Var = hy91.TITLE;
                break;
            case 4:
                hy91Var = hy91.PRIMARY_BUTTON;
                break;
            case 5:
                hy91Var = hy91.EXPLANATION_TEXT;
                break;
            case 6:
                hy91Var = hy91.MARKER;
                break;
            case 7:
                hy91Var = hy91.SUB_MARKER;
                break;
            case 8:
                hy91Var = hy91.SOURCES;
                break;
            case 9:
                hy91Var = hy91.OTHER;
                break;
            case 10:
                hy91Var = hy91.POSITIVE_MESSAGE;
                break;
            case 11:
                hy91Var = hy91.NEGATIVE_MESSAGE;
                break;
            case 12:
                hy91Var = hy91.COMPLETION_BUTTON;
                break;
            case 13:
                hy91Var = hy91.SECONDARY_BUTTON;
                break;
            case 14:
                hy91Var = hy91.ROUND_NAME;
                break;
            case 15:
                hy91Var = hy91.COMPLETION_TIME_LABEL;
                break;
            case 16:
                hy91Var = hy91.SHARE_TEXT;
                break;
            default:
                hy91Var = null;
                break;
        }
        return hy91Var == null ? hy91.UNRECOGNIZED : hy91Var;
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
