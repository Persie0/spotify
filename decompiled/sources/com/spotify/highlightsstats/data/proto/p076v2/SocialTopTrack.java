package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Person;
import p204p.ae50;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialTopTrack extends AbstractC0269h implements sre0 {
    private static final SocialTopTrack DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PERSONS_FIELD_NUMBER = 2;
    public static final int TOP_TRACK_FIELD_NUMBER = 1;
    private int bitField0_;
    private ae50 persons_ = AbstractC0269h.emptyProtobufList();
    private TopTrack topTrack_;

    static {
        SocialTopTrack socialTopTrack = new SocialTopTrack();
        DEFAULT_INSTANCE = socialTopTrack;
        AbstractC0269h.registerDefaultInstance(SocialTopTrack.class, socialTopTrack);
    }

    private SocialTopTrack() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "topTrack_", "persons_", Person.class});
        }
        if (iOrdinal == 3) {
            return new SocialTopTrack();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 18);
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
        synchronized (SocialTopTrack.class) {
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
    public final ae50 m11635n() {
        return this.persons_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TopTrack m11636o() {
        TopTrack topTrack = this.topTrack_;
        return topTrack == null ? TopTrack.m11720o() : topTrack;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
