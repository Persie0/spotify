package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PostVotePageResponse extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int CLOSE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 4;
    public static final int CLOSE_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    private static final PostVotePageResponse DEFAULT_INSTANCE;
    public static final int ELEMENTS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 elements_ = AbstractC0269h.emptyProtobufList();
    private String backgroundColor_ = "";
    private String closeButtonAccessibilityText_ = "";
    private String closeButtonAccessibilityAction_ = "";

    static {
        PostVotePageResponse postVotePageResponse = new PostVotePageResponse();
        DEFAULT_INSTANCE = postVotePageResponse;
        AbstractC0269h.registerDefaultInstance(PostVotePageResponse.class, postVotePageResponse);
    }

    private PostVotePageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"elements_", PostVotePageElement.class, "backgroundColor_", "closeButtonAccessibilityText_", "closeButtonAccessibilityAction_"});
        }
        if (iOrdinal == 3) {
            return new PostVotePageResponse();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 13);
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
        synchronized (PostVotePageResponse.class) {
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
    public final String m22388n() {
        return this.backgroundColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22389o() {
        return this.closeButtonAccessibilityAction_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22390p() {
        return this.closeButtonAccessibilityText_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m22391q() {
        return this.elements_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
