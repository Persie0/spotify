package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.Visual;
import p204p.ae50;
import p204p.gva;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Hashtag extends AbstractC0269h implements sre0 {
    public static final int DECISION_ID_FIELD_NUMBER = 5;
    private static final Hashtag DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SEED_ITEM_URI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int VISUALS_FIELD_NUMBER = 6;
    private String id_ = "";
    private String title_ = "";
    private String seedItemUri_ = "";
    private String navigationUri_ = "";
    private String decisionId_ = "";
    private ae50 visuals_ = AbstractC0269h.emptyProtobufList();

    static {
        Hashtag hashtag = new Hashtag();
        DEFAULT_INSTANCE = hashtag;
        AbstractC0269h.registerDefaultInstance(Hashtag.class, hashtag);
    }

    private Hashtag() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static Hashtag m22653r(gva gvaVar) {
        return (Hashtag) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "title_", "seedItemUri_", "navigationUri_", "decisionId_", "visuals_", Visual.class});
        }
        if (iOrdinal == 3) {
            return new Hashtag();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 21);
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
        synchronized (Hashtag.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22654n() {
        return this.decisionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22655o() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22656p() {
        return this.seedItemUri_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m22657q() {
        return this.visuals_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
