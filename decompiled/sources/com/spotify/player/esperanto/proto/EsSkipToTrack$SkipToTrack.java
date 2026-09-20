package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xow;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSkipToTrack$SkipToTrack extends AbstractC0269h implements sre0 {
    private static final EsSkipToTrack$SkipToTrack DEFAULT_INSTANCE;
    public static final int PAGE_INDEX_FIELD_NUMBER = 2;
    public static final int PAGE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_INDEX_FIELD_NUMBER = 5;
    public static final int TRACK_UID_FIELD_NUMBER = 3;
    public static final int TRACK_URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private EsOptional$OptionalInt64 pageIndex_;
    private EsOptional$OptionalInt64 trackIndex_;
    private String pageUrl_ = "";
    private String trackUid_ = "";
    private String trackUri_ = "";

    static {
        EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = new EsSkipToTrack$SkipToTrack();
        DEFAULT_INSTANCE = esSkipToTrack$SkipToTrack;
        AbstractC0269h.registerDefaultInstance(EsSkipToTrack$SkipToTrack.class, esSkipToTrack$SkipToTrack);
    }

    private EsSkipToTrack$SkipToTrack() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18003n(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esSkipToTrack$SkipToTrack.getClass();
        esOptional$OptionalInt64.getClass();
        esSkipToTrack$SkipToTrack.pageIndex_ = esOptional$OptionalInt64;
        esSkipToTrack$SkipToTrack.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m18004o(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, String str) {
        esSkipToTrack$SkipToTrack.getClass();
        str.getClass();
        esSkipToTrack$SkipToTrack.pageUrl_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m18005p(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esSkipToTrack$SkipToTrack.getClass();
        esOptional$OptionalInt64.getClass();
        esSkipToTrack$SkipToTrack.trackIndex_ = esOptional$OptionalInt64;
        esSkipToTrack$SkipToTrack.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18006q(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, String str) {
        esSkipToTrack$SkipToTrack.getClass();
        str.getClass();
        esSkipToTrack$SkipToTrack.trackUid_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m18007r(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, String str) {
        esSkipToTrack$SkipToTrack.getClass();
        str.getClass();
        esSkipToTrack$SkipToTrack.trackUri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static EsSkipToTrack$SkipToTrack m18008s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static xow m18009u() {
        return (xow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001", new Object[]{"bitField0_", "pageUrl_", "pageIndex_", "trackUid_", "trackUri_", "trackIndex_"});
        }
        if (iOrdinal == 3) {
            return new EsSkipToTrack$SkipToTrack();
        }
        if (iOrdinal == 4) {
            return new xow(DEFAULT_INSTANCE);
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
        synchronized (EsSkipToTrack$SkipToTrack.class) {
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

    /* JADX INFO: renamed from: t */
    public final String m18010t() {
        return this.trackUid_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
