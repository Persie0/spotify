package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import p204p.flw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EsLocalFiles$GetTracksRequest extends AbstractC0269h implements sre0 {
    private static final EsLocalFiles$GetTracksRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 2;
    public static final int QUERY_FIELD_NUMBER = 1;
    private int bitField0_;
    private PlaylistTrackDecorationPolicy policy_;
    private EsLocalFiles$Query query_;

    static {
        EsLocalFiles$GetTracksRequest esLocalFiles$GetTracksRequest = new EsLocalFiles$GetTracksRequest();
        DEFAULT_INSTANCE = esLocalFiles$GetTracksRequest;
        AbstractC0269h.registerDefaultInstance(EsLocalFiles$GetTracksRequest.class, esLocalFiles$GetTracksRequest);
    }

    private EsLocalFiles$GetTracksRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13152n(EsLocalFiles$GetTracksRequest esLocalFiles$GetTracksRequest, PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        esLocalFiles$GetTracksRequest.getClass();
        playlistTrackDecorationPolicy.getClass();
        esLocalFiles$GetTracksRequest.policy_ = playlistTrackDecorationPolicy;
        esLocalFiles$GetTracksRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m13153o(EsLocalFiles$GetTracksRequest esLocalFiles$GetTracksRequest, EsLocalFiles$Query esLocalFiles$Query) {
        esLocalFiles$GetTracksRequest.getClass();
        esLocalFiles$Query.getClass();
        esLocalFiles$GetTracksRequest.query_ = esLocalFiles$Query;
        esLocalFiles$GetTracksRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static flw m13154p() {
        return (flw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "query_", "policy_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$GetTracksRequest();
        }
        if (iOrdinal == 4) {
            return new flw(DEFAULT_INSTANCE);
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
        synchronized (EsLocalFiles$GetTracksRequest.class) {
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
