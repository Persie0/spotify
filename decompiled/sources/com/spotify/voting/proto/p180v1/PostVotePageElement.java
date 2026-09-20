package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PostVotePageElement extends AbstractC0269h implements sre0 {
    private static final PostVotePageElement DEFAULT_INSTANCE;
    public static final int HEADER_TEXT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_CAROUSEL_FIELD_NUMBER = 3;
    public static final int TEXT_SECTION_FIELD_NUMBER = 2;
    public static final int UPSELL_BANNER_FIELD_NUMBER = 4;
    private int elementsOneofCase_ = 0;
    private Object elementsOneof_;

    static {
        PostVotePageElement postVotePageElement = new PostVotePageElement();
        DEFAULT_INSTANCE = postVotePageElement;
        AbstractC0269h.registerDefaultInstance(PostVotePageElement.class, postVotePageElement);
    }

    private PostVotePageElement() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"elementsOneof_", "elementsOneofCase_", TextSectionElement.class, TextSectionElement.class, ShareElements.class, PremiumUpsell.class});
        }
        if (iOrdinal == 3) {
            return new PostVotePageElement();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 12);
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
        synchronized (PostVotePageElement.class) {
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
    public final int m22383n() {
        int i = this.elementsOneofCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TextSectionElement m22384o() {
        return this.elementsOneofCase_ == 1 ? (TextSectionElement) this.elementsOneof_ : TextSectionElement.m22417n();
    }

    /* JADX INFO: renamed from: p */
    public final ShareElements m22385p() {
        return this.elementsOneofCase_ == 3 ? (ShareElements) this.elementsOneof_ : ShareElements.m22410n();
    }

    /* JADX INFO: renamed from: q */
    public final TextSectionElement m22386q() {
        return this.elementsOneofCase_ == 2 ? (TextSectionElement) this.elementsOneof_ : TextSectionElement.m22417n();
    }

    /* JADX INFO: renamed from: r */
    public final PremiumUpsell m22387r() {
        return this.elementsOneofCase_ == 4 ? (PremiumUpsell) this.elementsOneof_ : PremiumUpsell.m22396n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
