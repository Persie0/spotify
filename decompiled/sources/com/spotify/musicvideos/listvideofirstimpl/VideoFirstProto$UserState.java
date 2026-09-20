package com.spotify.musicvideos.listvideofirstimpl;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.ovb1;
import p204p.pre0;
import p204p.pvb1;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class VideoFirstProto$UserState extends AbstractC0269h implements sre0 {
    private static final VideoFirstProto$UserState DEFAULT_INSTANCE;
    public static final int LIST_ENABLED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 listEnabled_ = ihc0.f102235b;

    static {
        VideoFirstProto$UserState videoFirstProto$UserState = new VideoFirstProto$UserState();
        DEFAULT_INSTANCE = videoFirstProto$UserState;
        AbstractC0269h.registerDefaultInstance(VideoFirstProto$UserState.class, videoFirstProto$UserState);
    }

    private VideoFirstProto$UserState() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m15948n(VideoFirstProto$UserState videoFirstProto$UserState) {
        ihc0 ihc0Var = videoFirstProto$UserState.listEnabled_;
        if (!ihc0Var.f102236a) {
            videoFirstProto$UserState.listEnabled_ = ihc0Var.m50613h();
        }
        return videoFirstProto$UserState.listEnabled_;
    }

    /* JADX INFO: renamed from: o */
    public static VideoFirstProto$UserState m15949o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"listEnabled_", pvb1.f181681a});
        }
        if (iOrdinal == 3) {
            return new VideoFirstProto$UserState();
        }
        if (iOrdinal == 4) {
            return new ovb1(DEFAULT_INSTANCE);
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
        synchronized (VideoFirstProto$UserState.class) {
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
    public final Map m15950p() {
        return Collections.unmodifiableMap(this.listEnabled_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
