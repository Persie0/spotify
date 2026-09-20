package com.spotify.savetospotify.p145v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.a530;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class HttpShowSummary extends AbstractC0269h implements sre0 {
    public static final int CREATED_AT_FIELD_NUMBER = 5;
    private static final HttpShowSummary DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    public static final int LAST_EPISODE_UPLOADED_AT_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_URI_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp createdAt_;
    private Timestamp lastEpisodeUploadedAt_;
    private String showUri_ = "";
    private String title_ = "";
    private String language_ = "";

    static {
        HttpShowSummary httpShowSummary = new HttpShowSummary();
        DEFAULT_INSTANCE = httpShowSummary;
        AbstractC0269h.registerDefaultInstance(HttpShowSummary.class, httpShowSummary);
    }

    private HttpShowSummary() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "showUri_", "title_", "language_", "createdAt_", "lastEpisodeUploadedAt_"});
        }
        if (iOrdinal == 3) {
            return new HttpShowSummary();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 10);
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
        synchronized (HttpShowSummary.class) {
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

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final Timestamp m20442n() {
        Timestamp timestamp = this.lastEpisodeUploadedAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20443o() {
        return this.showUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
