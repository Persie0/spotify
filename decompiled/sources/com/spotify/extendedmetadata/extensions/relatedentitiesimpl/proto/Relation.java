package com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vev0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Relation extends AbstractC0269h implements sre0 {
    private static final Relation DEFAULT_INSTANCE;
    public static final int GATED_RELATION_FIELD_NUMBER = 1;
    public static final int GUEST_RELATION_FIELD_NUMBER = 2;
    public static final int MVA_RELATION_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SAME_PERSON_RELATION_FIELD_NUMBER = 3;
    public static final int TOPIC_RELATION_FIELD_NUMBER = 4;
    private int relationTypeCase_ = 0;
    private Object relationType_;

    static {
        Relation relation = new Relation();
        DEFAULT_INSTANCE = relation;
        AbstractC0269h.registerDefaultInstance(Relation.class, relation);
    }

    private Relation() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"relationType_", "relationTypeCase_", GatedRelation.class, GuestRelation.class, SamePersonRelation.class, TopicRelation.class, MusicVideoRelatedAssociation.class});
        }
        if (iOrdinal == 3) {
            return new Relation();
        }
        if (iOrdinal == 4) {
            return new vev0(DEFAULT_INSTANCE, 24);
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
        synchronized (Relation.class) {
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
    public final GatedRelation m10357n() {
        return this.relationTypeCase_ == 1 ? (GatedRelation) this.relationType_ : GatedRelation.m10346n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final GuestRelation m10358o() {
        return this.relationTypeCase_ == 2 ? (GuestRelation) this.relationType_ : GuestRelation.m10349n();
    }

    /* JADX INFO: renamed from: p */
    public final MusicVideoRelatedAssociation m10359p() {
        return this.relationTypeCase_ == 5 ? (MusicVideoRelatedAssociation) this.relationType_ : MusicVideoRelatedAssociation.m10351n();
    }

    /* JADX INFO: renamed from: q */
    public final int m10360q() {
        int i = this.relationTypeCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: r */
    public final TopicRelation m10361r() {
        return this.relationTypeCase_ == 4 ? (TopicRelation) this.relationType_ : TopicRelation.m10362n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
