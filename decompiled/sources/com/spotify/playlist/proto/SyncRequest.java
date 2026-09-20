package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wf61;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class SyncRequest extends AbstractC0269h implements sre0 {
    private static final SyncRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URIS_FIELD_NUMBER = 1;
    private ae50 playlistUris_ = AbstractC0269h.emptyProtobufList();

    static {
        SyncRequest syncRequest = new SyncRequest();
        DEFAULT_INSTANCE = syncRequest;
        AbstractC0269h.registerDefaultInstance(SyncRequest.class, syncRequest);
    }

    private SyncRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18663n(SyncRequest syncRequest, Iterable iterable) {
        ae50 ae50Var = syncRequest.playlistUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            syncRequest.playlistUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, syncRequest.playlistUris_);
    }

    /* JADX INFO: renamed from: o */
    public static wf61 m18664o() {
        return (wf61) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"playlistUris_"});
        }
        if (iOrdinal == 3) {
            return new SyncRequest();
        }
        if (iOrdinal == 4) {
            return new wf61(DEFAULT_INSTANCE);
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
        synchronized (SyncRequest.class) {
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
