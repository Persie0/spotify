package com.spotify.audiobookrelations.p028v0;

import com.google.protobuf.AbstractC0269h;
import p204p.ec7;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudiobookRelationsResponse extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final AudiobookRelationsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SAME_BOOK_URI_FIELD_NUMBER = 1;
    private int action_;
    private String sameBookUri_ = "";

    static {
        AudiobookRelationsResponse audiobookRelationsResponse = new AudiobookRelationsResponse();
        DEFAULT_INSTANCE = audiobookRelationsResponse;
        AbstractC0269h.registerDefaultInstance(AudiobookRelationsResponse.class, audiobookRelationsResponse);
    }

    private AudiobookRelationsResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static AudiobookRelationsResponse m3435p(byte[] bArr) {
        return (AudiobookRelationsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"sameBookUri_", "action_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookRelationsResponse();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 11);
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
        synchronized (AudiobookRelationsResponse.class) {
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
    public final ec7 m3436n() {
        ec7 ec7Var;
        int i = this.action_;
        if (i != 0) {
            ec7Var = i != 1 ? null : ec7.BOOK_PAGE_REDIRECT;
        } else {
            ec7Var = ec7.UNSPECIFIED;
        }
        return ec7Var == null ? ec7.UNRECOGNIZED : ec7Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3437o() {
        return this.sameBookUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
