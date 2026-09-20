package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tp10;
import p204p.up10;
import p204p.vp10;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GpbOperation extends AbstractC0269h implements sre0 {
    private static final GpbOperation DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 9;
    public static final int ERROR_TYPE_FIELD_NUMBER = 8;
    public static final int INPUT_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int OUTPUT_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int STEP_FIELD_NUMBER = 4;
    private int bitField0_;
    private String errorMessage_;
    private String errorType_;
    private ihc0 input_;
    private String name_;
    private ihc0 output_;
    private String result_;
    private String sessionId_;
    private String source_;
    private String step_;

    static {
        GpbOperation gpbOperation = new GpbOperation();
        DEFAULT_INSTANCE = gpbOperation;
        AbstractC0269h.registerDefaultInstance(GpbOperation.class, gpbOperation);
    }

    private GpbOperation() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.input_ = ihc0Var;
        this.output_ = ihc0Var;
        this.source_ = "";
        this.sessionId_ = "";
        this.name_ = "";
        this.step_ = "";
        this.result_ = "";
        this.errorType_ = "";
        this.errorMessage_ = "";
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m11217n(GpbOperation gpbOperation) {
        ihc0 ihc0Var = gpbOperation.input_;
        if (!ihc0Var.f102236a) {
            gpbOperation.input_ = ihc0Var.m50613h();
        }
        return gpbOperation.input_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m11218o(GpbOperation gpbOperation) {
        ihc0 ihc0Var = gpbOperation.output_;
        if (!ihc0Var.f102236a) {
            gpbOperation.output_ = ihc0Var.m50613h();
        }
        return gpbOperation.output_;
    }

    /* JADX INFO: renamed from: p */
    public static void m11219p(GpbOperation gpbOperation, String str) {
        gpbOperation.getClass();
        str.getClass();
        gpbOperation.bitField0_ |= 64;
        gpbOperation.errorMessage_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11220q(GpbOperation gpbOperation, String str) {
        gpbOperation.getClass();
        str.getClass();
        gpbOperation.bitField0_ |= 32;
        gpbOperation.errorType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m11221r(GpbOperation gpbOperation, String str) {
        gpbOperation.getClass();
        gpbOperation.bitField0_ |= 4;
        gpbOperation.name_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m11222s(GpbOperation gpbOperation, String str) {
        gpbOperation.getClass();
        gpbOperation.bitField0_ |= 16;
        gpbOperation.result_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m11223t(GpbOperation gpbOperation, String str) {
        gpbOperation.getClass();
        gpbOperation.bitField0_ |= 2;
        gpbOperation.sessionId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m11224u(GpbOperation gpbOperation, String str) {
        gpbOperation.getClass();
        gpbOperation.bitField0_ |= 1;
        gpbOperation.source_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m11225v(GpbOperation gpbOperation, String str) {
        gpbOperation.getClass();
        gpbOperation.bitField0_ |= 8;
        gpbOperation.step_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static tp10 m11226w() {
        return (tp10) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u00052\u0006ဈ\u0004\u00072\bဈ\u0005\tဈ\u0006", new Object[]{"bitField0_", "source_", "sessionId_", "name_", "step_", "input_", up10.f232550a, "result_", "output_", vp10.f243566a, "errorType_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new GpbOperation();
        }
        if (iOrdinal == 4) {
            return new tp10(DEFAULT_INSTANCE);
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
        synchronized (GpbOperation.class) {
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
