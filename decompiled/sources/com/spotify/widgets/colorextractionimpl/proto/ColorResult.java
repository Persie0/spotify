package com.spotify.widgets.colorextractionimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z051;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes11.dex */
public final class ColorResult extends AbstractC0269h implements sre0 {
    public static final int COLOR_DARK_FIELD_NUMBER = 3;
    public static final int COLOR_LIGHT_FIELD_NUMBER = 2;
    public static final int COLOR_RAW_FIELD_NUMBER = 1;
    private static final ColorResult DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int TTL_S_FIELD_NUMBER = 4;
    private int bitField0_;
    private Color colorDark_;
    private Color colorLight_;
    private Color colorRaw_;
    private int status_;
    private int ttlS_;

    static {
        ColorResult colorResult = new ColorResult();
        DEFAULT_INSTANCE = colorResult;
        AbstractC0269h.registerDefaultInstance(ColorResult.class, colorResult);
    }

    private ColorResult() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005\f", new Object[]{"bitField0_", "colorRaw_", "colorLight_", "colorDark_", "ttlS_", "status_"});
        }
        if (iOrdinal == 3) {
            return new ColorResult();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 19);
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
        synchronized (ColorResult.class) {
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
    public final Color m23076n() {
        Color color = this.colorDark_;
        return color == null ? Color.m23066o() : color;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Color m23077o() {
        Color color = this.colorRaw_;
        return color == null ? Color.m23066o() : color;
    }

    /* JADX INFO: renamed from: p */
    public final z051 m23078p() {
        z051 z051Var;
        int i = this.status_;
        if (i == 0) {
            z051Var = z051.OK;
        } else if (i == 1) {
            z051Var = z051.IN_PROGRESS;
        } else if (i != 2) {
            z051Var = i != 3 ? null : z051.INTERNAL;
        } else {
            z051Var = z051.INVALID_URL;
        }
        return z051Var == null ? z051.UNRECOGNIZED : z051Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m23079q() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m23080r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
