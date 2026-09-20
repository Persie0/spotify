package com.spotify.canvas.settings.canvas.impl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hsb;
import p204p.ihc0;
import p204p.isb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CanvasPreference extends AbstractC0269h implements sre0 {
    private static final CanvasPreference DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 4;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private ihc0 details_ = ihc0.f102235b;
    private String identifier_ = "";
    private String value_ = "";
    private String source_ = "";

    static {
        CanvasPreference canvasPreference = new CanvasPreference();
        DEFAULT_INSTANCE = canvasPreference;
        AbstractC0269h.registerDefaultInstance(CanvasPreference.class, canvasPreference);
    }

    private CanvasPreference() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5516n(CanvasPreference canvasPreference) {
        canvasPreference.getClass();
        canvasPreference.bitField0_ |= 1;
        canvasPreference.identifier_ = "settings_toggle";
    }

    /* JADX INFO: renamed from: o */
    public static void m5517o(CanvasPreference canvasPreference, String str) {
        canvasPreference.getClass();
        str.getClass();
        canvasPreference.bitField0_ |= 4;
        canvasPreference.source_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5518p(CanvasPreference canvasPreference, String str) {
        canvasPreference.getClass();
        canvasPreference.bitField0_ |= 2;
        canvasPreference.value_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static hsb m5519q() {
        return (hsb) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"bitField0_", "identifier_", "value_", "source_", "details_", isb.f105207a});
        }
        if (iOrdinal == 3) {
            return new CanvasPreference();
        }
        if (iOrdinal == 4) {
            return new hsb(DEFAULT_INSTANCE);
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
        synchronized (CanvasPreference.class) {
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
