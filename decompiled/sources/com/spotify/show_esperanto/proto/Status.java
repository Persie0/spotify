package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.l051;
import p204p.m051;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Status extends AbstractC0269h implements sre0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int code_;
    private String reason_ = "";

    static {
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        AbstractC0269h.registerDefaultInstance(Status.class, status);
    }

    private Status() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21248n(Status status, m051 m051Var) {
        status.getClass();
        status.code_ = m051Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m21249o(Status status, String str) {
        status.getClass();
        str.getClass();
        status.reason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Status m21250q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static l051 m21251r() {
        return (l051) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"code_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new Status();
        }
        if (iOrdinal == 4) {
            return new l051(DEFAULT_INSTANCE);
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
        synchronized (Status.class) {
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

    /* JADX INFO: renamed from: p */
    public final m051 m21252p() {
        m051 m051Var;
        int i = this.code_;
        if (i == 0) {
            m051Var = m051.SUCCESS;
        } else if (i == 1) {
            m051Var = m051.BAD_REQUEST;
        } else if (i != 2) {
            m051Var = i != 3 ? null : m051.NOT_FOUND;
        } else {
            m051Var = m051.INTERNAL_ERROR;
        }
        return m051Var == null ? m051.UNRECOGNIZED : m051Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
