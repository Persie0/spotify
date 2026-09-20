package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yjw;
import p204p.z110;
import p204p.zjw;

/* JADX INFO: loaded from: classes2.dex */
public final class EsContextTrack$ContextTrack extends AbstractC0269h implements sre0 {
    private static final EsContextTrack$ContextTrack DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int UID_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private ihc0 metadata_ = ihc0.f102235b;
    private String uri_ = "";
    private String uid_ = "";

    static {
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = new EsContextTrack$ContextTrack();
        DEFAULT_INSTANCE = esContextTrack$ContextTrack;
        AbstractC0269h.registerDefaultInstance(EsContextTrack$ContextTrack.class, esContextTrack$ContextTrack);
    }

    private EsContextTrack$ContextTrack() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m17748n(EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        ihc0 ihc0Var = esContextTrack$ContextTrack.metadata_;
        if (!ihc0Var.f102236a) {
            esContextTrack$ContextTrack.metadata_ = ihc0Var.m50613h();
        }
        return esContextTrack$ContextTrack.metadata_;
    }

    /* JADX INFO: renamed from: o */
    public static void m17749o(EsContextTrack$ContextTrack esContextTrack$ContextTrack, String str) {
        esContextTrack$ContextTrack.getClass();
        str.getClass();
        esContextTrack$ContextTrack.uid_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17750p(EsContextTrack$ContextTrack esContextTrack$ContextTrack, String str) {
        esContextTrack$ContextTrack.getClass();
        str.getClass();
        esContextTrack$ContextTrack.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static EsContextTrack$ContextTrack m17752r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static yjw m17753s() {
        return (yjw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"uri_", "uid_", "metadata_", zjw.f283558a});
        }
        if (iOrdinal == 3) {
            return new EsContextTrack$ContextTrack();
        }
        if (iOrdinal == 4) {
            return new yjw();
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
        synchronized (EsContextTrack$ContextTrack.class) {
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

    public final int getMetadataCount() {
        return this.metadata_.size();
    }

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    public final String getUid() {
        return this.uid_;
    }

    public final String getUri() {
        return this.uri_;
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
