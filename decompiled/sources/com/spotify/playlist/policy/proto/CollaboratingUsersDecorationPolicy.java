package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rxe;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class CollaboratingUsersDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int COLLABORATOR_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final CollaboratingUsersDecorationPolicy DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private CollaboratorPolicy collaborator_;
    private boolean count_;
    private int limit_;

    static {
        CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = new CollaboratingUsersDecorationPolicy();
        DEFAULT_INSTANCE = collaboratingUsersDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(CollaboratingUsersDecorationPolicy.class, collaboratingUsersDecorationPolicy);
    }

    private CollaboratingUsersDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18296n(CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy, CollaboratorPolicy collaboratorPolicy) {
        collaboratingUsersDecorationPolicy.getClass();
        collaboratorPolicy.getClass();
        collaboratingUsersDecorationPolicy.collaborator_ = collaboratorPolicy;
        collaboratingUsersDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m18297o(CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        collaboratingUsersDecorationPolicy.count_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m18298p(CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy, int i) {
        collaboratingUsersDecorationPolicy.limit_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static rxe m18300s() {
        return (rxe) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "count_", "limit_", "collaborator_"});
        }
        if (iOrdinal == 3) {
            return new CollaboratingUsersDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new rxe();
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
        synchronized (CollaboratingUsersDecorationPolicy.class) {
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

    /* JADX INFO: renamed from: r */
    public final CollaboratorPolicy m18301r() {
        CollaboratorPolicy collaboratorPolicy = this.collaborator_;
        return collaboratorPolicy == null ? CollaboratorPolicy.m18306r() : collaboratorPolicy;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
