package com.spotify.extendedmetadata.extensions.listmetadataimpl;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ListAttributeCapabilities extends AbstractC0269h implements sre0 {
    public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 15;
    public static final int COLLABORATIVE_FIELD_NUMBER = 4;
    private static final ListAttributeCapabilities DEFAULT_INSTANCE;
    public static final int DELETED_BY_OWNER_FIELD_NUMBER = 6;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PICTURE_FIELD_NUMBER = 3;
    private AttributeCapabilities aiCurationReferenceId_;
    private int bitField0_;
    private AttributeCapabilities collaborative_;
    private AttributeCapabilities deletedByOwner_;
    private AttributeCapabilities description_;
    private AttributeCapabilities name_;
    private AttributeCapabilities picture_;

    static {
        ListAttributeCapabilities listAttributeCapabilities = new ListAttributeCapabilities();
        DEFAULT_INSTANCE = listAttributeCapabilities;
        AbstractC0269h.registerDefaultInstance(ListAttributeCapabilities.class, listAttributeCapabilities);
    }

    private ListAttributeCapabilities() {
    }

    /* JADX INFO: renamed from: o */
    public static ListAttributeCapabilities m10205o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0004\u000fဉ\u0005", new Object[]{"bitField0_", "name_", "description_", "picture_", "collaborative_", "deletedByOwner_", "aiCurationReferenceId_"});
        }
        if (iOrdinal == 3) {
            return new ListAttributeCapabilities();
        }
        if (iOrdinal == 4) {
            return new sj80(4);
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
        synchronized (ListAttributeCapabilities.class) {
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

    /* JADX INFO: renamed from: p */
    public final AttributeCapabilities m10206p() {
        AttributeCapabilities attributeCapabilities = this.description_;
        return attributeCapabilities == null ? AttributeCapabilities.m10179p() : attributeCapabilities;
    }

    /* JADX INFO: renamed from: q */
    public final AttributeCapabilities m10207q() {
        AttributeCapabilities attributeCapabilities = this.name_;
        return attributeCapabilities == null ? AttributeCapabilities.m10179p() : attributeCapabilities;
    }

    /* JADX INFO: renamed from: r */
    public final AttributeCapabilities m10208r() {
        AttributeCapabilities attributeCapabilities = this.picture_;
        return attributeCapabilities == null ? AttributeCapabilities.m10179p() : attributeCapabilities;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
