package com.spotify.home.funkispage.p077v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vv20;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Feed extends AbstractC0269h implements sre0 {
    public static final int ANIMATION_FIELD_NUMBER = 6;
    public static final int CHILDREN_FIELD_NUMBER = 3;
    private static final Feed DEFAULT_INSTANCE;
    public static final int HIGHLIGHT_COLOR_FIELD_NUMBER = 5;
    public static final int HIGHLIGHT_SCHEME_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private Animation animation_;
    private int bitField0_;
    private int highlightScheme_;
    private String id_ = "";
    private String name_ = "";
    private ae50 children_ = AbstractC0269h.emptyProtobufList();
    private String highlightColor_ = "";

    static {
        Feed feed = new Feed();
        DEFAULT_INSTANCE = feed;
        AbstractC0269h.registerDefaultInstance(Feed.class, feed);
    }

    private Feed() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\f\u0005Ȉ\u0006ဉ\u0000", new Object[]{"bitField0_", "id_", "name_", "children_", Feed.class, "highlightScheme_", "highlightColor_", "animation_"});
        }
        if (iOrdinal == 3) {
            return new Feed();
        }
        if (iOrdinal == 4) {
            return new mlx(17);
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
        synchronized (Feed.class) {
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

    public final List getChildrenList() {
        return this.children_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getId() {
        return this.id_;
    }

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Animation m11805o() {
        Animation animation = this.animation_;
        return animation == null ? Animation.m11801o() : animation;
    }

    /* JADX INFO: renamed from: p */
    public final String m11806p() {
        return this.highlightColor_;
    }

    /* JADX INFO: renamed from: q */
    public final vv20 m11807q() {
        vv20 vv20Var;
        int i = this.highlightScheme_;
        if (i == 0) {
            vv20Var = vv20.NONE;
        } else if (i == 1) {
            vv20Var = vv20.WRAPPED;
        } else if (i != 2) {
            vv20Var = i != 3 ? null : vv20.AUDIOBOOKS;
        } else {
            vv20Var = vv20.NEW_RELEASES;
        }
        return vv20Var == null ? vv20.UNRECOGNIZED : vv20Var;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11808r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
