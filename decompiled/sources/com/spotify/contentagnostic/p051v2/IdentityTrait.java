package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class IdentityTrait extends AbstractC0269h implements sre0 {
    public static final int CONTENT_HIERARCHY_PARENT_FIELD_NUMBER = 4;
    public static final int CONTRIBUTORS_FIELD_NUMBER = 5;
    private static final IdentityTrait DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EntityReference contentHierarchyParent_;
    private String type_ = "";
    private String name_ = "";
    private String description_ = "";
    private ae50 contributors_ = AbstractC0269h.emptyProtobufList();

    static {
        IdentityTrait identityTrait = new IdentityTrait();
        DEFAULT_INSTANCE = identityTrait;
        AbstractC0269h.registerDefaultInstance(IdentityTrait.class, identityTrait);
    }

    private IdentityTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static IdentityTrait m7868s(byte[] bArr) {
        return (IdentityTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ဉ\u0001\u0005\u001b", new Object[]{"bitField0_", "type_", "name_", "description_", "contentHierarchyParent_", "contributors_", ContributorReference.class});
        }
        if (iOrdinal == 3) {
            return new IdentityTrait();
        }
        if (iOrdinal == 4) {
            return new a530(22);
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
        synchronized (IdentityTrait.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EntityReference m7869o() {
        EntityReference entityReference = this.contentHierarchyParent_;
        return entityReference == null ? EntityReference.m7851o() : entityReference;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m7870p() {
        return this.contributors_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7871q() {
        return this.type_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7872r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
