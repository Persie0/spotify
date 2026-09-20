package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.aks;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class DuplicateMixRequest extends AbstractC0269h implements sre0 {
    private static final DuplicateMixRequest DEFAULT_INSTANCE;
    public static final int ONLY_MIX_IF_ALREADY_MIXED_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TRANSITION_OVERRIDES_FIELD_NUMBER = 2;
    private boolean onlyMixIfAlreadyMixed_;
    private String playlistUri_ = "";
    private ae50 transitionOverrides_ = AbstractC0269h.emptyProtobufList();

    static {
        DuplicateMixRequest duplicateMixRequest = new DuplicateMixRequest();
        DEFAULT_INSTANCE = duplicateMixRequest;
        AbstractC0269h.registerDefaultInstance(DuplicateMixRequest.class, duplicateMixRequest);
    }

    private DuplicateMixRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19379n(DuplicateMixRequest duplicateMixRequest, TransitionOverride transitionOverride) {
        duplicateMixRequest.getClass();
        transitionOverride.getClass();
        ae50 ae50Var = duplicateMixRequest.transitionOverrides_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            duplicateMixRequest.transitionOverrides_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        duplicateMixRequest.transitionOverrides_.add(transitionOverride);
    }

    /* JADX INFO: renamed from: o */
    public static void m19380o(DuplicateMixRequest duplicateMixRequest, boolean z) {
        duplicateMixRequest.onlyMixIfAlreadyMixed_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m19381p(DuplicateMixRequest duplicateMixRequest, String str) {
        duplicateMixRequest.getClass();
        str.getClass();
        duplicateMixRequest.playlistUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static aks m19382q() {
        return (aks) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0007", new Object[]{"playlistUri_", "transitionOverrides_", TransitionOverride.class, "onlyMixIfAlreadyMixed_"});
        }
        if (iOrdinal == 3) {
            return new DuplicateMixRequest();
        }
        if (iOrdinal == 4) {
            return new aks(DEFAULT_INSTANCE);
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
        synchronized (DuplicateMixRequest.class) {
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
