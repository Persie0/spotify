package com.spotify.quizaccessservice.p138v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CheckUserQuizStateResponse extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBLE_FIELD_NUMBER = 2;
    public static final int COMPLETED_FIELD_NUMBER = 1;
    private static final CheckUserQuizStateResponse DEFAULT_INSTANCE;
    public static final int INACCESSIBLE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int stateCase_ = 0;
    private Object state_;

    static {
        CheckUserQuizStateResponse checkUserQuizStateResponse = new CheckUserQuizStateResponse();
        DEFAULT_INSTANCE = checkUserQuizStateResponse;
        AbstractC0269h.registerDefaultInstance(CheckUserQuizStateResponse.class, checkUserQuizStateResponse);
    }

    private CheckUserQuizStateResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"state_", "stateCase_", Completed.class, Accessible.class, Inaccessible.class});
        }
        if (iOrdinal == 3) {
            return new CheckUserQuizStateResponse();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 15);
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
        synchronized (CheckUserQuizStateResponse.class) {
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
    public final Accessible m20027n() {
        return this.stateCase_ == 2 ? (Accessible) this.state_ : Accessible.m20018o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Completed m20028o() {
        return this.stateCase_ == 1 ? (Completed) this.state_ : Completed.m20033o();
    }

    /* JADX INFO: renamed from: p */
    public final Inaccessible m20029p() {
        return this.stateCase_ == 3 ? (Inaccessible) this.state_ : Inaccessible.m20035n();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20030q() {
        return this.stateCase_ == 2;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20031r() {
        return this.stateCase_ == 1;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m20032s() {
        return this.stateCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
