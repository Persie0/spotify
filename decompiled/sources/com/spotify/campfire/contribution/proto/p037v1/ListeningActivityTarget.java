package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xf90;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ListeningActivityTarget extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final ListeningActivityTarget DEFAULT_INSTANCE;
    public static final int OWNER_USER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp timestamp_;
    private String ownerUser_ = "";
    private String trackUri_ = "";
    private String contextUri_ = "";

    static {
        ListeningActivityTarget listeningActivityTarget = new ListeningActivityTarget();
        DEFAULT_INSTANCE = listeningActivityTarget;
        AbstractC0269h.registerDefaultInstance(ListeningActivityTarget.class, listeningActivityTarget);
    }

    private ListeningActivityTarget() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4339n(ListeningActivityTarget listeningActivityTarget, String str) {
        listeningActivityTarget.getClass();
        str.getClass();
        listeningActivityTarget.bitField0_ |= 1;
        listeningActivityTarget.contextUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m4340o(ListeningActivityTarget listeningActivityTarget, String str) {
        listeningActivityTarget.getClass();
        str.getClass();
        listeningActivityTarget.ownerUser_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m4341p(ListeningActivityTarget listeningActivityTarget, Timestamp timestamp) {
        listeningActivityTarget.getClass();
        timestamp.getClass();
        listeningActivityTarget.timestamp_ = timestamp;
        listeningActivityTarget.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m4342q(ListeningActivityTarget listeningActivityTarget, String str) {
        listeningActivityTarget.getClass();
        str.getClass();
        listeningActivityTarget.trackUri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static ListeningActivityTarget m4343s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static xf90 m4344x() {
        return (xf90) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "ownerUser_", "trackUri_", "contextUri_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new ListeningActivityTarget();
        }
        if (iOrdinal == 4) {
            return new xf90(DEFAULT_INSTANCE);
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
        synchronized (ListeningActivityTarget.class) {
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

    public final boolean hasTimestamp() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final String m4345r() {
        return this.contextUri_;
    }

    /* JADX INFO: renamed from: t */
    public final String m4346t() {
        return this.ownerUser_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Timestamp m4347u() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: v */
    public final String m4348v() {
        return this.trackUri_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4349w() {
        return (this.bitField0_ & 1) != 0;
    }
}
