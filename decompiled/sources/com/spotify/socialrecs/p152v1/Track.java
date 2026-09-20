package com.spotify.socialrecs.p152v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Track extends AbstractC0269h implements sre0 {
    public static final int ARTIST_NAMES_FIELD_NUMBER = 3;
    public static final int ATTRIBUTED_MEMBERS_FIELD_NUMBER = 8;
    private static final Track DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 5;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    public static final int MOGEF19_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean explicit_;
    private boolean mogef19_;
    private String uri_ = "";
    private String title_ = "";
    private ae50 artistNames_ = AbstractC0269h.emptyProtobufList();
    private String imageUri_ = "";
    private String previewId_ = "";
    private ae50 attributedMembers_ = AbstractC0269h.emptyProtobufList();

    static {
        Track track = new Track();
        DEFAULT_INSTANCE = track;
        AbstractC0269h.registerDefaultInstance(Track.class, track);
    }

    private Track() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ\u0005\u0007\u0006\u0007\u0007Ȉ\b\u001b", new Object[]{"uri_", "title_", "artistNames_", "imageUri_", "explicit_", "mogef19_", "previewId_", "attributedMembers_", Member.class});
        }
        if (iOrdinal == 3) {
            return new Track();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 7);
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
        synchronized (Track.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m21469n() {
        return this.attributedMembers_;
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
