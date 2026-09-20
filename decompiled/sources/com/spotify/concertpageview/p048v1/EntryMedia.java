package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.xq71;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EntryMedia extends AbstractC0269h implements sre0 {
    private static final EntryMedia DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_LOGO_URL_FIELD_NUMBER = 2;
    public static final int VISUAL_IDENTITY_URI_FIELD_NUMBER = 3;
    private int mediaCase_ = 0;
    private Object media_;

    static {
        EntryMedia entryMedia = new EntryMedia();
        DEFAULT_INSTANCE = entryMedia;
        AbstractC0269h.registerDefaultInstance(EntryMedia.class, entryMedia);
    }

    private EntryMedia() {
    }

    /* JADX INFO: renamed from: n */
    public static EntryMedia m7033n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000", new Object[]{"media_", "mediaCase_"});
        }
        if (iOrdinal == 3) {
            return new EntryMedia();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 9);
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
        synchronized (EntryMedia.class) {
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

    /* JADX INFO: renamed from: o */
    public final xq71 m7034o() {
        if (this.mediaCase_ != 1) {
            return xq71.TIMELINE_ICON_UNSPECIFIED;
        }
        xq71 xq71VarM91818a = xq71.m91818a(((Integer) this.media_).intValue());
        return xq71VarM91818a == null ? xq71.UNRECOGNIZED : xq71VarM91818a;
    }

    /* JADX INFO: renamed from: p */
    public final int m7035p() {
        int i = this.mediaCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public final String m7036q() {
        return this.mediaCase_ == 2 ? (String) this.media_ : "";
    }

    /* JADX INFO: renamed from: r */
    public final String m7037r() {
        return this.mediaCase_ == 3 ? (String) this.media_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
