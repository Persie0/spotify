package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qk91;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Trigger extends AbstractC0269h implements sre0 {
    private static final Trigger DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String pattern_ = "";
    private int type_;

    static {
        Trigger trigger = new Trigger();
        DEFAULT_INSTANCE = trigger;
        AbstractC0269h.registerDefaultInstance(Trigger.class, trigger);
    }

    private Trigger() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "pattern_"});
        }
        if (iOrdinal == 3) {
            return new Trigger();
        }
        if (iOrdinal == 4) {
            return new s791(10);
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
        synchronized (Trigger.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m17312o() {
        return this.pattern_;
    }

    /* JADX INFO: renamed from: p */
    public final qk91 m17313p() {
        qk91 qk91Var;
        int i = this.type_;
        if (i == 0) {
            qk91Var = qk91.TRIGGER_TYPE_UNKNOWN;
        } else if (i == 1) {
            qk91Var = qk91.URI;
        } else if (i != 2) {
            qk91Var = i != 3 ? null : qk91.PLAYBACK_STARTED;
        } else {
            qk91Var = qk91.CLIENT_EVENT;
        }
        return qk91Var == null ? qk91.UNRECOGNIZED : qk91Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
