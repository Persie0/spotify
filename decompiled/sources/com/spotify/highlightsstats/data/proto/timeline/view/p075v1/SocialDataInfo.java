package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Person;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.ae50;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialDataInfo extends AbstractC0269h implements sre0 {
    private static final SocialDataInfo DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SOCIAL_USERS_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private ae50 socialUsers_ = AbstractC0269h.emptyProtobufList();
    private Paragraph text_;

    static {
        SocialDataInfo socialDataInfo = new SocialDataInfo();
        DEFAULT_INSTANCE = socialDataInfo;
        AbstractC0269h.registerDefaultInstance(SocialDataInfo.class, socialDataInfo);
    }

    private SocialDataInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static SocialDataInfo m11405n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "text_", "socialUsers_", Person.class});
        }
        if (iOrdinal == 3) {
            return new SocialDataInfo();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 11);
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
        synchronized (SocialDataInfo.class) {
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
    public final ae50 m11406o() {
        return this.socialUsers_;
    }

    /* JADX INFO: renamed from: p */
    public final Paragraph m11407p() {
        Paragraph paragraph = this.text_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11408q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
